package prob1;
import java.util.Scanner;
public class PasswordChecker {
	public static void  main(String[] args){
		String pass;
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.printf("%40s" , "Input a password:","\n");
			pass = scan.nextLine();
			if(pass==null || pass.isEmpty()){
				System.out.printf("%40s" , "Have a good day!");
				break;
			}
			System.out.printf("%40s%5s%1s" , "Proposed password:",pass,"\n");
			System.out.printf("%40s%5b%1s" , "isLevel1():",isLevel1(pass),"\n");
			System.out.printf("%40s%5b%1s" , "isLevel2():",isLevel2(pass),"\n");
			
		}
		
	}
	public static boolean isLevel1(String password){
		boolean lcase = false;
		boolean ucase = false;
		boolean dig = false;
		for(int i = 0;i<password.length();i++){
			if(Character.isSpaceChar(password.charAt(i)))
				return false;
			if((lcase&&ucase)||(lcase&&dig)||(ucase&&dig))
				return true;
			if(Character.isDigit(password.charAt(i))){
				dig = true;
				continue;
			}
			if(Character.isUpperCase(password.charAt(i))){
				ucase = true;
				continue;
			}
			if(Character.isLowerCase(password.charAt(i))){
				lcase = true;
				continue;
			}
		}
		return false;
	}
	public static boolean isLevel2(String password){
		boolean lcase = false;
		boolean ucase = false;
		boolean dig = false;
		for(int i = 0;i<password.length();i++){
			if(Character.isSpaceChar(password.charAt(i)))
				return false;
			if(lcase&&ucase&&dig)
				return true;
			if(Character.isDigit(password.charAt(i))){
				dig = true;
				continue;
			}
			if(Character.isUpperCase(password.charAt(i))){
				ucase = true;
				continue;
			}
			if(Character.isLowerCase(password.charAt(i))){
				lcase = true;
				continue;
			}
		}
		return false;
	}
	
}
