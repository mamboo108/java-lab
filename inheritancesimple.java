import java.util.*;
class Employee
{
    String name;
    int phone;
    public Employee(String name,int phone)
    {
        this.name=name;
        this.phone=phone;
    }
}
class Officer extends Employee
{
    String dep;
    public Officer(String name,int phone,String dep)
    {
        super(name,phone);
        this.dep=dep;
    }
    public void display()
    {
        System.out.println("Name"+name);
        System.out.println("Phone"+phone);
        System.out.println("department"+dep);
        
    }
    
}

class Manager extends Employee
{
    String dep;
    public Manager(String name,int phone,String dep)
    {
        super(name,phone);
        this.dep=dep;
    }
    public void display()
    {
        System.out.println("Name"+name);
        System.out.println("Phone"+phone);
        System.out.println("department"+dep);
        
    }
}
public class main
{
    public static void main(String args[])
    {
        Officer offi = new Officer("Antony",999,"accounts");
        Manager man= new Manager("George",777,"marketing");
        offi.display();
        man.display();
    }
}
