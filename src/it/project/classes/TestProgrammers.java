package it.project.classes;

public class TestProgrammers {
    public static void main(String[] args){
        Programmer Gino = new Programmer();
        Programmer Paoli = new Programmer();

        Gino.name = "gino";
        Gino.age = 22;
        Gino.wearsGlasses = true;

        Paoli.name = "Paoli";
        Paoli.age = 33;
        Paoli.wearsGlasses = false;

        Gino.drinkCoffe();
        Gino.printDetails();

        Paoli.printDetails();
        Paoli.hasGlasses();
    }
}
