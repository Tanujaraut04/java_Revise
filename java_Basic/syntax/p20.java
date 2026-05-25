class Demo{
	public static void main(String[]args){
		Codex c=new Codex();
		c.g.fun();	
	}
}
class Codex{
	 CodeGurucool g=new CodeGurucool();
}
class CodeGurucool{
	void fun(){
		System.out.println("In fun......");
	}
}