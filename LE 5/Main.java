class Main
{
    public static void main(String[] args)
    {
        Beverage b=new Whisky();
        b.templateMethod(30);
        b=new Rum();
        b.templateMethod(60);
        b=new Beer();
        b.templateMethod(300);
    }
}