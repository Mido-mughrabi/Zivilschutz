package model;

public class Person {
	private String call_number;
	private String surname;
	private int[] additional_qualification = new int[4];
	private int[] functions = new int[3];
	private int[] unit_type = new int[2];
	
	public Person(String call_number, String surname, int[] functions, int[] unit_type, int[] additional_qualification) {
		this.setCall_number(call_number);
		this.setSurname(surname);
		this.setAdditional_qualification(additional_qualification);
		this.setFunctions(functions);
		this.setUnit_type(unit_type);
	}

	public String getCall_number() {
		return call_number;
	}

	public void setCall_number(String call_number) {
		this.call_number = call_number;
	}

	public String getSurname() {
		return this.surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int[] getAdditional_qualification() {
		return additional_qualification;
	}

	public void setAdditional_qualification(int[] additional_qualification) {
		this.additional_qualification = additional_qualification;
	}

	public int[] getFunctions() {
		return functions;
	}

	public void setFunctions(int[] functions) {
		functions = functions;
	}

	public int[] getUnit_type() {
		return unit_type;
	}

	public void setUnit_type(int[] unit_type) {
		this.unit_type = unit_type;
	}
	
	
	

}