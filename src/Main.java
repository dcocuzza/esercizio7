import estensioni.Punto;
import implementazioni.Auto;
import implementazioni.Camion;
import interfacce.Veicolo;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Veicolo a = new Auto();
        System.out.println(a.getTipoMezzo());
        Veicolo c = new Camion();
        System.out.println(c.getTipoMezzo());

        Punto p = new Punto();
        System.out.println(p.getTipoMezzo());
        Auto p2 = new Punto();
        System.out.println(p2.getTipoMezzo());
    }
}