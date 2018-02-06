import java.util.Scanner;
public class CountyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("What is the County name?");
		Scanner scan=new Scanner(System.in);
		String CountyName=scan.nextLine();
		
		System.out.println("What is the County population?");
		Scanner scan1=new Scanner(System.in);
		int CountyPopulation=scan1.nextInt();
		
		System.out.println("What year was the County Establsihed?");
		Scanner scan2=new Scanner(System.in);
		int CountyYearEstablished=scan2.nextInt();
		
		System.out.println("What is the County's Land Volume");
		Scanner scan3=new Scanner(System.in);
		int CountyLandVolume=scan3.nextInt();
		
		County County1= new County(CountyName,CountyPopulation,CountyYearEstablished,CountyLandVolume);
		System.out.println(County1.CountyName);
		System.out.println(County1.CountyPopulation);
		System.out.println(County1.CountyYearEstablished);
		System.out.println(County1.CountyLandVolume);
		
	}

}
