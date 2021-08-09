public class Questoes {

    //1


    //2
    // Assinatura: public static int somatorio(int i)
    // Caso de erro:
    // Caso de parada: i = 0
    // caso comum soma;

    public static int somatorio(int i){
        if(i == 0) return 0;

        int novoI;

        if(i > 0){
            novoI = i-1;
        } else {
            novoI = i+1;
        }

        return somatorio(novoI) + i;
    }

    //3
    // Assinatura: public static int fibonacci(int n, int anterior, int atual)
    // Caso de erro: n <= 0
    // Caso de parada: n == 1 || n == 2
    // caso comum soma;

    public static int fibonacci(int n, int anterior, int atual) {
        if(n <= 0) throw new RuntimeException("ERRO ");
        if(n == 1) return 1;
        if(n == 2) return 1;

        return fibonacci(n-1, atual, atual+anterior) + atual;
    }


    //4
        // Assinatura: public static int somatorioEmFaixa(int k, int j)
        // Caso de erro:  k > j
        // Caso de parada: k == j
        // caso comum soma;
    public static int somatorioEmFaixa(int k, int j){
        if(k > j ) throw  new RuntimeException("ERRO");
        if(k == j) return k;

        return somatorioEmFaixa(k+1, j) + k;
    }

    //5
        // Assinatura: boolean isPal(String s)
        // Caso de erro:
        // Caso de parada: s.length == 1 || s.length == 0
        // caso comum isPal(s);

    public static boolean isPal(String s){
        if (s.length() < 2) return true;
        if(s.charAt(s.length() - 1) == s.charAt(0)){
            return isPal(s.substring(1, s.length() - 1) );
        } else {
            return false;
        }
    }

    //6
        // Assinatura: String convBase2(int n)
        // Caso de erro:n < 0
        // Caso de parada: n == 0
        // caso comum convBase2(n);
    public static String convBase2(int n){
        if(n < 0) throw new RuntimeException("Erro");
        if(n == 0) return "0";
        return "convBase2()";
    }



}
