class SQLTrainer extends Trainer
{
public SQLTrainer()
{
System.out.println("SQL trainer");
}

public static void main(String[] args)
{
SQLTrainer ram=new SQLTrainer();
System.out.println(Trainer.institude);
System.out.println(Trainer.dept);
ram.getsalary();
ram.training();
}
}

