
import javax.swing.JFrame;

public class DealerTest
{
   public static void main( String[] args )
   {
      Dealer application = new Dealer(); // create server
      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      application.runDeal(); // run server application
   } // end main
} // end class ServerTest