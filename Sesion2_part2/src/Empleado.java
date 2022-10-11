
public class Empleado {

	enum TipoEmpleado{Vendedor,Encargado}
	
	
	
	public static float calculoNominaBruta(TipoEmpleado tipo, float  ventaMes, float horasExtra) {
		float nomina=0;
		if(tipo==TipoEmpleado.Encargado) 
			nomina+=2500;
		else
			nomina+=2000;
		
		
		if(ventaMes>=1500)
			nomina+=200;
		else if(ventaMes>=1000)
			nomina+=100;
		
		
		if(horasExtra>0)
			nomina+=30*horasExtra;
		
		return nomina;
	}
	
	public static float calculoNominaNeta(float nominaBruta){
		double retencion=0;
		
		if(nominaBruta>2500)
			retencion=0.18;
		else if (nominaBruta>2000)
			retencion=0.15;
		
		return nominaBruta*(1-(float)retencion);
	}
}
