// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package communitycommons.actions;

import communitycommons.Misc;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

/**
 * (Behavior has changed since version 3.2. The exception is now properly propagated to the cient). 
 * 
 * Throws an exception.  This is very useful if the microflow is called by a webservice. If you throw this kind of exceptions, an fault message will be generated in the output, instead of an '501 Internal server' error.
 * 
 * If debug level of community commons is set to 'debug' the errors will be locally visible as well, otherwise not. Throwing a webservice exception states that the webservice invocation was incorrect, not the webservice implementation.
 */
public class ThrowWebserviceException extends CustomJavaAction<java.lang.Boolean>
{
	private java.lang.String faultstring;

	public ThrowWebserviceException(IContext context, java.lang.String faultstring)
	{
		super(context);
		this.faultstring = faultstring;
	}

	@java.lang.Override
	public java.lang.Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
		Misc.throwWebserviceException(faultstring);
		return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "ThrowWebserviceException";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}