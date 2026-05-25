/*1.Normal Way :SCP
2.Reinitialize
op:
Tanuja
925858445
Vaishu
798154996
3.Address different aahe store different place zalel aahe
4.String are immmutable ha point ethe proof Hoto.
5.Aapan Reinnitialize krtna jr content same nsel tr vegali memory reserve hote.
*/
class Demo{
	public static void main(String[]args){
		String s="Tanuja";
		System.out.println(s);
		System.out.println(System.identityHashCode(s));
		s="Vaishu";
		System.out.println(s);
		System.out.println(System.identityHashCode(s));	
	}
}