package Exception;

public class DinosaurIllException extends Exception{
	
	public DinosaurIllException(String dinosaur) {
		super(dinosaur+"이 현재 아파합니다." );
	}
	

}
