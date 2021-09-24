package com.example.app2;

import android.os.Bundle;
import android.transition.ChangeScroll;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.app.Activity;
import static android.R.attr.button;

public class MainActivity extends Activity {
    private static ImageView imageView;//change image
    private static Button forward;
    private static Button backward;
    private static TextView contents; //change text
    //private static ChangeScroll front;
    //private static ChangeScroll back;
    private int content_change;//new text
    private int image_next;//new image

    int[] images_array = {R.drawable.image2, R.drawable.image3, R.drawable.image4, R.drawable.image5_foreground};
    int [] text_array={R.id.one,R.id.two,R.id.three,R.id.four};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clicknext();
        clickprevious();
    }

    public void clicknext() {
        imageView = (ImageView) findViewById(R.id.imageView);
        forward = (Button) findViewById(R.id.forward);
        forward.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        image_next++;
                        content_change++;
                        image_next = image_next % images_array.length;
                        content_change=content_change%text_array.length;
                        imageView.getImageAlpha(images_array[image_next]);
                        contents.getText(text_array[content_change]);
                    }
                }
        );
        /*forward.setOnScrollChangeListener(
                new View.OnScrollChangeListener() {
                    @Override
                    public void onScrollChange(View view, int i, int i1, int i2, int i3) {


                    }
                }
        );*/
    }

    public void clickprevious() {
        imageView = (ImageView) findViewById(R.id.imageView);
        backward = (Button) findViewById(R.id.backward);
        backward.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        image_next--;
                        content_change--;
                        image_next = image_next % images_array.length;
                        content_change=content_change%text_array.length;
                        imageView.getImageAlpha(images_array[image_next]);
                        contents.getText(text_array[content_change]);
                    }
                }
        );
    }
}
