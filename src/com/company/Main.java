package com.company;

public class Main {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
        Food[] breakfast = new Food[20];
        int item_in_list = 0;
        for (String arg : args) {
            String[] parts_of_string = arg.split("/");
            if (parts_of_string[0].equals("Cheese")) {
                breakfast[item_in_list] = new Cheese();
            } else if (parts_of_string[item_in_list].equals("Apple")) {
                breakfast[item_in_list] = new Apple(parts_of_string[item_in_list + 1]);
            } else {
                breakfast[item_in_list] = new Cake(parts_of_string[item_in_list + 1]);
            }
            item_in_list++;
        }
        for (Food meal : breakfast) {
            if (meal != null) meal.consume();
            else break;
        }
        System.out.println("Have a nice day baby");
    }
}


