/*1.Instance variable instance method madhe chaltat
op:error: non-static variable marks cannot be referenced from a static context
                System.out.println("Marks:"+marks);*/
class Demo{
	public static void main(String[]args){
		Students s = new Students();
		s.education();
		Students.fun(); 
	}
}
class Students{
	int marks=10;
	void education(){
		System.out.println("Marks:"+marks);
	}
	static void fun(){
		System.out.println("Marks:"+marks);
	}
}