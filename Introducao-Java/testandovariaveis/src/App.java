public class App {
    public static void main(String[] args) throws Exception {
        int i;
       // não pode ser utilizado uma variavel com o mesmo nome int i;
        int I;
        // invalido começando com letras int 1a;
        int _1a;
        int $aq;

        i = 5;
        I = 10;
        _1a = 20;
        $aq = 7;

        final int j = 10;
       // Como é um valor final não pode ser modificado  
       //j = 15;
        int asrn24678md;
       // Não é  permitido espaço nas variaveis
       //int asrn2$4678 _md = 10;

       // não é uma boa prática usar % 
       // int asrn2$46%78_md = 10;

        asrn24678md = 100;
        //asrn2$4678_md = 10;

        int quantidadeProduto = 50;
        int QuantidadeProduto;
        final int NUMERO_TENTATIVAS = 5;
        final int numeroTentativas = 5;
        int QUANTIDADE_OPCOES = 25;
        int qtdProd;

        System.out.println(i);
      
    }
}
