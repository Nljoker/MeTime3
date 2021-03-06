package com.superawesome.metime;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.AdRequest;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.lorentzos.flingswipe.SwipeFlingAdapterView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
private ArrayList<String> al;
private ArrayAdapter<String> arrayAdapter;
private int i;
private FirebaseAnalytics mFirebaseAnalytics;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.app_menu, menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final AdView adView = findViewById(R.id.adView);

        final AdRequest adRequest = new AdRequest.Builder()
                //.addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();

        adView.loadAd(adRequest);
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);





        al = new ArrayList<>();
        al.add("Support a local business by buying a voucher");
        al.add("Do 10 push-ups and increase by 1 every day");
        al.add("Learn to do 10 keepy-ups with a toilet rol");
        al.add("Learn to do a handstand for 5 seconds or longer");
        al.add("Organize an online pubquiz");
        al.add("Make a cocktail");
        al.add("Paint with Bob Ross");
        al.add("Enjoy the Musée d’Orsay");
        al.add("Experience the British Museum");
        al.add("Have a karaoke night");
        al.add("Try a fitness challenge");
        al.add("Arrange a virtual houseparty");
        al.add("Learn a language");
        al.add("Cook something completely new");
        al.add("Deep clean your house");
        al.add("Buy more plants from your local florist");
        al.add("Learn programming");
        al.add("Understand nutrition and how food affects your body, health and mood");
        al.add("Read or listen a book");
        al.add("Try out a new hairstyle or experiment with your hair");
        al.add("Do yoga (check out YouTube for tutorials)");
        al.add("Give this app 5 stars on the play store!");
        al.add("Look through old photos and videos");
        al.add("Write a letter to your future self");
        al.add("Create your own website");
        al.add("Rearrange your furniture or redecorate your living space");
        al.add("Reach out to a friend or relative you haven't seen in a while");
        al.add("Learn how to draw");
        al.add("If you can go outside, visit spots you haven't seen before");
        al.add("Stage a photo shoot");
        al.add("Do a full body home workout (See YouTube for Tutorials)");
        al.add("Update your resume or LinkedIn");
        al.add("Clean something in your place that you haven't in a while (inside of microwave, anyone?)");
        al.add("Make a future finances plan");
        al.add("Send a message to some one which you are grateful of");
        al.add("Start a DIY project(Like this app)");
        al.add("Clean your phone or phone case (Corona can be on there)");
        al.add("Do 10 push-ups and increase by 5 every day");
        al.add("Donate old clothes or other items to your local charity");
        al.add("Get ahead on schoolwork or future projects");
        al.add("Watch a favorite movie or a movie you haven't seen in a while");
        al.add("Write love notes for your S.O");
        al.add("Facetime/Videocall your friends or family");
        al.add("Make a bucketlist of all the things you never thought you'd do");
        al.add("Don't forget to drink water");
        al.add("Start learning something new (See EDX for online classes)");
        al.add("Grab a card and send your parents a handwritten note");
        al.add("Set up an online dating profile for a website or app you’ve never tried before");
        al.add("Learn to do meditation");
        al.add("Water your plants and come back for more");
        al.add("Wash your windows (Don't put your laptop in your bathtub)");
        al.add("Support a local business by buying a voucher");
        al.add("Read up on current events (See r/WorldNews on Reddit.com)");
        al.add("Learn to do 10 keepy-ups with a toilet rol");
        al.add("Bake a cake (Don't forget to watch your nutrition)");
        al.add("Do a project you’ve been putting off for months");
        al.add("Study a map of your neighborhood");
        al.add("Offer your help to a friend in need");
        al.add("Go through the photos on your phone");
        al.add("Teach yourself the army alphabet");
        al.add("Learn the alphabet backwards");
        al.add("Organize the apps on your phone");
        al.add("Google adorable baby animal photos");
        al.add("Figure out a way to make more money");
        al.add("Start an Instagram feed for your pet (Your S.O. is not a pet)");
        al.add("Drink a full glass of water, NOW!");
        al.add("Put together an epic puzzle");
        al.add("Put up an ad to do groceries for people who can't");
        al.add("Sing along to some Disney songs");
        al.add("Watch a rom-com marathon");
        al.add("Try to mimic the voice of John Wick");
        al.add("Plan your next getaway");
        al.add("Build a fort made of your couch and blankets");
        al.add("Watch a performance");
        al.add("Find YouTube videos with a low number in views");
        al.add("Learn a dance (Looking at you Techno hippies)");
        al.add("Listen to a new podcast");
        al.add("Make a custom photo book");
        al.add("Try a new recipe");
        al.add("Take a bubble bath");
        al.add("Shine the windows");
        al.add("Organize your kitchen");
        al.add("Clean out your closet");
        al.add("Spot-treat your white shoes");
        al.add("Listen to your favorite music");
        al.add("Listen to a song you haven't listened to for a while");
        al.add("Call your Best Friend");
        al.add("Watch funny YouTube videos");
        al.add("Clean your room");
        al.add("Dance like there is no tomorrow");
        al.add("Create a video and upload online");
        al.add("Catch up on your favorite soap operas");
        al.add("Start thinking of ways to save money");
        al.add("Read a novel (And watch Lord of the Rings afterwards)");
        al.add("Investigate whether investing in stocks (or cryptocurrencies) is something for you");



        Collections.shuffle(al);

        arrayAdapter = new ArrayAdapter<>(this, R.layout.item, R.id.name, al);

        SwipeFlingAdapterView flingContainer = (SwipeFlingAdapterView) findViewById(R.id.frame);


        flingContainer.setAdapter(arrayAdapter);
        flingContainer.setFlingListener(new SwipeFlingAdapterView.onFlingListener() {
            @Override
            public void removeFirstObjectInAdapter() {
                // this is the simplest way to delete an object from the Adapter (/AdapterView)
                Log.d("LIST", "removed object!");
                al.remove(0);
                arrayAdapter.notifyDataSetChanged();
            }



            @Override
            public void onLeftCardExit(Object dataObject) {
                //Do something on the left!
                //You also have access to the original object.
                //If you want to use it just cast it (String) dataObject
                Toast.makeText(MainActivity.this, "Not interested", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onRightCardExit(Object dataObject) {
                Toast.makeText(MainActivity.this, "I'm going to do this!", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAdapterAboutToEmpty(int itemsInAdapter) {
                // Ask for more data here
                al.add("Do you have more ideas? Send an e-mail to themetimeapp@gmail.com");
                arrayAdapter.notifyDataSetChanged();
                Log.d("List", "notified");
                i++;
            }

            @Override
            public void onScroll(float scrollProgressPercent) {
            }
        });

        // Optionally add an OnItemClickListener
        flingContainer.setOnItemClickListener(new SwipeFlingAdapterView.OnItemClickListener() {
            @Override
            public void onItemClicked(int itemPosition, Object dataObject) {
                Toast.makeText(MainActivity.this, "Dude, SWIPE left OR right", Toast.LENGTH_SHORT).show();
            }
        });

    }
}