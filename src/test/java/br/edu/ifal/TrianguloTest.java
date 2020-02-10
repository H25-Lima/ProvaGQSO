package br.edu.ifal;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class TrianguloTest {
	
	Triangulo triangulo;
	
	
	@Before
    public void inicializacao() {
	
	}
	
    @Test
    public void deveRetornarIlegalParaTodosOsLadosIguaisA0(){
        triangulo = new Triangulo(0, 0, 0);
    	String resultadoRetornado = triangulo.getTipo(triangulo);
    	String resultadoEsperado = "Ilegal";
    	assertEquals(resultadoEsperado, resultadoRetornado);
    }

    @Test
    public void deveRetornarIlegalPara2LadosIguaisA0(){ 
        triangulo = new Triangulo(0, 2, 0);
    	String resultadoRetornado = triangulo.getTipo(triangulo);
    	String resultadoEsperado = "Ilegal";
    	assertEquals(resultadoEsperado, resultadoRetornado);
    }

    @Test
    public void deveRetornarIlegalPara1LadosIguaisA0(){ 
        triangulo = new Triangulo(0, 1, 10);
    	String resultadoRetornado = triangulo.getTipo(triangulo);
    	String resultadoEsperado = "Ilegal";
    	assertEquals(resultadoEsperado, resultadoRetornado);
    }

    @Test
    public void deveRetornarEscalenoParaTodosOsLadosDiferentesDe0(){
        triangulo = new Triangulo(5, 8, 7);
    	String resultadoRetornado = triangulo.getTipo(triangulo);
    	String resultadoEsperado = "Escaleno";
    	assertEquals(resultadoEsperado, resultadoRetornado);
    }
    
    @Test 
    public void deveRetornarEquilateroParaTodosOsLadosComMedidasIguais(){
        triangulo = new Triangulo(4, 4, 4);
        String resultadoRetornado = triangulo.getTipo(triangulo);
    	String resultadoEsperado = "Equilatero";
    	assertEquals(resultadoEsperado, resultadoRetornado);
    }

    @Test 
    public void deveRetornarIsocelesQuandoOLado1ForIgualAoLado2(){
        triangulo = new Triangulo(5, 5, 6 );
        String resultadoRetornado = triangulo.getTipo(triangulo);
    	String resultadoEsperado = "Isosceles";
    	assertEquals(resultadoEsperado, resultadoRetornado);
    }

    @Test 
    public void deveRetornarIsocelesQuandoOLado1ForIgualAoLado3(){
        triangulo = new Triangulo(7, 6, 7);
    	String resultadoRetornado = triangulo.getTipo(triangulo);
    	String resultadoEsperado = "Isosceles";
    	assertEquals(resultadoEsperado, resultadoRetornado);
    }

    @Test 
    public void deveRetornarIsocelesQuandoOLado2ForIgualAoLado3() {
        triangulo = new Triangulo(9, 8, 8);
    	String valorRetornado = triangulo.getTipo(triangulo);
    	String valorEsperado = "Isosceles";
    	assertEquals(valorEsperado, valorRetornado);
    }

    @Test
    public void deveRetornarIlegalQuandoASubtracaoDoLadoAComOLadoCForMaiorQueOLadoB(){ 
        triangulo = new Triangulo(11, 6, 5);
    	String valorRetornado = triangulo.getTipo(triangulo);
    	String valorEsperado = "Ilegal";
    	assertEquals(valorEsperado, valorRetornado);
    }

    @Test
    public void deveRetornarIlegalQuandoASubtracaoDoLadoBComOLadoCForMaiorQueOLadoA(){
        triangulo = new Triangulo(7, 15, 8);
        String valorRetornado = triangulo.getTipo(triangulo);
        String valorEsperado = "Ilegal";
        assertEquals(valorEsperado, valorRetornado);
  }

  @Test
    public void deveRetornarIlegalParaUmLadoComONumeroNegativos(){
        triangulo = new Triangulo(4, -2, 6);
        String validadeRetornada =  triangulo.getTipo(triangulo);
        String validadeEsperada = "Ilegal";
        assertEquals(validadeEsperada, validadeRetornada);
    }

    
    
}