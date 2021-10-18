package com.appsmoviles.ejemplocuboopengl;

import android.content.Context;
import android.opengl.GLSurfaceView;

import android.view.MotionEvent;
/*
 * Custom GL view by extending GLSurfaceView so as
 * to override event handlers such as onKeyUp(), onTouchEvent()
 */
public class MyGLSurfaceView extends GLSurfaceView {
   MyGLRenderer renderer;    // Custom GL Renderer
   
   // For touch event
   private final float TOUCH_SCALE_FACTOR = 180.0f / 320.0f;


   // Constructor - Allocate and set the renderer
   public MyGLSurfaceView(Context context) {
      super(context);
      renderer = new MyGLRenderer(context);
      this.setRenderer(renderer);
      // Request focus, otherwise key/button won't react
      this.requestFocus();  
      this.setFocusableInTouchMode(true);
   }
   
   

   // Handler for touch event
   @Override
   public boolean onTouchEvent(final MotionEvent evt) {
      
      switch (evt.getPointerCount())
      {
         case (1):
        	renderer.signo = 0; break;
         case (2):
            renderer.signo=-1; break;
         case (3):
        	renderer.signo=1; break;
         case (4):
            renderer.rotacion=(renderer.rotacion+1)%3;
            renderer.angulo=0; break;
         //La variable signo, es para representar el sentido de una rotacion
         //Puede ser positiva (sentido reloj), negativa(sentido contrarip) o nulo(sin rotacion)
         //Variables rotacion: indica respecto a que eje se hace la rotacion (X, Y, Z)
      }

 
      return true;  // Event handled
   }
}
