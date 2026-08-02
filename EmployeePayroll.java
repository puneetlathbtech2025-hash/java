class EmployeePayroll {

    public static void main(String[] args) {

        // Employee details in String format
        String empId = "101";
        String basicSalary = "50000";
        String bonus = "5000";

        // Convert using Wrapper Classes
        Integer id = Integer.parseInt(empId);
        Double basic = Double.parseDouble(basicSalary);
        Double bonusAmount = Double.parseDouble(bonus);

        // Validation
        if (basic < 0 || bonusAmount < 0) {
            System.out.println("Invalid Salary Details");
        } else {

            double netSalary = basic + bonusAmount;

            System.out.println("Employee Payroll");
            System.out.println("Employee ID: " + id);
            System.out.println("Basic Salary: ₹" + basic);
            System.out.println("Bonus: ₹" + bonusAmount);
            System.out.println("Net Salary: ₹" + netSalary);
        }
    }
}