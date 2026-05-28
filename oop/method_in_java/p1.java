/*Methods in Java
# Instance Method
1.class madhe lihatat
2.non-static 
3.call:object create karun
*/
class Demo{
	public static void main(String[]args){
		Students s1 = new Students();
		s1.education();
	}
}
class Students{
	void education(){
		System.out.println("Hello...");	
	}	
}