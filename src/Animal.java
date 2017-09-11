// 1. ��ɺ�ȭ�� ���� �Ͼ�� ���� �߻� Ŭ������ ����
// 2. ��ɺ�ȭ�� ���� ���� �������̽��� ����
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

//1. ��ɺ�ȭ�� ���� �Ͼ�� ���� �߻� Ŭ������ ����
//2. ��ɺ�ȭ�� ���� ���� �������̽��� ����
abstract class Memo extends Base {
	public void deleteList(){
		delete();
		showList();
	}
}













