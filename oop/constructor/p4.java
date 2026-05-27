/*object call zalyvr aapan data send krt aahe jr object create zalyvr constructor la call jat asel tr tr aapan constructor through pn data send kru shakto tymule code jast complicated honar nahi.*/
class Demo{
	public static void main(String[]args){
		Students s1 = new Students();
		s1.marks=90;
		s1.name="Tanuja";
		s1.display();
		Students s2 = new Students();
		s2.marks=99;
		s2.name="Anuja";
		s2.display();
	}
}
class Students{
	int marks;
	String name;
	void display(){
		System.out.println("Name:"+name);
		System.out.println("Marks:"+marks);
	}
}