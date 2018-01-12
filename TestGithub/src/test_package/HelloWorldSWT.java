package test_package;

import org.eclipse.swt.*;
import org.eclipse.swt.widgets.*;

public class HelloWorldSWT {

	public static void main(String[] args) {

		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setText("Hello world! Now within github");
		Label label = new Label(shell, SWT.BORDER);
		label.setText("Another Hello World; completely within github!");
		label.pack();

		shell.pack();
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) display.sleep();
		}
		display.dispose();
	}
}
