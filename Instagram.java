

import java.util.Scanner; 
class Instagram 
{
	static String name;
	static String email;
	static long phno;
	
	static String password;
	static String gender;
	static int otp1;

	public static void main(String[] args) 
	{
		
		System.out.println("!!....Welcome to Instagram....!!");
        System.out.println("Create a Account");
		signUp();
	    
	
	}
	public static void signUp()
	{
		Scanner s =new Scanner(System.in);
		System.out.println("Enter your Name");
		 name = s.nextLine();
		System.out.println("Enter your Email Id");
		 email = s.next();
		System.out.println("Enter your Phone Number") ;
        phno = s.nextLong();
		
		System.out.println("Enter a password");
		 password = s.next();
		System.out.println("ReEnter  password");
		String repassword = s.next();
		System.out.println("Enter your Gender");
		 gender = s.next();
		if (password.equals(repassword))
		{
		System.out.println("Account Sucessfully Created.....!");
        logIn();
		}
		else
			System.out.println("Password MisMatch");
	}
	public static void logIn()
	{
		Scanner s =new Scanner(System.in);
		System.out.println("!!.....Welcome to Login Page.....!!\n");
		for (int i =1;i<=3;i++)
		{
		System.out.println("Enter  Email Id");
		String emailid =s.next();
       
		if (emailid.equals(email))
		{
		System.out.println("Enter  password");
		String password1 = s.next();
			if (password1.equals(password))
			{
          System.out.println("LogIn Sucessfully");
		  System.out.println("!!....Welcome to HomePage....!!");
		  break;
			}
			else
			{
				System.out.println("!!....Invalid Password....!!");
				System.out.println("Forget Password");
		        forgetPass();
			}
		}
		else
		{
			System.out.println("!!....Invalid userid....!!");
			System.out.println("!!....Try Again....!!");
		}
	  }
	}
	public static void forgetPass()
	{
		OTP();
		System.out.println("Your OTP is "+otp1);
		Scanner s =new Scanner(System.in);
		System.out.println("Enter your OTP") ;
		int otp2 = s.nextInt();
        if (otp2==otp1)
        {
        System.out.println("Enter a password");
		String newpass1 = s.next();
		System.out.println("ReEnter  password");
		String newpass2 = s.next();
        }
		else
		{
			System.out.println("Invalid OTP input");
		}
		
	}
	public static void OTP()
	{
		Scanner s =new Scanner(System.in);
		System.out.println("Enter your Phone Number") ;
		long phno1 = s.nextLong();
		if (phno1==phno)
		{
			int min = 1000;
			int max = 9999;
			otp1 = (int)(Math.random()*(max-min+1)+min); 
			
		}
	}

}
