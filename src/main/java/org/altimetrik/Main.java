package org.altimetrik;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Fetches the total engineers count.
        int engineersCount = scanner.nextInt();
        if (engineersCount <= 0) {
            System.out.println("Engineers count should be greater than zero.");
            return;
        }

        //Fetches the total accountants count.
        int accountantsCount = scanner.nextInt();
        if (accountantsCount <= 0) {
            System.out.println("Accountants count should be greater than zero.");
            return;
        }

        //Fetches all the engineers salary and inserted into the engineersSalary array.
        int[] engineersSalary = new int[engineersCount];
        for (int engineerSalary = 0; engineerSalary < engineersCount; engineerSalary++) {
            engineersSalary[engineerSalary] = scanner.nextInt();
        }

        //Fetches all the accountants salary and inserted into the accountantsSalary array.
        int[] accountantsSalary = new int[accountantsCount];
        for (int accountantSalary = 0; accountantSalary < accountantsCount; accountantSalary++) {
            accountantsSalary[accountantSalary] = scanner.nextInt();
        }

        EngineerFirm engineerFirm = new EngineerFirm();
        AccountantFirm accountantFirm = new AccountantFirm();
        engineerFirm.assignSalaries(engineersSalary);
        engineerFirm.averageSalary();
        engineerFirm.maxSalary();
        engineerFirm.minSalary();
        accountantFirm.assignSalaries(accountantsSalary);
        accountantFirm.averageSalary();
        accountantFirm.maxSalary();
        accountantFirm.minSalary();
    }
}