
import java.util.Scanner;

public class LucasSouza_Exercicio08{
	public static void main(String[] args) {
        /* CRIAÇÃO DAS VARIÁVEIS */
            final Scanner reader;
            int numeroInseridoPeloUsuario;
        
        /* INICIALIZAÇÃO DAS VARIÁVEIS */
            reader = new Scanner(System.in);
            numeroInseridoPeloUsuario = 0;
      
        /* RECEBE O NÚMERO DO USUÁRIO */
            System.out.println("Insira um valor abaixo: ");
                numeroInseridoPeloUsuario = reader.nextInt();
      
        /* CALCULA O VALOR TOTAL A PAGAR */
            if(numeroInseridoPeloUsuario >= 94 && numeroInseridoPeloUsuario <= 456){
                System.out.println("Acertou!");
            }else{
                System.out.println("Tente de novo!");
            }
	}
}
