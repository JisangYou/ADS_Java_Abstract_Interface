// 1. ��ɺ�ȭ�� ���� �Ͼ�� ���� �߻� Ŭ������ ����
// 2. ��ɺ�ȭ�� ���� ���� �������̽��� ����
/*
 * �߻�Ŭ���� �׽�Ʈ
 * 
 */
public abstract class Animal {
	/*
	 * ����������  + abstract + type + �޼ҵ��();
	 */
	public  abstract String type();

	/*
	 * ���� �⺻ �޼ҵ嵵 �ۼ��� �����ϴ�.
	 */
	public String sound() {
		
		return new String("��������");
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
 * ����ü
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
 * �������̽� �׽�Ʈ
 * 
 */
interface Animal2{
	
}

interface Animal3{
	
}