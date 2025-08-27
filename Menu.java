import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        ABB abb = new ABB();

        Scanner sc =  new Scanner(System.in);
        int option;
        do{
            System.out.println("Choose an option according how do you want to proceed.");
            System.out.println("1. Input 1 value on the Tree\n2.In order show\n0.Out");
            option = sc.nextInt();
            switch (option){
                case 0:
                    break;
                case 1:
                    System.out.println("Insert the value: \n");
                    int value = sc.nextInt();
                    abb.root=  abb.insert(abb.root, value);
                case 2:
                    System.out.println("See the Binary Search Tree as follows: \n");
                    abb.show(abb.root);
                    System.out.println();
                    break;
            }
        } while(option != 0);

    }
}
