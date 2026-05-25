/*String Comparison
two object la point krt aahe
op:
Tanuja
925858445
Tanuja
798154996
TanujaTanuja
2061475679*/
class Demo{
	public static void main(String[]args){
		String s=new String("Tanuja");
		System.out.println(s);
	System.out.println(System.identityHashCode(s));
		String s1=new String("Tanuja");
		System.out.println(s1);
	System.out.println(System.identityHashCode(s1));
		s=s+s1;
		System.out.println(s);
	System.out.println(System.identityHashCode(s));

	}
}