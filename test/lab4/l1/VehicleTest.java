package lab4.l1;

import static org.junit.Assert.*;
import org.junit.Test;

public class VehicleTest {


    @Test
    public void testVerify_IsReturnTrueIfPutPassengerInList() // проверка метода put (добавление пассажира)
    {
        VCTaxi<Human> taxi = new VCTaxi<>(4); // создание такси ёмкостью 4 пассажира
        Human Benson = new Human("Benson");  // создаём обычного пассажира
        assertTrue(taxi.put(Benson));
    }


    @Test
    public void testVerify_IsReturnTrueIfRemovePassengerFromList() // проверка метода remove (добавление пассажира)
    {
        VCTaxi<Human> taxi = new VCTaxi<>(4); // создание такси ёмкостью 4 пассажира
        Human Benson = new Human("Benson");  // создаём обычного пассажира
        taxi.put(Benson);
        assertTrue(taxi.remove(Benson));
    }

    @Test
    public void testVerify_IsReturnExceptionIfPutMoreMaxPassengerToList() // проверка метода put (добавление пассажира) исключение
                                                                            // в машине нет больше мест
    {
        VCTaxi<Human> taxi = new VCTaxi<>(1); // создание такси ёмкостью 1 пассажира
        Human Benson = new Human("Benson");  // создаём обычного пассажира
        taxi.put(Benson);


        HPoliceMan Jack = new HPoliceMan ("Jack"); // создаем полицейского - который не поместится в такси
        taxi.remove(Jack); // invalid exeption

    }

   // на стадии компиляции приемы обобщенного програмирования не позволяют садить пасажиров в авто которые для них не предназначены

}