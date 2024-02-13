public class Main {
    public static void main(String[] args) {

        int [][] arrey = new int[3][3];
        //arrey [0][0] = 1;
        //arrey [0][1] = 2;
        //arrey [0][2] = 3; если мы не заполним массив то выведет нули 000

        arrey [1][0] = 4;
        arrey [1][1] = 5;
        arrey [1][2] = 6;

        arrey [2][0] = 7;
        arrey [2][1] = 8;
        arrey [2][2] = 9;

        System.out.print(arrey [0][0]);
        System.out.print(arrey [0][1]);
        System.out.print(arrey [0][2]);
        System.out.print("\n");
        System.out.print(arrey [1][0]);
        System.out.print(arrey [1][1]);
        System.out.print(arrey [1][2]);
        System.out.print("\n");
        System.out.print(arrey [2][0]);
        System.out.print(arrey [2][1]);
        System.out.print(arrey [2][2]);
    }
}