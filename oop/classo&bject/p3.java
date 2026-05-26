/* error: non-static variable marks cannot be referenced from a static context
  static method not allowed instance variable */
class Demo{
	public static void main(String[]args){
		Student s = new Student();
		s.fun();
	}
}
class Student{
	int marks=90;
	static void fun(){
		System.out.println("Hello"+" "+ marks);
	}
}