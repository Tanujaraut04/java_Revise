/*op:
Tanuja
925858445
Tanuja
925858445*/
class Demo{
	public static void main(String[]args){
		String s="Tanuja";
		System.out.println(s);
	System.out.println(System.identityHashCode(s));
		String s1="Raut";
		s1=s+s1;
		System.out.println(s);
	System.out.println(System.identityHashCode(s));
	}
}