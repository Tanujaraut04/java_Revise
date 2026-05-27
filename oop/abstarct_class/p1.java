class Demo{
	public static void main(String[]args){
		Child c = new Child();
		c.education();
		c.property();
		
		
	}

}
abstract class Parent{
	Parent(){
		System.out.println("in Parent");
	}
	abstract void education();
	void property(){
		System.out.println("2 acr");
	}
}
class Child extends Parent{
	Child(){
		System.out.println("in Child");
	}
	void education(){
		System.out.println("Hello");
	}
}