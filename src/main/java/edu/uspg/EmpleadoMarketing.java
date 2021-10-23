package edu.uspg;

import java.util.List;
import java.util.ArrayList;

public class EmpleadoMarketing {
	private String name;
	private String dept;
	private int salary;
	private List<EmpleadoMarketing> subordinates;

	public EmpleadoMarketing(String name, String dept, int sal) {
		this.name = name;
		this.dept = dept;
		this.salary = sal;
		subordinates = new ArrayList<EmpleadoMarketing>();
	}

	public void add(EmpleadoMarketing e) {
		subordinates.add(e);
	}

	public void remove(EmpleadoMarketing e) {
		subordinates.remove(e);
	}

	public List<EmpleadoMarketing> getSubordinates() {
		return subordinates;
	}

	public String toString() {
		return ("Empleado: [Nombre:\" + name + \", Departamento/Área:\" + dept + \", Salario:\" + salary + \"]");
	}
}
