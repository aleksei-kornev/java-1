package ru.geekbrains.lesson1;

public class MainApp {
    public static int SIZE = 3;
    public static Employee[] employeesArray = new Employee[5];

    public static void main(String[] args) {
        // инициализируем сотрудников
        employeesArray[0] = new Employee("Smith Garry", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        employeesArray[1] = new Employee("Black Peter", "CEO", "peter@mailbox.com", "892312345", 60000, 48);
        employeesArray[2] = new Employee("Cannon John", "CIO", "john@mailbox.com", "892312678", 50000, 47);
        employeesArray[3] = new Employee("Root Susan", "Engineer", "susan@mailbox.com", "892312386", 30000, 42);
        employeesArray[4] = new Employee("McFly Katy", "Engineer", "katy@mailbox.com", "892312849", 30000, 30);

        // выводим тех, что удовлетворяют условию
        for (int i = 0; i < employeesArray.length; i++) {
            if (employeesArray[i].getAge() > 40) {
                employeesArray[i].info();
            }
        }


    }

}

class Employee {
    //ФИО, должность, email, телефон, зарплата, возраст;
    private String name;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phoneNumber, int salary, int age) {
        this.age = age;
        this.email = email;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.position = position;
        this.salary = salary;
    }

    public void info() {
        System.out.println("name=" + name + " position=" + position + " email=" + email + " phoneNumber=" + phoneNumber + " salary=" + salary + " age=" + age);
    }

    public int getAge() {
        return age;
    }
}
