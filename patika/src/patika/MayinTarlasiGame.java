package patika;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

	

	public class MayinTarlasiGame {
	    private final int rows;
	    private final int cols;
	    private final char[][] mineField;
	    private final char[][] playerField;
	    private final Set<String> visited;

	    public MayinTarlasiGame(int rows, int cols) {
	        this.rows = rows;
	        this.cols = cols;
	        this.mineField = new char[rows][cols];
	        this.playerField = new char[rows][cols];
	        this.visited = new HashSet<>();
	        initializeMineField();
	        initializePlayerField();
	    }

	    private void initializeMineField() {
	        Random random = new Random();
	        int mineCount = rows * cols / 4;
	        while (mineCount > 0) {
	            int row = random.nextInt(rows);
	            int col = random.nextInt(cols);
	            if (mineField[row][col] != '*') {
	                mineField[row][col] = '*';
	                mineCount--;
	            }
	        }
	    }

	    private void initializePlayerField() {
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                playerField[i][j] = '-';
	            }
	        }
	    }

	    public void play() {
	        Scanner scanner = new Scanner(System.in);
	        int remainingCells = rows * cols - (rows * cols / 4);
	        System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz !");
	        printPlayerField();

	        while (true) {
	            System.out.print("Satır Giriniz: ");
	            int row = scanner.nextInt();
	            System.out.print("Sütun Giriniz: ");
	            int col = scanner.nextInt();

	            if (!isValid(row, col)) {
	                System.out.println("Geçersiz koordinatlar, lütfen tekrar girin.");
	                continue;
	            }

	            if (visited.contains(row + "," + col)) {
	                System.out.println("Bu koordinat daha önce seçildi, başka bir koordinat girin.");
	                continue;
	            }

	            visited.add(row + "," + col);

	            if (mineField[row][col] == '*') {
	                printMineField();
	                System.out.println("Game Over!!");
	                return;
	            }

	            int neighborMines = countNeighborMines(row, col);
	            playerField[row][col] = (char) (neighborMines + '0');
	            remainingCells--;

	            if (remainingCells == 0) {
	                printPlayerField();
	                System.out.println("Oyunu Kazandınız!");
	                return;
	            }

	            printPlayerField();
	        }
	    }

	    private boolean isValid(int row, int col) {
	        return row >= 0 && row < rows && col >= 0 && col < cols;
	    }

	    private int countNeighborMines(int row, int col) {
	        int count = 0;
	        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}, {-1, -1}, {-1, 1}, {1, -1}, {1, 1}};
	        for (int[] dir : directions) {
	            int newRow = row + dir[0];
	            int newCol = col + dir[1];
	            if (isValid(newRow, newCol) && mineField[newRow][newCol] == '*') {
	                count++;
	            }
	        }
	        return count;
	    }

	    private void printPlayerField() {
	        for (char[] row : playerField) {
	            for (char cell : row) {
	                System.out.print(cell + " ");
	            }
	            System.out.println();
	        }
	    }

	    private void printMineField() {
	        for (char[] row : mineField) {
	            for (char cell : row) {
	                System.out.print(cell + " ");
	            }
	            System.out.println();
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Satır sayısını giriniz: ");
	        int rows = scanner.nextInt();
	        System.out.print("Sütun sayısını giriniz: ");
	        int cols = scanner.nextInt();

	        if (rows < 2 || cols < 2) {
	            System.out.println("Satır ve sütun sayısı en az 2 olmalıdır.");
	            return;
	        }

	        MayinTarlasiGame mineSweeper = new MayinTarlasiGame(rows, cols);
	        mineSweeper.play();
	    }
	}


