public class Metodo {
    public static void main(String args[]){
        //Variaveis
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        multiplicaValores(x,y);
    }
    public static void multiplicaValores(int x, int y){
        int valor = x*y;
        System.out.println("A multiplicação é "+valor);
    }
}
