package lab4.l1;

public class VCPoliceCar<T extends HPoliceMan> extends VCar<T>
// класс полицейская машина - принимает только один тип пассажиров после создания обьекта
        // т.е. пассажири другого типа не могут сесть
{
    public VCPoliceCar(int n) // конструктор принимает кол-во мест
    {
        super(n); // вызов конструтора базового класса

    }
}
