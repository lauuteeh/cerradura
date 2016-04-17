package ar.edu.unlam.tallerweb1.clase3;

public class Cerradura {
	
	private Integer claveApertura;
	public boolean estaAbierta=false;
	private Integer fallosConsec;
	private Integer fallosErroneos = 0;
	private Integer AperturaLograda = 0;
	private boolean estaBloqueada = false;
	
	public Cerradura(Integer clave,Integer cantidadFallos){
		
		claveApertura = clave;
		fallosConsec=cantidadFallos;
		
	}
	
	
	public boolean abrirCerradura(Integer clave){
		
		if(claveApertura==clave){
			if(estaBloqueada == false){
			AperturaLograda = AperturaLograda+1;
			estaAbierta=true;
			return true;
			
			}else{

			
			return false;
				
			} 
		}else{
			
			fallosErroneos = fallosErroneos+1; 
			
			if(fallosErroneos == fallosConsec){
				estaBloqueada = true;
			}
			
		 return false;
			
		}
	}
	
	public void cerrarCerradura(){
		estaAbierta = false;
	}	
	
	public boolean estaCerrado(){
		if(estaAbierta==false){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean estaAbierto(){
		if(estaAbierta==true){
			return true;
		}else{
			return false;
		}
		

		
		}
	
	public boolean fueBloqueada(){
		if(fallosConsec == fallosErroneos){
			
			return true;
			
		}else{
			
			return false;
			
		}
	}
	
	public Integer contarAperturasExitosas(){
		Integer valor = AperturaLograda;
		return valor;
	}

	public Integer contarAperturasFallidas(){
		Integer valor = fallosErroneos;
		return valor;
	}
	
	
}
