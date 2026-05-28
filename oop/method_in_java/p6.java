/*jri static method la object create karun call kela tri address automatic pass hot nahi*/
class Demo{
	public static void main(String[]args){
		Students s = new Students();
		s.fun();
		s.gun();
	}
}
class Students{
	int a=10;
	void fun(){
		System.out.println(a);
	}
	static void gun(){
		System.out.println(a);
	}
}