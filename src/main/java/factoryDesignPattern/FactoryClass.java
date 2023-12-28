package factoryDesignPattern;

public class FactoryClass {
	
	public CustomerAccount createAccount(String types) {
		if(types == null)
			return null;
		
		switch(types) {
		case "Individual" :
			return new IndividualAccount();
		case "Joint" :
			return new JointAccount();
		case "Minor" :
			return new MinorAccount();
		case "Senior" :
			return new SeniorAccount();
		default :
			return null;
		}
		
	}

}
