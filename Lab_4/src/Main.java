public class Main {
    public static void main(String[] args) {
        Eagle.PrintCalr();
        Eagle eagle_1 = new Eagle();
        Eagle eagle_2 = new Eagle("duck");
        Eagle eagle_3 = new Eagle("wolf",30.5);
        Duck duck_1 = new Duck();
        Duck duck_2 = new Duck("eagle");
        Duck duck_3 = new Duck("worm",10.5);
        System.out.println("Check for equality: ");
        System.out.println(duck_1 == duck_2);
        System.out.println(eagle_1.Eat());
        System.out.println(eagle_1.Move());
        System.out.println(duck_1.Eat());
        System.out.println(duck_1.Move());
        System.out.println(eagle_2.Eat());
        System.out.println(eagle_2.Move());
        System.out.println(duck_2.Eat());
        System.out.println(duck_2.Move());
        System.out.println(eagle_3.Move());
        System.out.println(eagle_3.Eat());
        System.out.println(duck_3.Move());
        System.out.println(duck_3.Eat());
        Eagle.PrintCalr();
    }
}
abstract class Bird {
    protected String eat;
    abstract String Eat();
    abstract String Move();
}

class Eagle extends Bird{

    private double flySpeed;
    static public double Calories;
    static
    {
        Calories = 10;
    }
    {
        eat = "Fish";
        flySpeed = 7;
    }

    public Eagle() {
        eat = "chickens";
        flySpeed = 5;
        Calories += 20;
    }
    public Eagle(String food,Double... speed)
    {
        eat = food;
        if(speed.length > 0)
            this.flySpeed = speed[0];
        else
            this.flySpeed = 10;
        Calories += 30;
    }
    double getFlySpeed()
    {
        return flySpeed;
    }
    void setFlySpeed(double value)
    {
        flySpeed = value;
    }
    static void PrintCalr()
    {
        System.out.println("Eagle's calories: " + Calories);
    }
    @Override
    String Eat() {
        return ("Eagle is eating " + eat);
    }

    @Override
    String Move() {
        return ("Eagle is moving with the speed: " + flySpeed);
    }
}
class Duck extends Bird{
    private double footSpeed;
    Duck(){
        eat = "Wheat";
        footSpeed = 5;
    }
    Duck(String food,Double... speed)
    {
        eat = food;
        if(speed.length > 0)
        {
            this.footSpeed = speed[0];
        }
        else
        {
            this.footSpeed = 10;
        }
    }
    double getFootSpeed()
    {
        return footSpeed;
    }
    void setFootSpeed(double value)
    {
        footSpeed = value;
    }
    boolean ObjectEquals(Duck obj)
    {
        return footSpeed == obj.footSpeed;
    }
    @Override
    String Move() {
        return ("Duck is moving with the speed " + footSpeed);
    }

    @Override
    String Eat() {
        return ("Duck is eating " + eat);
    }
}