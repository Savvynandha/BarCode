
public class BarCodeImage {
   public static final int MAX_HEIGHT = 30;    
   public static final int MAX_WIDTH = 65;
   
   private boolean[][] image_data {
	   /*
	    * This is where to store your image.  If the incoming data is smaller than the max, instantiate memory anyway, 
	    * but leave it blank (white). This data will be false for elements that are white, and true for elements that are 
	    * black.
	    */
   }
   BarCodeImage(){
	   BarCodeImage[][] bc= new BarCodeImage[1][];
      //instantiates a 2D array (MAX_HEIGHT x MAX_WIDTH) and stuffs it all with blanks (false).	   
	   //null loop
   }

   BarcodeImage(String[] str_data){
	   /*-takes a 1D array of Strings and converts it to the internal 2D array of booleans. This constructor is a little 
	    * tricky because the incoming image is not the necessarily same size as the internal matrix.  So, you have to pack 
	    * it into the lower-left corner of the double array, causing a bit of stress if you don't like 2D counting.  
	    * This is good 2D array exercise.  The DataMatrix class will make sure that there is no extra space below or left 
	    * of the image so this constructor can put it into the lower-left corner of the array.
	    */
	   
}
}
