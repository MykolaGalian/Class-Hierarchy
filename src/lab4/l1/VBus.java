package lab4.l1;

public class VBus<T extends  Human> extends Vehicle<T>
    // класс VBus (автобус) наследует класс Vehicle,
        //  принимает все типы пассажиров наследуемые от Human после создания обьекта
{
    public VBus(int n) // конструктор принимает кол-во мест
    {
        super(n); // вызов конструтора базового класса

    }

}
