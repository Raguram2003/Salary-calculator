import java.util.Scanner;


public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sunday : ");
        int sunday = sc.nextInt();
        System.out.println("Monday : ");
        int monday = sc.nextInt();
        System.out.println("Tuesday : ");
        int tuesday = sc.nextInt();
        System.out.println("wednesday : ");
        int wednesday = sc.nextInt();
        System.out.println("Thursday : ");
        int thursday = sc.nextInt();
        System.out.println("Friday : ");
        int friday = sc.nextInt();
        System.out.println("Saturday : ");
        int saturday = sc.nextInt();
        int total_hours=sunday+monday+tuesday+wednesday+thursday+friday+saturday;
        int amount=0;
        if(sunday<=24 && monday<=24 && tuesday<=24 && wednesday<=24 && thursday<=24 && friday<=24 && saturday<=24){
            if(total_hours>40){
                total_hours = (total_hours-40)*25;
            }
            else{
                total_hours = 0;
            }
            if(sunday>8){
                sunday = ((sunday-8)*15)+800+((sunday-8)*100);
                sunday = sunday+((sunday*50)/100);
            }
            else{
                sunday = sunday*100;
                sunday = sunday+((sunday*50)/100);
            }
            if(saturday>8){
                saturday = ((saturday-8)*15)+800+((saturday-8)*100);
                saturday = saturday+((saturday*25)/100);
            }
            else{
                saturday = saturday*100;
                saturday = saturday+((saturday*25)/100);
            }
            if(monday>8){
                monday = ((monday-8)*15)+800+((monday-8)*100);
            }
            else{
                monday = monday*100;
            }
            if(tuesday>8){
                tuesday = ((tuesday-8)*15)+800+((tuesday-8)*100);
            }
            else{
                tuesday = tuesday*100;
            }
            if(wednesday>8){
                wednesday = ((wednesday-8)*15)+800+((wednesday-8)*100);
            }
            else{
                wednesday = wednesday*100;
            }
            if(thursday>8){
                thursday = ((thursday-8)*15)+800+((thursday-8)*100);
            }
            else{
                thursday = thursday*100;
            }
            if(friday>8){
                friday = ((friday-8)*15)+800+((friday-8)*100);
            }
            else{
                friday = friday*100;
            }
            amount = sunday+monday+tuesday+wednesday+thursday+friday+saturday+total_hours;
            System.out.println("total amount : "+amount);
        }
        else {
            System.out.println("!!! Enter valid hours !!!");
        }
    }
}
