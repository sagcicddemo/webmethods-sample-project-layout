

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class EvensTestPackage

{
	// ---( internal utility methods )---

	final static EvensTestPackage _instance = new EvensTestPackage();

	static EvensTestPackage _newInstance() { return new EvensTestPackage(); }

	static EvensTestPackage _cast(Object o) { return (EvensTestPackage)o; }

	// ---( server methods )---




	public static final void calcStandDeviation (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(calcStandDeviation)>> ---
		// @sigtype java 3.5
		// [i] field:2:required list
		// [o] field:0:required result
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
			String[][]	list = IDataUtil.getStringTable( pipelineCursor, "list" );
		
		
			
			
			
			
		// pipeline
		IDataUtil.put( pipelineCursor, "result", "result" );
		pipelineCursor.destroy();
		// --- <<IS-END>> ---

                
	}
}

