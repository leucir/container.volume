package container.volume;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@javax.ws.rs.Path("volume")
public class ManageVolume {

	@GET
	@Produces("application/json")
	public Response writeToDisk(){
		
	      File file = new File("/props/config.txt");
	      
	      // creates the file
	      try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      
	      // creates a FileWriter Object
	      FileWriter writer = null;
		try {
			writer = new FileWriter(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	      
	      // Writes the content to the file
	      try {
			writer.write("This\n is\n an\n example\n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
		      try {
				writer.flush();
			    writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		
		
		return Response.status(200).entity("{rc:200}").build();
	}
	
	
}
