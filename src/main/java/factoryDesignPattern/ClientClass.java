package factoryDesignPattern;

public class ClientClass {
	
	public static void main(String[] args) {
		
		
		FactoryClass factoryclass = new FactoryClass();
		CustomerAccount customeraccount = factoryclass.createAccount("Senior");
		
		customeraccount.AccountTypes();

	}

}
