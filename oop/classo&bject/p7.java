/*Reinitialize instance variable*/
class Demo{
	public static void main(String[]args){
		 Students s = new  Students();
		  s.marks=10;
		s.fun();
	}
}
class Students{
	int marks;
	void fun(){
		System.out.println(marks);
	}
	
}