package Project;

import Project.Person;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Auth auth = new Auth();
        Menu menu = new Menu();

        Category firstCategory = new Category("Toy");

        Categories categories = new Categories();
        categories.add(firstCategory);

        Products products = new Products();
        products.add(new Product("Bear", firstCategory));
        products.add(new Product("Lion", firstCategory));
        products.add(new Product("Tiger", firstCategory));

        Scanner sc = new Scanner(System.in);
        Person currentPerson;
        currentPerson = auth.login(sc);

        boolean status = true;
        while (status) {
            menu.print(currentPerson);
            int key = sc.nextInt();
            clearScreen();
            if (currentPerson.isAdmin()){
                switch (key)
                {
                    case 1: {
                        System.out.println("All products");
                        products.print();
                        break;
                    }
                    case 2: {
                        System.out.print("Add category.");
                        System.out.println("Enter category name:");
                        String name = sc.next();
                        categories.add(new Category(name));
                        break;
                    }
                    case 3: {

                        System.out.println("Add product. Enter product name:");
                        String name = sc.next();
                        System.out.println("Enter category:");
                        categories.print();
                        Integer categoryId = sc.nextInt();

                        if (categories.has(categoryId)) {
                            Category category = categories.get(categoryId);
                            products.add(new Product(name, category));
                        } else {
                            System.out.println("category not found");
                        }
                        break;
                    }
                    case 4: {
                        System.out.println("You left the system");
                        status = false;
                        break;
                    }
                }
            }
            else {
                switch (key)
                {
                    case 1: {
                        System.out.println("1. Переглянути весь товар.");

                        products.print();

                        break;
                    }
                    case 2: {
                        System.out.print("2. Search: ");
                        String search = sc.next();
                        products.searchProduct(search);
                        break;
                    }
                    case 3: {
                        System.out.println("3. Сортувати Товар");
//                        products.sort();
                        break;
                    }
                    case 4: {
                        System.out.println("4. Add to backet");

                        products.print();

                        int productId = sc.nextInt();

                        if (products.has(productId)) {
                            currentPerson.addProduct(products.get(productId));
                        } else {
                            System.out.println("products not found");
                        }

                        break;
                    }
                    case 5: {
                        currentPerson.printBacket();

                        break;
                    }
                    case 6: {
                        System.out.println("Вийти із системи");
                        status = false;
                        break;
                    }
                }
            }

        }

    }
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}