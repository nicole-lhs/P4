/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nicole
 */
public class TestEmployee {
    
    public static void main(String[] args){
        Employee emp1 = new Employee("Xiao Ming", 5000.00);
        Employee emp2 = new Employee("Xiao Hua");
        emp1.raiseSalary(8.0);
        emp2.setSalary(3000.00);
        
        if(emp1.getSalary()>emp2.getSalary()){
            System.out.println(emp1.getSalary());
        }
        else{
            System.out.println(emp2.getSalary());
        }
        
        System.out.print(emp1.getSalary() + " + " + emp2.getSalary() + " = " + (emp1.getSalary() + emp2.getSalary()));  
    }
     
     
     /*part b
     //System.out.print("Salary : " + emp1.salary);
     System.out.print("Salary : " + emp1.getSalary);
     
     emp1.raiseSalary(8.0);
     
     //System.out.print("Salary : " + emp1.salary);
     System.out.print("Salary : " + emp1.getSalary);
*/
    
     
    
}
