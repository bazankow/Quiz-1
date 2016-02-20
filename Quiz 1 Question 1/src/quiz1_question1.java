import java.util.Scanner;

public class quiz1_question1 {
	
	public static double qb_rating(double comp, double att, double yds, double td, double interceptions)
	{
		System.out.println(comp + "\n" + att + "\n" + yds + "\n" + td + "\n" + interceptions);
		double rating = 0;
		double a = ((comp/att)-0.3)*5;
		double b = ((yds/att)-3)*0.25;
		double c = (td/att)*20;
		double d = 2.375 - (interceptions*25/att);
		
		rating = ((a+b+c+d)/6)*100;
		System.out.println(a + "\n" + b + "\n" + c + "\n" + d + "\n" + rating);
		return rating;
	}
	public static double[] get_info()
	{
		Scanner input = new Scanner(System.in);
		double[] stats = new double[5];
		
		System.out.println("Enter number of completions: ");
		stats[0] = input.nextDouble();
		
		System.out.println("Enter number of attempted passes: ");
		stats[1] = input.nextDouble();
		
		System.out.println("Enter number of yards: ");
		stats[2] = input.nextDouble();
		
		System.out.println("Enter number of touchdowns: ");
		stats[3] = input.nextDouble();
		
		System.out.println("Enter number of interceptions: ");
		stats[4] = input.nextDouble();
		
		return stats;		
	}

	public static void main(String[] args) {
		double[] stats = new double[5];
		double rating;
		stats = get_info();
		System.out.println(stats[0] + "\n" + stats[1] + "\n" + stats[2] + "\n" + stats[3] + "\n" + stats[4]);
		rating = qb_rating(stats[0],stats[1],stats[2],stats[3],stats[4]);
		System.out.println("QB Rating: " + rating);
	}

}
