
public class Dog extends Animal{
	
	String type="포유류";
	
	@Override
	public String type() {
		return type;
	}

	@Override
	public String sound() {
		// TODO Auto-generated method stub
		return "강아지는는 멍멍 하고 웁니다.";
	}
}