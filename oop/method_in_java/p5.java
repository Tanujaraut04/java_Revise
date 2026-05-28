class Demo{
	public static void main(String[]args){
		Students s = new Students();
		s.fun();
		Students.gun(s);
	}
}
class Students{
	int a=10;
	void fun(){
		System.out.println(a);
	}
	static void gun(Students c){
		System.out.println(c.a);
	}
}