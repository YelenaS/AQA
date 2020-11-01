package homework5;

public class Runner {
    public static void main(String[] args) {
        Department financeDep = new Department(5, 1, 1100, 2300.8);
        Department marketingDep = new Department(12, 2, 1000.5, 2000);
        Bonuses performBonus = new Bonuses(12800, 5);

//выводим информацию по отделу Финансов
        System.out.println("Number of employees in the Finance department: " + financeDep.countEmployees());
        System.out.println("Total salary for the Finance department: " + financeDep.countSalary());
        System.out.println("Total salary for workers in the Finance department: " + financeDep.countWorkersSalary());
//выводим информацию по отделу Маркетинга
        System.out.println("Number of employees in the Marketing department: " + marketingDep.countEmployees());
        System.out.println("Total salary for the Marketing department: " + marketingDep.countSalary());
        System.out.println("Total salary for workers in the Marketing department: " + marketingDep.countWorkersSalary());
//выводим информацию по Бонусам
        System.out.println("Performance bonuses for " + performBonus.month + " months equal: " + performBonus.countBonuses() + " EUR");
        System.out.println("Each employees of company gets a bonus: " +
                performBonus.countBonuses() / (financeDep.countEmployees() + marketingDep.countEmployees()) + " EUR");
    }
}
