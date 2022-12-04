import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
	    int x=0;
	    Search obj=new Search();
	    obj.show_services_type();
	    x=input.nextInt();
	    obj.create_object(x);
	    x=input.nextInt();
	    System.out.println(obj.choose_services_type(x));
	    

	}

}
