//import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class IndianBank{
    Scanner input = new Scanner(System.in);
    void personalLoan(double loanAmt, int nofyrs){
        double annualIntrate = 12;
        double monthlyIntrate = annualIntrate/1200;
        double monthlypay = loanAmt * monthlyIntrate /(1-1/Math.pow(1+monthlyIntrate,nofyrs*12 ));
        double totalpay = monthlypay*nofyrs*12;
        System.out.println("The monthly payment is : " + (int)(monthlypay*100/100.0));
        System.out.println("The total payment is : "+ (int)(totalpay*100/100.0));
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");
		Calendar c = Calendar.getInstance();
        c.add(Calendar.DATE, 30);
        String newDate = dateFormat.format(c.getTime());  
        System.out.println("The next payment should be done within : ");
		System.out.println(" EMI Date:"+newDate); 
        

  }
  void goldloan(int grams, int tenure){
    double annualIntrate = 10;
    double monthlyIntrate = annualIntrate/1200;
    double loanamount = grams*4800;
    double monthlypay = loanamount * monthlyIntrate /(1-1/Math.pow(1+monthlyIntrate,tenure*12 ));
    double totalpay = monthlypay*tenure*12;
    System.out.println("The monthly payment is : " + (int)(monthlypay*100/100.0));
    System.out.println("The total payment is : "+ (int)(totalpay*100/100.0));
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");
	Calendar c = Calendar.getInstance();
    c.add(Calendar.DATE, 30);
    String newDate = dateFormat.format(c.getTime());  
    System.out.println("The next payment should be done within : ");
    System.out.println("EMI Date:"+newDate); 
    
	
    

}
public static void main(String args[]) {
    System.out.println("Dear User, Please Select the Bank : \n1.Indian Bank \n2.HDFC Bank \n3.AXIS Bank");
      Scanner in = new Scanner(System.in);
      int bch = in.nextInt();
      if(bch == 1){
        System.out.println("Dear User, Welcome to Indian Bank");
        System.out.println("Dear User, Please Select the Loan Type : \n1.Personal Loan \n2.Educational Loan \n3.Housing Loan \n4.Gold Loan");
        int ch = in.nextInt();
        switch(ch){
            case 1:
            System.out.println("Enter the Principal Amount : ");
            double princamt = in.nextDouble();
            System.out.println("Enter the number of years : ");
            int yrs = in.nextInt();
            IndianBank obj = new IndianBank();
            obj.personalLoan(princamt,yrs);
            break;

            case 2:
            System.out.println("Enter the Principal Amount : ");
            double Edprincamt = in.nextDouble();
            System.out.println("Enter the number of years : ");
            int years = in.nextInt();
            IndianBank Edobj = new IndianBank();
            Edobj.personalLoan(Edprincamt,years);
            break;

            case 3:
            System.out.println("Enter the Principal Amount : ");
            double Houprincamt = in.nextDouble();
            System.out.println("Enter the number of years : ");
            int Hyrs = in.nextInt();
            IndianBank Hobj = new IndianBank();
            Hobj.personalLoan(Houprincamt,Hyrs);
            break;

            case 4:
            System.out.println("Enter the Amount of gold in grams : ");
            int Goldprincamt = in.nextInt();
            System.out.println("Enter the number of years : ");
            int Gyears = in.nextInt();
            IndianBank Gobj = new IndianBank();
            Gobj.goldloan(Goldprincamt,Gyears);
            break;
        }
           
    }
       if(bch == 2){
        System.out.println("Dear User, Welcome to HDFC Bank");
        System.out.println("Dear User, Please Select the Loan Type : \n1.Personal Loan \n2.Educational Loan \n3.Housing Loan \n4.Gold Loan");
        int ch = in.nextInt();
        switch(ch){
            case 1:
            System.out.println("Enter the Principal Amount : ");
            double princamt = in.nextDouble();
            System.out.println("Enter the number of years : ");
            int yrs = in.nextInt();
            IndianBank obj = new IndianBank();
            obj.personalLoan(princamt,yrs);
            break;

            case 2:
            System.out.println("Enter the Principal Amount : ");
            double Edprincamt = in.nextDouble();
            System.out.println("Enter the number of years : ");
            int years = in.nextInt();
            IndianBank Edobj = new IndianBank();
            Edobj.personalLoan(Edprincamt,years);
            break;

            case 3:
            System.out.println("Enter the Principal Amount : ");
            double Houprincamt = in.nextDouble();
            System.out.println("Enter the number of years : ");
            int Hyrs = in.nextInt();
            IndianBank Hobj = new IndianBank();
            Hobj.personalLoan(Houprincamt,Hyrs);
            break;

            case 4:
            System.out.println("Enter the Amount of gold in grams : ");
            int Goldprincamt = in.nextInt();
            System.out.println("Enter the number of years : ");
            int Gyears = in.nextInt();
            IndianBank Gobj = new IndianBank();
            Gobj.goldloan(Goldprincamt,Gyears);
            break;
        }
       } 
       if(bch == 3){
        System.out.println("Dear User, Welcome to AXIS Bank");
        System.out.println("Dear User, Please Select the Loan Type : \n1.Personal Loan \n2.Educational Loan \n3.Housing Loan \n4.Gold Loan");
        int ch = in.nextInt();
        switch(ch){
            case 1:
            System.out.println("Enter the Principal Amount : ");
            double princamt = in.nextDouble();
            System.out.println("Enter the number of years : ");
            int yrs = in.nextInt();
            IndianBank obj = new IndianBank();
            obj.personalLoan(princamt,yrs);
            break;

            case 2:
            System.out.println("Enter the Principal Amount : ");
            double Edprincamt = in.nextDouble();
            System.out.println("Enter the number of years : ");
            int years = in.nextInt();
            IndianBank Edobj = new IndianBank();
            Edobj.personalLoan(Edprincamt,years);
            break;

            case 3:
            System.out.println("Enter the Principal Amount : ");
            double Houprincamt = in.nextDouble();
            System.out.println("Enter the number of years : ");
            int Hyrs = in.nextInt();
            IndianBank Hobj = new IndianBank();
            Hobj.personalLoan(Houprincamt,Hyrs);
            break;

            case 4:
            System.out.println("Enter the Amount of gold in grams : ");
            int Goldprincamt = in.nextInt();
            System.out.println("Enter the number of years : ");
            int Gyears = in.nextInt();
            IndianBank Gobj = new IndianBank();
            Gobj.goldloan(Goldprincamt,Gyears);
            break;
        }

       }
}

}

