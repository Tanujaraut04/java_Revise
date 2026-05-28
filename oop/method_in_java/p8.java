/*
op:
10
10
10
10
address pass karun 

*/
class Demo{
	public static void main(String[]args){
		Codex c1 = new Codex();
		c1.fun();
		c1.gun(c1);
		CodeGurucool c2 = new CodeGurucool();
		c2.fun(c1);
		c2.fun(c1);	
	}
}
class Codex{
	int a=10;
	void fun(){
		System.out.println(a);
	}
	static void gun(Codex c1){
		System.out.println(c1.a);
	}
}
class CodeGurucool{
	void fun(Codex c1){
		System.out.println(c1.a);
	}
	static void gun(Codex c1){
		System.out.println(c1.a);
	}
}