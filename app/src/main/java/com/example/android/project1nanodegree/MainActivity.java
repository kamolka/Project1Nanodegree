package com.example.android.project1nanodegree;

import android.graphics.Bitmap;

import java.io.InputStream;



        import android.graphics.BitmapFactory;

        import android.os.Bundle;

        import android.app.Activity;

        import android.view.View;

        import android.widget.Button;

        import android.widget.ImageView;



        import java.io.IOException;

        import java.io.InputStream;



public class MainActivity extends Activity implements View.OnClickListener{


    ImageView ImageView1;

    Button button;

    int tophone;



    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        ImageView1=(ImageView)findViewById(R.id.picture1);

        tophone=R.drawable.ic_launcher;

        ImageView ImageView2=(ImageView)findViewById(R.id.picture2);

        ImageView ImageView3=(ImageView)findViewById(R.id.picture3);


        button=(Button)findViewById(R.id.button);

        ImageView2.setOnClickListener(this);

        ImageView3.setOnClickListener(this);

        button.setOnClickListener(this);

    }

    public void onClick(View v)

    {

        switch(v.getId())

        {

            case R.id.picture2:

                ImageView1.setImageResource(R.drawable.gallery1);

                tophone=R.drawable.gallery2;

                break;



            case R.id.picture3:

                ImageView1.setImageResource(R.drawable.gallery2);

                tophone=R.drawable.ic_launcher;

                break;





            case R.id.button:

                InputStream a=getResources().openRawResource(tophone);

                Bitmap bitmap = BitmapFactory.decodeStream(a);

                try{



                    getApplicationContext().setWallpaper(bitmap);

                }

                catch(IOException e){



                    e.printStackTrace();

                }

                break;



        }

    }

}