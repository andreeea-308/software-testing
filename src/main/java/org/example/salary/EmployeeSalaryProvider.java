package org.example.salary;

public class EmployeeSalaryProvider {

    private static final int BASE_SALARY = 1000;

    public int getSalary(EmployeeType employeeType){
        switch (employeeType) {
            case JUNIOR:
                return BASE_SALARY;
            case MIDDLE:
                return BASE_SALARY + 100;
            case SENIOR:
                return (BASE_SALARY * 2) + 200;
            default:
                throw new RuntimeException("Oops! Could not provide salary for employeeType --> " + employeeType + " <--" );
        }
    }
}

/**
 * TODO Please answer to following questions:
 *
 * - What this code do? Understand the algorithm for each case
 * - Decide for which EmployeeType will be thrown the exception
 * - Write unit tests to assuring this method works as expected
 */
