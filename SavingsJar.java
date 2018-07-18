public class SavingsJar extends Jar{
	private String accessKey; 
	
	
	public SavingsJar(String name, double value, double cap, String key){
		super(name, value, cap);
		this.accessKey = key; 
		super.depositable = true;
		
	}
	
	public void withdraw (String key, double value){
		if (key.equals(this.accessKey)){
			
			super.withdrawable = true; 
		}else{
			
			System.out.println("incorrect key");
		}
		super.withdraw(value);
		
	}
	
	
	
	
	
}