package Model;

public class Person {
	private String call_number;
	private String Surname;
	private int[] additional_qualification = new int[4];
	private int[] Functions = new int[3];
	private int[] unit_type = new int[2];
	
	public Person(String call_number, String Surname, int[] Functions, int[] unit_type, int[] additional_qualification) {
		this.call_number=call_number;
		this.Surname=Surname;
		this.additional_qualification=additional_qualification;
		this.Functions=Functions;
		this.unit_type=unit_type;
	}
	
	
	

}