/*op:
Tanuja
925858445
Tanuja
925858445
Normal way ni string create keli tr SCP vr jate aani same contain asel tr exist address la point krte
*/
class Demo{
	public static void main(String[]args){
		String s = "Tanuja";
		System.out.println(s);
		System.out.println(System.identityHashCode(s));
		String s1="Tanuja";
		System.out.println(s1);
		System.out.println(System.identityHashCode(s1));
		
	}
}