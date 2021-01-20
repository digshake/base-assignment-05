package assignment05;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class AnimatedScene {

	/****************** These two methods are done for you. Do not modify/remove *********************/

	/**
	 * Setup the drawing area to be 1024 wide by 512 high with the bottom left corner at 0,0
	 */
	public static void setupDrawing() {
		// DONE: Do not modify this!
		StdDraw.setCanvasSize(1024, 512);
		StdDraw.setXscale(0,1024);
		StdDraw.setYscale(0,512);		
	}
	
	/**
	 * Draw a rectangle of given dimensions using the given (x,y) for the lower left corner
	 * @param x coordinate of lower left corner
	 * @param y coordinate of lower left corner
	 * @param width total width
	 * @param height total height
	 */
	public static void rectangleFromCorner(double x, double y, double width, double height) {
		// DONE: This is done for you.  It may serve as an example or make other work easier
		double cx = x+width/2;
		double cy = y+height/2;
		StdDraw.filledRectangle(cx, cy, width/2, height/2);
	}
	
	
	/****************** All your work goes below here!!! *********************/
		
	
	// TODO: Add JavaDoc style comments!
	public static double randomInRange(double start, double stop) {		
		// TODO / FIXME: This method needs to be completed
		return 0;
	}

	
	/**
	 * Draw a flat triangle at the designated location with the designated coordinates.
	 * 
	 * It'll look something like this (drawn with lines in StdDraw)
     *         ^            }
     *        / \           } 
	 *       /   \          } <- Height (up & down) 
	 *      /     \         }
	 *     /       \        }
	 *    .---------       <---- Width (left & right)
	 *  (x,y)              <---- (x,y) are the coordinates of the lower left corner
	 *  
	 * @param x coordinate of lower  left corner
	 * @param y coordinate of lower left corner
	 * @param width overall width
	 * @param height overall height
	 */
	public static void filledFlatTriangle(double x, double y, double width, double height) { 
		
		// These are "parallel arrays":  
		//     The 1st elements in each are the x and y of the first point of the polygon
		//     The 2nd elements in each are the x and y of the second point of the polygon
		//     Etc.		
		// TODO / FIXME: This example draws a rectangle from points going clockwise from (x,y) in the bottom right
		// It'll need to be changed for your triangle!
		// Think about where the points need to be located relative to (x,y)
		double[] xs = {x,        x,     x+width,  x+width};
		double[] ys = {y, y+height,    y+height,        y};

		StdDraw.filledPolygon(xs, ys);
	}
	
	
	/**
	 * Draw a house using the given (x,y) for the lower left corner
	 * @param x coordinate of lower left corner
	 * @param y coordinate of lower left corner
	 * @param width total width (all other aspects are proportional to this).  
	 * 
	 * The total height of the house shown in the video is twice the width: 
	 *     The height of the building itself is the same as the width
	 *     The height of the roof on the building is also the same as the width 
	 *     (so the total height from the bottom of the building to the top of the roof is 2*width)
	 */
	public static void drawHouse(/* TODO: Add parameters as described above */) {
		// TODO: Complete the code to draw a house of the given width at the given location
	}
		
	// TODO: Complete JavaDoc style comments
	public static void drawCloud(double x, double y, double size) {
		// Note the Pen color uses a "new color" with 4 parameters
		// TODO: You are welcome to change the color & transparency of clouds
		//                             red   green   blue   transparency (0-255)
		int bright = 255;        // 255 for white clouds. Lower numbers for grayer clouds
		int transparency = 200;  // 0-255; Higher numbers are "less transparent"
		StdDraw.setPenColor(new Color( bright,    bright,   bright,   transparency));

		// TODO:  Draw cloud 
		// The should be at least three distinct shapes (the "lobes" on the cloud)
		// The "size" parameter should dictate the overall width (and height should be proportional to size)
	}
	
	
	// TODO: Create drawSceneBackground()
	
	
	// TODO:  Complete createRandomCloudLocations(int n), which will return an array that 
	//        represents the locations of n randomly located / randomly sized clouds. 
	//            There should be n rows in the array
	//            There should be 3 columns:  
	//                  The first column should be a x coordinate of a cloud
	//                  The second column should be a y coordinate of a cloud
	//                  The third column should be the size of the cloud
	
	// TODO: Complete "drawCloudsAt(...) method that will utilize an array of clouds and draw them

	// TODO: Complete "advanceClouds(...) that will move the clouds across the screen on small step

	
	/*************** main(): Update this to test your work incrementally ***************/
	public static void main(String[] args) {
		// Setup the canvas for drawing
		setupDrawing();  // Done: Do not change this line

		// Below are several small tests that are commented out.  
		// You can remove the "//" on each part to test one small part of the assignment

		/* TODO: TRIANGLE TESTING ************************************************************/
		// The line below should put a triangle across the entire bottom of the screen with the "point" 
		// in the center:
		filledFlatTriangle(0, 0, 1024, 256);

		// Review what each of the following should do and test each individually:
		// filledFlatTriangle(0,    0, 1024, 512);
		// filledFlatTriangle(0,  256, 1024, 256);
		// filledFlatTriangle(512,  0,  512, 512);
				
	
		// Animation loop:  Uncomment this and fill in the TODOs to finish out the assignment
		// (You can remove the "testing code" above, but leave the "setupDrawing()"
		/**************************** Animation loop commented out below *****************/
//		StdDraw.enableDoubleBuffering();
//		double[][] cloudLocations = createRandomCloudLocations(20);
//		while(true) {
//			// TODO: Draw the scene background first
		
//			// TODO: Draw all the clouds (on the background)
//
//			// TODO: Update all the cloud locations for the next time around
//
//			// TODO: Creative flair: any other drawing / animation / updates
//			StdDraw.show();
//			StdDraw.pause(15);
//		}
	}
	
}
