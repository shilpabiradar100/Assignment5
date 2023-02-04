package Basic_Core_Program;
import java.util.*;
public class FlipCoin {
    public static void main(String[] args) {
       /* int heads = 0, tails = 0;
        double headsPercent, tailsPercent;
        System.out.print("Enter number of times coin should flip : ");
        Scanner sc = new Scanner(System.in);
        int flips = sc.nextInt();
        int result = Integer.signum(flips);
        if (result == 1) {
            double headPer, tailPer;

            Scanner scan = new Scanner(System.in);
            System.out.print("Enter flips : ");
            flips = scan.nextInt();

            int ans = Integer.signum(flips);

            if (ans == 1) {
                for (int i = 1; i <= flips; i++) {
                    if (Math.random() < 0.5) {
                        tails++;
                    } else {
                        if (Math.random() > 0.5) {
                            heads++;
                        } else {
                            tails++;
                        }
                    }
                    headsPercent = (heads * 100) / flips;
                    tailsPercent = (tails * 100) / flips;
                    System.out.println("Heads : " + headsPercent);
                    System.out.println("Tails : " + tailsPercent);
                } else if (result == -1)
                {
                    System.out.println("Please enter positive number.");
                } else {
                    System.out.println("You enter 0");
                    headPer = (float) ((heads * 100) / flips);
                    tailPer = (float) ((tails * 100) / flips);
                    System.out.println("Heads :" + headPer + " \nTails: " + tailPer);
                }else if (ans == -1) {
                    System.out.println("Dont Enter Negative Number");
                } else {
                    System.out.println("You Entered 0");
                }
            }
        }*/
        int headCount=0,tailCount=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.of times you want to flip the coin:");
        int n = sc.nextInt();
        for (int i=1;i<=n;i++) {
            double random = Math.random();
            if (random < 0.5) {
                tailCount++;
                System.out.println("Tails");
            } else {
                headCount++;
                System.out.println("Heads");
            }
        }
        System.out.println(headCount+" no.of tmes head flip the coin");
        System.out.println(tailCount+" no.of tmes tail flip the coin");
        double headPercentage=headCount/(double)n *100;
        double tailPercentage=tailCount/(double)n *100;
        System.out.println("Percentage of head is:"+headPercentage);
        System.out.println("Percentage of tail is:"+tailPercentage);
    }
}