/*Complier: error: non-static method fun() cannot be referenced from a static context
*/
class Demo{
	public static void main(String[]args){
		Demo.fun();
		System.out.println("Hello.........");
		
	}
	public  void fun(){
		System.out.println("In fun.........");
	}
}