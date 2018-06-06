import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.List;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.wb.swt.SWTResourceManager;

public class AskUser2 extends Dialog {
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());

	/**
	 * Create the dialog.
	 * @param parentShell
	 */
	public AskUser2(Shell parentShell) {
		super(parentShell);
		setShellStyle(SWT.CLOSE);
	}

	/**
	 * Create contents of the dialog.
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);
		container.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		ScrolledComposite scrolledComposite = new ScrolledComposite(container, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		formToolkit.adapt(scrolledComposite);
		formToolkit.paintBordersFor(scrolledComposite);
		scrolledComposite.setExpandHorizontal(true);
		scrolledComposite.setExpandVertical(true);
		
		ListViewer listViewer = new ListViewer(scrolledComposite, SWT.BORDER | SWT.V_SCROLL);
		List list = listViewer.getList();
		list.setFont(SWTResourceManager.getFont("Tahoma", 10, SWT.NORMAL));
		list.add("��");
		list.add("��");		
		list.add("��1");		
		list.add("��2");		
		list.add("��3");		
		list.add("��4");		
		list.add("��5");		
		list.add("��6");		
		list.add("��7");		
		list.add("��8");		
		list.add("��9");		
		list.add("��10");		
		list.add("��11");		
		list.add("��12");		
		list.add("��13");		
		list.add("��14");		
		list.add("��15");		
		list.add("��16");		
		list.add("��17");		
		list.add("��18");		
		list.add("��19");		
		scrolledComposite.setMinSize(new Point(0, 0));
		scrolledComposite.setContent(list);

		
		this.getShell().setText("����� ������������");
				
		return container;
	}

	/**
	 * Create contents of the button bar.
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, "Ok", true);
		Button button = createButton(parent, IDialogConstants.CANCEL_ID, "�����", false);
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(288, 313);
	}
	
}
