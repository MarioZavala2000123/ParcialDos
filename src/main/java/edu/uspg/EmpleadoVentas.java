package edu.uspg;

import java.util.List;
import java.util.ArrayList;

public class EmpleadoVentas {
	private String name;
	private String dept;
	private int salary;
	private List<EmpleadoVentas> subordinates;

	public EmpleadoVentas(String name, String dept, int sal) {
		this.name = name;
		this.dept = dept;
		this.salary = sal;
		subordinates = new ArrayList<EmpleadoVentas>();
	}

	public void add(EmpleadoVentas e) {
		subordinates.add(e);
	}

	public void remove(EmpleadoVentas e) {
		subordinates.remove(e);
	}

	public List<EmpleadoVentas> getSubordinates() {
		return subordinates;
	}

	public String toString() {
		return ("Empleado: [Nombre:" + name + ", Departamento/Área:" + dept + ", Salario:" + salary + "]");
	}
}
