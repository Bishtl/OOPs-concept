package Encapsulation;

class Encapsulate {
	
	private String geekName;
	private int geekRoll;
	private int geekAge;

	
	public int getAge() { return geekAge; }

	
	public String getName() { return geekName; }

	
	public int getRoll() { return geekRoll; }

	
	public void setAge(int newAge) { geekAge = newAge; }

	
	public void setName(String newName)
	{
		geekName = newName;
	}

	
	public void setRoll(int newRoll) { geekRoll = newRoll; }
}

public class demo {
	public static void main(String[] args)
	{
		Encapsulate obj = new Encapsulate();

		
		obj.setName("Harsh");
		obj.setAge(19);
		obj.setRoll(51);

		
		System.out.println("my name: " + obj.getName());
		System.out.println("my age: " + obj.getAge());
		System.out.println("my roll: " + obj.getRoll());

		
	}
}
