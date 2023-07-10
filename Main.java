public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Иванов", "Мотвей", 30, "Сотрудник", 30000, "+793444648");
        Employee employee2 = new Employee("Сидоров", "Владислав", 46, "Сотрудник", 35000, "+786232548");
        Employee employee3 = new Employee("Петров", "Константин", 28, "Сотрудник", 30000, "+729854652");
        Employee employee4 = new Employee("Николаев", "Владимир", 39, "Сотрудник", 20000, "+720935478");
        Employee employee5 = new Employee("Сидоров", "Иван", 21, "Сотрудник", 20000, "+727762868");

        Employee[] employees = new Employee[] { employee1, employee2, employee3, employee4, employee5 };

        Wages.salaryUpAll(employees, 5000);

        System.out.println("Информация о всех сотрудниках:");
        for (Employee e : employees) {
            System.out.println(e.toString());
        }
    }
}