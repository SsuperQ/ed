using System;
using Gtk;

public partial class MainWindow: Gtk.Window
{	
	public MainWindow (): base (Gtk.WindowType.Toplevel)
	{
		Build ();

			//Si quisieramos crear una tabla
			//Table table = new Table (9, 10, true);
			//for (int vez = 0; vez < 9; vez++) {
			//Button button = new Button ();
			//button.Label = "  " + vez;
			//button.Visible = true;
			//table.Attach (button, vez, + 1, 0, 1);



		// renombra la etiqueta desde codigo fuente
		labelSaludo.Text = "Hola. Pon tu nombre y pulsa Adelante";

			//añadir 5 botones con el for
			for (int vez = 0; vez < 5; vez++) {
			//crear boton
			Button button = new Button ();
			//indicamos el nombre de los botones que creara
			button.Label = "Boton " + vez;
		
			//añade el boton al contenedor visual
			vBoxMain.Add (button);
			//hacer visible el boton
			button.Visible = true;

				//indica la funcion del boton a mano
				//button.Clicked += delegate {
				//	Console.WriteLine("Pulsado " + button.Label);
				//};

			//indica la funcion del boton por enlace a modo diseño
			button.Clicked += OnButtonClicked;

		
		}
	}

	protected void OnDeleteEvent (object sender, DeleteEventArgs a)
	{
		Console.WriteLine ("OnDeleteEvent");
		Application.Quit ();
		a.RetVal = true;
	}

	protected void OnButtonClicked (object sender, EventArgs e)
	{
		//guarda un log con los detalles
		Button button = (Button)sender;

		// muestra el contenido del campo rellenado
		labelSaludo.Text = "hola " + entryNombre.Text +button.Label;
		Console.WriteLine ("OnButtonClicked" +button.Label);
	}
}
