package test_package;

import org.eclipse.swt.*;
import org.eclipse.swt.widgets.*;

public class HelloWorldSWT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setText("Hello world!");
		Label label = new Label(shell, SWT.BORDER);
		label.setText("Another Hello World - after changing this line !");
		label.pack();

		shell.pack();
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) display.sleep();
		}
		display.dispose();
	}
}
