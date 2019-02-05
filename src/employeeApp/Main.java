package employeeApp;

public class Main
{
    private static void workWithData()
    {
        HealthPlan h1 = new HealthPlan("My Health 1");
        HealthPlan h2 = new HealthPlan("My Health 2");

        Company c1 = new Company("Company A", 100);
        Company c2 = new Company("Company B", 100);

        Employee emp1 = new Employee("Steve", "Green", 45000, c1.id, h1.getId());
        Employee emp2 = new Employee("May", "Ford", 80000, c1.id, h2.getId());
        Employee emp3 = new Employee("DOug", "Jones", 75000, c2.id, h2.getId());

        System.out.println("*** Query Data ***");
        System.out.println(c1);

        System.out.println("Original divided 5 " + (c1.debt / 5));
        System.out.println("Original divided 5 " + (c1.debt / 5));
        System.out.println("Original divided 7.0 " + (c1.debt / 7.0));
        System.out.println("Original divided 7 " + ((double)c1.debt / 7));
    }
    public static void main(String[] args)
    {
        workWithData();
    }
}