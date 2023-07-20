package polymorphism;




public class polymorphism {

	public static void main(String[] args) {
		// 다형성 실습
		Human[] humans = new Human[10];
		humans[0] = new Human();
		humans[1] = new SpiderMan();
		
		System.out.println(humans[0]);
		System.out.println(humans[1]);
		
		
		
		Object[] objects = new Object[5];
		objects[0] = new Human();
		objects[1] = new SpiderMan();
		objects[2] = "hi";
		objects[3] = 1;
		objects[4] = false;
		

		for (Object obj : objects) {
			System.out.println(obj);
		}
		


	}

}
