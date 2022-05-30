
import javax.swing.SwingConstants;

public class Conversor {
	
	
	public Double moedas(int opc,Double valor, int tipoDeEntrada, Double cotacao) {
		
		Double dolar = null;
		Double euro = null;
		Double librasEsterlinas = null;
		Double pesoArgentino = null;
		Double pesoChileno = null;
		
		if(tipoDeEntrada == 1) {
			dolar = 4.8152;
			euro = 5.1388;
			librasEsterlinas = 6.0477;
			pesoArgentino = 24.6913;
			pesoChileno = 172.469;
		}else if(tipoDeEntrada == 2){
			dolar = cotacao;
			euro = cotacao;
			librasEsterlinas = cotacao;
			pesoArgentino = cotacao;
			pesoChileno = cotacao;
		}
		
		
		
		
		Double r = null;
		



		switch(opc) {
		
		case 1:
			r = valor / dolar;
			break;
		case 2:
			r = dolar * valor;
			break;
		case 3:
			r = valor / euro;
			break;
		case 4:
			r = valor * euro;
			break;
		case 5:
			r = valor / librasEsterlinas;
			break;
		case 6:
			r = valor * librasEsterlinas;
			break;
		case 7:
			r = valor * pesoArgentino;
			break;
		case 8:
			r = valor / pesoArgentino;
			break;
		case 9:
			r = valor * pesoChileno;
			break;
		case 10:
			r = valor / pesoChileno;
			break;
		default:
			System.out.println("Erro");
			break;
	}
	return r;
}
}
