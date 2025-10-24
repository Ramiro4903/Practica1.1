package com.example.practica1;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DB extends SQLiteOpenHelper {

    public DB(Context context, String name, SQLiteDatabase.CursorFactory factory, int version){
        super(context, "prueba", factory, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db){db.execSQL("create table datos(nombre text, apellido text)");}

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){}

    public String guardar(String nombre, String apellido){
        String mensaje= "";
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues contenedor = new ContentValues();
        contenedor.put("nombre", nombre);
        contenedor.put("apellido", apellido);

        try{
            database.insertOrThrow("datos", null, contenedor);
            mensaje = "Ingresado correctamente";
        }
        catch(SQLException e){mensaje = "No Ingresado";}
        database.close();
        return mensaje;
    }

    public String[] buscar_reg(String buscar){

      String[] datos = new String[3];
      SQLiteDatabase database = this.getReadableDatabase();
      String q= "SELECT * FROM datos WHERE nombre ='"+buscar+"'";
      Cursor registros = database.rawQuery(q, null);
      if(registros.moveToFirst()){

          for(int x = 0; x<2;x++){
              datos[x] = registros.getString((x));
              datos[2]="encontrado";
          }
      }
      else {datos[2] = "no encontrado";}

          database.close();
      return datos;
    }

}
