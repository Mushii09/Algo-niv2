import java.util.Date;
import java.text.SimpleDateFormat;

public class test {

    SimpleDateFormat formater = null;

    Date aujourdhui = new Date();

    formater = new SimpleDateFormat("dd-MM-yy");
    System.out.println(formater.format(aujourdhui));
}
