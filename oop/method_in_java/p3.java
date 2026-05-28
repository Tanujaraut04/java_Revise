/* error: non-static method fun() cannot be referenced from a static context
                Students.fun();
non-static method la static way ni call jat nahi*/
class Demo{
	public static void main(String[]args){
		Students.fun();
	}
}
class Students{
	
	void fun(){
		System.out.println("Hello..");
	}
}