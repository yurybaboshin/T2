import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.StatusLineManager;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.window.ApplicationWindow;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import java.sql.Connection;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.Separator;

public class MainMenu extends ApplicationWindow {
	private Action action;
	private Action action_1;
	private Action action_2;
	
	static Connection con = null; // JDBC Connection  к базе	

	/**
	 * Создать окно приложения
	 */
	public MainMenu() {
		super(null);
		createActions();
		addToolBar(SWT.FLAT | SWT.WRAP);
		addMenuBar();
		addStatusLine();
	}

	/**
	 * Создать содержимое окна приложения
	 * @param parent
	 */
	@Override
	protected Control createContents(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);

		return container;
	}

	/**
	 * Создать действия
	 */
	private void createActions() {
		// Create the actions
		{
			action = new Action("Список заказов") {
			};
		}
		{
			action_1 = new Action("Список накладных") {
			};
		}
		{
			action_2 = new Action("Выход") {
				public void run() {
					System.exit(0);
				}
			};
		}
	}

	/**
	 * Create the menu manager.
	 * @return the menu manager
	 */
	@Override
	protected MenuManager createMenuManager() {
		MenuManager menuManager = new MenuManager("menu");
		{
			MenuManager menuManager_1 = new MenuManager("Документы");
			menuManager.add(menuManager_1);
			menuManager_1.add(action);
			menuManager_1.add(action_1);
			menuManager_1.add(new Separator());
			menuManager_1.add(action_2);
		}
		return menuManager;
	}

	/**
	 * Create the toolbar manager.
	 * @return the toolbar manager
	 */
	@Override
	protected ToolBarManager createToolBarManager(int style) {
		ToolBarManager toolBarManager = new ToolBarManager(style);
		return toolBarManager;
	}

	/**
	 * Create the status line manager.
	 * @return the status line manager
	 */
	@Override
	protected StatusLineManager createStatusLineManager() {
		StatusLineManager statusLineManager = new StatusLineManager();
		return statusLineManager;
	}

	/**
	 * Запуск приложения
	 * @param args
	 */
	public static void main(String args[]) {
		try {
			
			// Подключиться к базе данных
			dbConnection dbCon = new dbConnection();
            con = dbCon.getConnection();			
								
			// Ввести имя пользователя
            Display display = new Display();
			Shell shell = new Shell(display);	
			AskUser2 a = new AskUser2(shell);
			a.open();
			shell.dispose();
				
			// Открыть основное окно
			MainMenu window = new MainMenu();
			window.setBlockOnOpen(true);
			window.open();
			Display.getCurrent().dispose();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Configure the shell.
	 * @param newShell
	 */
	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText("Моё приложение");
	}

	/**
	 * Return the initial size of the window.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(450, 200);
	}
     
}
