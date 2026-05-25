class Demo{
	public static void main(String[]args){
		Codex c=new Codex();
		Codex v=c.gun();
		v.g.fun();	
	}
}
class Codex{
	void gun(){
		 CodeGurucool g=new CodeGurucool();
	}
}
class CodeGurucool{
	void fun(){
		System.out.println("In fun......");
	}
}