import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number");
        String phNo1= sc.next();
        CellPhone mobile=new CellPhone(phNo1);
        System.out.println("calling no?");
        String phNo= sc.next();
       mobile.isPowerOn();
       mobile.callNumber(phNo);
       mobile.isRinginging(phNo);
       if(mobile.getisRinging()){
        System.out.println("want to recive the call yes/no");
       }else{
           System.out.println("not a valid number");
       }
        String answer= sc.next();
       mobile.recieveCall(answer);


    }
}