public class task2 {
    public static void main(String[] args) {

        //Írd ki a parancssori paramétereket a konzolra, fordított sorrendben

        for (int i = args.length-1; i >= 0; i--) {
            System.out.println(args[i]);
        }
    }
}
