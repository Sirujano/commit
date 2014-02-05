package calculadora;
import java.util.Scanner;

public class TestCalculadora{
private static int reset; //sirve para poder borrar un resultado (en un futuro sera boolean)
private static float resultado; //sirve para poder operar con resultados guardados (version BETA solo suma)

	public static void main(String[] args){
        Calculadora cal;
	cal = new Calculadora();
	Scanner entrada = new Scanner(System.in);
	for(int x=0; x<11000000; x++){
	int op;
	int re;	
		System.out.println("Elija su operacion: \n 1.Suma \n 2.Resta \n 3.Multiplicacion \n 4.Division \n 5.Potencia \n 6.Raiz \n 7.Coseno \n 8.Seno \n 9.Tangente \n 10.Reset \n 11.Apagar");
		op = (int) entrada.nextInt();
		
			if(op==1){
			System.out.println("Elija el primer numero :");
			float numero1 = entrada.nextFloat();
			System.out.println("Elija el segundo numero :");
			float numero2 = entrada.nextFloat();
				
				
				resultado +=cal.sumar(numero1, numero2);
				System.out.println("El resultado es:" +resultado);
				System.out.println("\n");
                                cal.refrescar();
				System.out.println("Desea guardar el resultado obtenido para seguir operando? \n 1.Si \n 2.No ");
				reset = (int)entrada.nextInt();
					if(reset == 2){
						resultado = 0;
				}
						
				
				
			}
			if(op==2){
			System.out.println("Elija el primer numero :");
			float numero1 = entrada.nextFloat();
			System.out.println("Elija el segundo numero :");
			float numero2 = entrada.nextFloat();
				resultado +=cal.restar(numero1, numero2);
				System.out.println("El resultado es:" +resultado);
				cal.refrescar();
				System.out.println("Desea guardar el resultado obtenido para seguir operando? \n 1.Si \n 2.No ");
				reset =  (int)entrada.nextInt();
					if(reset == 2){
						resultado = 0;
					}
				
			}
			if(op==3){
			System.out.println("Elija el primer numero :");
			float numero1 = entrada.nextFloat();
			System.out.println("Elija el segundo numero :");
			float numero2 = entrada.nextFloat();
				resultado +=cal.multiplicar(numero1, numero2);
				System.out.println("El resultado es:" +resultado);
				cal.refrescar();
				System.out.println("Desea guardar el resultado obtenido para seguir operando? \n 1.Si \n 2.No ");
				reset = (int)entrada.nextInt();
					if(reset == 2){
						resultado = 0;
					}
			}
			if(op==4){
			System.out.println("Elija el primer numero :");
			float numero1 = entrada.nextFloat();
			System.out.println("Elija el segundo numero :");
			float numero2 = entrada.nextFloat();
				resultado +=cal.dividir(numero1, numero2);
				System.out.println("El resultado es:" +resultado);
				cal.refrescar();
				System.out.println("Desea guardar el resultado obtenido para seguir operando? \n 1.Si \n 2.No ");
				reset =  (int) entrada.nextInt();
					if(reset == 2){
						resultado = 0;
					}
			}
			if(op==5){
			System.out.println("Elija el primer numero :");
			float numero1 = entrada.nextFloat();
			System.out.println("Elija el exponente :");
			float numero2 = entrada.nextFloat();
				resultado +=cal.potencia(numero1, numero2);
				System.out.println("El resultado es:" +resultado);
				cal.refrescar();
				System.out.println("Desea guardar el resultado obtenido para seguir operando? \n 1.Si \n 2.No ");
				reset = (int) entrada.nextInt();
					if(reset == 2){
						resultado = 0;
					}else{
                                            System.out.println("Especifique el tipo de operacion que desea hacer con el resultado: ");
                                        }
			}
			if(op==6){
			System.out.println("Elija el tipo de raiz :");
			float numero2 = entrada.nextFloat();
			System.out.println("Elija el numero :");
			float numero1 = entrada.nextFloat();
				resultado +=cal.raiz(numero1, numero2);
				System.out.println("El resultado es:" +resultado);
				cal.refrescar();
				System.out.println("Desea guardar el resultado obtenido para seguir operando? \n 1.Si \n 2.No ");
				reset = (int) entrada.nextInt();
					if(reset == 2){
						resultado = 0;
					}
			}
			if(op==7){
			System.out.println("Elija el angulo :");
			float numero1 = entrada.nextFloat();
			float angulo = (float) Math.toRadians(numero1);
			
				resultado +=cal.coseno(angulo);
				System.out.println("El resultado es:" +resultado);
				cal.refrescar();
				System.out.println("Desea guardar el resultado obtenido para seguir operando? \n 1.Si \n 2.No ");
				reset = (int) entrada.nextInt();
					if(reset == 2){
						resultado = 0;
					}
			}
			if(op==8){
			System.out.println("Elija el angulo :");
			float numero1 = entrada.nextFloat();
			float angulo = (float) Math.toRadians(numero1);
			
				resultado +=cal.seno(angulo);
				System.out.println("El resultado es:" +resultado);
				cal.refrescar();
				System.out.println("Desea guardar el resultado obtenido para seguir operando? \n 1.Si \n 2.No ");
				reset = (int) entrada.nextInt();
					if(reset == 2){
						resultado = 0;
					}
			}
			if(op==9){
			System.out.println("Elija el angulo :");
			float numero1 = entrada.nextFloat();
			float angulo = (float) Math.toRadians(numero1);
			
				resultado +=cal.tangente(angulo);
				System.out.println("El resultado es:" +resultado);
				cal.refrescar();
				System.out.println("Desea guardar el resultado obtenido para seguir operando? \n 1.Si \n 2.No ");
				reset = (int) entrada.nextInt();
					if(reset == 2){
						resultado = 0;
					}
			}
			
			if(op==10){
				if(reset != 1){
					System.out.println("No hay ningun valor guardado en la calculadora");
				}
				if(reset ==1){
					System.out.println("Desea borrar el resultado guardado en la calculadora \n 1.No \n 2.Si");
					reset = (int) entrada.nextInt();
						if(reset == 2){
							resultado = 0;
						}
				}
			}
			
			if(op==11){
				System.out.println("***** Hasta luego *****");
                                x=1100000000;
			}
			

			if (op > 11) {
				System.out.println("Tu eres tonto");
				cal.refrescar();
			}
			if (op < 1) {
				System.out.println("Tu eres tonto");
				cal.refrescar();
			}
		}	
		
		
		
	}
	
		
		
		
		
	
}	