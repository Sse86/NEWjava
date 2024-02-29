package Exception;

public class EnclosureBreachExceptoin extends Exception {
	
	public EnclosureBreachExceptoin(String enclosure) {
		
		super(enclosure+ "주의!!우리가 뚫렸습니다.!!" );
	}
 }
