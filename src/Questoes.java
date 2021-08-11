import java.util.ArrayList;

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
        // Caso de erro: n < 0
        // Caso de parada: n == 0 -> ""
        // caso comum convBase2(n);
    public static String convBase2(int n){
        if(n < 0) throw new RuntimeException("Erro");
        if(n == 0) return "";
        return convBase2(n >> 1) + n % 2;
    }

    //7
        // Assinatura: Integer calcSomatorio(ArrayList<Integer> ar)
        // Caso de erro: arr == null
        // Caso de parada: arr.size == 0
        // Caso comum calcSomatorio
    public static Integer calcSomatorio(ArrayList<Integer> ar) {
        if (ar.size() == 0) return 0;
        int v = ar.remove(0);
        int v2 = calcSomatorio(ar);
        return v + v2;
    }
        
    //8
        // Assinatura: Integer calcSomatorio(ArrayList<Integer> arr, int index)
        // Caso de erro: arr == null
        // Caso de parada: arr.size == 0
        // Caso comum findBiggest
    public static int findBiggest(ArrayList<Integer> ar) {
        if (ar.size() == 0) return 0;
        int v = ar.remove(0);
        int v2 = findBiggest(ar);
        return v > v2 ? v : v2;
    }

    //9
        // Assinatura: boolean findSubStr(String str, String match)
        // Caso de erro: str == null || match == null
        // Caso de parada: inicio da str for igual ao match
        // Caso comum findSubStr
    public static boolean findSubStr(String str, String match) {
        if (match.length() == 0) return true;
        if (str.length() == 0) return false;
        if (str.startsWith(match)) return true;
        return findSubStr(str.substring(1), match);
    }

    //10
    // Assinatura:  int nroDigit(int n)
    // Caso de erro:Nenhum
    // Caso de parada:n <= 1
    // Caso comum nroDigit

    public static int nroDigit(int n) {
        if( n < 0) n = n * -1;
        if(n == 0) return 1;
        if(n/10 < 1 ) return 1;
        return 1 + nroDigit(n/10);
    }

    //11
    // Assinatura: ArrayList<String> permutations(String s)
    // Caso de erro:
    // Caso de parada:
    // Caso comum: permutations

    public static ArrayList<String> permutations(String s){
        if(s.length() < 0) return null;
        ArrayList<String > permutations = new ArrayList<>();

        if(s.length() == 1) {
            permutations.add(s);
            return permutations;
        }
        char[] characters = s.toCharArray();
        for(int i = 0; i < characters.length - 1; i++){
            System.out.println("111111");
           ArrayList<String> leftovers = permutations(s.substring(1));
            for (int j = 0; j < leftovers.size(); j++ ){
                System.out.println("22222222222");

                permutations.add(characters[i] + leftovers.get(j) );
            }
        }

        return permutations;
    }

}
