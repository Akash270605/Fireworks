/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fireworks;

public class Environment {

	private double windVelocity;					// m/sec
	/**
	 * Air density in kg per cubic metre at close to sea level.
	 */
	public final static double DENSITY_AIR = 1.2;	// kg/m*m*m
	/**
	 * The acceleration due to Earth's gravity in metres per second squared.
	 */
	public final static double G = 9.807;  			// m/s*s
	
	/**
	 * The constructor for the Environment object.
	 * @param wind The wind velocity in km/hour.
	 * @throws EnvironmentException If the magnitude of the wind velocity is above 20 km/hour.
	 */
	public Environment(double wind) throws EnvironmentException {
		setWindVelocity(wind);
	}
	
	/**
	 * The wind velocity accessor.
	 * @return The wind velocity in m/sec.
	 */
	public double getWindVelocity() {
		return windVelocity;
	}
	
	public void setWindVelocity(double wind) throws EnvironmentException
	{
		if (wind < -20 || wind > 20)
			throw new EnvironmentException("Wind too high: " + wind);
		windVelocity = wind / 3.6;
	}
	
} // end Environment