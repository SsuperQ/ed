using System;
using Gtk;

public partial class MainWindow: Gtk.Window
{	
	public MainWindow (): base (Gtk.WindowType.Toplevel)
	{
		Build ();

		Console.WriteLine("27/10 = " + " resto = " + 27%10);


		buttonGoForward.Clicked += delegate {
			labelSaludo.Text = "Hola (desde delegate) " + entryNombre.Text;
		};

		Table table = new Table (9, 10, true);
		for ( uint index = 0; index < 90; index++) {
			Button button = new Button ();
			button.Label = "B " + (index +1);
			button.Visible = true;
			uint row = index / 10;
			uint colum = index % 10;
			table.Attach (button, colum, colum + 1, row, row + 1);
			button.Clicked += delegate {
				Console.WriteLine("clicked es " + button.Label);
			};

		}
		table.Visible = true;
		vBoxMain.Add (table);
	}
	

		
	protected void OnDeleteEvent (object sender, DeleteEventArgs a)
	{
		Application.Quit ();
		a.RetVal = true;
	}

	protected void OnButtonGoForwardClicked (object sender, EventArgs e)
	{
		throw new NotImplementedException ();
	}
}

