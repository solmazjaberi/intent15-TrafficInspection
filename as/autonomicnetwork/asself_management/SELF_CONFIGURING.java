package generatedbyassl.as.autonomicnetwork.asself_management;

import java.io.Serializable;
import generatedbyassl.as.ASSLPOLICY;

/**
 * Generated by ASSL Framework
 * 
 * This is the Java class generated for 'SELF_CONFIGURING' (specified as SELF_CONFIGURING ASSL tier).
 */
public class SELF_CONFIGURING
	extends ASSLPOLICY
	implements  Serializable
{

	/**
	 * Generated by ASSL Framework
	 * 
	 * This is a reference to the unique instance of 'SELF_CONFIGURING' class.
	 */
	static private SELF_CONFIGURING oInstance = null;
	/**
	 * Generated by ASSL Framework
	 * 
	 * Needed by the class because it implements the Serializable interface.
	 */
	static final long serialVersionUID = 0001L;

	/**
	 * Generated by ASSL Framework
	 * 
	 * Because this is a singleton class its constructor is private.
	 */
	private  SELF_CONFIGURING (  )
	{
		vFluents.put( "INAUTONOMICNETWORKCONFIGURATION", generatedbyassl.as.autonomicnetwork.asself_management.self_configuring.INAUTONOMICNETWORKCONFIGURATION.getInstance() );
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method returns the unique instance of 'SELF_CONFIGURING' class.
	 */
	static public SELF_CONFIGURING getInstance (  )
	{
		if ( null == oInstance ) 
		{
			oInstance = new SELF_CONFIGURING();
		}
		return oInstance;
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * For each specified MAPPING, checks if the MAPPING conditions are fulfilled and if so spawn a thread to perform the MAPPING actions.
	 */
	public synchronized void doAllMappings (  )
	{
		//************************ MAPPING ***********************
		if ( generatedbyassl.as.autonomicnetwork.asself_management.self_configuring.INAUTONOMICNETWORKCONFIGURATION.getInstance().isFluentInitiated() ) 
		{
			//**** runs a thread that performs the actions mapped to these fluents
			Runnable actionsRunner = new Runnable()
			{
				/**
				 * Generated by ASSL Framework
				 * 
				 * This method runs the mapping thread until all the mapped actions have been performed.
				 */
				public void run (  )
				{
					try
					{
						generatedbyassl.as.autonomicnetwork.actions.CONFIGUREAUTONOMICNETWORK.getInstance().perform(  );
					}
					catch ( Exception ex ) 
					{
						System.err.println( ex.getMessage() );
					}
				}

			};
			//**** creates and starts the thread if the latter is not currently running
			if ( !isMappingRunning( "INAUTONOMICNETWORKCONFIGURATION" ) ) 
			{
				Thread runActions = new Thread(thrdgrMappings, actionsRunner, "INAUTONOMICNETWORKCONFIGURATION");
				runActions.start();
			}
		}
	}

}