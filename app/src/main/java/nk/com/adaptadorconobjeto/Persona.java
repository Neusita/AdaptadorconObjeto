package nk.com.adaptadorconobjeto;

import android.widget.ImageView;

/**
 * Created by J Pablo on 04/08/2017.
 */

public class Persona {
    private String nombre;
    private String redSocial;
    private int id;

    public Persona() {
    }

    public Persona(String nombre, String redSocial, int id) {
        this.nombre = nombre;
        this.redSocial = redSocial;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRedSocial() {
        return redSocial;
    }

    public int getId() {
        return id;
    }
}
