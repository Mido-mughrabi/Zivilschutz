package model;


enum functions{
	unit_leaders,
	subordinate_leaders,
	skilled_workers
};

enum unit_types{
	TZ,
	OV_Stab
};

public class Person {
	
	private String call_number;
	private String Surname;
	private int[] additional_qualification = new int[4];
	functions function;
	unit_types unit_type;
	public Person(String call_number, String surname, functions function,  unit_types unit_type, int[] additional_qualification) {
		this.setCall_number(call_number);
		this.setSurname(Surname);
		this.setAdditional_qualification(additional_qualification);
		this.setfunction(function);
		this.setunit_type(unit_type);
	}
	

	public String getCall_number() {
		return call_number;
	}

	public void setCall_number(String call_number) {
		this.call_number = call_number;
	}

	public String getSurname() {
		return this.Surname;
	}

	public void setSurname(String surname) {
		this.Surname = surname;
	}

	public int[] getAdditional_qualification() {
		return additional_qualification;
	}

	public void setAdditional_qualification(int[] additional_qualification) {
		this.additional_qualification = additional_qualification;
	}
	
	

	public functions getfunction() {
		return this.function;
	}

	public void setfunction(functions function) {
		this.function = function;
	}
	
	public unit_types getunit_type() {
		return this.unit_type;
	}

	public void setunit_type(unit_types unit_type) {
		this.unit_type = unit_type;
	}

	
	
	

}