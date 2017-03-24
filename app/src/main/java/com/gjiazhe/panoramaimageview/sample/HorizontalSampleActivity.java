package com.gjiazhe.panoramaimageview.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gjiazhe.panoramaimageview.GyroscopeObserver;
import com.gjiazhe.panoramaimageview.PanoramaImageView;

public class HorizontalSampleActivity extends AppCompatActivity {

    /*https://github.com/gjiazhe/PanoramaImageView?utm_source=android-arsenal.com&utm_medium=referral&utm_campaign=5041*/
    /*https://github.com/gjiazhe/PanoramaImageView?utm_source=android-arsenal.com&utm_medium=referral&utm_campaign=5041*/
    /*https://github.com/gjiazhe/PanoramaImageView?utm_source=android-arsenal.com&utm_medium=referral&utm_campaign=5041*/

    private GyroscopeObserver gyroscopeObserver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horizontal_sample);

        gyroscopeObserver = new GyroscopeObserver();

        PanoramaImageView panoramaImageView = (PanoramaImageView) findViewById(R.id.panorama_image_view);
        panoramaImageView.setGyroscopeObserver(gyroscopeObserver);
    }

    @Override
    protected void onResume() {
        super.onResume();
        gyroscopeObserver.register(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        gyroscopeObserver.unregister();
    }
}
