public class MaintenanceCost
{
    public static void main(String[] args)
    {
    double springMaintenanceCost = 1000.15;
    double summerMaintenanceCost = 1200.32;
    double fallMaintenanceCost = 1250.43;
    double winterMaintenanceCost = 1400.00;
    double yearlyMaintenanceCost = springMaintenanceCost + summerMaintenanceCost + fallMaintenanceCost + winterMaintenanceCost;
        System.out.println("The Spring Maintenance Cost is $" + springMaintenanceCost + " and the summer maintenance cost is $" + summerMaintenanceCost +
                " and the fall maintenance cost is $" + fallMaintenanceCost + " and the winter maintenance cost is \n" + winterMaintenanceCost +
                " and the yearly maintenance cost is $" + yearlyMaintenanceCost);
    }
}
