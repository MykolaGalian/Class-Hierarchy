package lab4.l1;

public class VCFireCar<T> extends VCar<T>
// класс пожарная машина - принимает только один тип пассажиров после создания обьекта
    // т.е. пассажири другого типа не могут сесть

{

    public VCFireCar(int n) // конструктор принимает кол-во мест
    {
        super(n); // вызов конструтора базового класса

    }
}
