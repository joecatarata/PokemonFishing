package pokemonfishing;


import pokemonfishing.Locale;


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
                      
                      public String getName()
                      {
                          return name;
                      }
                      
                      public int getPortXpos(){
                          return portXpos;
                      }
                      public int getPortYpos(){
                          return portYpos;
                      }
	
	
	
}
