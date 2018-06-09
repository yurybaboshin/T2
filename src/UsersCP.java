import org.eclipse.jface.viewers.IStructuredContentProvider;

/**
 * Content provider "Users"
 */
public class UsersCP implements IStructuredContentProvider {

	String test[] = {"1","2","3","4"};
	
	public Object[]	getElements(Object inputElement) {
		return test;		
	}
	
	public UsersCP() {
		// TODO Auto-generated constructor stub
	}
}