class HdfcBank extends IndianBank{
    @Override
    void personalLoan(double princamt, int years){
        double annualIntrate = 7.5;
        double monthlyIntrate = annualIntrate/1200;
        double monthlypay = princamt * monthlyIntrate /(1-1/Math.pow(1+monthlyIntrate,years*12 ));
        double totalpay = monthlypay*years*12;
        System.out.println("The monthly payment is : " + (int)(monthlypay*100/100.0));
        System.out.println("The total payment is : "+ (int)(totalpay*100/100.0));
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");
		Calendar c = Calendar.getInstance();
        c.add(Calendar.DATE, 30);
        String newDate = dateFormat.format(c.getTime());  
        System.out.println("The next payment should be done within : ");
        System.out.println("EMI Date:"+newDate); 
        
        
}
    @Override
    void goldloan(int grams, int tenure){
        double annualIntrate = 9.8;
        double monthlyIntrate = annualIntrate/1200;
        double loanamount = grams*4800;
        double monthlypay = loanamount * monthlyIntrate /(1-1/Math.pow(1+monthlyIntrate,tenure*12 ));
        double totalpay = monthlypay*tenure*12;
        System.out.println("The monthly payment is : " + (int)(monthlypay*100/100.0));
        System.out.println("The total payment is : "+ (int)(totalpay*100/100.0));
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DATE, 30);
        String newDate = dateFormat.format(c.getTime());  
        System.out.println("EMI Date:"+newDate); 
        System.out.println("The next payment should be done within : ");
        
        

}
}
class AxisBank extends IndianBank{
    @Override
    void personalLoan(double princamt, int years){
        double annualIntrate = 8.5;
        double monthlyIntrate = annualIntrate/1200;
        double monthlypay = princamt * monthlyIntrate /(1-1/Math.pow(1+monthlyIntrate,years*12 ));
        double totalpay = monthlypay*years*12;
        System.out.println("The monthly payment is : " + (int)(monthlypay*100/100.0));
        System.out.println("The total payment is : "+ (int)(totalpay*100/100.0));
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");
		Calendar c = Calendar.getInstance();
        c.add(Calendar.DATE, 30);
        String newDate = dateFormat.format(c.getTime());  
        System.out.println("The next payment should be done within : ");
		System.out.println("EMI Date:"+newDate); 
        
}
    @Override
    void goldloan(int grams, int tenure){
        double annualIntrate = 11.7;
        double monthlyIntrate = annualIntrate/1200;
        double loanamount = grams*4800;
        double monthlypay = loanamount * monthlyIntrate /(1-1/Math.pow(1+monthlyIntrate,tenure*12 ));
        double totalpay = monthlypay*tenure*12;
        System.out.println("The monthly payment is : " + (int)(monthlypay*100/100.0));
        System.out.println("The total payment is : "+ (int)(totalpay*100/100.0));
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DATE, 30);
        String newDate = dateFormat.format(c.getTime());  
        System.out.println("The next payment should be done within : ");
        System.out.println("EMI Date:"+newDate); 
        

}
}


  
