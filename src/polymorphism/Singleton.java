package polymorphism;

class SingletonClass{
	/*
	 * 싱글톤 디자인 패턴의 필요성
	 * 그러니까, static 변수만 있다던가 기능(메서드)만 있는 클래스의 경우는 
	 * 객체를 여러개 생성해서 사용하는 게 손해잖아. 메모리 낭비란 말이야. 
	 * 그래서 우리가 이건 객체를 하나만 만들어어서 사용하세요~ 해봐야
	 * 사용자들은 걍 지맘대로 쓸거란 말이지. 
	 * 사용자들이 우리 의도대로 잘 쓸거라는 기대를 애초에 하지 말자. 
	 * 
	 * 애초에 그냥 그럴 수 밖에 없게 해야 한다. 
	 * 봐봐, 변수를 원하는대로 제어하기 위해서 변수에 직접 접근하지 못하고
	 * 메서드를 통해 접근(ex) 값이 0보다 클때만 할당)해서  했던 거 기억나지? 
	 * 그것처럼 애초에 강제성을 부여해서 다른 방법은 못하게 만들어야 돼. 
	 * 
	 * 
	 * 그럼 객체를 한번만 만들 수 있게 하려면 어떻게 해야 할까?
	 * 그것에 대한 디자인 패턴이 싱글톤 디자인 패턴이다. 
	 * 
	 * 
	 * 싱글톤 디자인 패턴이란?
	 * 객체를 오직 하나만 만들어서 사용하기 위해 고안된 디자인 패턴
	 * 클래스 외부에서는 생성자를 호출하지 못하게 하고
	 * 클래스 내부에서 객체를 생성해서 반환해줌. 
	 */		
		private static SingletonClass instance = new SingletonClass();
		private SingletonClass() {}
		
		public static SingletonClass getInstance() {
			return instance;
		}
		
		public void sayHello() {
			System.out.println("Hello");
		}

}

public class Singleton {
	public static void main(String[] args) {
		SingletonClass sc1 = SingletonClass.getInstance();
		SingletonClass sc2 = SingletonClass.getInstance();
		
		System.out.printf("두 객체는 같은가? %b%n", sc1==sc2);
		sc1.sayHello();
	}
}
