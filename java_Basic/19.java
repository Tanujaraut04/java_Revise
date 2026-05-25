class Demo{
	public static void main(String[]args){
		Codex.g.fun();	
	}
}
class Codex{
	static CodeGurucool g=new CodeGurucool();
}
class CodeGurucool{
	void fun(){
		System.out.println("In fun......");
	}
}