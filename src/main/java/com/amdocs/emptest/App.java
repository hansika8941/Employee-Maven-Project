package com.amdocs.emptest;



class EmployeeDetails {  
int emp_id, salary;  
String name;  
  
//Getter and setters for getting and setting properties  
public int getEmp_id() {  
    return emp_id;  
}  
public void setEmp_id(int emp_id) {  
    this.emp_id = emp_id;  
}  
public int getSalary() {  
    return salary;  
}  
public void setSalary(int salary) {  
    this.salary = salary;  
}  
public String getName() {  
    return name;  
}  
public void setName(String name) {  
    this.name = name;  
}  

//@Override  
public String toString() {  
    return "Employee [emp_id = " + emp_id + ", salary = " + salary + ", name = " + name +  "]";  
    }  
      
}   
public class App{    
    public static void main(String args[]) {  
        EmployeeDetails emp = new EmployeeDetails();  
        emp.setEmp_id(101);  
        emp.setName("Neha Agarwal");   
        emp.setSalary(95000);   
        System.out.println(emp);  
        }         
    }  


  