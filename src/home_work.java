public class home_work {
    public static void main(String[] args) {

//        char[] my_array = new char[4];
//
//        my_array[0] = 'c';
//        my_array[2] = 'ч';
//        my_array[3] = 'и';
//        my_array[1] = 'о';
//        System.out.println(my_array);


           //В одну строку без пробела.

       String hi = "       Hello";
        String world = " woRld!\n";
        String worldLowerCase = world.toLowerCase();
        String trimmed = hi.trim();
        String result = ( trimmed + worldLowerCase).repeat(3);

       System.out.println(result);


     //   String result = trimmed + world;
       // String repeat = result.repeat(3);
       // System.out.println(result);result






    }
}