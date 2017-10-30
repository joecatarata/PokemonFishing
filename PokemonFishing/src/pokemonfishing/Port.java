package pokemonfishing;


import pokemonfishing.Locale;

/**
 * This class provides the layout of the Port
 * @author Michael Gerra-Clarin
 */
public class Port {

	private String name;
                     private int portXpos; 
                     private int portYpos;
                      public Port(){
                          name = "Port";
                      }
                      
                      public Port(int xPos, int yPos){
                          name = "Port";
                          portXpos = xPos;
                          portYpos = yPos;
                      }
                      /**
                       * Retrieves the name of the Port.
                       * @return A string data type.
                       */
                      public String getName()
                      {
                          return name;
                      }
                      /**
                       * Retrieves the X position of the port.
                       * @return An integer data type.
                       */
                      public int getPortXpos(){
                          return portXpos;
                      }
                      /**
                       * Retrieves the Y position of the port.
                       * @return An integer data type.
                       */
                      public int getPortYpos(){
                          return portYpos;
                      }
	
	
	
}
