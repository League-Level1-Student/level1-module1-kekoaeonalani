

public class whiteBoardMarkerRunner {

	   public class Platypus {
		    private String name;
		    void sayHi(){
		        System.out.println("The platypus " + name + " is smarter than your average platypus.");
		    }
		    
		}
	   
        public static void main(String[] args) {
            whiteBoardMarker marker = new whiteBoardMarker(8,"Hello");
            System.out.println(marker.inkLeft);
            System.out.println(marker.color);
      }
        
   }