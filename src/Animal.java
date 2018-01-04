// 1. 기능변화가 자주 일어나는 경우는 추상 클래스로 설계
// 2. 기능변화가 없는 경우는 인터페이스로 설계
/*
 * 추상클래스 테스트
 * 
 */
public abstract class Animal {
	/*
	 * 접근제한자  + abstract + type + 메소드명();
	 */
	public  abstract String type();

	/*
	 * 물론 기본 메소드도 작성이 가능하다.
	 */
	public String sound() {
		
		return new String("울어버리기");
	}
}

abstract class Base{
	abstract void create();
	abstract void read();
	abstract void update();
	abstract void delete();
}

abstract class Memo extends Base{
	
	public void deleteList() {
		update();
		delete();
	}
}

/**
 * 구현체
 *
 */
class MemoImpl extends Memo{

	@Override
	void create() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void read() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void delete() {
		// TODO Auto-generated method stub
		
	}
}


/**
 * 인터페이스 테스트
 * 
 */
interface Animal2{
	
}

interface Animal3{
	
}