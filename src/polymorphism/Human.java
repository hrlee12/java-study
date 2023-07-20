package polymorphism;

public class Human {
	private String name;
	private boolean isHungry;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean getIsHungry() {
		return isHungry;
	}
	
	public void setIsHungry(boolean isHungry) {
		this.isHungry = isHungry;
	}
}


class SpiderMan extends Human {
	private boolean isSpider;
	
	public boolean getIsSpider(){
		return isSpider;
	}
	
	
	public void setIsSpider(boolean isSpider) {
		this.isSpider = isSpider;
	}
}


