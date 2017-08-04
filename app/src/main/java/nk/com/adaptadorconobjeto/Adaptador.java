package nk.com.adaptadorconobjeto;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adaptador extends ArrayAdapter {
    Context context;
    List<Persona> personas;


    public Adaptador(Context context, List<Persona> personas) {
        super(context, R.layout.lista_contenedor, personas);
        this.personas = personas;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.lista_contenedor, parent, false);

        ImageView imageView = (ImageView) vista.findViewById(R.id.imagen);
        TextView textView = (TextView) vista.findViewById(R.id.nombre);
        TextView textView1 = (TextView) vista.findViewById(R.id.redSocial);
        TextView textView2 = (TextView) vista.findViewById(R.id.id);

        Utilidades imagenes = new Utilidades(null);

        imagenes.ponerImagen(position, imageView);
        textView.setText(personas.get(position).getNombre());
        textView1.setText(personas.get(position).getRedSocial());
        textView2.setText(personas.get(position).getId() + "");

        return vista;
    }
}
