import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Log {

	/**
	 * @param args
	 */
	public Log() {}

	public void escribirEnLog(String texto){
		Calendar date = Calendar.getInstance();
		SimpleDateFormat dateformatter = new SimpleDateFormat("E yyyy.MM.dd 'at'hh:mm:ss a zzz");
	    
			FileWriter fichero = null;
			PrintWriter pw = null;
			try {
				fichero = new FileWriter("datos/eventos.txt", true);
				pw = new PrintWriter(fichero);
				pw.print(dateformatter.format(date.getTime()) + " // " + texto + "\n");
				if (null != fichero)
					fichero.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
}
