/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fireworks;

/**
 *
 * @author darknight
 */
public interface ODESystem {

	/**
	 * An accessor for the system size, where the system size is the number of ordinary
	 * differential equations used to describe the motion of the system.
	 * @return The system size.  (In the case of the Star object, this will be 2, since
	 * it ignores the third dimension.)
	 */
	int getSystemSize();
	
	/**
	 * An accessor that returns the current velocity values of the object supplied to
	 * the RungeKutta solver.
	 * @return The current velocity components, vX and vY, in m/sec, as an array of double.
	 */
	double[] getVelocity();
	
	/**
	 * As described in assignment 1, the differential equations are expressed as functions
	 * of time and the velocity components, fX() and fY().  This method returns the values of
	 * these functions at the supplied time and velocity components as an array of double.  
	 * All arrays have the size of the system.
	 * @param time The current time in seconds.
	 * @param values An array of double consisting of the velocity components in m/sec.
	 * @return An array of double consisting of the function results described by the ODE 
	 * equations.
	 */
	double[] getFunction(double time, double[] values);
	
} // end ODESystem interface