/*Constructor chaining using this*/
class Demo{
	public static void main(String[]args){
		Employees e1 = new Employees("Tanuja");
		e1.display();
	}

}
class Employees{
	String name;
	int sal;
	Employees(String name){
		this(10);
		this.name=name;
	}
	Employees(int sal){
		this.sal=sal;
	}
	void display(){
		System.out.println(name);
		System.out.println(sal);
	}
	
}