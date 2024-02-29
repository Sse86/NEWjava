package Exception;

import java.util.Random;

class DinosaurIllException1 extends Exception{
	public DinosaurIllException1(String message) {
		super(message);
	}
}

class EnclosureBreachedException extends Exception{
	public EnclosureBreachedException(String message) {
		super(message);
	}
}

public class DinosaurCareSystem {
	
	Random random = new Random();
	
  public void handleDinosaurHealth() throws DinosaurIllException1{
	  
	  int healthStatus = random.nextInt(10);
	  if(healthStatus <5) {
		  throw new DinosaurIllException1("공룡이 아파요. 진찰이 필요합니다.!!");
	  }else {
		  System.out.println("공룡의 건강 상태가 좋습니다.");
	  }
	  
  }
  public void handleEnclosureSecurity() throws EnclosureBreachedException{
	 int securityStatus = random.nextInt(10);
	 if(securityStatus <4) {
		 throw new EnclosureBreachedException("공룡 우리가 파손되었습니다. 즉시 수리가 필요합니다. ");
		 
	 }else {
		 System.out.println("공룡 우리의 보안 상태가 좋습니다.");
	 }
  }
	public static void main(String[]args) {
		
		DinosaurCareSystem dcs = new DinosaurCareSystem();
		
		try {
			dcs.handleDinosaurHealth();
			
		}catch(DinosaurIllException1 e) {
			System.out.println(e.getMessage());
		}
		try {
			dcs.handleEnclosureSecurity();
		}catch(EnclosureBreachedException e) {
			System.out.println(e.getMessage());
		}
	}
}
