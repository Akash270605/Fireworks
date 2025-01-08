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
public class EmitterException extends Exception {

	/**
	 * Accepts a specific message about the problem.
	 * @param message
	 */
	public EmitterException(String message) {
		super(message);
	}
	
} // end EmitterException class