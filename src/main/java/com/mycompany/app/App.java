package com.mycompany.app;

import org.gavaghan.geodesy.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	GeodeticCalculator geodeticCalculator = new GeodeticCalculator();
        GlobalCoordinates coordinates = geodeticCalculator.calculateEndingGlobalCoordinates(
        	// Ellipsoid ellipsoid, GlobalCoordinates start, double startBearing, double distance, double[] endBearing
                Ellipsoid.WGS84, 
                new GlobalCoordinates(1, 2), 
                0, 
                0);
        // printf("Hello world!");
    }
}
