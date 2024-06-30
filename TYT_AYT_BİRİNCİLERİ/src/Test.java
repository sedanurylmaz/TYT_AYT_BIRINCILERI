import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

System.out.println("Welcome to TYT and AYT winner finder program: ");
String transactions = "Transactions...\n"+
       "1.transaction: Find the equal weight students winner\n"+
	   "2.transaction: Find the digital winner\n"+
       "Enter q to exit!";
	Scanner sc = new Scanner(System.in);


while(true) {
	
	 System.out.println(transactions);
	 System.out.println("Select one of them: ");
	 String selection = sc.nextLine();
     if(selection.equals("q")) {
		
		System.out.println("Exiting to program...");
		break;
		
	}

	//First student
	System.out.println("What is the first student name? ");
	String name1 = sc.nextLine();
	System.out.println("What is the students nets?(turkish,mathematic,literature,physic) ");
	int turkish1 = sc.nextInt();
	int math1 = sc.nextInt();
	int lit1 = sc.nextInt();
	int physic1 = sc.nextInt();
	sc.nextLine();

	//Second student
		System.out.println("What is the second student name? ");
		String name2 = sc.nextLine();
		System.out.println("What is the students nets?(turkish,mathematic,literature,physic) ");
		int turkish2 = sc.nextInt();
		int math2 = sc.nextInt();
		int lit2 = sc.nextInt();
		int physic2 = sc.nextInt();
		sc.nextLine();
	
		//Third student
		System.out.println("What is the third student name? ");
		String name3 = sc.nextLine();
		System.out.println("What is the students nets?(turkish,mathematic,literature,physic) ");
		int turkish3 = sc.nextInt();
		int math3 = sc.nextInt();
		int lit3 = sc.nextInt();
		int physic3 = sc.nextInt();
		sc.nextLine();
	
	

	
   
	
	
	if(selection.equals("1")) {
		
		Equal_weight_student student1 = new Equal_weight_student(turkish1, math1, lit1, physic1, name1);
		Equal_weight_student student2 = new Equal_weight_student(turkish2, math2, lit2, physic2, name2);
		Equal_weight_student student3 = new Equal_weight_student(turkish3, math3, lit3, physic3, name3);
		
		Equal_weight_student winner = birinci(student1, student2, student3);
		System.out.println("Winner of the equal weight students: "+winner.getName());
		System.out.println("Point of student: "+winner.calculatePoint());
		
	}
	
	else if(selection.equals("2")) {
	
		Digital student1 = new Digital(turkish1, math1, lit1, physic1, name1);
		Digital student2 = new Digital(turkish2, math2, lit2, physic2, name2);
		Digital student3 = new Digital(turkish3, math3, lit3, physic3, name3);
		
		Digital winner = birinci(student1, student2, student3);
		System.out.println("Winner of the digital students: "+winner.getName());
		System.out.println("Point of student: "+winner.calculatePoint());
		
}
	
	else {
	
	System.out.println("Invalid transaction!");
	
}
	
}
	
	}
	
	public static <E extends Candidate> E birinci(E e1, E e2, E e3) {
		
		if(e1.calculatePoint()>e2.calculatePoint() && e1.calculatePoint()>e3.calculatePoint()) {
			
			return e1;
			
		}
		
		else if(e2.calculatePoint()>e1.calculatePoint() && e2.calculatePoint()>e3.calculatePoint()) {
			
			return e2;
			
		}

		else if(e3.calculatePoint()>e1.calculatePoint() && e3.calculatePoint()>e2.calculatePoint()) {
	
	        return e3;
	
        }
		else {
			
			return e1;
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
