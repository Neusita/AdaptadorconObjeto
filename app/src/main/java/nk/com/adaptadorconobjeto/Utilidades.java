package nk.com.adaptadorconobjeto;

import android.content.Context;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by J Pablo on 04/08/2017.
 */

public class Utilidades {
    Context context;

    public Utilidades(Context context) {
        this.context = context;
    }

    //Colocamos imagen de usuario
    public void ponerImagen(int i, ImageView imageView){

        switch (i){
            case 0:
                imageView.setImageResource(R.drawable.ic_accessibility_black_24dp);
                break;
            case 1:
                imageView.setImageResource(R.drawable.ic_accessible_black_24dp);
                break;
            case 2:
                imageView.setImageResource(R.drawable.ic_error_outline_black_24dp);
                break;
            case 3:
                imageView.setImageResource(R.drawable.ic_person_black_24dp);
                break;
            case 4:
                imageView.setImageResource(R.drawable.ic_rowing_black_24dp);
                break;
            case 5:
                imageView.setImageResource(R.drawable.ic_sentiment_satisfied_black_24dp);
                break;
            case 6:
                imageView.setImageResource(R.drawable.ic_warning_black_24dp);
                break;
            default:
                imageView.setImageResource(R.mipmap.ic_launcher);
                break;
        }
    }

    //Alertas en pantalla
    public void alertas(String mensaje){
        Toast.makeText(context, mensaje, Toast.LENGTH_SHORT).show();
    }

}
