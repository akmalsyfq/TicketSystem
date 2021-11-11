import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int choice, totalfee, count1, totalfee1, fee, count2, ok, totalfee2, count3, totalfee3, count4, totalfee4, revenue;
        
        revenue = 12500;
        choice = 0;
        count1 = 0;
        count2 = 0;
        count3 = 0;
        count4 = 0;
        totalfee = 0;
        totalfee1 = 0;
        totalfee2 = 0;
        totalfee3 = 0;
        totalfee4 = 0;
        ok = 0;
        while (choice != 5) {
            System.out.println("Category and Fee  1.Adult 50  2.Children 30  3.Senior 25  4.International 80  5.Exit");
            choice = input.nextInt();
            if (choice == 1) {
                fee = 50;
                totalfee1 = fee + totalfee1;
                count1 = count1 + 1;
            } else {
                if (choice == 2) {
                    fee = 30;
                    totalfee2 = fee + totalfee2;
                    count2 = count2 + 1;
                } else {
                    if (choice == 3) {
                        fee = 25;
                        totalfee3 = fee + totalfee3;
                        count3 = count3 + 1;
                    } else {
                        if (choice == 4) {
                            fee = 80;
                            totalfee4 = fee + totalfee4;
                            count4 = count4 + 1;
                        }
                    }
                }
            }
        }
        totalfee = totalfee1 + totalfee2 + totalfee3 + totalfee4;
        ok = totalfee - revenue;
        System.out.println("Adult " + count1 + " " + totalfee1 + "Child " + count2 + " " + totalfee2 + "Senior " + count3 + " " + totalfee3 + "International " + count4 + " " + totalfee4 + "Total " + totalfee + "Revenue" + ok);
    }
}