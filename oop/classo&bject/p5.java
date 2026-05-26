class Demo{
	public static void main(String[]args){
		Students s = new Students();
		s.display();
		s.display();
		Students s1 = new Students();
		s1.display();
	}
}
class Students{
	int marks=10;
	void display(){
		System.out.println("Marks:"+" "+marks);
	}
}