public class StaticVariableExample {
    public static String myClassVar = "class or variable";
    public static void main(String[] args) {
        //create objects to initialize the
        StaticVariableExample obj1 = new StaticVariableExample();
        StaticVariableExample obj2 = new StaticVariableExample();
        StaticVariableExample obj3 = new StaticVariableExample();

        //display on the console
        System.out.println(obj1.myClassVar);
        System.out.println(obj2.myClassVar);
        System.out.println(obj3.myClassVar);

        //changing the text  value held by the static variable
        System.out.println("---------------------------------------------------");
        obj1.myClassVar = "am a winner";
        System.out.println(obj1.myClassVar);
        System.out.println(obj1.myClassVar);
        System.out.println(obj1.myClassVar);

        final double pie = 3.1444;
        int volume, length;

    }
}
