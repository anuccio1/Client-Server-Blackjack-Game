
import javax.swing.JFrame;


public class PlayerTest
{
   public static void main( String[] args )
   {
      Player application; // declare client application

      // if no command line args
      if ( args.length == 0 )
         application = new Player( "127.0.0.1" ); // connect to localhost
      else
         application = new Player( args[ 0 ] ); // use args to connect

      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      application.runClient(); // run client application
   } // end main
} // end class ClientTest





