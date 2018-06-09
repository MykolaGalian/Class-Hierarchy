package lab4.l1;

import java.util.ArrayList;

public abstract class Vehicle <T> //  класс Vehicle (транспортные средства) работающий с обобщенным типом
{
    private ArrayList<T> passangers; // список в котором будут хранится все пасажири севшие в транспортное средство
    private int maxSize;     // максимальное количество мест для данного транспортного средства

    public Vehicle(int n) // конструктор - установка макс. количество мест и создаем лист по кол-ву мест
    {
        this.maxSize = n;
        this.passangers = new ArrayList<T>(maxSize);
    }

    public boolean put(T passanger) throws  ArrayIndexOutOfBoundsException //метод - добавляем пассажира в транспортное средство - исключение (границы массива)
    {                                                                      //проверка на превышение максимальное количество мест
       if (this.size() < maxSize)
       {
           passangers.add(passanger);
           return  true;
       }
       else throw new ArrayIndexOutOfBoundsException(); // исключение при отсутствии места в машине (возможен выход за границы массива)
    }

    public boolean remove(T passanger) //высаживаем пассажира из транспортного средства - проверка типа запрашиваемого пассажира перед высадкой
    {
        passangers.remove(passanger);
        return  true;
    }

    public int size() // возвращаем количество занятых мест в транспортном средстве
    {
        return passangers.size();
    }

    public int maxSizeGet() // возвращаем максимальное количество мест для данного транспортного средства
    {
       return maxSize;
    }


}
