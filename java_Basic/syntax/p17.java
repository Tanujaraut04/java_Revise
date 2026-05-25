/*Compiler: error: method fun() is already defined in class Demo*/
class Demo{
	public static void main(Strin[]args){
		
	}
	void fun(){
		System.out.println("Fun");
	}
	static void fun(){
		System.out.println("Fun");
	}
}