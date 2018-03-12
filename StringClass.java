public class StringsClass {
    public static void main(String args[]){
        //Variaveis
        String[] dadosAluno = new String[3];
        dadosAluno[0] = args[0];
        dadosAluno[1] = args[1];
        dadosAluno[2] = args[2];
        //Ultilizando as variaveis
        System.out.print("\n Nome: "+ dadosAluno[0] +"\n Idade: "+ dadosAluno[1] +"\n Email: "+ dadosAluno[2] +"\n");   
    }
}
