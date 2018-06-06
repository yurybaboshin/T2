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
		list.add("ќй");
		list.add("јй");		
		list.add("јй1");		
		list.add("јй2");		
		list.add("јй3");		
		list.add("јй4");		
		list.add("јй5");		
		list.add("јй6");		
		list.add("јй7");		
		list.add("јй8");		
		list.add("јй9");		
		list.add("јй10");		
		list.add("јй11");		
		list.add("јй12");		
		list.add("јй13");		
		list.add("јй14");		
		list.add("јй15");		
		list.add("јй16");		
		list.add("јй17");		
		list.add("јй18");		
		list.add("јй19");		
		scrolledComposite.setMinSize(new Point(0, 0));
		scrolledComposite.setContent(list);

		
		this.getShell().setText("¬ыбор пользовател€");
				
		return container;
	}

	/**
	 * Create contents of the button bar.
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, "Ok", true);
		Button button = createButton(parent, IDialogConstants.CANCEL_ID, "ќтказ", false);
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(288, 313);
	}
	
}
