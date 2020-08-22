package model;
import java.time.LocalDate;
import java.util.*;

import exceptions.IdNoMatchException;

public class Minimarket {
	
	private Person income;
	private ArrayList<Person> people;
	
	public Minimarket(){
		people = new ArrayList();
	}

	public void addPerson(String type, int identification) throws IdNoMatchException {
		if (type.equals("TI")){
			
		} else {
			int date = LocalDate.now().getDayOfMonth();
			String id = Integer.toString(identification);
			int cc = id.charAt(id.length()-1);
			if (date%2==0&&cc%2!=0){
				Person per = new Person(type,identification);
				people.add(per);
			}else {
				throw new IdNoMatchException (date, cc);
			}
			
		}
	}

	public ArrayList<Person> getPeople() {
		return people;
	}

}
