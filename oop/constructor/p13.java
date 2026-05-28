/*Constructor overloading :
1.Tyach class madhe hot
2.Same class Name Different Parameters
3.aapalya data sagla mahit nasel tr jo mahit aahe to bharto pn jr overloading concept nasti  tr error yenar mhun constructor overloading he concept aali aani tyat aapan mahit aselela data bharto aani to tya tya constructor  call jato
op:
Name:Tanuja Salary:200 Position:SDE
Name:Anuja Salary:500 Position:null
Name:Madhuri Salary:800 Position:null*/
class Demo{
	public static void main(String[]args){
		Employees e1 = new Employees("Tanuja",200,"SDE");
		e1.display();
		Employees e2 = new Employees("Anuja",500);
		e2.display();
		Employees e3 = new Employees("Madhuri",800);
		e3.display();

	}
}
class Employees{
	String name;
	int sal;
	String position;
	Employees(String name,int sal,String position){
		this.name=name;
		this.sal=sal;
		this.position=position;
	}
	Employees(String name,int sal){
		this.name=name;
		this.sal=sal;
		
	}
	Employees(String name){
		this.name=name;
		
	}
	void display(){
		System.out.println("Name:"+name+" "+"Salary:"+sal+" "+"Position:"+position);
	}
}