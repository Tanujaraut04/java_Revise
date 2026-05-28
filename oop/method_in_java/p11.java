/* error: non-static variable a cannot be referenced from a static context
object create kela tri pn address pass hot nahi*/
class Demo{
	public static void main(String[]args){
		Students s = new Students();
		s.fun();
	}
}
class Students{
	int a=10;
	static void fun(){
		System.out.println(a);
	}
		
} 