public class task3 {
    public static void main(String[] args) {

        /*Írd ki a parancssori paramétereket úgy, hogy az n. sorban
        az első n darab parancssori paramétert írja ki: első sorba
        csak az elsőt, a másodikba az első kettőt szóközzel elválasztva,
        a harmadikba az első hármat, stb..*/

        for (int i = 1; i <= args.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(args[j] + ' ');
            }
            System.out.println();
        }
    }
}
