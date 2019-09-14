package design;

import java.util.ArrayList;
import java.util.List;

public class FortuneEmployee {

    /**
     * FortuneEmployee class has a main methods where you will be able to create Object from
     * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible
     * to use with proper business work flow.Think as a Software Architect, Product Designer and
     * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
     * more to design an application that will meet for fortune 500 Employee Information
     * Services.
     * <p>
     * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
     **/
    public static void main(String[] args) {
        EmployeeInfo firstEmployee = new EmployeeInfo("Hisham Raihan", 101, "can collector");
        EmployeeInfo secondEmployee = new EmployeeInfo("Wayel Raihan",102,  "coffee boy");


//		Map<Integer, List<Integer>> compensationMap = new HashMap<>(); //id, {salary, bonus, pension}
        List<Integer> salaryList = new ArrayList<>(3); //salary
        //       List<Integer> bonusList = new ArrayList<>(3);  //bonus

        //salary
        firstEmployee.setMonthlySalary(320);
        secondEmployee.setMonthlySalary(5000);

        salaryList.add(firstEmployee.calculateSalary(320));
        salaryList.add(secondEmployee.calculateSalary(5000));

        //numberOfYearsWithCompany
        ArrayList<Integer> numberOfYearsWithCompany = new ArrayList<>();
        numberOfYearsWithCompany.add(5);
        numberOfYearsWithCompany.add(1);



        //bonus
        ArrayList<Integer> bonusList = new ArrayList<>();
        bonusList.add(firstEmployee.calculateEmployeeBonus(numberOfYearsWithCompany.get(0)));
        bonusList.add(secondEmployee.calculateEmployeeBonus(numberOfYearsWithCompany.get(1)));
        System.out.println(bonusList.get(0));  // test

        //benefitLayout


        System.out.println("Your total annual salary is :::" + firstEmployee.calculateSalary(320));
        System.out.println("Your total annual bonus is :::" + firstEmployee.calculateEmployeeBonus(1));
        System.out.println("Your pension will be :::" + firstEmployee.calculateEmployeePension());





    }

}