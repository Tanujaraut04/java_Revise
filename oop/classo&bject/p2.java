/*non-static allowed instance varible  */
class Demo{
	public static void main(String[]args){
		Student s = new Student();
		s.fun();
	}
}
class Student{
	int marks=90;
	 void fun(){
		System.out.println("Hello"+ marks);
	}
}