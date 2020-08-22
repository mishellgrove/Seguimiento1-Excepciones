package model;

public class Person {
	
	public static final String TARJETA_IDENTIDAD = "TI";
	public static final String CEDULA_CIUDADANIA = "CC";
	public static final String PASAPORTE = "PP";
	public static final String CEDULA_EXTRANJERIA = "CE";
	private String type;
	private int identification;
	
	
	public Person(){
	}
	
	public Person(String type, int identification){
		this.type = type;
		this.identification = identification;
	}
	
	public String getType(){
		return this.type;
	}
	
	public int getIdentification(){
		return this.identification;
	}
}
