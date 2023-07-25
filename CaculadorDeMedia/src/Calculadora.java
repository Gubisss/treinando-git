import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		

		 Scanner teclado = new Scanner (System.in);

	        double nota1, nota2, nota3, nota4, media1,pontos1;
	        double semestre1 , pontos2,semestre2,faltante;
	        double gs;


	        System.out.println("Digite as 4 notas dos CP/Sprint do segundo semestre (de 0 a 100)");

	        nota1=teclado.nextDouble();
	        nota2=teclado.nextDouble();
	        nota3=teclado.nextDouble();
	        nota4=teclado.nextDouble();

	        media1=(nota1+nota2+nota3+nota4)/4;
	        pontos1= (media1*4)/100;

	        System.out.println("Sua nota só dos CP/Sprint é : " + pontos1);

	        System.out.println("Digite com quanto você ficou no primeiro semestre ( 0 a 100) ");
	        semestre1= teclado.nextDouble();

	        semestre2= ((pontos1+(semestre1*4))/4)/100;

	        pontos2= semestre2+pontos1;

	        System.out.println("Seus pontos atuais totais são : " + pontos2);

	        faltante=0;

	        if (pontos2>= 6) {
	            System.out.println("Você passou de ano já, sem fazer a GS");
	        } else
	{
	            faltante= 6-pontos2;
	            System.out.println("Você ainda precisa de "+  faltante);
	            gs= (faltante/0.6)/0.6;

	            System.out.println("Para passar na Gs você precisa tirar : " + gs);
	        }
		
		
	}

}
