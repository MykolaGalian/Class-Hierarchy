package lab4.l1;

public class VCTaxi<T extends Human> extends VCar<T>
//  класс машина такси наследник от класса VCar
//  принимает все типы пассажиров наследуемые от Human после создания обьекта
{
    public VCTaxi(int n) // конструктор принимает кол-во мест
    {
        super(n); // вызов конструтора базового класса

    }

}
