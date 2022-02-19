package aircompany.run;

/*
В примере с авиакомпанией я решил попробовать реализовать без инамов, интерфейсов,
т.е. посмотреть как выглядит плохой подход проектирования,
чтобы понимать чем он отличается то хорошего, который реализовал в 2-х других задачах.
 */

import aircompany.aircrafts.Airbus333;
import aircompany.aircrafts.Aircraft;
import aircompany.aircrafts.Boeing124;
import aircompany.aircrafts.Boeing747;
import aircompany.tools.AircraftCompany;

import java.util.Set;
import java.util.TreeSet;

public class Init {
    public static void main(String[] args) {


        Aircraft aircraft1 = new Boeing124("boeing124",220, 54900,3900, 85000);
        Aircraft aircraft2 = new Boeing747("boeing747",854, 435000,14815, 227600);
        Aircraft aircraft3 = new Airbus333("Airbus333",310, 191000,11480, 139000);

        Aircraft[] arr = {aircraft1,aircraft2,aircraft2,aircraft2};

        //Создаем авиакомпанию
        AircraftCompany aircompany1 = new AircraftCompany(arr);
        aircompany1.setAircraftCompany(arr);
        System.out.println("================================================================");

        //Подсчитываем общую вместимость
        System.out.println("Общая пассажирская вместительность = " + aircompany1.countCapacity(arr) + " чел");

        //Подсчитываем общую грузоподьемность
        System.out.println("Общая грузоподьемность = " + aircompany1.countLoad(arr) + " кг");
        System.out.println("================================================================");

        //Сортируем самолеты компании по дальности полета
        System.out.println("Сортируем самолеты по дальности полета:");
        Set<Aircraft>aircraftSet = new TreeSet<>();
        aircraftSet.add(aircraft1);
        aircraftSet.add(aircraft2);
        aircraftSet.add(aircraft3);
        aircraftSet.add(aircraft2);
        aircraftSet.forEach(System.out::println);
        System.out.println("================================================================");


        //Находим самолет в компании, соответствующий у которого уровень потребления топлива более 200 000 кг.
        System.out.println("Выводим только те самолеты компании, у которых уровень потребления горючего более 200 000кг:");
        Aircraft[] bigFuel = aircompany1.getAircraftByFuel(new Aircraft[]{aircraft1,aircraft2,aircraft3,aircraft1});
        for (Aircraft a:bigFuel) {
            System.out.println(a.getModel());
        }
    }
}
