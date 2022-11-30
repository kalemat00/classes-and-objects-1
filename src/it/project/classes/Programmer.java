package it.project.classes;

public class Programmer {
    public String name;
    public int age;
    public boolean wearsGlasses;

    public void drinkCoffe(){
        System.out.println("Espresso is the secret!");
    }

    public void printDetails(){
        System.out.println(name + "is a " + age + "-yo programmer");
    }

    public void hasGlasses(){

        System.out.println("Is" + name + "wearing glasses? ");

        if(wearsGlasses == true){
            System.out.println("yes");
        }else if(wearsGlasses == false){
            System.out.println("no");
        }

    }
}
