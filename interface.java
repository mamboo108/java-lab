interface Police{
    public void speed();
    public void parking();
    
}
class Driver implements Police
{
    public void speed(){
        System.out.println("Speeding");
        
    }
    public void parking(){
        System.out.println("fined");
    }
}
public class main{
    public static void main(String args[]){
        Driver mydriver=new Driver();
        mydriver.speed();
        mydriver.parking();    
        
    }
}
