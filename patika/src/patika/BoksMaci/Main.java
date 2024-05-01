package patika.BoksMaci;

public class Main {

	public static void main(String[] args) {
		Fighter marc = new Fighter("Marc", 15, 100, 90, 0);
        Fighter alex = new Fighter("Alex", 20, 95, 100, 0);
        Ring r = new Ring(marc, alex, 90, 100);
        r.run();

	}

}
