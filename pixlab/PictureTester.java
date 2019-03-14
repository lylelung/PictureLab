/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
 /*   
 
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  public static void testMirrorVerticalRightToLeft()
  {
      Picture redMotorcycle = new Picture("redMotorcycle.jpg");
    redMotorcycle.explore();
    redMotorcycle.mirrorVerticalRightToLeft();
    redMotorcycle.explore();
  }
 
  public static void testMirrorUpAndDown()
  {
      Picture redMotorcycle = new Picture("redMotorcycle.jpg");
    redMotorcycle.explore();
    redMotorcycle.mirrorUpAndDown();
    redMotorcycle.explore();
  }
  
  
 
  public static void testMirrorTempleReflect()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTempleReflect();
    temple.explore();
  }
  */
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  /* weird stuff
  public static void testkeepOnlyBlue()
  {
      Picture beach = new Picture("beach.jpg");
      beach.keepOnlyBlue();
      beach.explore();
    }
  public static void testSnowmanReflect()
  {
      Picture snowman = new Picture("snowman.jpg");
      snowman.snowmanreflect();
      snowman.explore();
    }
  
    */
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
   //testZeroBlue();
    //testkeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorUpAndDown();
    //testMirrorVerticalRightToLeft();
    //testMirrorVertical();
    //testMirrorTempleReflect();
    //testSnowmanReflect();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}