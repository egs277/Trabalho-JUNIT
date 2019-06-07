package control;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProgramaTeste {

	private static final double VerificarPeso = 0;
	private static final double VerificarAltura = 0;
	private static final double VerAltura = 0;


	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
    public void VerificarAltura() {       
        int n1 = 5;
        int n2 = 5;
        ProgramaTeste instance = new ProgramaTeste();
        double expResult = 10.0;
        int altura = 0;
		double result = instance.VerificarAltura ((altura*100) - 100, altura) * 0.90;
        assertEquals(expResult, result, 0);
    }
 
   
    private double VerificarAltura(int n1, int n2) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Test
    public void VerificarPeso() {
        ProgramaTeste instance = new ProgramaTeste();
        double expResult = 2;
        double result = instance.VerificarPeso;
		double peso = 0;
		double altura = 0;
		Object imc = (peso / (altura * altura));;
        assertEquals(expResult, result, 0);
    }
 
    
    private double VerificarPeso(Class<Double> class1) {
		// TODO Auto-generated method stub
		return 0;
	}
    /*
     * Teste para mulheres
     */

	@Test
    public void VerAltura() {
        
        ProgramaTeste instance = new ProgramaTeste();
        double expResult = 6;
        double result = instance.VerAltura;
		int altura = 0;
		double pesoIdeal = ((altura*100) - 100) * 0.85;;
        assertEquals(expResult, result, 0);
    }
 
    
    
 
}


