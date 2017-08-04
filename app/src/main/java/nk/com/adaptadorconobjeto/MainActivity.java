package nk.com.adaptadorconobjeto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    
    //Este es la clase Principal

    ListView mLista;
    Adaptador adaptador;
    TextView mSalida;
    Utilidades mUtilidades = new Utilidades(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSalida = (TextView) findViewById(R.id.salida);

        try {
            inicializar();
        } catch (Exception e) {
            mUtilidades.alertas("Error al llenar la lista");
            mSalida.setVisibility(View.VISIBLE);
            mSalida.setText(e.toString());
        }
    }

    public void inicializar() {
        mLista = (ListView) findViewById(R.id.lista);
        List<Persona> personas = new ArrayList<>();

        final String[] nombres = getResources().getStringArray(R.array.nombres);
        String[] redSocial = getResources().getStringArray(R.array.red);


        for (int i = 0; i < nombres.length; i++) {
            personas.add(new Persona(nombres[i], redSocial[i], i));
        }
        adaptador = new Adaptador(this, personas);

        mLista.setAdapter(adaptador);

        mLista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                mUtilidades.alertas("Precionaste: " + nombres[i]);
            }
        });


    }
}
