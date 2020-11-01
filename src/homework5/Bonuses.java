package homework5;

public class Bonuses {
    double income;
    int month;
    double average;

    //конструктор по умолчанию
    Bonuses() {
    }

    //конструктор 1

    Bonuses(double i, int m) {
        income = i;
        month = m;
        average = i / m;
    }

    //рассчитать сумму бонусов
    double countBonuses() {
        if (average >= 1200) {
            return income * 0.1; //сумма бонуса составляет 10% от прибыли
        } else {
            return income * 0.05; //сумма бонуса составляет 5% от прибыли
        }
    }
}
