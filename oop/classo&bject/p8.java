/*multiple data store krta yeto object madhe using instance variable*/
class Demo{
	public static void main(String[]args){
		System.out.println("Students 1");
		Students s1=new Students();
		s1.name="Tanuja";
		s1.marks=90;
		s1.display();
		System.out.println("Students 2");
		Students s2=new Students();
		s2.name="Anuja";
		s2.marks=80;
		s2.display();
	}
}
class Students{
	String name;
	int marks;
	void display(){
		System.out.println("Name:"+name);
		System.out.println("Marks:"+marks);
	}
}