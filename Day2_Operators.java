
/*
https://www.hackerrank.com/challenges/30-operators/problem?h_r=email&unlock_token=67cdd1fb163724626c83c9d644822ff719724ca6
&utm_campaign=30_days_of_code_continuous&utm_medium=email&utm_source=daily_reminder

*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day2_Operators {

    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double tip;
        double tax;
        double total_cost;
        tip=meal_cost*tip_percent/100;
        tax=meal_cost*tax_percent/100;
        total_cost=meal_cost+tip+tax;
        System.out.print(Math.round(total_cost));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
       

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}
