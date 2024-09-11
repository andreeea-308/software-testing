package org.example.salary;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class EmployeeSalaryProviderTest {

    @Test
    public void getSalary_whenEmployerTypeIsJunior_thenReturnBaseSalary1000() {
        EmployeeSalaryProvider employeeSalaryProvider = new EmployeeSalaryProvider();
        int juniorSalary = employeeSalaryProvider.getSalary(EmployeeType.JUNIOR);
        assertThat(juniorSalary).isEqualTo(1000);
    }

    @Test
    public void getSalary_whenEmployerTypeIsMiddle_thenReturnBaseSalary1100() {
        EmployeeSalaryProvider employeeSalaryProvider = new EmployeeSalaryProvider();
        int middleSalary = employeeSalaryProvider.getSalary(EmployeeType.MIDDLE);
        assertThat(middleSalary).isEqualTo(1100);
    }

    @Test
    public void getSalary_whenEmployerTypeIsSenior_thenReturnBaseSalary2200() {
        EmployeeSalaryProvider employeeSalaryProvider = new EmployeeSalaryProvider();
        int seniorSalary = employeeSalaryProvider.getSalary(EmployeeType.SENIOR);
        assertThat(seniorSalary).isEqualTo(2200);
    }

    @Test
    public void getSalary_whenEmployerIsIntern_thenThrowsAnException(){
        EmployeeSalaryProvider employeeSalaryProvider = new EmployeeSalaryProvider();
        Assertions.assertThrows(RuntimeException.class, () -> employeeSalaryProvider.getSalary(EmployeeType.INTERN));
    }

}