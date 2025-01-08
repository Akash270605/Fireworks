/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fireworks;


public class RungeKuttaSolver {
    public static double[] getNextPoint(ODESystem ode, double time, double deltaTime){
        int systemSize= ode.getSystemSize();
        double[] q1= new double [systemSize];
        double [] q2 = new double [systemSize];
        double [] q3 = new double [systemSize];
        double [] q4 = new double [systemSize];
        double[] newVals= new double[systemSize];
        double[] intermediateVals= new double[systemSize];
        double halfTime= time + deltaTime / 2;
        double fullTime= time + deltaTime;
        int valNum;
        double[] values= ode.getVelocity();
       q1 = ode.getFunction(time, values);
		for (valNum = 0; valNum < systemSize; valNum++)
			intermediateVals[valNum] = values[valNum] + deltaTime * q1[valNum] / 2;
		q2 = ode.getFunction(halfTime, intermediateVals);
		for (valNum = 0; valNum < systemSize; valNum++)
			intermediateVals[valNum] = values[valNum] + deltaTime * q2[valNum] / 2;
		q3 = ode.getFunction(halfTime, intermediateVals);
		for (valNum = 0; valNum < systemSize; valNum++)
			intermediateVals[valNum] = values[valNum] + deltaTime * q3[valNum];
		q4 = ode.getFunction(fullTime, intermediateVals);
		for (valNum = 0; valNum < systemSize; valNum++)
			newVals[valNum] = values[valNum] + deltaTime * (q1[valNum] + 2 * q2[valNum] +
					2 * q3[valNum] + q4[valNum]) / 6;
		return newVals;
    }
}
