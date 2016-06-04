
//Реализовать класс Pet, который описывает характеристики и поведение домашнего питомца (собаки, рыбки, хомячка, удава, и тп).

import java.util.Scanner;

public class Pet {

    String name;
    String type;
    double age;
    double weight;
    String colour;
    

    public void printPetsData() {
        System.out.println("The name of the pet is " + this.name + ".");
        System.out.println("It is " + this.type + ".");
        System.out.println("It is " + this.age + " years old.");
        System.out.println("It weights " + this.weight + " kg.");
        System.out.println("It is of " + this.colour + " colour.");

    }

    Pet(String name, String type, double age, double weight, String colour) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.weight = weight;
        this.colour = colour;
    }

    public void letsTalk() {
        System.out.println("I want to talk with you!");
    }


    public void beHungry() {
        System.out.println("I am hungry! Could you please share some meal with me!");
    }

    public void letsPlay() {
        System.out.println("Nice time to play!");
    }

    public void letsGoForWalk() {
        System.out.println("Lets go for a walk together! ");
    }


    public static void main(String[] args) {

        Pet elf = new Pet("Colin", "Elf", 2, 1.4, "blue");

        elf.printPetsData();
        System.out.println();

        System.out.println(" - Hello, my dear Elf! Are you hungry?");
        Scanner sc = new Scanner(System.in);

        String beingHungry = "yes";
        String inputState = sc.nextLine();

        if (beingHungry.equals(inputState)) {
            elf.beHungry();
            System.out.println(" - Please have your meal, dear!");
        }

        else elf.letsGoForWalk();

        System.out.println(" - Do you want to play?");

        String reply = "yes";
        String inputReply = sc.nextLine();

        if (reply.equals(inputReply)){
            elf.letsPlay();
            System.out.println(" - Great idea! lets play!");}
        else elf.letsTalk();
        System.out.println(" - Ok, then!");

    }
}
