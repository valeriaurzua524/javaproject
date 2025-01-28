public class javaproject {
    private String name;
    private String employeeNumber;
    private String hireDate;
//contructor
    public javaproject(String name, String employeeNumber, String hireDate) {
        this.name = name;
        this.employeeNumber = employeeNumber;
        this.hireDate = hireDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public String getHireDate() {
        return hireDate;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create a Worker object
        javaproject worker = new javaproject("John Doe", "123-A", "01/15/2022");

        // Display initial worker information
        System.out.println("Initial Worker Information:");
        System.out.println("Name: " + worker.getName());
        System.out.println("Employee Number: " + worker.getEmployeeNumber());
        System.out.println("Hire Date: " + worker.getHireDate());

        // Modify the worker's information
        worker.setName("Jane Smith");
        worker.setEmployeeNumber("456-B");
        worker.setHireDate("05/20/2023");

        // Display updated worker information
        System.out.println("\nUpdated Worker Information:");
        System.out.println("Name: " + worker.getName());
        System.out.println("Employee Number: " + worker.getEmployeeNumber());
        System.out.println("Hire Date: " + worker.getHireDate());
    }
}
