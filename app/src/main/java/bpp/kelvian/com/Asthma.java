package bpp.kelvian.com;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.firebase.analytics.FirebaseAnalytics;

import uk.co.senab.photoview.PhotoViewAttacher;

/**
 * Created by kelvian on 3/4/17.
 */

public class Asthma extends Activity {


    ImageView imgv;
    AlertDialog dialog;

    PhotoViewAttacher mAttacher;
    private FirebaseAnalytics mFirebaseAnalytics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asthma);
       // getActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#f9a614")));
        imgv = (ImageView) findViewById(R.id.imageView1);
        mAttacher = new PhotoViewAttacher(imgv);
        mAttacher.setOnLongClickListener(new View.OnLongClickListener(){
            @Override
            public boolean onLongClick(View v) {
                Intent i = new Intent (Asthma.this, DrugActivity1.class);
                startActivity(i);

                return false;
            }
        });

        MobileAds.initialize(getApplicationContext(), "ca-app-pub-3940256099942544~3347511713");

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        // Obtain the FirebaseAnalytics instance.
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);


    }

}
