import java.util.Scanner;

/**
   A telephone that takes simulated keystrokes and voice input
   from the user and simulates spoken text.
*/
public class Telephone
{
   /**
      Construct phone object.
      @param aScanner that reads text from a character-input stream
   */
   public Telephone(Scanner aScanner)
   {
      scanner = aScanner;
   }

   /**
      Speak a message to System.out.
      @param output the text that will be "spoken"
   */
   public void speak(String output)
   {
      System.out.println(output);
   }

   /**
      Loops reading user input and passes the input to the
      Connection object's methods dial, record or hangup.
      @param c the connection that connects this phone to the
      voice mail system
   */
   public void run(Connection c)
   {
      boolean more = true;
      while (more)
      {
         String input = scanner.nextLine();
         if(c.getAfterReset() == true)
         {
        	 if(input.length() == 1 && input.equals("1")){
        		 // LEAVE MESSAGE FLOW
        		 speak(LEAVING_MESSAGE_PROMPT);
        		 c.setState(1); // set to Connected
        		 c.setAfterReset(false);
        		 c.setInitialInputSet(true);
        		 c.dial(input);
        	 }
        	 else if(input.length() == 1 && input.equals("2")){
        		 // ENTER MAILBOX FLOW
        		 speak(ENTER_MAILBOX_PROMPT);
        		 c.setState(7); // set to Recording
        		 c.setAfterReset(false);
        		 c.setInitialInputSet(true);
        		 c.dial(input);
        	 }
        	 else{
        		 speak("Invalid entry! Please type 1 or 2");
        	 }
         }
         
         else{
        	 c.setInitialInputSet(false);
	         if (input == null) return;
	         if (input.equalsIgnoreCase("H"))
	            c.hangup();
	         else if (input.equalsIgnoreCase("Q"))
	            more = false;
	         else if (input.length() == 1
	            && "1234567890#".contains(input))
	            c.dial(input);
	         else
	            c.record(input);
         }
      }
   }

   private static final String LEAVING_MESSAGE_PROMPT = 
	         "Enter mailbox number followed by #"; 
   private static final String ENTER_MAILBOX_PROMPT = 
		         "Please enter your passcode followed by #";
   private Scanner scanner;
}
