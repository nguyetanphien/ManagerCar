package util;

import model.From100To200cc;
import model.LessThan100cc;
import model.Over200cc;
import model.Vehicle;

import java.util.ArrayList;
import java.util.Scanner;

public class MainCar {
    public static ArrayList<Vehicle> arrayList = new ArrayList<>();

    public static void printMenu(Scanner scanner) {
        while (true) {
            System.out.println("Please fill in the choose number");
            System.out.println("1. Input");
            System.out.println("2. Export the tax return of the vehicle..");
            System.out.println("3. Exit");


            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("InputProgrammer");
                    inputLessThan100cc(scanner);
                    inputFrom100To200cc(scanner);
                    inputOver200cc(scanner);
                    break;
                case 2:
                    System.out.println("Export the tax return of the vehicle.");
                    output();
                    break;
                case 3:
                    System.exit(0);
                    break;

            }
        }
    }

    public static void inputLessThan100cc(Scanner scanner) {
        System.out.println("inputLessThan100cc");
        LessThan100cc lessThan100cc = new LessThan100cc();
        lessThan100cc.input(scanner);
        arrayList.add(lessThan100cc);
    }

    public static void inputFrom100To200cc(Scanner scanner) {
        System.out.println("inputFrom100To200cc");
        From100To200cc from100To200cc = new From100To200cc();
        from100To200cc.input(scanner);
        arrayList.add(from100To200cc);
    }

    public static void inputOver200cc(Scanner scanner) {
        System.out.println("inputOver200cc");
        Over200cc over200cc = new Over200cc();
        over200cc.input(scanner);
        arrayList.add(over200cc);
    }

    public static void output() {
        for (Vehicle v : arrayList)
            System.out.println(v);
    }


}
