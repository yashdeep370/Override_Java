public class over {
    
}

class parent{
    public void display()
    {
        System.out.println("hi");
    }
}

class child extends parent
{
    @Override
    public void display()
    {
        System.out.println("hello");
    }
}