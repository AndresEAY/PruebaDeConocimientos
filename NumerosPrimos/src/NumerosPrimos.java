public class NumerosPrimos {
    public static void main(String[] args) {
        int contador = 0;
        int numero = 0;
        int primos[];
        primos = new int[10];

        while (contador < 10){
            numero++;
            if (primo(numero)){
                primos[contador] = numero;
                contador++;
            }
        }
        for (int i = 0; i < primos.length; i++){
            System.out.print(primos[i] + ", ");
        }
    }

    public static boolean primo(int num){
        if (num == 0 || num == 1){
            return false;
        }
        for (int i = 2; i < num; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
