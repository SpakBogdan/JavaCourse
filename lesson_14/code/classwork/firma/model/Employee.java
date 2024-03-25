package classwork.firma.model;

public class Employee {

    // fields
    private int id;
    private String name;
    private String lastname;
    private int age;
    private boolean gender;
    private double salary;

    // constructor

    public Employee(int id, String name, String lastname, int age, boolean gender, double salary) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    // getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", salary=" + salary +
                '}';
    }
    public void work(){
        System.out.println("Employee is working hard!...");
    }
    public void lunch(){
        System.out.println("Employee is waiting lunch");
    }
    public void sleep(){
        System.out.println("Employee is sleeping");
    }

}
