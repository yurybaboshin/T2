import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;

public class UsersLP implements ILabelProvider {

	String header = "Фамилия И.О.";
	
	public UsersLP() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isLabelProperty(Object element, String property) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub

	}

	@Override
	public Image getImage(Object element) {
		// TODO Auto-generated method stub
		//return getImage(new File("src/Res/if_folder_416376.png"));
	//	return (new javax.swing.ImageIcon(getClass().getResource("/org/me/myimageapp/newpackage/image.png")));
	    Image picture =
        pictureBox1.Image = (Image)resources.GetObject("img1.png"); 		
	}

	@Override
	public String getText(Object element) {
		return element.toString();
	}

}
