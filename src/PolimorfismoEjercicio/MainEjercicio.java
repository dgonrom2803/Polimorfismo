package PolimorfismoEjercicio;

public class MainEjercicio {
    public static void main(String[] args) {
        Animal leon;
        Animal paloma;

        leon = new Lion();
        leon.speak();

        paloma = new Bird();
        paloma.speak();
        ((Bird) paloma).fly();

    }
}
