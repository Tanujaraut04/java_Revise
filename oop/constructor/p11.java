/*error: constructor Students in class Students cannot be applied to given types;
                Students s1 = new Students(10);
                              ^
  required: no arguments
  found:    int
  reason: actual and formal argument lists differ in length
ByteCode:class Students {
  Students(int);
1 error*/
class Demo{
	public static void main(String[]args){
		Employees s1 = new Employees(10);
	}
}
class Employees{
	 
}