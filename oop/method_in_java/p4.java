/*static method madhe instance varible direct access hot nahi karan instance variable object madhe jaga milte static method la call krayla object create krav lagat nahi mhun te direct access hot nahi tyamule aapan object create karun reference varible cha address send krto

op:10*/
class Demo{
	public static void main(String[]args){
		Students s = new Students();
		s.fun(s);
	}
}
class Students{
	int a=10;
	static void fun(Students s){
		System.out.println(s.a);
	}
}