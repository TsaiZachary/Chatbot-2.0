import java.util.Scanner;

public class Bot2Tester
{
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    String a1 = input.nextLine();
    Bot2 hello = new Bot2(a1);
    hello.greeting();
    System.out.println("What is your favorite animal?");
    String animal = input.nextLine();
    hello.favoriteAnimal(animal);
    System.out.println("Where do you live?");
    String location = input.nextLine();
    hello.home(location);
    System.out.println("What's your faovrite number?");
    int favnum = input.nextInt();
    hello.favoriteNumber(favnum);
    hello.goodbye();
    }
}