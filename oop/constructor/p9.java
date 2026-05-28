/*Parameterize Constructor:
error: constructor Students in class Students cannot be applied to given types;
                Students s = new Students(10);
                             ^
  required: no arguments
  found:    int
  reason: actual and formal argument lists differ in length*/
class Demo{
	public static void main(String[]args){
		Students s = new Students(10);
	}
}
class Students{
	Students(){
		System.out.println("In Constructor");
	}
}