/*op:
10
50
50
50*/
class Demo{
	public static void main(String[]args){
		Students s = new Students();
		s.fun();
		s.gun(s);
		Students s2 = new Students();
		s.fun();
		s.gun(s);
	}
}
class Students{
	int a=10;
	void fun(){
		System.out.println(a);
		this.a=50;
	}
	static void gun(Students s){
		System.out.println(s.a);
	}
}