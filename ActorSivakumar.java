class ActorSivakumar implements Actor
{
static String address="coimbatore";
ActorSivakumar()
{
System.out.println("actor sivakumar");
}
ActorSivakumar(int age , String car)
{
System.out.println(age);
System.out.println(car);
}
public void act()
{
System.out.println("Acting");
}
public void dance()
{
System.out.println("dancing");
}
public void sing()
{
System.out.println("singing");
}
public void speak()
{
System.out.println("speaking");
}
public static void main(String[] args)
{
ActorSivakumar as=new ActorSivakumar(65, "audicar");
System.out.println(address);
as.act();
as.dance();
as.sing();
as.speak();
Actor a=new ActorSivakumar();
a.act();
a.dance();
a.sing();
}
}
