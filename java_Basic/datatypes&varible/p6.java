/*error: variable a is already defined in method main(String[])*/
class Demo{
	public static void main(String[]args){
		int a=10;
		int a=20;
		System.out.println(a);
	}
}