package polymorphism;



// 캡슐화의 필요성
// 변수를 아주 지멋대로 바꿔버릴 수 있음. 
// 내가 원하는 대로 변수를 제어할거란 생각은 버리자. 
// 사용자는 내가 원하는 방식대로 안 할거임. 
// 애초에 강제성을 부여해서 그렇게 할 수 밖에 없게 해야 됨

// 캡슐화의 방법
// -> 멤버 변수에 직접 접근할 수 없게 하고 메서드 통해서만 제어할 수 있게 해야 함. 
// 멤버 변수를 private처리하고 
// 멤버 변수 값을 변경하는 getter 메서드와 멤버 변수 값을 반환하는 setter함수를 세트로 만들자. 

class Person{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void eat() {
		System.out.println("냠냠");
	}
	
	public String getName() {
		
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}



public class Encapsulation {

	public static void main(String[] args) {

		
		Person p1 = new Person("hyori", 25);
		 
		System.out.println(p1.getAge());
		p1.setAge(10);
		System.out.println(p1.getAge());
		
		System.out.println(p1.getName());
		p1.setName("Nari");
		System.out.println(p1.getName());
		
		
				
	}

}
