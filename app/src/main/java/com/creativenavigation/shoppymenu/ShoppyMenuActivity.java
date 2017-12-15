package com.creativenavigation.shoppymenu;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;

import java.util.ArrayList;

public class ShoppyMenuActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, BaseSliderView.OnSliderClickListener {

    private SliderLayout mDemoSlider;

    private RecyclerView rv,rv2,rv3;
    private ArrayList<BeanlistGrooming> Bean;
    private GroomingRecyclerViewAdapter baseAdapter;
    private ArrayList<BeanlistTrending> Bean1;
    private TrendingRecyclerViewAdapter baseAdapter1;
    private ArrayList<BeanlistBrands> Bean2;
    private BrandsRecyclerViewAdapter baseAdapter2;
    private Context context;
    private Typeface fonts1,fonts2,fonts3,fonts4;
    private TextView eshop,shirt1,jeans1,shoes1,slippers1,goggles1,groomingproducts,trendingproducts,topbrands;
    private EditText searchtext;
    private LinearLayout home0,offer0,fav0,bag0,noti0;
    private ImageView home,offer,fav,bag,noti;

    private int[] IMAGEG = {R.drawable.shoppy_logo, R.drawable.shoppy_logo, R.drawable.shoppy_logo, R.drawable.shoppy_logo};
    private String[] TITLEG = {"Canvera Black Heel", "Canvera Black Heel", "Canvera Black Heel", "Canvera Black Heel"};
    private String[] DESCRIPTIONG = {"1200 Rs", "1200 Rs", "1200 Rs", "1200 Rs"};
    private String[] DATEG = {"200 Rs", "200 Rs", "200 Rs", "200 Rs"};
    private String[] DISCOUNTG = {"15%", "10%", "25%", "50%"};
    private String[] RATINGTEXTG = {"(1234)", "(2322)", "(4322)", "(1223)"};

    private int[] IMAGET = {R.drawable.shoppy_logo, R.drawable.shoppy_logo, R.drawable.shoppy_logo, R.drawable.shoppy_logo};
    private String[] TITLET = {"Canvera Black Heel", "Canvera Black Heel", "Canvera Black Heel", "Canvera Black Heel"};
    private String[] DESCRIPTIONT = {"1200 Rs", "1200 Rs", "1200 Rs", "1200 Rs"};
    private String[] DATET = {"200 Rs", "200 Rs", "200 Rs", "200 Rs"};
    private String[] DISCOUNTT = {"15%", "10%", "25%", "50%"};
    private String[] RATINGTEXTT = {"(1234)", "(2322)", "(4322)", "(1223)"};

    private int[] IMAGEB = {R.drawable.shoppy_logo, R.drawable.shoppy_logo, R.drawable.shoppy_logo};
    private String[] TEXT1 = {"Nike", "Microwaves", "Nike"};
    private String[] TEXT2 = {"Adidas", "Chimneys", "Adidas"};
    private String[] TEXT3 = {"UCB", "Gas Stoves ", "UCB"};
    private String[] TEXT4 = {"Levis", "Water Purifiers", "Levis"};
    private String[] TEXT5 = {"Kuotons", "Electric Cookers", "Kuotons"};
    private String[] TEXT6 = {"See More", "Roti Makers", "See More"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onSliderClick(BaseSliderView slider) {

    }
}
