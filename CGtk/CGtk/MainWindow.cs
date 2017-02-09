using System;
using Gtk;

public partial class MainWindow: Gtk.Window
{	
	public MainWindow (): base (Gtk.WindowType.Toplevel)
	{
		Build ();

		Console.WriteLine("27/10 = "+ 27/10 +" resto= "+27%10);

		labelSaludo.Text = "Hola. Pon tu nombre y pulsa Adelante";

		Table table = new Table (9, 10, true);

//		for (uint i=0; i<90; i++) {
//			Button button = new Button ();
//			button.Label = " "+(i+1);
//			button.Visible = true;
//			uint row = i / 10;
//			uint colum = i % 10;
//			table.Attach (button, colum, colum+1 , row, row+1);
//			button.Clicked += OnButtonGoForwardClicked;
//		}
		for (uint row=0; row<9; row++) 
			for (uint colum=0; colum<10; colum++) {
				uint index = row * 10 + colum;
				Button button = new Button ();
				button.Label = " " + (index +1);
				button.Visible = true;
				table.Attach (button, colum, colum + 1, row, row + 1);
				button.Clicked += OnButtonGoForwardClicked;
			}
		table.Visible = true;
		vBoxMain.Add (table);

	
	}

	protected void OnDeleteEvent (object sender, DeleteEventArgs a)
	{
		Console.WriteLine ("OnDeleteEvent");
		Application.Quit ();
		a.RetVal = true;
	}

	protected void OnButtonGoForwardClicked (object sender, EventArgs e)
	{
		Button button = (Button)sender;
		labelSaludo.Text = "Hola " + entryNombre.Text+ " pulsado "+button.Label;
	}
}
