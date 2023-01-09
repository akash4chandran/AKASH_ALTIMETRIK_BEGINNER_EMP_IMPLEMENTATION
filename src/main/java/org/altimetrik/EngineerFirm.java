package org.altimetrik;

public class EngineerFirm implements Company {

    private int[] incomes;

    public EngineerFirm() {
        System.out.println("Incomes of engineers credited");
    }

    @Override
    public void assignSalaries(int[] salaries) {
        System.out.println("Entering assignSalaries()");
        this.incomes = salaries;
        System.out.println("Leaving assignSalaries()");
    }

    @Override
    public void averageSalary() {
        System.out.println("Entering averageSalary()");
        double sumIncome = 0;
        for (int in : incomes) {
            sumIncome += in;
        }
        double avgSalary = sumIncome / incomes.length;
        System.out.println("Average salary of engineers is " + avgSalary);
        System.out.println("Leaving averageSalary()");
    }

    @Override
    public void maxSalary() {
        System.out.println("Entering maxSalary()");
        int maxIncome = incomes[0];
        for (int in : incomes) {
            maxIncome = in > maxIncome ? in : maxIncome;
        }
        System.out.println("Maximum salary amongst engineers is " + maxIncome);
        System.out.println("Leaving maxSalary()");
    }

    @Override
    public void minSalary() {
        System.out.println("Entering minSalary()");
        int minIncome = incomes[0];
        for (int in : incomes) {
            minIncome = in < minIncome ? in : minIncome;
        }
        System.out.println("Minimum salary amongst engineers is " + minIncome);
        System.out.println("Leaving minSalary()");
    }
}
