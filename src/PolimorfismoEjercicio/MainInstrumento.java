package PolimorfismoEjercicio;

public class MainInstrumento {
    public static void main(String[] args) {
        Instrumento instrumento;
        instrumento = new Guitarra();
        instrumento.tocar();

        instrumento = new Tambor();
        instrumento.tocar();
    }
}
