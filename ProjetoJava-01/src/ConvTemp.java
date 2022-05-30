
public class ConvTemp {
	public Double conversor(int opc, Double temperatura) {
		
		Double r = null;
		
		switch (opc) {
		case 1: // Fahrenheit para Cº
			r =  (temperatura - 32) / 1.8;
			break;
		case 2://Celsius para Fº
			r = (1.8 * temperatura) + 32;
			break;	
		default:
			System.out.println("ERRO");
			break;
		}
		System.out.println(r);
		return r;
		
	}
	}

