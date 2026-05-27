/*Constructor ni initialize ch problem solve kela aani constructor chya aata aapan sop lihu shkto pn object create kelyvr lagech call jato constructor la mhun control krta yet nahi method lihali tr jevha lagnr aahe tevha call karu shakto*/
class Demo{
	public static void main(String[]args){
		Students s1 = new Students("Tanuja",90);
		Students s2 = new Students("Anuja",99);
		s1.display();
		s2.display();
	}
}
class Students{
	String name;
	int marks;
	Students(String a,int b){
		name=a;
		marks=b;
	}
	void display(){
		System.out.println("Name:"+name);
		System.out.println("Marks:"+marks);
	}
}