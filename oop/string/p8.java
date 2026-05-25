/*New create kel compulsary new object banto
op:Tanuja
925858445
Tanuja
798154996*/
class Demo{
	public static void main(String[]args){
		String s=new String("Tanuja");
		System.out.println(s);
	System.out.println(System.identityHashCode(s));
		String s1=new String("Tanuja");
		System.out.println(s1);
	System.out.println(System.identityHashCode(s1));
	
	}
}