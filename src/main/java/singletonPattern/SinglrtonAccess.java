package singletonPattern;

public class SinglrtonAccess {
	
	
public static void main(String[] args) {
	
	Singleton test1 = Singleton.getInstance("Divya", 10);
	Singleton test2 = Singleton.getInstance("Vithyakar", 11);
	
	System.out.println(test1.name);
	System.out.println(test1.age);
	
	System.out.println(test2.name);
	System.out.println(test2.age);
	
	
	
}

}
