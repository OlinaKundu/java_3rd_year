
/* Create a class called Employee which maintains the details of an employee (EID, Name, Basic, City). The class
contain the following member function
i) Takes all the details of Employee.
ii) Shows the details of an employee
iii) Find the gross salary of an employee.
Create two subclasses Company1 and Company2 which inherits the parent class Employee but the salary structure
is different than the Employee class. Override the function Salary() according to the company1’s and company2’s
salary structure. Considering salary structure of Company1, AGP is 40% of the basic pay. Company provides 25%
DA and 10% HRA on the merged basic (Basic+ AGP). Similarly, Company2 provides AGP 50% of the basic pay.
They also provide 50% DA and 15% HRA on the merged basic (Basic+ AGP). Create a main class to instantiate
several objects of these classes and implement the above-stated function.*/

class Employee{
    int EID;
    String name,city;
    double basic;
    //take all details
    Employee(int EID,String name,double basic,String city){
        this.EID=EID;
        this.name=name;
        this.basic=basic;
        this.city=city;
    }
    //show
    public void showdetails(){
        System.out.println("Employee ID:"+EID);
        System.out.println("Employee Name:" + name);
        System.out.println("Employee Basic Salary:" + basic);
        System.out.println("employee city:" + city);
    }
    public double salary(){
        return basic;
    }
    public void showSalary(){
        System.out.println("Gross Salary:" + salary());
    }
}
class Company1 extends Employee{
    Company1(int EID, String name, double basic, String city){
        super(EID,name,basic,city);
    }
    @Override
    public double salary(){
        double AGP=0.4*basic;
        double mergedBasic=basic+AGP;
        double DA=0.25*mergedBasic;
        double HRA=0.1*mergedBasic;
        double grossSalary=mergedBasic+DA+HRA;
        return grossSalary;
    }
}

class Company2 extends Employee {

    Company2(int EID, String name, double basic, String city) {
        super(EID, name, basic, city);
    }

    // Override salary calculation
    @Override
    public double salary() {
        double AGP = 0.5 * basic;
        double mergedBasic = basic + AGP;
        double DA = 0.50 * mergedBasic;
        double HRA = 0.15 * mergedBasic;
        return mergedBasic + DA + HRA;
    }
}

public class asg8a {
    public static void main(String[] args) {
        Company1 emp1 = new Company1(101, "Alice", 50000, "Kolkata");
        Company1 emp2 = new Company1(102, "Bob", 60000, "Mumbai");

        // Employee objects from Company2
        Company2 emp3 = new Company2(201, "Charlie", 70000, "Delhi");
        Company2 emp4 = new Company2(202, "David", 80000, "Chennai");

        System.out.println("------ Company1 Employees ------");
        emp1.showdetails();
        emp1.showSalary();
        System.out.println();

        emp2.showdetails();
        emp2.showSalary();
        System.out.println();

        System.out.println("------ Company2 Employees ------");
        emp3.showdetails();
        emp3.showSalary();
        System.out.println();

        emp4.showdetails();
        emp4.showSalary();
    }
}

