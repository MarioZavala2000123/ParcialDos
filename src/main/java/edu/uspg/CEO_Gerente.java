package edu.uspg;

public class CEO_Gerente {
	public static void main(String[] args) {
		System.out.println("-----Empleados de Ventas-----");
		Ventas();
		System.out.println("");
		System.out.println("-----Empleados de Marketing-----");
		Marketing();
	}

	public static void Ventas() {
		EmpleadoVentas CEO = new EmpleadoVentas("John", "CEO", 30000);

		EmpleadoVentas headSales = new EmpleadoVentas("Carlos", "Jefe Ventas", 20000);

		EmpleadoVentas headMarketing = new EmpleadoVentas("Mishel", "Vodega", 2000);

		EmpleadoVentas clerk1 = new EmpleadoVentas("Laura", "Gerente Ventas", 10000);
		EmpleadoVentas clerk2 = new EmpleadoVentas("Manuel", "Publicidad", 10000);

		EmpleadoVentas salesExecutive1 = new EmpleadoVentas("Richard", "Vodega", 2000);
		EmpleadoVentas salesExecutive2 = new EmpleadoVentas("Robert", "Vodega", 2000);

		CEO.add(headSales);
		CEO.add(headMarketing);

		headSales.add(salesExecutive1);
		headSales.add(salesExecutive2);

		headMarketing.add(clerk1);
		headMarketing.add(clerk2);
		
		for (EmpleadoVentas headEmployee : CEO.getSubordinates()) {
			System.out.println(headEmployee);
			for (EmpleadoVentas employee : headEmployee.getSubordinates()) {
				System.out.println(employee);
			}
		}
	}
	
	public static void Marketing() {
		EmpleadoMarketing CEO = new EmpleadoMarketing("John", "CEO", 30000);

		EmpleadoMarketing headSales = new EmpleadoMarketing("Robert", "Head Sales", 20000);

		EmpleadoMarketing headMarketing = new EmpleadoMarketing("Michel", "Head Marketing", 20000);

		EmpleadoMarketing clerk1 = new EmpleadoMarketing("Laura", "Marketing", 10000);
		EmpleadoMarketing clerk2 = new EmpleadoMarketing("Bob", "Marketing", 10000);

		EmpleadoMarketing salesExecutive1 = new EmpleadoMarketing("Richard", "Sales", 10000);
		EmpleadoMarketing salesExecutive2 = new EmpleadoMarketing("Rob", "Sales", 10000);

		CEO.add(headSales);
		CEO.add(headMarketing);

		headSales.add(salesExecutive1);
		headSales.add(salesExecutive2);

		headMarketing.add(clerk1);
		headMarketing.add(clerk2);
		
		for (EmpleadoMarketing headEmployee : CEO.getSubordinates()) {
			System.out.println(headEmployee);
			for (EmpleadoMarketing employee : headEmployee.getSubordinates()) {
				System.out.println(employee);
			}
		}
	}
}