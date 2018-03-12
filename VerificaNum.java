public class VerificaNum {
    public static void main(String args[]){
        //Variaveis
        int x = Integer.parseInt(args[0]);
        //operação
        if (x > 10){
            System.out.print("\nÉ maior que 10!\n");
        }else {
            System.out.print("\nÉ menor que 10!\n");
        }
        if (x %2 ==0){
            System.out.print("O numero é par! \n \n");
        }else {
            System.out.print("O numero é ímpar! \n \n");
        }
    }
}
