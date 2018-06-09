package lab4.l1;

public class Human  // обычный человек
{
    private String name; // имя человека

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Human (String name) // конструктор - задает имя
    {
        this.name = name;
    }


}
