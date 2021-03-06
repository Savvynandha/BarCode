public class BarCodeIO {
	BarCodeImage b = new BarCodeImage();
	public boolean scan( BarcodeImage bc ){
		/*- accepts some image, represented as a BarcodeImage object to be described below, and stores a copy of this 
		 * image.  Depending on the sophistication of the implementing class, the internally stored image might be an exact
		 *  clone of the parameter, or a refined, cleaned and processed image.  Technically, there is no requirement that 
		 *  an implementing class use a BarcodeImage object internally, although we will do so.  For the basic DataMatrix 
		 *  option, it will be an exact clone.  Also, no translation is done here - i.e., any text string that might be 
		 *  part of an implementing class is not touched, updated or defined during the scan.
		 */
		return true;
	}

	public boolean readText( String text ) {
		/*- accepts a text string to be eventually encoded in an image. No translation is done here - i.e., any 
		 * BarcodeImage that might be part of an implementing class is not touched, updated or defined during the reading 
		 * of the text.
		 */
		return true;
	}
	public boolean generateImageFromText() {
		/*- Not technically an I/O operation, this method looks at the internal text stored in the implementing class and 
		 * produces a companion BarcodeImage, internally (or an image in whatever format the implementing class uses).  
		 * After this is called, we expect the implementing object to contain a fully-defined image and text that are in 
		 * agreement with each other.
		 */
		return true;
	}
	public boolean translateImageToText() {
	   String companion;
	   /*- Not technically an I/O operation, this method looks at the internal image stored in the implementing class, and
	    *  produces a companion text string, internally.  After this is called, we expect the implementing object to contain 
	    *  a fully defined image and text that are in agreement with each other.
	    */
	   return true;
	}
	public void displayTextToConsole() {
	   //- prints out the text string to the console.
	   System.out.println();
	}
	void displayImageToConsole() {
	   /*- prints out the image to the console.  In our implementation, we will do this in the form of a dot-matrix of 
        * blanks and asterisks, e.g.,
	    */
		System.out.println();
	}
}
