import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your salary: ");
        float givenSalary = scanner.nextFloat();

        if ((givenSalary >= 0) && (givenSalary <= 14999)) {
            System.out.println("Your tax rate is 0%" + '\n' +
                    "Your calculated tax is \u00A30" + '\n' +
                    "Your take home pay is \u00A3" + givenSalary);


        } else if ((givenSalary >= 15000) && (givenSalary <= 19999)) {
            float taxedAmount = (float) (givenSalary * 0.1);

            System.out.println("Your tax rate is 10%" + '\n' +
                    "Your calculated tax is \u00A3" + taxedAmount + '\n' +
                    "Your take home pay is \u00A3" + (givenSalary - taxedAmount));
        } else if ((givenSalary >= 20000) && (givenSalary <= 29999)) {
            float taxedAmount = (float) (givenSalary * 0.15);

            System.out.println("Your tax rate is 15%" + '\n' +
                    "Your calculated tax is \u00A3" + taxedAmount + '\n' +
                    "Your take home pay is \u00A3" + (givenSalary - taxedAmount));
        } else if ((givenSalary >= 30000) && (givenSalary <= 39999)) {
            float taxedAmount = (float) (givenSalary * 0.20);

            System.out.println("Your tax rate is 20%" + '\n' +
                    "Your calculated tax is \u00A3" + taxedAmount + '\n' +
                    "Your take home pay is \u00A3" + (givenSalary - taxedAmount));


        } else if (givenSalary >= 45000) {
            float taxedAmount = (float) (givenSalary * 0.25);

            System.out.println("Your tax rate is 25%" + '\n' +
                    "Your calculated tax is \u00A3" + taxedAmount + '\n' +
                    "Your take home pay is \u00A3" + (givenSalary - taxedAmount));
        } else {
            System.out.println("Please try again");
        }
    }
    public String taxCalculation(float givenSalary) {
        if ((givenSalary >= 0) && (givenSalary <= 14999)) {
            String TaxRate = Integer.toString(0);
            String CalculatedTax = Integer.toString(0);
            String FinalSalary = Float.toString(givenSalary);
            return ("Tax rate: " + TaxRate + "% Calculated Tax: " +  CalculatedTax +
                    " Final Salary: "+ FinalSalary);

        } else if ((givenSalary >= 15000) && (givenSalary <= 19999)) {
            float taxedAmount = (float) (givenSalary * 0.1);
            String TaxRate = Integer.toString(10);
            String CalculatedTax = Float.toString(taxedAmount);
            String FinalSalary = Float.toString(givenSalary-taxedAmount);
            return ("Tax rate: " + TaxRate + "% Calculated Tax: " +  CalculatedTax +
                    " Final Salary: "+ FinalSalary);

        } else if ((givenSalary >= 20000) && (givenSalary <= 29999)) {
            float taxedAmount = (float) (givenSalary * 0.15);
            String TaxRate = Integer.toString(15);
            String CalculatedTax = Float.toString(taxedAmount);
            String FinalSalary = Float.toString(givenSalary-taxedAmount);
            return ("Tax rate: " + TaxRate + "% Calculated Tax: " +  CalculatedTax +
                    " Final Salary: "+ FinalSalary);

        } else if ((givenSalary >= 30000) && (givenSalary <= 39999)) {
            float taxedAmount = (float) (givenSalary * 0.20);
            String TaxRate = Integer.toString(20);
            String CalculatedTax = Float.toString(taxedAmount);
            String FinalSalary = Float.toString(givenSalary-taxedAmount);
            return ("Tax rate: " + TaxRate + "% Calculated Tax: " +  CalculatedTax +
                    " Final Salary: "+ FinalSalary);

        } else if (givenSalary >= 45000) {
            float taxedAmount = (float) (givenSalary * 0.25);
            String TaxRate = Integer.toString(25);
            String CalculatedTax = Float.toString(taxedAmount);
            String FinalSalary = Float.toString(givenSalary-taxedAmount);
            return ("Tax rate: " + TaxRate + "% Calculated Tax: " +  CalculatedTax +
                    " Final Salary: "+ FinalSalary);
        } else {
            return "Please try again";
        }
    }
}
