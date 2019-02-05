package employeeApp;

public class Employee
{
    private static int maxId = 0;
    private int id;
    private String fname;
    private String lname;
    private double salary;
    private int companyID;
    private int healthPlanID;

    public Employee (String fname, String lname, double salary, int companyID, int healthPlanID)
    {
        maxId++; // maxId= maxId + 1;
        id = maxId;

        this.fname = fname;
        this.lname = lname;
        this.salary = salary;
        this.companyID = companyID;
        this.healthPlanID = healthPlanID;
    }

    // geters and setters
    public int getId()
    {
        return id;
    }

    public String getNAme()
    {
        return fname + " " + lname;
    }

    public void setFname(String fname)
    {
        this.fname = fname;
    }

    public void setLname(String lname)
    {
        this.lname = lname;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }
}