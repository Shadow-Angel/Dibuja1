package mx.ipn.cecyt9.dibuja1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.view.View;

public class OptionsDibujos extends View {
    Paint config = new Paint();

    public OptionsDibujos(Context context) {
        super(context);
    }

    @Override
    public void onDraw(Canvas canvas) {
	  /* //.drawRect(left, top, right, bottom, paint)
        paint.setColor(Color.RED);
		canvas.drawRect(30, 30, 80, 80, paint);
	    paint.setColor(Color.CYAN);
		canvas.drawRect(33, 60, 77, 77, paint);
		paint.setColor(Color.YELLOW);
		canvas.drawRect(33, 33, 77, 60, paint);

		//.drawCircle(cx, cy, radius, paint);
		paint.setColor(Color.RED);
		canvas.drawCircle(100, 100, 20, paint);

		//.drawLine(startX, startY, stopX, stopY, paint)
        paint.setColor(Color.BLUE);
        canvas.drawLine(0, 0, 350, 100, paint);
        canvas.drawOval(ovalo1, paint);
        canvas.drawArc(ovalo1, 10, 120,false, paint);
*/

        config.reset();
        config.setColor(Color.GREEN);
        config.setStyle(Paint.Style.FILL);
        RectF ovalo1 =  new RectF(400,400,50,30);
        Path trazo = new Path();
        trazo.moveTo(500, 200);
        trazo.cubicTo(500,200, 600,300, 700,200);
        trazo.moveTo(700, 200);
        trazo.cubicTo(700,200, 750,180, 780,300);
        trazo.moveTo(780, 300);
        trazo.cubicTo(780,300, 750,420, 700,400);
        trazo.moveTo(700, 400);
        trazo.cubicTo(700,400, 600,300, 500,400);
        trazo.moveTo(500, 400);
        trazo.cubicTo(500,400, 450,420, 420,300);
        trazo.moveTo(420, 300);
        trazo.cubicTo(420,300, 450,180, 500,200);
        //trazo.lineTo(700,800);
        //trazo.addOval(ovalo1, Path.Direction.CW);
        config.setStrokeWidth(4);
        config.setStyle(Paint.Style.STROKE);
        canvas.drawPath(trazo, config);
        config.setStrokeWidth(1);
        config.setStyle(Paint.Style.FILL);
        config.setTextSize(20);
        config.setTypeface(Typeface.SANS_SERIF);
        canvas.drawTextOnPath("Angel Gutierrez Contreras ", trazo, 0, 30, config);

        //.drawText(text, x, y, paint)
        config.setColor(Color.RED);
        config.setTextSize(20);
        canvas.drawText("Practica 7 Dibujando Figuras", 450, 30, config);
        canvas.drawText("Angel Gutierrez Contreras", 450, 55, config);

        //octagono
        config.setColor(Color.BLUE);
        Path octagono = new Path();
        float[] puntos = new float[16];
        puntos[0] = (float) 200+160;
        puntos[1] = (float) 200+80;
        puntos[2] = (float) 200+80;
        puntos[3] = (float) 200+160;
        puntos[4] = (float) 200-80;
        puntos[5] = (float) 200+160;
        puntos[6] = (float) 200-160;
        puntos[7] = (float) 200+80;
        puntos[8] = (float) 200-160;
        puntos[9] = (float) 200-80;
        puntos[10] = (float) 200-80;
        puntos[11] = (float) 200-160;
        puntos[12] = (float) 200+80;
        puntos[13] = (float) 200-160;
        puntos[14] = (float) 200+160;
        puntos[15] = (float) 200-80;

        config.setColor(Color.MAGENTA);
        config.setStrokeWidth(4);
        canvas.drawLine(puntos[0], puntos[1], puntos[2], puntos[3], config);
        canvas.drawLine(puntos[2], puntos[3], puntos[4], puntos[5], config);
        canvas.drawLine(puntos[4], puntos[5], puntos[6], puntos[7], config);
        canvas.drawLine(puntos[6], puntos[7], puntos[8], puntos[9], config);
        canvas.drawLine(puntos[8], puntos[9], puntos[10], puntos[11], config);
        canvas.drawLine(puntos[10], puntos[11], puntos[12], puntos[13], config);
        canvas.drawLine(puntos[12], puntos[13], puntos[14], puntos[15], config);
        canvas.drawLine(puntos[14], puntos[15], puntos[0], puntos[1], config);

        config.reset();
        //estrella
        config.setColor(Color.rgb(255, 196, 1));
        float[] Arista = new float[20];
        Arista[0] = (float) 1200-80;
        Arista[1] = (float) 430-40;
        Arista[2] = (float) 1200-120;
        Arista[3] = (float) 430-160;
        Arista[4] = (float) 1200-40;
        Arista[5] = (float) 430-230;
        Arista[6] = (float) 1200-160;
        Arista[7] = (float) 430-240;
        Arista[8] = (float) 1200-200;
        Arista[9] = (float) 430-350;
        Arista[10] = (float) 1200-240;
        Arista[11] = (float) 430-240;
        Arista[12] = (float) 1200-380;
        Arista[13] = (float) 430-230;
        Arista[14] = (float) 1200-280;
        Arista[15] = (float) 430-160;
        Arista[16] = (float) 1200-320;
        Arista[17] = (float) 430-40;
        Arista[18] = (float) 1200-200;
        Arista[19] = (float) 430-120;

        config.setStrokeWidth(3);
        canvas.drawLine(Arista[0], Arista[1], Arista[2], Arista[3], config);
        canvas.drawLine(Arista[2], Arista[3], Arista[4], Arista[5], config);
        canvas.drawLine(Arista[4], Arista[5], Arista[6], Arista[7], config);
        canvas.drawLine(Arista[6], Arista[7], Arista[8], Arista[9], config);
        canvas.drawLine(Arista[8], Arista[9], Arista[10], Arista[11], config);
        canvas.drawLine(Arista[10], Arista[11], Arista[12], Arista[13], config);
        canvas.drawLine(Arista[12], Arista[13], Arista[14], Arista[15], config);
        canvas.drawLine(Arista[14],   Arista[15], Arista[16], Arista[17], config);
        canvas.drawLine(Arista[16], Arista[17], Arista[18], Arista[19], config);
        canvas.drawLine(Arista[18], Arista[19], Arista[0], Arista[1], config);


    }

}
