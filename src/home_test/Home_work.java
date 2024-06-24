package home_test;

public class Home_work {
    public static void main(String[] args) {


           //В одну строку без пробела.

       String hi = "       Hello";
        String world = " woRld!\n";
        String worldLowerCase = world.toLowerCase();
        String trimmed = hi.trim();
        String result = ( trimmed + worldLowerCase).repeat(3);

       System.out.println(result);

       //Индекс тела

         float height = 1.75F;
         int weight = 90;
        float index = (float) weight / (height * height);
       System.out.println(index);

        //предложение

       char[] myArray = new char[5];
       myArray[0] = 'a';
       myArray[1] = 'b';
       myArray[2] = 'c';
       myArray[3] = 'd';
       myArray[4] = 'e';

       System.out.println(myArray);

        String text = String.copyValueOf(myArray);
        String replaced = text.replaceAll("c", "y");
        System.out.println(replaced);

        //Отправляем учиться
        int children = 11;

        if (children < 12) {
            System.out.print("Мальчик пошел в детски сад\n");
        } else {
            System.out.print("Ну и ладно");
        };

        int children2 = 11;

         if (children2 == 11) {
            System.out.print("Мальчик пошел в младшую школу\n");
        }
        else if (children2 > 11) {
            System.out.print("мальчик пошел в старшую школу\n");
        } else {
            System.out.print("Ладно");
         };

           int children3 = 16;
           if(children3 > 17) {
               System.out.print("Пошел в универ");
           } else {
               System.out.print("Мальчик пошел в старшую школу");
           }

           boolean chicken = true;
           boolean vegetables = true;
           boolean sour = true;
           boolean toast = true;
           boolean sausage = true;
           boolean eggs = false;
           boolean isChickenAndSausageOrVegetablesAndToast = true || false;
           boolean isChefMadeACaesarSalad = chicken && sausage && vegetables && toast;
           boolean isChefMadeAOlivieSalad = isChickenAndSausageOrVegetablesAndToast;
           boolean isChefMadeAvegetableSalad = vegetables;


           //Повар должен сделать салат
          if (isChefMadeACaesarSalad) {
              System.out.print("\nМогу сделать салат Цезарь");

          } else if (isChefMadeAOlivieSalad) {
              System.out.println("\nМогу сделать салат Оливье");

          } else if (isChefMadeAvegetableSalad) {
              System.out.print("\nМогу сделать овощной салат");

          } else {
              System.out.print("\nНевозможно сделать салат");
        }


    }
}