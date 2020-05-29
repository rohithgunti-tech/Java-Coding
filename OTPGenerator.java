/* JAVA Program to Generate and Validate an OTP (6 Digits) */

import java.util.*;

class OTPGenerator {
  
  public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);

    char[] otp=generate(); //Stores the otp returned by the Generate Function.
    System.out.println(otp);

    
    String check; //To Validate

    String sotp=new String(otp); //Converting Character Array to String for easy Comparision

    for(int j=2;j>-1;j--) //Giving user 3 chances of entering the correct OTP
    {
      System.out.print("Enter the OTP: ");
      check=sc.nextLine();

    if(sotp.equals(check))
    {
      System.out.println("Login Successful :) ");
      System.exit(0); //Exiting the Program if the Comparision is true.
    }
    else
    {
      if(j==0)
      {
         System.out.println("Sorry !! All Attempts were Completed :( ");

      }
      else{
      System.out.println("Login Failure !!!. "+j+" Attempts Remaining..");
      }
    }
    }

  }

private static char[] generate() {    //Generate function to randomly generate an OTP

  String numbers= "1234567890";
  Random random=new Random();       //Random Function in Util Package
  char[] otp= new char[6];

  for(int i=0;i<6;i++)
  {
    otp[i]= numbers.charAt(random.nextInt(numbers.length())); //Selecting the String randomly and Storing
  }
  return otp;
}

}

}
