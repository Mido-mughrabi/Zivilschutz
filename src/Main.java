
import java.util.ArrayList;

import model.Person;

public class Main {
	ArrayList<Person> persons = new ArrayList<Person>();
	
	public void addPerson(Person person) {
		persons.add(person);
	}
	
	public void removePerson(Person person) {
		persons.remove(person);
	}
	
	public void updatePerson(Person person) {
		 
		int n=0;
		for(Person person1:persons) {
			if(person1.equals(person))break;
			n++;
		}
		persons.get(n).setAdditional_qualification(person.getAdditional_qualification());
		persons.get(n).setfunction(person.getfunction());
		persons.get(n).setSurname(person.getSurname());
		persons.get(n).setunit_type(person.getunit_type());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
