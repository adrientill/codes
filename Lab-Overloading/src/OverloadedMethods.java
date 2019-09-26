
public class OverloadedMethods {


		  public static void main(String[] args) {
		  
		    OverloadedMethods om = new OverloadedMethods();
		    om.print();

		    om.print("Printing from the stringssss");
		  }

		  //overload methods here
		  public void print(){
		    System.out.println("Printing from the orig");
		  }

		  public void print(String str){
		    System.out.println(str);
		  }
		}

