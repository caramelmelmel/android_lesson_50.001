package com.caramelmel.pika;

// Create a new android studio project with Empty Activity
// Copy the code below
// Go to your own MainActivity.java and
// paste it over the existing code BELOW the package statement ***
// ***Sep 2020

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Random;


//TODO 1.1 Put in some images in the drawables folder
//TODO 1.2 Go to activity_main.xml and modify the layout

public class MainActivity extends AppCompatActivity {

    //TODO 1.2 Instance variables are declared for you, please import the libraries
    ArrayList<Integer> images;
    Button charaButton;
    ImageView charaImage;
    Button chooseImg;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //TODO 1.3 Instantiate An ArrayList object
        images = new ArrayList<Integer>();
        //TODO 1.4 Add the image IDs to the ArrayList
        images.add(R.drawable.ashketchum);
        images.add(R.drawable.bartsimpson);
        images.add(R.drawable.ashketchum);
        images.add(R.drawable.pikachu);
        images.add(R.drawable.nemo);
        images.add(R.drawable.tomandjerry);
        images.add(R.drawable.yoda);
        images.add(R.drawable.edogawaconan);

        //TODO 1.5 Get references to the charaButton and charaImage widgets using findViewById
        charaButton = findViewById(R.id.charaButton);
            charaImage = findViewById(R.id.charaImage);
            //place the choice image
            chooseImg = findViewById(R.id.chooseimg);

            //TODO 1.6 For charaButton, invoke the setOnClickListener method
        charaButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Random r = new Random();
                    int id = images.get(r.nextInt(images.size()));
                    charaImage.setImageResource(id);
                }
            });

            //TODO1.9 for the charabutton,invoke the set onclick listener
        chooseImg.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int id1 = images.get(3);
                    charaImage.setImageResource(id1);
                }
            }
          );

        //this whole thing is a class without a name refer to below
        /*charaButton.setOnClickListener(new View.OnClickListener()) {
            @Override
            public void onClick(View view) {
                //TODO 1.8 Within onClick, write code to randomly select an image ID from the ArrayList and display it in the ImageView
                //use random to randomly select an image from array list
                //id.nextInt(images.get(images.size()));

                charaImage.setImageResource(id);
                public int randomgen(){
                    Random r = new Random();
                    int a = images.size();
                    // id of image
                    int x = images.get(r.nextInt(a));
                    return x;
                }

            }


            ;
        //TODO 1.7 Create an anonymous class which implements View.OnClickListener interface

        //TODO 1.9 [On your own] Create another button, which when clicked, will cause one image to always be displayed



    }*/
}

    }
