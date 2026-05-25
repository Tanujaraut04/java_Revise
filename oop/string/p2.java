/*1.Normal way aani New create keli tri op same yet aahe
2.difference ky aahe
3.System class madhe ek method aahe identityHashCode name ji adress return krte string 
4.op:Normal Way:Tanuja
2061475679
New Create:Tanuja
140435067
5.Address different aahet store different addresss la hot aahet.
6.Normal Way:SCP
  New Create:Heap */
class Demo{
	public static void main(String[]args){
		String s="Tanuja";
		System.out.println("Normal Way:"+s);
		System.out.println(System.identityHashCode(s));
		String s1 = new String("Tanuja");
		System.out.println("New Create:"+s1);
		System.out.println(System.identityHashCode(s1));
	}
}