package ar.edu.unlam.tallerweb1.clase3;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class CerraduraTest {

	
	@Test
	public void testNoSePuedeAbrirUnaCerraduraBloqueada() {
		Cerradura c1 = new Cerradura(123, 1);
		c1.abrirCerradura(1);
		c1.abrirCerradura(2);
		c1.abrirCerradura(123);
		Assert.assertFalse(c1.abrirCerradura(123));
	}
	
	@Test
	public void testCodigoAbreCerradura() {
		int claveInicial = 93;
		int falloConsecutivo =  3;
		Cerradura cer = new Cerradura(claveInicial,falloConsecutivo);
		
		Assert.assertTrue(cer.abrirCerradura(93)); 
		
	}
	
	@Test
	public void testCodigoNoAbreCerradura() {
		int claveInicial = 93;
		int falloConsecutivo =  3;
		Cerradura cer = new Cerradura(claveInicial,falloConsecutivo);
		
		Assert.assertFalse(cer.abrirCerradura(94)); 
		
	}
	
	@Test
	public void testCerrarCerradura(){
		int claveInicial = 93;
		int falloConsecutivo =  3;
		Cerradura cer = new Cerradura(claveInicial,falloConsecutivo);

		Assert.assertTrue(cer.abrirCerradura(93));
		
		cer.cerrarCerradura();
		
		Assert.assertFalse(cer.estaAbierta);
	}
	
	@Test
	public void testEstaCerrado(){
		int claveInicial = 93;
		int falloConsecutivo =  3;
		Cerradura cer = new Cerradura(claveInicial,falloConsecutivo);
				
		Assert.assertTrue(cer.estaCerrado());
			}
	
	@Test
	public void testEstaAbierto(){
		int claveInicial = 93;
		int falloConsecutivo =  3;
		Cerradura cer = new Cerradura(claveInicial,falloConsecutivo);
				
		Assert.assertFalse(cer.estaAbierto());
			}
	@Test
	public void testFueBloqueada(){
		int claveInicial = 93;
		int falloConsecutivo =  3;
		Cerradura cer = new Cerradura(claveInicial,falloConsecutivo);
				
		cer.abrirCerradura(94);
		cer.abrirCerradura(94);
		cer.abrirCerradura(94);
		
		Assert.assertTrue(cer.fueBloqueada());
			}
	
	@Test
	public void testConteoAperturasExitosas(){
		
		int claveInicial = 93;
		int falloConsecutivo =  3;
		Cerradura cer = new Cerradura(claveInicial,falloConsecutivo);
		Integer valorEsperado = 2; 
		
		
		cer.abrirCerradura(93);
		cer.cerrarCerradura();
		cer.abrirCerradura(93);
		Integer valorObtenido = cer.contarAperturasExitosas();
		
		
		Assert.assertEquals(valorEsperado,valorObtenido);	
	}

	@Test
	public void testConteoAperturasFallidas(){
		
		int claveInicial = 93;
		int falloConsecutivo =  3;
		Cerradura cer = new Cerradura(claveInicial,falloConsecutivo);
		Integer valorEsperado = 2; 
		
		
		cer.abrirCerradura(94);
		cer.abrirCerradura(94);
		Integer valorObtenido = cer.contarAperturasFallidas();
		
		
		Assert.assertEquals(valorEsperado,valorObtenido);	
	}
	
	
}
