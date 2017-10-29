public class task4 {
    public static void main(String[] args) {

        /*Írd ki a parancssori paraméterek közül a legnagyobbat,
        legkisebbet, valamint az értékek átlagát.*/

        int max = Integer.parseInt(args[0]);
        int min = Integer.parseInt(args[0]);
        float sum = 0;

        for (int i = 0; i < args.length; i++) {
            int actualValue = Integer.parseInt(args[i]);
            if (actualValue > max) {
                max = actualValue;
            } else if (actualValue < min) {
                min = actualValue;
            }
            sum += actualValue;
        }
        System.out.println("A legnagyobb paraméter: " + max);
        System.out.println("A legkisebb paraméter: " + min);
        System.out.println("Az összes paraméter átlaga: " + sum/args.length);
    }
}
