package lab4.l1;

public class VCar<T> extends Vehicle <T>
        // класс VCar (легковое авто) наследует класс Vehicle
{
    public VCar(int n) // конструктор принимает кол-во мест
    {
        super(n); // вызов конструтора базового класса

    }
}
