package Datas;
        
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ConversaoDatas {

	public static void main(String[] args) throws ParseException {
		///Cria um calendario e chama o metodo pra pegar a data
                Calendar c = Calendar.getInstance(); ///get instance pega uma data de acordo com a localizacao do dispositivo.
		Date data = c.getTime();///retorna a data atual e seta na data

		///Criamos um novo formato de data
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                ///Insere dentro desse formato, a data que pegamos lá em cima
		System.out.println("Data formatada: "+ sdf.format(data));

                ///Converte uma String em data
		System.out.println("Data convertida: "+ sdf.parse("02/08/1970"));
   
	}

}

