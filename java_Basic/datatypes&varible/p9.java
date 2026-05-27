/*error: incompatible types: possible lossy conversion from int to char
                char ch=65536;*/
class Demo{
	public static void main(String[]args){
		char ch=65536;
		System.out.println(ch);
	}
}