# ADS04 Java 

## 수업 내용

- abstract와 interface 학습
- 자바에서 구현하는 callback

## Code Review

1. test

```Java
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
```

2. test2

```Java
public class Test extends Animal implements Animal2{

	/*
	 * 추상클래스인 경우에는 다중 상속이 불가능하지만
	 * 인터페이스인 경우에는 다중 상속이 가능하다.
	 * 
	 * 기능이 고정되어 있다면 abstract안에 메소드를 작성할 수 있지만
	 * interface는 추상적으로
	 * 
	 */
	
	@Override
	public String type() {
		// TODO Auto-generated method stub
		return null;
	}
}
```

3. test3

```Java
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
```

### ※ callback 

1. A class

```Java 
public class A implements InterfaceC{

	public void process(){
		C c = new C();
		// C 클래스를 사용할 준비
		c.process(this);
		// 실행이 끝난다음에 afterProcess
	}
	
	public void afterProcess(){
		System.out.println("실행이 완료되었습니다.");
	}

	@Override
	public void callback() {
		afterProcess();
	}
	// A 클래스 method인 process는 C class가 실행이 되고 작업이 완료가 되면 콜백이 되면서 afterProcess가 인터페이스로 오버라이드 된 콜백메소드에서 실행됨.
}
```

2. C class

```Java
public class C {
	public void process(InterfaceC c){
		// 예는 처리시간이 얼마나 걸릴지 모르는 애다.. 한시간정도?
		// 처리...
		// ...
		// ...
		c.callback();
	}	
}
```

3. Interface C

```Java
public interface InterfaceC{
	public void callback();
}
```

## 보충설명

### abstract class

사전적인 의미로 추상은 실체간의 공통되는 특성을 추출한 것을 말한다.
- 클래스에서도 추상클래스가 있는데, 객체를 직접 생성할 수 있는 클래스를 실체 클래스라고 한다면 이 클래스들의 공통적인 특성을 추출해서 선언한 클래스를 추상 클래스라고 한다.
- 특징: 추상클래스는 실체클래스의 공통되는 필드와 메소드를 추출해서 만들었기 때문에 객체를 직접 생성해서 사용할 수 없다. 다시 말해서, 추상 클래스는 new 연산자를 사용해서 인스턴스를 생성시키지 못한다. 
- 추상클래스는 새로운 실체클래스를 만들기 위해 부모클래스로만 사용된다. 그러므로 extends 뒤에만 올 수 있는 클래스이다. 
- 예제 코드

```Java
class Ant extends Animal{....}
```
- 용도로는 1. 실체 클래스들의 공통된 필드와 메소드의 이름을 통일할 목적 2. 실체 클래스를 작성할 때 시간을 절약

- 추상 메소드
추상 메소드는 추상 클래스에서만 선언할 수 있는데, 메소드의 선언부만 있고 메소드 실행 내용인 중괄호가 없는 메소드를 말한다.

```Java
public abstract calss Animal{
    public abstract void sound();
}
```

### interface

- 자바에서 인터페이스는 객체의 사용방법을 정의한 타입이다. 인터페이스는 객체의 교환성을 높여주기 때문에 다형성을 구현하는 매우 중요한 역할을 한다. 

- 인터페이스는 개발 코드와 객체가 서로 통신하는 접점 역할을 한다. 

- 개발 코드를 수정하지 않고, 사용하는 객체를 변경 할 수 있음.

- 인터페이스는 하나의 객체가 아니라 여러 객체들과 사용이 가능하므로 어떤 객체를 사용하느냐에 따라서 실행 내용과 리턴값이 다를 수 있다. 개발 코드 측면에서는 코드의 변경없이 실행 내용과 리턴값을 다양화

- 인터페이스 선언
- 아래 예제 코드처럼 사용할 수 있고, 필요한 것만 선언할 수 있다.
```Java
public interface 인터페이스명 {...}

public int MAX_VOLUME = 10;
public void turnOn();
default void setMute(boolean mute){
    if(mute){
        System.out.println("~~~");
    }
static void changeBattery(){
    System.out.printlln("~~~");
}
}
```
- 인터페이스 구현
```Java
public class 구현클래스명 implements 인터페이스명{
    // 인터페이스에 선언된 추상메소드의 실체 메소드 선언
}
```

### 다형성

- 형성이란 하나의 메소드나 클래스가 있을 때 이것들이 다양한 방법으로 동작하는 것을 의미
```Java
class O{
    public void a(int param){
        System.out.println("숫자출력");
        System.out.println(param);
    }
    public void a(String param){
        System.out.println("문자출력");
        System.out.println(param);
    }
}
public class PolymorphismOverloadingDemo {
    public static void main(String[] args) {
        O o = new O();
        o.a(1);;
        o.a("one");
    }
}
```
- 클래스 O의 메소드 a는 두개의 본체를 가지고 있다. 동시에 두개의 본체는 하나의 이름인 a를 공유하고 있다. 같은 이름이지만 서로 다른 동작 방법을 가지고 있기 때문에 오버로딩은 다형성의 한 예라고 할 수 있다.

### callback

- 피호출자(Callee)가 호출자(Caller)를 호출하는 것(호출자(Caller)-> 피호출자(Callee) (x))
- A가 B를 호출하여 B가 작업을 수행하다가 어떤 시점에서 다시 B는 A를 호출, 그때 A가 정해놓은 작업을 수행하는 것.

```Java
class Callee {
    
    interface Callback { // 인터페이스는 외부에 구현해도 상관 없습니다.
        void callbackMethod();
    }
    
    private boolean m_condition;
    private Callback m_callback;
    
    public Callee() {
        m_condition = false;
        m_callback = null;
    }
    
    public setCallback(Callback callback) {
        this.m_callback = callback;
    }
    
    // 콜백 메서드를 호출할 수 있는지 확인
    private checkCondition() {
        if(m_condition && (m_callback != null))
            m_callback.callbackMethod(); // 가능하면 콜백 메서드 호출
    }
    
    ...
}

class Caller {
    
    private Callee callee;
    private int value;
    
    public Caller() {
        Callee.Callback callback = new Callee.Callback() {
            @Override
            public void callbackMethod() {
                // 이곳에 콜백 메서드에서 할일을 구현 (값 전달, 복사...)
            }
        callee.setCallback(callback);
        ...
    }
    
    ...
}
```
- 위와 같이 구현하여 Callee에서 checkCondition() 메서드를 통해, 현재의 작업이나 상태 등을 체크하고 Caller에게 값을 전달하거나 기능을 수행할 수 있습니다.

 일반적인 구현에서, 값을 넘겨주는 쪽이 아닌 보통 넘겨 받는 쪽이 받아올 수 있는 상황인지 물어보고 받아오는 것과 달리, 콜백에선 넘겨주는 쪽이 스스로 넘겨줄 수 있는지 확인 후 넘겨줄 수 있을 때 값을 전달해 주는 것이죠.

#### 출처 : [생활코딩](https://opentutorials.org/module/516/6127)
#### 출처 : 이것이 자바다
#### 출처 : [Hychul's Blog](https://hychome.blogspot.kr/2015/10/java-callback.html)

## TODO

- 인터페이스의 기능들을 좀더 면밀히 살펴볼것
- 인터페이스를 활용해 직접 코드를 짜보면서 그 효율성을 생각해볼것 

## Retrospect

- 가볍게 보고 넘어간 부분이였는데, 다시 보니까 생각보다 코드를 짜는데 꼭 필요한 부분이라는 생각이 든다.
- 협업시 굉장히 중요할 것 같고, 코드의 재사용성 측면에서도 중요한 것 같다.


## Output
- 생략