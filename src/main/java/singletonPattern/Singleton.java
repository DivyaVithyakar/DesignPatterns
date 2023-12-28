package singletonPattern;

public class Singleton {
	
	
	private static Singleton singleton;
	public String name;
	public int age;
	
	public Singleton(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public static Singleton getInstance(String name, int age) {
		if(singleton == null) {
			singleton = new Singleton(name,age);
		}
		
		return singleton;
	}

	
}
