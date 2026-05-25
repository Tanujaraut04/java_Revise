/*op:
Tanuja
925858445
Raut
798154996
TanujaRaut
2061475679
TanujaRaut
140435067*/
class Demo{
	public static void main(String[]args){
		String s="Tanuja";
		System.out.println(s);
	System.out.println(System.identityHashCode(s));
		String s1="Raut";

		System.out.println(s1);
	System.out.println(System.identityHashCode(s1));
		s1=s+s1;
		System.out.println(s1);
	System.out.println(System.identityHashCode(s1));
		String s2="TanujaRaut";
		System.out.println(s2);
	System.out.println(System.identityHashCode(s2));

	}
}