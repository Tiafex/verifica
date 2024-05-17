package thread;

public class Main {
    public static void main(String[] args) {
        Persone p = new Persone();
        Botteghino b= new Botteghino();
        
        for (int i =0; i <50; i++)
        {
            Persone t1 =  new Persone();
            p.run();
    }
}
}