package calculadora;
public class Calculadora{

	
	
	public float sumar(float numero1, float numero2){
		
		return (float)numero1+numero2;
		
	}
	
	public float restar(float numero1, float numero2){
		
		return (float)numero1-numero2;
		
	}
	
	public float multiplicar(float numero1, float numero2){
		
		return (float)numero1*numero2;
		
	}
	
	public float dividir(float numero1, float numero2){
		
		return (float)numero1/numero2;
		
	}
	public float potencia(float numero1, float numero2){
		return (float) Math.pow(numero1,numero2);
	}
	
	public float raiz(float numero1, float numero2){
		return (float) Math.pow(numero1, 1.0/numero2);
	}
	
	public float coseno(float angulo){
		return (float) Math.cos(angulo);
	}
	
	public float seno(float angulo){
		return (float) Math.sin(angulo);
	}
	
	public float tangente(float angulo){
		return (float) Math.tan(angulo);
	}
	
	public void refrescar(){
			for(int x=0; x<5; x++){
				System.out.println();
			}
	}
}
		