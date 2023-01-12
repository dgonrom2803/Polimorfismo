package PolimorfismoEjercicio;

public class Bird extends Animal implements Flyable{
    @Override
    public void fly() {
        System.out.println("Estoy volando");
    }

    void speak(){
        System.out.println("Soy una paloma: fiufiufiufiu");
    }
}
