import java.util.Scanner;
public class SumOfNaturalNumbers {
	int Sum(int num){
		int result = (num*(num+1))/2;
		return result;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enetr the number");
		int input = sc.nextInt();
		SumOfNaturalNumbers s1 = new SumOfNaturalNumbers();
		int output = s1.Sum(input);
		System.out.print(output);
	}
	
}
