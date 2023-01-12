package Polimorfismo;

public class MainInterfaz {
    public static void main(String[] args) {
        Interfaz i;
        Interfaz b;
        i = new ImplementacionA();
        i.metodo();

        i = new ImplementacionB();
        i.metodo();

    }
}
