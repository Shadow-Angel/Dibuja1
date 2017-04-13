package mx.ipn.cecyt9.dibuja1;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;

public class Dibujos extends Activity {

    OptionsDibujos opc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //setContentView(R.layout.activity_main);

        opc = new OptionsDibujos(this);
        opc.setBackgroundColor(Color.WHITE);
        setContentView(opc);



    }


}