package homework5;

/*
 * Task:
 * Create several classes that represent entities of the real world.
 * Each class has to contain fields (data described the state of an object), methods (actions needed to operate those data).
 * Another requirements are to provide at least 3 different constructors, one of them should be "default" one.
 * Also, create a runner class which will be a container with "main" method needed to run the program, instantiate objects an so on.
 *
 * Создайте несколько классов, которые представляют сущности реального мира.
 *
 * Каждый класс должен содержать поля (данные описывают состояние объекта),
 * методы (действия, необходимые для работы с этими данными).
 *
 * Еще одно требование - предоставить как минимум 3 разных конструктора,
 * один из которых должен быть "по умолчанию".
 *
 * Кроме того, создайте runner класс, который будет контейнером с "main" методом,
 * необходимым для запуска программы, создания экземпляров объектов и так далее.
 */

public class Department {

    int numWorkers;
    int numManagers;
    double managersSalary;
    double workersSalary;

    //конструктор по умолчанию
    Department() {
        numWorkers = 0;//  данном случае такая инициализация не влияет на результат
        numManagers = 0;
        managersSalary = 0;
        workersSalary = 0;
    }

    //конструктор 1
    Department(int nw, double ws) {
        numWorkers = nw;
        workersSalary = ws;
    }

    //конструктор 2
    Department(int nw, int nm) {
        numWorkers = nw;
        numManagers = nm;
    }

    //конструктор 3
    Department(int nw, int nm, double ws, double ms) {
        numWorkers = nw;
        numManagers = nm;
        workersSalary = ws;
        managersSalary = ms;
    }

    //посчитать и возвратить количество сотрудников в отделе
    int countEmployees() {
        return numWorkers + numManagers;
    }

    //рассчитать и возвратить зарплату на отдел
    double countSalary() {
        return workersSalary * numWorkers + managersSalary * numManagers;
    }

    //рассчитать и возвратить зарплату работников (без менеджеров) на отдел
    double countWorkersSalary() {
        return workersSalary * numWorkers;
    }
}


