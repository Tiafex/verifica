package thread;

public class Botteghino {
    int biglietti = 100;

    public Botteghino()
    {
        this.biglietti=biglietti;
    }


    public synchronized void entra() 
{
  
    while (biglietti == 0 ) {
   try {
    wait();
   } catch (Exception e) {
    e.printStackTrace();
   }

  } 
  biglietti--; 
    
}

public synchronized void esci()
{
  biglietti++; 
  notifyAll();
    
}

}
