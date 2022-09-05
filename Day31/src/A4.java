class Billing 
{  
    synchronized void show(int amt)
    {
        for(int i = 1;i<=7;i++){
            System.out.println(amt*i);
            try
        {
            Thread.sleep(2000);
        }
        catch(Exception e )
        {
            e.printStackTrace();
        }
    }

}

}
class Client1 extends Thread
{
    Billing b;
    public Client1(Billing b) {

    }
}
class Client2 extends Thread
{
    Billing b;
    public Client2(Billing b) {
        this.b= b;
    }
    public void run()
    {
        b.show(5);

    }
}
public class A4 {
    public void main(String[] args) {
        Billing bb = new Billing();
        Client1 c1 = new Client1(bb);
        Client2 c2 = new Client2(bb);
        c1.start();
        c2.start();

    }

}
