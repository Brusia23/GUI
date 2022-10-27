import java.util.Scanner;

public class DreamVacation{
    public static void main(String[] args){
        Scanner placeScan = new Scanner(System.in);
        System.out.println("Where do you dream of going?");
        String place = placeScan.nextLine();
        Scanner doScan = new Scanner(System.in);
        System.out.println("What would you like to do there?");
        String action = doScan.nextLine();

        System.out.println("Welcome to Boston!");
        System.out.println("Even though this isn't " + place + ", I hope you will still like it!");
        System.out.println("In Boston, you can visit historical monuments, although you won't be able to " + action + ".");        
        
    }
}