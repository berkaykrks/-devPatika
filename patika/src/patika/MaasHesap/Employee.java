package patika.MaasHesap;

import java.time.Year;

public class Employee {

	String name;
	double salary;
	int workHours;
	int hireYear;

	public Employee(String name, double salary, int workHours, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}

	public double tax() {
		if (salary <= 1000) {
			return 0;
		} else {
			return salary * 0.03;
		}
	}

	public double bonus() {
		if (workHours > 40) {
			return (workHours - 40) * 30;
		} else {
			return 0;
		}
	}

	public double raiseSalary() {
		int yearsWorked = Year.now().getValue() - hireYear;
		if (yearsWorked < 10) {
			return salary * 0.05;
		} else if (yearsWorked >= 10 && yearsWorked < 20) {
			return salary * 0.1;
		} else {
			return salary * 0.15;
		}
	}

	public double totalSalary() {
		return salary + raiseSalary() + bonus() - tax();
	}

	@Override
	public String toString() {
		double tax = tax();
		double bonus = bonus();
		double raise = raiseSalary();
		double total = totalSalary();

		return "Adı : " + name + "\n" + "Maaşı : " + salary + "\n" + "Çalışma Saati : " + workHours + "\n"
				+ "Başlangıç Yılı : " + hireYear + "\n" + "Vergi : " + tax + "\n" + "Bonus : " + bonus + "\n"
				+ "Maaş Artışı : " + raise + "\n" + "Vergi ve Bonuslar ile birlikte maaş : " + total;
	}
}
