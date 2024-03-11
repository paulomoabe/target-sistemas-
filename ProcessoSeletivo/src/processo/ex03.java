package processo;

public class ex03 {

	public static void main(String[] args) {
	    
        int proximoA = proximoElementoA(7);
        System.out.println("a) Próximo elemento: " + proximoA);

      
        int proximoB = proximoElementoB(64);
        System.out.println("b) Próximo elemento: " + proximoB);

    
        int proximoC = proximoElementoC(36);
        System.out.println("c) Próximo elemento: " + proximoC);

    
        int proximoD = proximoElementoD(64);
        System.out.println("d) Próximo elemento: " + proximoD);

   
        int proximoE = proximoElementoE(8);
        System.out.println("e) Próximo elemento: " + proximoE);

      
        int proximoF = proximoElementoF(19);
        System.out.println("f) Próximo elemento: " + proximoF);
    }

    // Sequência a) 1, 3, 5, 7, ___
    public static int proximoElementoA(int ultimoElemento) {
        return ultimoElemento + 2;
    }

    // Sequência b) 2, 4, 8, 16, 32, 64, ___
    public static int proximoElementoB(int ultimoElemento) {
        return ultimoElemento * 2;
    }

    // Sequência c) 0, 1, 4, 9, 16, 25, 36, ___
    public static int proximoElementoC(int ultimoElemento) {
        int raizQuadrada = (int) Math.sqrt(ultimoElemento);
        return (raizQuadrada + 1) * (raizQuadrada + 1);
    }

    // Sequência d) 4, 16, 36, 64, ___
    public static int proximoElementoD(int ultimoElemento) {
        int raizQuadrada = (int) Math.sqrt(ultimoElemento);
        return (raizQuadrada + 2) * (raizQuadrada + 2);
    }

    // Sequência e) 1, 1, 2, 3, 5, 8, ___
    public static int proximoElementoE(int ultimoElemento) {
       
        int a = 0, b = 1;
        while (a + b <= ultimoElemento) {
            int proximo = a + b;
            a = b;
            b = proximo;
        }
        return a + b;
    }

    // Sequência f) 2,10, 12, 16, 17, 18, 19, ___
    public static int proximoElementoF(int ultimoElemento) {
        return ultimoElemento + 1;
	}

}
