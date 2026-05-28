/*
error: non-static method fun() cannot be referenced from a static context*/
class Demo{
	public static void main(String[]args){
		Students.fun();
		}
}
class Students{
	void fun(){
		System.out.println("in fun");
	}
}