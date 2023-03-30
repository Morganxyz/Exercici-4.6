import java.util.Scanner;

public class M4_Ex6_Daniel_Amat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dia = 0;
		int mes = 0;
		
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Indica un mes, siendo enero el 1 y diciembre el 12: ");
		mes = entrada.nextInt();
		
		System.out.println("Indica ara un dia del mes, del 1 al 31: ");
		dia = entrada.nextInt();
		
		switch(mes) {
		
			case 1:
				if(dia >=1 && dia <= 19) {
				System.out.println("El signo zodiacal es Capricornio");
				
			}	else if(dia >= 20 && dia <= 31) {
				System.out.println("El signo zodiacal es Acuario");
			}
				break;
			case 2: 
				if(dia >=1 && dia <= 18) {
					System.out.println("El signo zodiacal es Acuario");
					
				}	else if(dia >= 19 && dia <= 29) {
					System.out.println("El signo zodiacal es Piscis");
		}
				break;
			case 3:
				if(dia >=1 && dia <= 20) {
				System.out.println("El signo zodiacal es Piscis");
				
			}	else if(dia >= 21 && dia <= 31) {
				System.out.println("El signo zodiacal es Aries");
			}
				break;
			case 4:
				if(dia >=1 && dia <= 19) {
				System.out.println("El signo zodiacal es Aries");
				
			}	else if(dia >= 20 && dia <= 30) {
				System.out.println("El signo zodiacal es Tauro");
			}
				break;
			case 5:
				if(dia >=1 && dia <= 20) {
				System.out.println("El signo zodiacal es Tauro");
				
			}	else if(dia >= 21 && dia <= 31) {
				System.out.println("El signo zodiacal es Géminis");
			}
				break;
			case 6:
				if(dia >=1 && dia <= 20) {
				System.out.println("El signo zodiacal es Géminis");
				
			}	else if(dia >= 21 && dia <= 30) {
				System.out.println("El signo zodiacal es Cáncer");
			}
				break;
			case 7:
				if(dia >=1 && dia <= 22) {
				System.out.println("El signo zodiacal es Cáncer");
				
			}	else if(dia >= 23 && dia <= 31) {
				System.out.println("El signo zodiacal es Leo");
			}
				break;
			case 8:
				if(dia >=1 && dia <= 22) {
				System.out.println("El signo zodiacal es Leo");
				
			}	else if(dia >= 23 && dia <= 31) {
				System.out.println("El signo zodiacal es Virgo");
			}
				break;
			case 9:
				if(dia >=1 && dia <= 22) {
				System.out.println("El signo zodiacal es Virgo");
				
			}	else if(dia >= 23 && dia <= 30) {
				System.out.println("El signo zodiacal es Libra");
			}
				break;
			case 10:
				if(dia >=1 && dia <= 22) {
				System.out.println("El signo zodiacal es Libra");
				
			}	else if(dia >= 23 && dia <= 30) {
				System.out.println("El signo zodiacal es Escorpio");
			}
				break;
			case 11:
				if(dia >=1 && dia <= 21) {
				System.out.println("El signo zodiacal es Escorpio");
				
			}	else if(dia >= 22 && dia <= 30) {
				System.out.println("El signo zodiacal es Sagitario");
			}
				break;
			case 12:
				if(dia >=1 && dia <= 21) {
				System.out.println("El signo zodiacal es Sagitario");
				
			}	else if(dia >= 22 && dia <= 31) {
				System.out.println("El signo zodiacal es Capricornio");
			}
				break;
			default:
				System.out.println("Algun dato introducido es incorrecto, vuelva a intentarlo");
	}
	}
	}
	
