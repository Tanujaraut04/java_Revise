/*error: incompatible types: possible lossy conversion from int to char
                char  ch=a;*/
class Demo{
	public static void main(String[]args){
		int a=65;
		char  ch=a;
		System.out.println(ch);
	}
}