import java.util.Scanner;

public class DemoPizza {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] toppings = new String[10];
        int count = 0;

        System.out.println("Enter toppings (type 'QUIT' to finish):");
        while (count < 10) {
            String topping = input.nextLine();
            if ("QUIT".equalsIgnoreCase(topping)) {
                break;
            }
            toppings[count++] = topping;
        }

        System.out.println("Is the pizza to be delivered? (yes/no)");
        String delivery = input.nextLine();

        if ("yes".equalsIgnoreCase(delivery)) {
            System.out.println("Enter delivery address:");
            String address = input.nextLine();
            DeliveryPizza pizza = new DeliveryPizza(toppings, address, count);
            System.out.println(pizza);
        } else {
            Pizza pizza = new Pizza(toppings, count);
            System.out.println(pizza);
        }

        input.close();
    }
}
