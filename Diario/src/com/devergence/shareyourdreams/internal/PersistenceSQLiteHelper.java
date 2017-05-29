package com.devergence.shareyourdreams.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class PersistenceSQLiteHelper extends SQLiteOpenHelper {

    //Sentencia SQL para crear la tabla de Usuarios
    String sqlCreate_MYPOIS = "CREATE TABLE Poi (id INTEGER, type INTEGER, desc TEXT, date TEXT); ";

	String sqlCreateIndex_pois_date = "CREATE INDEX index_pois_date ON Poi ( date ASC );";
    
 
    public PersistenceSQLiteHelper(Context contexto, String nombre,
                               CursorFactory factory, int version) {
        super(contexto, nombre, factory, version);
    }
 
    @Override
    public void onCreate(SQLiteDatabase db) {
        //Se ejecuta la sentencia SQL de creaci�n de la tabla
    	
        db.execSQL(sqlCreate_MYPOIS);       
        //http://www.enavigo.com/2011/08/02/sqlite-order-by-does-not-work-on-integers-time-for-an-index/
        db.execSQL(sqlCreateIndex_pois_date); 
    }
 
    @Override
    public void onUpgrade(SQLiteDatabase db, int versionAnterior, int versionNueva) {
        //NOTA: Por simplicidad del ejemplo aqu� utilizamos directamente la opci�n de
        //      eliminar la tabla anterior y crearla de nuevo vac�a con el nuevo formato.
        //      Sin embargo lo normal ser� que haya que migrar datos de la tabla antigua
        //      a la nueva, por lo que este m�todo deber�a ser m�s elaborado.
 
        //Se elimina la versi�n anterior de la tabla
        db.execSQL( "DROP TABLE IF EXISTS Poi ; ");
 
        //Se crea la nueva versi�n de la tabla
        onCreate(db);
    }
}
