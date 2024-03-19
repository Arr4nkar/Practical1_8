/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practical4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author gnekh
 */
public class Practical4 {

    public static void main(String[] args) {
        System.out.println("Nekhaev Gleb group РИБО-01-22 variant 2");
        ArrayList<Telephone> telephoneList = new ArrayList<>();
        
        telephoneList.add(new Telephone("Panasonic", "X35235ZMD", "white", false));
        telephoneList.add(new Telephone("Samsung S10", "XYZ123456789", "black", true));
        telephoneList.add(new Telephone("Iphone X", "ASIOS77777QWERTY", "black", true));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nВыберите действие:");
            System.out.println("1. Добавить телефонный аппарат");
            System.out.println("2. Удалить телефонный аппарат по серийному номеру");
            System.out.println("3. Удалить все телефонные аппараты из списка");
            System.out.println("4. Выйти");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addTelephone(telephoneList, scanner);
                    break;
                case 2:
                    removeTelephoneBySerialNumber(telephoneList, scanner);
                    break;
                case 3:
                    removeAllTelephones(telephoneList);
                    break;
                case 4:
                    System.out.println("Программа завершена.");
                    return;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }

            System.out.println("\nТекущее содержимое списка телефонов:");
            for (Telephone telephone : telephoneList) {
                System.out.println(telephone);
            }
        }
    }

    private static void addTelephone(ArrayList<Telephone> telephoneList, Scanner scanner) {
        System.out.println("Введите модель:");
        String model = scanner.nextLine();

        System.out.println("Введите серийный номер:");
        String serialNumber = scanner.nextLine();

        for (Telephone telephone : telephoneList) {
            if (telephone.getSerialNumber().equals(serialNumber)) {
                System.out.println("Телефон с таким серийным номером уже существует.");
                return;
            }
        }

        System.out.println("Введите цвет:");
        String color = scanner.nextLine();

        System.out.println("Это мобильный телефон? (true/false):");
        boolean isMobile = scanner.nextBoolean();
        scanner.nextLine(); 

        telephoneList.add(new Telephone(model, serialNumber, color, isMobile));
        System.out.println("Телефон успешно добавлен в список.");
    }

    private static void removeTelephoneBySerialNumber(ArrayList<Telephone> telephoneList, Scanner scanner) {
        System.out.println("Введите серийный номер телефона для удаления:");
        String serialNumber = scanner.nextLine();

        for (Telephone telephone : telephoneList) {
            if (telephone.getSerialNumber().equals(serialNumber)) {
                telephoneList.remove(telephone);
                return;
            }
        }

        System.out.println("Телефон с таким серийным номером не найден.");
    }

    private static void removeAllTelephones(ArrayList<Telephone> telephoneList) {
        telephoneList.clear();
        System.out.println("Все телефоны успешно удалены из списка.");
    }
}
