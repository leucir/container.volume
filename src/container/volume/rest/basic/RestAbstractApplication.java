package container.volume.rest.basic;

import java.util.HashSet;
import java.util.Set;

import container.volume.ManageVolume;

@javax.ws.rs.ApplicationPath("rest")
public class RestAbstractApplication extends javax.ws.rs.core.Application{
    public Set<Class<?>> getClasses() {
        Set<Class<?>> classes = new HashSet<Class<?>>();
        classes.add(ManageVolume.class);
        return classes;
    }
	
}
