//Create a Java application where we have an Organization with details like EmpId, EmpName, EmpSalary, EmpDesignation
//, and EmpWorkLocation, OrganizationName. Create instances for Five employees. 
//There is a method named EmployeeDetails with a Class variable as a parameter and it returns nothing. 
//Invoke this method under main and while invoking, According to user choice, 
//the respective employee details should be displayed.Provide Dynamic inputs.
//Note: Do not use an Import statement.
class Organ
{
 static java.util.Scanner scan=new java.util.Scanner(System.in);
 int EmpId=scan.nextInt();
 String EmpName=scan.next();
 int EmpSalary=scan.nextInt();
 String EmpDesignation=scan.next();
 String EmpWorkLocation=scan.next();
 String OrganizationName=scan.next();
 void EmployeeDetails(Organ o)
 {
  System.out.println(o.EmpId);
  System.out.println(o.EmpName);
  System.out.println(o.EmpSalary);
  System.out.println(o.EmpDesignation);
  System.out.println(o.EmpWorkLocation);
  System.out.println(o.OrganizationName);
 }
 public static void main(String args[])
 {
   System.out.print("enter emp details 1");
   Organ emp1=new Organ();

   System.out.print("enter emp details 2");
   Organ emp2=new Organ();
  
   System.out.print("enter emp details 3");
   Organ emp3=new Organ();

   System.out.print("enter emp details 4");
   Organ emp4=new Organ();
   
   System.out.print("enter emp details 5");
   Organ emp5=new Organ();
   
   String s=scan.next();
   switch(s)
   {
    case "emp1":EmployeeDetails(emp1);
    break;
    case "emp2":EmployeeDetails(emp2);
    break;
    case "emp3":EmployeeDetails(emp3);
    break;
    case "emp4":EmployeeDetails(emp4);
    break;
    case "emp5":EmployeeDetails(emp5);
    break;
   }
 }
}
 
  