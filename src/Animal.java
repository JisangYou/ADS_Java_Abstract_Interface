// 1. 기능변화가 자주 일어나는 경우는 추상 클래스로 설계
// 2. 기능변화가 없는 경우는 인터페이스로 설계
abstract class Base {

	public void deleteList() {
		delete();
		showList();
	}

	public abstract void create();

	public abstract void read();

	public abstract void update();

	public abstract void delete();

	public abstract void showList();
}

//1. 기능변화가 자주 일어나는 경우는 추상 클래스로 설계
//2. 기능변화가 없는 경우는 인터페이스로 설계
abstract class Memo extends Base {
	public void deleteList(){
		delete();
		showList();
	}
}













