package com.faresimtiez.algotech.anaros;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.ViewFlipper;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.text.DateFormat;
import java.util.Calendar;

public class ClientRDVm2Activity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, ValueEventListener {
    Button editDate;
    int year_x,month_x,day_x;
    static final int DIALOG_ID = 0;
    ViewFlipper viewFlipper;
    private Button next,pre;

    Button d1_h1,d1_h2,d1_h3,d1_h4,d1_h5,d1_h6,d1_h7,d1_h8,d1_h9;
    Button d2_h1,d2_h2,d2_h3,d2_h4,d2_h5,d2_h6,d2_h7,d2_h8,d2_h9;
    Button d3_h1,d3_h2,d3_h3,d3_h4,d3_h5,d3_h6,d3_h7,d3_h8,d3_h9;
    Button d4_h1,d4_h2,d4_h3,d4_h4,d4_h5,d4_h6,d4_h7,d4_h8,d4_h9;
    Button d5_h1,d5_h2,d5_h3,d5_h4,d5_h5,d5_h6,d5_h7,d5_h8,d5_h9;
    Button d6_h1,d6_h2,d6_h3,d6_h4,d6_h5,d6_h6,d6_h7,d6_h8,d6_h9;
    Button d7_h1,d7_h2,d7_h3,d7_h4,d7_h5,d7_h6,d7_h7,d7_h8,d7_h9;
    Button d8_h1,d8_h2,d8_h3,d8_h4,d8_h5,d8_h6,d8_h7,d8_h8,d8_h9;
    Button d9_h1,d9_h2,d9_h3,d9_h4,d9_h5,d9_h6,d9_h7,d9_h8,d9_h9;
    Button d10_h1,d10_h2,d10_h3,d10_h4,d10_h5,d10_h6,d10_h7,d10_h8,d10_h9;
    Button d11_h1,d11_h2,d11_h3,d11_h4,d11_h5,d11_h6,d11_h7,d11_h8,d11_h9;
    Button d12_h1,d12_h2,d12_h3,d12_h4,d12_h5,d12_h6,d12_h7,d12_h8,d12_h9;
    Button d13_h1,d13_h2,d13_h3,d13_h4,d13_h5,d13_h6,d13_h7,d13_h8,d13_h9;
    Button d14_h1,d14_h2,d14_h3,d14_h4,d14_h5,d14_h6,d14_h7,d14_h8,d14_h9;
    Button d15_h1,d15_h2,d15_h3,d15_h4,d15_h5,d15_h6,d15_h7,d15_h8,d15_h9;
    Button d16_h1,d16_h2,d16_h3,d16_h4,d16_h5,d16_h6,d16_h7,d16_h8,d16_h9;
    Button d17_h1,d17_h2,d17_h3,d17_h4,d17_h5,d17_h6,d17_h7,d17_h8,d17_h9;
    Button d18_h1,d18_h2,d18_h3,d18_h4,d18_h5,d18_h6,d18_h7,d18_h8,d18_h9;
    Button d19_h1,d19_h2,d19_h3,d19_h4,d19_h5,d19_h6,d19_h7,d19_h8,d19_h9;
    Button d20_h1,d20_h2,d20_h3,d20_h4,d20_h5,d20_h6,d20_h7,d20_h8,d20_h9;
    Button d21_h1,d21_h2,d21_h3,d21_h4,d21_h5,d21_h6,d21_h7,d21_h8,d21_h9;
    Button d22_h1,d22_h2,d22_h3,d22_h4,d22_h5,d22_h6,d22_h7,d22_h8,d22_h9;
    Button d23_h1,d23_h2,d23_h3,d23_h4,d23_h5,d23_h6,d23_h7,d23_h8,d23_h9;
    Button d24_h1,d24_h2,d24_h3,d24_h4,d24_h5,d24_h6,d24_h7,d24_h8,d24_h9;
    Button d25_h1,d25_h2,d25_h3,d25_h4,d25_h5,d25_h6,d25_h7,d25_h8,d25_h9;
    Button d26_h1,d26_h2,d26_h3,d26_h4,d26_h5,d26_h6,d26_h7,d26_h8,d26_h9;
    Button d27_h1,d27_h2,d27_h3,d27_h4,d27_h5,d27_h6,d27_h7,d27_h8,d27_h9;
    Button d28_h1,d28_h2,d28_h3,d28_h4,d28_h5,d28_h6,d28_h7,d28_h8,d28_h9;
    Button d29_h1,d29_h2,d29_h3,d29_h4,d29_h5,d29_h6,d29_h7,d29_h8,d29_h9;
    Button d30_h1,d30_h2,d30_h3,d30_h4,d30_h5,d30_h6,d30_h7,d30_h8,d30_h9;
    Button d31_h1,d31_h2,d31_h3,d31_h4,d31_h5,d31_h6,d31_h7,d31_h8,d31_h9;

    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference mRootReference = firebaseDatabase.getInstance().getReference("RDV");

    //Sep
    ///////////////////////////////////////////////////////
    //1-7
    DatabaseReference mDate_1_7 = mRootReference.child("1_7");
    DatabaseReference
            m1_7_h1 = mDate_1_7.child("1_7_h1_info");DatabaseReference
            m1_7_h1_s = mDate_1_7.child("1_7_h1_s");
    DatabaseReference
            m1_7_h2 = mDate_1_7.child("1_7_h2_info");DatabaseReference
            m1_7_h2_s = mDate_1_7.child("1_7_h2_s");
    DatabaseReference
            m1_7_h3 = mDate_1_7.child("1_7_h3_info");DatabaseReference
            m1_7_h3_s = mDate_1_7.child("1_7_h3_s");
    DatabaseReference
            m1_7_h4 = mDate_1_7.child("1_7_h4_info");DatabaseReference
            m1_7_h4_s = mDate_1_7.child("1_7_h4_s");
    DatabaseReference
            m1_7_h5 = mDate_1_7.child("1_7_h5_info");DatabaseReference
            m1_7_h5_s = mDate_1_7.child("1_7_h5_s");
    DatabaseReference
            m1_7_h6 = mDate_1_7.child("1_7_h6_info");DatabaseReference
            m1_7_h6_s = mDate_1_7.child("1_7_h6_s");
    DatabaseReference
            m1_7_h7 = mDate_1_7.child("1_7_h7_info");DatabaseReference
            m1_7_h7_s = mDate_1_7.child("1_7_h7_s");
    DatabaseReference
            m1_7_h8 = mDate_1_7.child("1_7_h8_info");DatabaseReference
            m1_7_h8_s = mDate_1_7.child("1_7_h8_s");
    DatabaseReference
            m1_7_h9 = mDate_1_7.child("1_7_h9_info");DatabaseReference
            m1_7_h9_s = mDate_1_7.child("1_7_h9_s");

    //2-7
    DatabaseReference mDate_2_7 = mRootReference.child("2_7");
    DatabaseReference
            m2_7_h1 = mDate_2_7.child("2_79h1_info");DatabaseReference
            m2_7_h1_s = mDate_2_7.child("2_7_h1_s");
    DatabaseReference
            m2_7_h2 = mDate_2_7.child("2_7_h2_info");DatabaseReference
            m2_7_h2_s = mDate_2_7.child("2_7_h2_s");
    DatabaseReference
            m2_7_h3 = mDate_2_7.child("2_7_h3_info");DatabaseReference
            m2_7_h3_s = mDate_2_7.child("2_7_h3_s");
    DatabaseReference
            m2_7_h4 = mDate_2_7.child("2_7_h4_info");DatabaseReference
            m2_7_h4_s = mDate_2_7.child("2_7_h4_s");
    DatabaseReference
            m2_7_h5 = mDate_2_7.child("2_7_h5_info");DatabaseReference
            m2_7_h5_s = mDate_2_7.child("2_7_h5_s");
    DatabaseReference
            m2_7_h6 = mDate_2_7.child("2_7_h6_info");DatabaseReference
            m2_7_h6_s = mDate_2_7.child("2_7_h6_s");
    DatabaseReference
            m2_7_h7 = mDate_2_7.child("2_7_h7_info");DatabaseReference
            m2_7_h7_s = mDate_2_7.child("2_7_h7_s");
    DatabaseReference
            m2_7_h8 = mDate_2_7.child("2_7_h8_info");DatabaseReference
            m2_7_h8_s = mDate_2_7.child("2_7_h8_s");
    DatabaseReference
            m2_7_h9 = mDate_2_7.child("2_7_h9_info");DatabaseReference
            m2_7_h9_s = mDate_2_7.child("2_7_h9_s");
    //3-7
    DatabaseReference mDate_3_7 = mRootReference.child("3_7");
    DatabaseReference
            m3_7_h1 = mDate_3_7.child("3_7_h1_info");DatabaseReference
            m3_7_h1_s = mDate_3_7.child("3_7_h1_s");
    DatabaseReference
            m3_7_h2 = mDate_3_7.child("3_7_h2_info");DatabaseReference
            m3_7_h2_s = mDate_3_7.child("3_7_h2_s");
    DatabaseReference
            m3_7_h3 = mDate_3_7.child("3_7_h3_info");DatabaseReference
            m3_7_h3_s = mDate_3_7.child("3_7_h3_s");
    DatabaseReference
            m3_7_h4 = mDate_3_7.child("3_7_h4_info");DatabaseReference
            m3_7_h4_s = mDate_3_7.child("3_7_h4_s");
    DatabaseReference
            m3_7_h5 = mDate_3_7.child("3_7_h5_info");DatabaseReference
            m3_7_h5_s = mDate_3_7.child("3_7_h5_s");
    DatabaseReference
            m3_7_h6 = mDate_3_7.child("3_7_h6_info");DatabaseReference
            m3_7_h6_s = mDate_3_7.child("3_7_h6_s");
    DatabaseReference
            m3_7_h7 = mDate_3_7.child("3_7_h7_info");DatabaseReference
            m3_7_h7_s = mDate_3_7.child("3_7_h7_s");
    DatabaseReference
            m3_7_h8 = mDate_3_7.child("3_7_h8_info");DatabaseReference
            m3_7_h8_s = mDate_3_7.child("3_7_h8_s");
    DatabaseReference
            m3_7_h9 = mDate_3_7.child("3_7_h9_info");DatabaseReference
            m3_7_h9_s = mDate_1_7.child("3_7_h9_s");

    //4-7
    DatabaseReference mDate_4_7 = mRootReference.child("4_7");
    DatabaseReference
            m4_7_h1 = mDate_4_7.child("4_7_h1_info");DatabaseReference
            m4_7_h1_s = mDate_4_7.child("4_7_h1_s");
    DatabaseReference
            m4_7_h2 = mDate_4_7.child("4_7_h2_info");DatabaseReference
            m4_7_h2_s = mDate_4_7.child("4_7_h2_s");
    DatabaseReference
            m4_7_h3 = mDate_1_7.child("4_7_h3_info");DatabaseReference
            m4_7_h3_s = mDate_4_7.child("4_7_h3_s");
    DatabaseReference
            m4_7_h4 = mDate_4_7.child("4_7_h4_info");DatabaseReference
            m4_7_h4_s = mDate_4_7.child("4_7_h4_s");
    DatabaseReference
            m4_7_h5 = mDate_4_7.child("4_7_h5_info");DatabaseReference
            m4_7_h5_s = mDate_4_7.child("4_7_h5_s");
    DatabaseReference
            m4_7_h6 = mDate_4_7.child("4_7_h6_info");DatabaseReference
            m4_7_h6_s = mDate_4_7.child("4_7_h6_s");
    DatabaseReference
            m4_7_h7 = mDate_4_7.child("4_7_h7_info");DatabaseReference
            m4_7_h7_s = mDate_4_7.child("4_7_h7_s");
    DatabaseReference
            m4_7_h8 = mDate_4_7.child("4_7_h8_info");DatabaseReference
            m4_7_h8_s = mDate_4_7.child("4_7_h8_s");
    DatabaseReference
            m4_7_h9 = mDate_4_7.child("4_7_h9_info");DatabaseReference
            m4_7_h9_s = mDate_4_7.child("4_7_h9_s");
    //5_7
    DatabaseReference mDate_5_7 = mRootReference.child("5_7");
    DatabaseReference
            m5_7_h1 = mDate_5_7.child("5_7_h1_info");DatabaseReference
            m5_7_h1_s = mDate_5_7.child("5_7_h1_s");
    DatabaseReference
            m5_7_h2 = mDate_5_7.child("5_7_h2_info");DatabaseReference
            m5_7_h2_s = mDate_5_7.child("5_7_h2_s");
    DatabaseReference
            m5_7_h3 = mDate_5_7.child("5_7_h3_info");DatabaseReference
            m5_7_h3_s = mDate_5_7.child("5_7_h3_s");
    DatabaseReference
            m5_7_h4 = mDate_5_7.child("5_7_h4_info");DatabaseReference
            m5_7_h4_s = mDate_5_7.child("5_7_h4_s");
    DatabaseReference
            m5_7_h5 = mDate_5_7.child("5_7_h5_info");DatabaseReference
            m5_7_h5_s = mDate_5_7.child("5_7_h5_s");
    DatabaseReference
            m5_7_h6 = mDate_5_7.child("5_7_h6_info");DatabaseReference
            m5_7_h6_s = mDate_5_7.child("5_7_h6_s");
    DatabaseReference
            m5_7_h7 = mDate_5_7.child("5_7_h7_info");DatabaseReference
            m5_7_h7_s = mDate_5_7.child("5_7_h7_s");
    DatabaseReference
            m5_7_h8 = mDate_5_7.child("5_7_h8_info");DatabaseReference
            m5_7_h8_s = mDate_5_7.child("5_7_h8_s");
    DatabaseReference
            m5_7_h9 = mDate_5_7.child("5_7_h9_info");DatabaseReference
            m5_7_h9_s = mDate_5_7.child("5_7_h9_s");
    //6-7
    DatabaseReference mDate_6_7 = mRootReference.child("6_7");
    DatabaseReference
            m6_7_h1 = mDate_6_7.child("6_7_h1_info");DatabaseReference
            m6_7_h1_s = mDate_6_7.child("6_7_h1_s");
    DatabaseReference
            m6_7_h2 = mDate_6_7.child("6_7_h2_info");DatabaseReference
            m6_7_h2_s = mDate_6_7.child("6_7_h2_s");
    DatabaseReference
            m6_7_h3 = mDate_6_7.child("6_7_h3_info");DatabaseReference
            m6_7_h3_s = mDate_6_7.child("6_7_h3_s");
    DatabaseReference
            m6_7_h4 = mDate_6_7.child("6_7_h4_info");DatabaseReference
            m6_7_h4_s = mDate_6_7.child("6_7_h4_s");
    DatabaseReference
            m6_7_h5 = mDate_6_7.child("6_7_h5_info");DatabaseReference
            m6_7_h5_s = mDate_6_7.child("6_7_h5_s");
    DatabaseReference
            m6_7_h6 = mDate_6_7.child("6_7_h6_info");DatabaseReference
            m6_7_h6_s = mDate_6_7.child("6_7_h6_s");
    DatabaseReference
            m6_7_h7 = mDate_6_7.child("6_7_h7_info");DatabaseReference
            m6_7_h7_s = mDate_6_7.child("6_7_h7_s");
    DatabaseReference
            m6_7_h8 = mDate_6_7.child("6_7_h8_info");DatabaseReference
            m6_7_h8_s = mDate_6_7.child("6_7_h8_s");
    DatabaseReference
            m6_7_h9 = mDate_6_7.child("6_7_h9_info");DatabaseReference
            m6_7_h9_s = mDate_6_7.child("6_7_h9_s");
    //7-7
    DatabaseReference mDate_7_7 = mRootReference.child("7_7");
    DatabaseReference
            m7_7_h1 = mDate_7_7.child("7_7_h1_info");DatabaseReference
            m7_7_h1_s = mDate_7_7.child("7_7_h1_s");
    DatabaseReference
            m7_7_h2 = mDate_7_7.child("7_7_h2_info");DatabaseReference
            m7_7_h2_s = mDate_7_7.child("7_7_h2_s");
    DatabaseReference
            m7_7_h3 = mDate_7_7.child("7_7_h3_info");DatabaseReference
            m7_7_h3_s = mDate_7_7.child("7_7_h3_s");
    DatabaseReference
            m7_7_h4 = mDate_7_7.child("7_7_h4_info");DatabaseReference
            m7_7_h4_s = mDate_7_7.child("7_7_h4_s");
    DatabaseReference
            m7_7_h5 = mDate_7_7.child("7_7_h5_info");DatabaseReference
            m7_7_h5_s = mDate_7_7.child("7_7_h5_s");
    DatabaseReference
            m7_7_h6 = mDate_7_7.child("7_7_h6_info");DatabaseReference
            m7_7_h6_s = mDate_7_7.child("7_7_h6_s");
    DatabaseReference
            m7_7_h7 = mDate_7_7.child("7_7_h7_info");DatabaseReference
            m7_7_h7_s = mDate_7_7.child("7_7_h7_s");
    DatabaseReference
            m7_7_h8 = mDate_7_7.child("7_7_h8_info");DatabaseReference
            m7_7_h8_s = mDate_7_7.child("7_7_h8_s");
    DatabaseReference
            m7_7_h9 = mDate_7_7.child("7_7_h9_info");DatabaseReference
            m7_7_h9_s = mDate_7_7.child("7_7_h9_s");
    //8-7
    DatabaseReference mDate_8_7 = mRootReference.child("8_7");
    DatabaseReference
            m8_7_h1 = mDate_8_7.child("8_7_h1_info");DatabaseReference
            m8_7_h1_s = mDate_8_7.child("8_7_h1_s");
    DatabaseReference
            m8_7_h2 = mDate_8_7.child("8_7_h2_info");DatabaseReference
            m8_7_h2_s = mDate_8_7.child("8_7_h2_s");
    DatabaseReference
            m8_7_h3 = mDate_8_7.child("8_7_h3_info");DatabaseReference
            m8_7_h3_s = mDate_8_7.child("8_7_h3_s");
    DatabaseReference
            m8_7_h4 = mDate_8_7.child("8_7_h4_info");DatabaseReference
            m8_7_h4_s = mDate_8_7.child("8_7_h4_s");
    DatabaseReference
            m8_7_h5 = mDate_8_7.child("8_7_h5_info");DatabaseReference
            m8_7_h5_s = mDate_8_7.child("8_7_h5_s");
    DatabaseReference
            m8_7_h6 = mDate_8_7.child("8_7_h6_info");DatabaseReference
            m8_7_h6_s = mDate_8_7.child("8_7_h6_s");
    DatabaseReference
            m8_7_h7 = mDate_8_7.child("8_7_h7_info");DatabaseReference
            m8_7_h7_s = mDate_8_7.child("8_7_h7_s");
    DatabaseReference
            m8_7_h8 = mDate_8_7.child("8_7_h8_info");DatabaseReference
            m8_7_h8_s = mDate_8_7.child("8_7_h8_s");
    DatabaseReference
            m8_7_h9 = mDate_8_7.child("8_7_h9_info");DatabaseReference
            m8_7_h9_s = mDate_8_7.child("8_7_h9_s");
    //9-7
    DatabaseReference mDate_9_7 = mRootReference.child("9_7");
    DatabaseReference
            m9_7_h1 = mDate_9_7.child("9_7_h1_info");DatabaseReference
            m9_7_h1_s = mDate_9_7.child("9_7_h1_s");
    DatabaseReference
            m9_7_h2 = mDate_9_7.child("9_7_h2_info");DatabaseReference
            m9_7_h2_s = mDate_9_7.child("9_7_h2_s");
    DatabaseReference
            m9_7_h3 = mDate_9_7.child("9_7_h3_info");DatabaseReference
            m9_7_h3_s = mDate_9_7.child("9_7_h3_s");
    DatabaseReference
            m9_7_h4 = mDate_9_7.child("9_7_h4_info");DatabaseReference
            m9_7_h4_s = mDate_9_7.child("9_7_h4_s");
    DatabaseReference
            m9_7_h5 = mDate_9_7.child("9_7_h5_info");DatabaseReference
            m9_7_h5_s = mDate_9_7.child("9_7_h5_s");
    DatabaseReference
            m9_7_h6 = mDate_9_7.child("9_7_h6_info");DatabaseReference
            m9_7_h6_s = mDate_9_7.child("9_7_h6_s");
    DatabaseReference
            m9_7_h7 = mDate_9_7.child("9_7_h7_info");DatabaseReference
            m9_7_h7_s = mDate_9_7.child("9_7_h7_s");
    DatabaseReference
            m9_7_h8 = mDate_9_7.child("9_7_h9_info");DatabaseReference
            m9_7_h8_s = mDate_9_7.child("9_7_h8_s");
    DatabaseReference
            m9_7_h9 = mDate_9_7.child("9_7_h9_info");DatabaseReference
            m9_7_h9_s = mDate_9_7.child("9_7_h9_s");
    //10-7
    DatabaseReference mDate_10_7 = mRootReference.child("10_7");
    DatabaseReference
            m10_7_h1 = mDate_10_7.child("10_7_h1_info");DatabaseReference
            m10_7_h1_s = mDate_10_7.child("10_7_h1_s");
    DatabaseReference
            m10_7_h2 = mDate_10_7.child("10_7_h2_info");DatabaseReference
            m10_7_h2_s = mDate_10_7.child("10_7_h2_s");
    DatabaseReference
            m10_7_h3 = mDate_10_7.child("10_7_h3_info");DatabaseReference
            m10_7_h3_s = mDate_10_7.child("10_7_h3_s");
    DatabaseReference
            m10_7_h4 = mDate_10_7.child("10_7_h4_info");DatabaseReference
            m10_7_h4_s = mDate_10_7.child("10_7_h4_s");
    DatabaseReference
            m10_7_h5 = mDate_10_7.child("10_7_h5_info");DatabaseReference
            m10_7_h5_s = mDate_10_7.child("10_7_h5_s");
    DatabaseReference
            m10_7_h6 = mDate_10_7.child("10_7_h6_info");DatabaseReference
            m10_7_h6_s = mDate_10_7.child("10_7_h6_s");
    DatabaseReference
            m10_7_h7 = mDate_10_7.child("10_7_h7_info");DatabaseReference
            m10_7_h7_s = mDate_10_7.child("10_7_h7_s");
    DatabaseReference
            m10_7_h8 = mDate_10_7.child("10_7_h8_info");DatabaseReference
            m10_7_h8_s = mDate_10_7.child("10_7_h8_s");
    DatabaseReference
            m10_7_h9 = mDate_10_7.child("10_7_h9_info");DatabaseReference
            m10_7_h9_s = mDate_10_7.child("10_7_h9_s");
    //11-7
    DatabaseReference mDate_11_7 = mRootReference.child("11_7");
    DatabaseReference
            m11_7_h1 = mDate_11_7.child("11_7_h1_info");DatabaseReference
            m11_7_h1_s = mDate_11_7.child("11_7_h1_s");
    DatabaseReference
            m11_7_h2 = mDate_11_7.child("11_7_h2_info");DatabaseReference
            m11_7_h2_s = mDate_11_7.child("11_7_h2_s");
    DatabaseReference
            m11_7_h3 = mDate_11_7.child("11_7_h3_info");DatabaseReference
            m11_7_h3_s = mDate_11_7.child("11_7_h3_s");
    DatabaseReference
            m11_7_h4 = mDate_11_7.child("11_7_h4_info");DatabaseReference
            m11_7_h4_s = mDate_11_7.child("11_7_h4_s");
    DatabaseReference
            m11_7_h5 = mDate_11_7.child("11_7_h5_info");DatabaseReference
            m11_7_h5_s = mDate_11_7.child("11_7_h5_s");
    DatabaseReference
            m11_7_h6 = mDate_11_7.child("11_7_h6_info");DatabaseReference
            m11_7_h6_s = mDate_11_7.child("11_7_h6_s");
    DatabaseReference
            m11_7_h7 = mDate_11_7.child("11_7_h7_info");DatabaseReference
            m11_7_h7_s = mDate_11_7.child("11_7_h7_s");
    DatabaseReference
            m11_7_h8 = mDate_11_7.child("11_7_h8_info");DatabaseReference
            m11_7_h8_s = mDate_11_7.child("11_7_h8_s");
    DatabaseReference
            m11_7_h9 = mDate_11_7.child("11_7_h9_info");DatabaseReference
            m11_7_h9_s = mDate_11_7.child("11_7_h9_s");
    //12-7
    DatabaseReference mDate_12_7 = mRootReference.child("12_7");
    DatabaseReference
            m12_7_h1 = mDate_12_7.child("12_7_h1_info");DatabaseReference
            m12_7_h1_s = mDate_12_7.child("12_7_h1_s");
    DatabaseReference
            m12_7_h2 = mDate_12_7.child("12_7_h2_info");DatabaseReference
            m12_7_h2_s = mDate_12_7.child("12_7_h2_s");
    DatabaseReference
            m12_7_h3 = mDate_12_7.child("12_7_h3_info");DatabaseReference
            m12_7_h3_s = mDate_12_7.child("12_7_h3_s");
    DatabaseReference
            m12_7_h4 = mDate_12_7.child("12_7_h4_info");DatabaseReference
            m12_7_h4_s = mDate_12_7.child("12_7_h4_s");
    DatabaseReference
            m12_7_h5 = mDate_12_7.child("12_7_h5_info");DatabaseReference
            m12_7_h5_s = mDate_12_7.child("12_7_h5_s");
    DatabaseReference
            m12_7_h6 = mDate_12_7.child("12_7_h6_info");DatabaseReference
            m12_7_h6_s = mDate_12_7.child("12_7_h6_s");
    DatabaseReference
            m12_7_h7 = mDate_12_7.child("12_7_h7_info");DatabaseReference
            m12_7_h7_s = mDate_12_7.child("12_7_h7_s");
    DatabaseReference
            m12_7_h8 = mDate_12_7.child("12_7_h8_info");DatabaseReference
            m12_7_h8_s = mDate_12_7.child("12_7_h8_s");
    DatabaseReference
            m12_7_h9 = mDate_12_7.child("12_7_h9_info");DatabaseReference
            m12_7_h9_s = mDate_12_7.child("12_7_h9_s");
    //13-7
    DatabaseReference mDate_13_7 = mRootReference.child("13_7");
    DatabaseReference
            m13_7_h1 = mDate_13_7.child("13_7_h1_info");DatabaseReference
            m13_7_h1_s = mDate_13_7.child("13_7_h1_s");
    DatabaseReference
            m13_7_h2 = mDate_13_7.child("13_7_h2_info");DatabaseReference
            m13_7_h2_s = mDate_13_7.child("13_7_h2_s");
    DatabaseReference
            m13_7_h3 = mDate_13_7.child("13_7_h3_info");DatabaseReference
            m13_7_h3_s = mDate_13_7.child("13_7_h3_s");
    DatabaseReference
            m13_7_h4 = mDate_13_7.child("13_7_h4_info");DatabaseReference
            m13_7_h4_s = mDate_13_7.child("13_7_h4_s");
    DatabaseReference
            m13_7_h5 = mDate_13_7.child("13_7_h5_info");DatabaseReference
            m13_7_h5_s = mDate_13_7.child("13_7_h5_s");
    DatabaseReference
            m13_7_h6 = mDate_13_7.child("13_7_h6_info");DatabaseReference
            m13_7_h6_s = mDate_13_7.child("13_7_h6_s");
    DatabaseReference
            m13_7_h7 = mDate_13_7.child("13_7_h7_info");DatabaseReference
            m13_7_h7_s = mDate_13_7.child("13_7_h7_s");
    DatabaseReference
            m13_7_h8 = mDate_13_7.child("13_7_h8_info");DatabaseReference
            m13_7_h8_s = mDate_13_7.child("13_7_h8_s");
    DatabaseReference
            m13_7_h9 = mDate_13_7.child("13_7_h9_info");DatabaseReference
            m13_7_h9_s = mDate_13_7.child("13_7_h9_s");
    //14-7
    DatabaseReference mDate_14_7 = mRootReference.child("14_7");
    DatabaseReference
            m14_7_h1 = mDate_14_7.child("14_7_h1_info");DatabaseReference
            m14_7_h1_s = mDate_14_7.child("14_7_h1_s");
    DatabaseReference
            m14_7_h2 = mDate_14_7.child("14_7_h2_info");DatabaseReference
            m14_7_h2_s = mDate_14_7.child("14_7_h2_s");
    DatabaseReference
            m14_7_h3 = mDate_14_7.child("14_7_h3_info");DatabaseReference
            m14_7_h3_s = mDate_14_7.child("14_7_h3_s");
    DatabaseReference
            m14_7_h4 = mDate_14_7.child("14_7_h4_info");DatabaseReference
            m14_7_h4_s = mDate_14_7.child("14_7_h4_s");
    DatabaseReference
            m14_7_h5 = mDate_14_7.child("14_7_h5_info");DatabaseReference
            m14_7_h5_s = mDate_14_7.child("14_7_h5_s");
    DatabaseReference
            m14_7_h6 = mDate_14_7.child("14_7_h6_info");DatabaseReference
            m14_7_h6_s = mDate_14_7.child("14_7_h6_s");
    DatabaseReference
            m14_7_h7 = mDate_14_7.child("14_7_h7_info");DatabaseReference
            m14_7_h7_s = mDate_14_7.child("14_7_h7_s");
    DatabaseReference
            m14_7_h8 = mDate_14_7.child("14_7_h8_info");DatabaseReference
            m14_7_h8_s = mDate_14_7.child("14_7_h8_s");
    DatabaseReference
            m14_7_h9 = mDate_14_7.child("14_7_h9_info");DatabaseReference
            m14_7_h9_s = mDate_14_7.child("14_7_h9_s");
    //15-7
    DatabaseReference mDate_15_7 = mRootReference.child("15_7");
    DatabaseReference
            m15_7_h1 = mDate_15_7.child("15_7_h1_info");DatabaseReference
            m15_7_h1_s = mDate_15_7.child("15_7_h1_s");
    DatabaseReference
            m15_7_h2 = mDate_15_7.child("15_7_h2_info");DatabaseReference
            m15_7_h2_s = mDate_15_7.child("15_7_h2_s");
    DatabaseReference
            m15_7_h3 = mDate_15_7.child("15_7_h3_info");DatabaseReference
            m15_7_h3_s = mDate_15_7.child("15_7_h3_s");
    DatabaseReference
            m15_7_h4 = mDate_15_7.child("15_7_h4_info");DatabaseReference
            m15_7_h4_s = mDate_15_7.child("15_7_h4_s");
    DatabaseReference
            m15_7_h5 = mDate_15_7.child("15_7_h5_info");DatabaseReference
            m15_7_h5_s = mDate_15_7.child("15_7_h5_s");
    DatabaseReference
            m15_7_h6 = mDate_15_7.child("15_7_h6_info");DatabaseReference
            m15_7_h6_s = mDate_15_7.child("15_7_h6_s");
    DatabaseReference
            m15_7_h7 = mDate_15_7.child("15_7_h7_info");DatabaseReference
            m15_7_h7_s = mDate_15_7.child("15_7_h7_s");
    DatabaseReference
            m15_7_h8 = mDate_15_7.child("15_7_h8_info");DatabaseReference
            m15_7_h8_s = mDate_15_7.child("15_7_h8_s");
    DatabaseReference
            m15_7_h9 = mDate_15_7.child("15_7_h9_info");DatabaseReference
            m15_7_h9_s = mDate_15_7.child("15_7_h9_s");
    //16-7
    DatabaseReference mDate_16_7 = mRootReference.child("16_7");
    DatabaseReference
            m16_7_h1 = mDate_16_7.child("16_7_h1_info");DatabaseReference
            m16_7_h1_s = mDate_16_7.child("16_7_h1_s");
    DatabaseReference
            m16_7_h2 = mDate_16_7.child("16_7_h2_info");DatabaseReference
            m16_7_h2_s = mDate_16_7.child("16_7_h2_s");
    DatabaseReference
            m16_7_h3 = mDate_16_7.child("16_7_h3_info");DatabaseReference
            m16_7_h3_s = mDate_16_7.child("16_7_h3_s");
    DatabaseReference
            m16_7_h4 = mDate_16_7.child("16_7_h4_info");DatabaseReference
            m16_7_h4_s = mDate_16_7.child("16_7_h4_s");
    DatabaseReference
            m16_7_h5 = mDate_16_7.child("16_7_h5_info");DatabaseReference
            m16_7_h5_s = mDate_16_7.child("16_7_h5_s");
    DatabaseReference
            m16_7_h6 = mDate_16_7.child("16_7_h6_info");DatabaseReference
            m16_7_h6_s = mDate_16_7.child("16_7_h6_s");
    DatabaseReference
            m16_7_h7 = mDate_16_7.child("16_7_h7_info");DatabaseReference
            m16_7_h7_s = mDate_16_7.child("16_7_h7_s");
    DatabaseReference
            m16_7_h8 = mDate_16_7.child("16_7_h8_info");DatabaseReference
            m16_7_h8_s = mDate_16_7.child("16_7_h8_s");
    DatabaseReference
            m16_7_h9 = mDate_16_7.child("16_7_h9_info");DatabaseReference
            m16_7_h9_s = mDate_16_7.child("16_7_h9_s");
    //17-7
    DatabaseReference mDate_17_7 = mRootReference.child("17_7");
    DatabaseReference
            m17_7_h1 = mDate_17_7.child("17_7_h1_info");DatabaseReference
            m17_7_h1_s = mDate_17_7.child("17_7_h1_s");
    DatabaseReference
            m17_7_h2 = mDate_17_7.child("17_7_h2_info");DatabaseReference
            m17_7_h2_s = mDate_17_7.child("17_7_h2_s");
    DatabaseReference
            m17_7_h3 = mDate_17_7.child("17_7_h3_info");DatabaseReference
            m17_7_h3_s = mDate_17_7.child("17_7_h3_s");
    DatabaseReference
            m17_7_h4 = mDate_17_7.child("17_7_h4_info");DatabaseReference
            m17_7_h4_s = mDate_17_7.child("17_7_h4_s");
    DatabaseReference
            m17_7_h5 = mDate_17_7.child("17_7_h5_info");DatabaseReference
            m17_7_h5_s = mDate_17_7.child("17_7_h5_s");
    DatabaseReference
            m17_7_h6 = mDate_17_7.child("17_7_h6_info");DatabaseReference
            m17_7_h6_s = mDate_17_7.child("17_7_h6_s");
    DatabaseReference
            m17_7_h7 = mDate_17_7.child("17_7_h7_info");DatabaseReference
            m17_7_h7_s = mDate_17_7.child("17_7_h7_s");
    DatabaseReference
            m17_7_h8 = mDate_17_7.child("17_7_h8_info");DatabaseReference
            m17_7_h8_s = mDate_17_7.child("17_7_h8_s");
    DatabaseReference
            m17_7_h9 = mDate_17_7.child("17_7_h9_info");DatabaseReference
            m17_7_h9_s = mDate_17_7.child("17_7_h9_s");
    //18-7
    DatabaseReference mDate_18_7 = mRootReference.child("18_7");
    DatabaseReference
            m18_7_h1 = mDate_18_7.child("18_7_h1_info");DatabaseReference
            m18_7_h1_s = mDate_18_7.child("18_7_h1_s");
    DatabaseReference
            m18_7_h2 = mDate_18_7.child("18_7_h2_info");DatabaseReference
            m18_7_h2_s = mDate_18_7.child("18_7_h2_s");
    DatabaseReference
            m18_7_h3 = mDate_18_7.child("18_7_h3_info");DatabaseReference
            m18_7_h3_s = mDate_18_7.child("18_7_h3_s");
    DatabaseReference
            m18_7_h4 = mDate_18_7.child("18_7_h4_info");DatabaseReference
            m18_7_h4_s = mDate_18_7.child("18_7_h4_s");
    DatabaseReference
            m18_7_h5 = mDate_18_7.child("18_7_h5_info");DatabaseReference
            m18_7_h5_s = mDate_18_7.child("18_7_h5_s");
    DatabaseReference
            m18_7_h6 = mDate_18_7.child("18_7_h6_info");DatabaseReference
            m18_7_h6_s = mDate_18_7.child("18_7_h6_s");
    DatabaseReference
            m18_7_h7 = mDate_18_7.child("18_7_h7_info");DatabaseReference
            m18_7_h7_s = mDate_18_7.child("18_7_h7_s");
    DatabaseReference
            m18_7_h8 = mDate_18_7.child("18_7_h8_info");DatabaseReference
            m18_7_h8_s = mDate_18_7.child("18_7_h8_s");
    DatabaseReference
            m18_7_h9 = mDate_18_7.child("18_7_h9_info");DatabaseReference
            m18_7_h9_s = mDate_18_7.child("18_7_h9_s");
    //19-7
    DatabaseReference mDate_19_7 = mRootReference.child("19_7");DatabaseReference
            m19_7_h1 = mDate_19_7.child("19_7_h3_info");DatabaseReference
            m19_7_h1_s = mDate_19_7.child("19_7_h3_s");
    DatabaseReference
            m19_7_h2 = mDate_19_7.child("19_7_h2_info");DatabaseReference
            m19_7_h2_s = mDate_19_7.child("19_7_h2_s");
    DatabaseReference
            m19_7_h3 = mDate_19_7.child("19_7_h3_info");DatabaseReference
            m19_7_h3_s = mDate_19_7.child("19_7_h3_s");
    DatabaseReference
            m19_7_h4 = mDate_19_7.child("19_7_h4_info");DatabaseReference
            m19_7_h4_s = mDate_19_7.child("19_7_h4_s");
    DatabaseReference
            m19_7_h5 = mDate_19_7.child("19_7_h5_info");DatabaseReference
            m19_7_h5_s = mDate_19_7.child("19_7_h5_s");
    DatabaseReference
            m19_7_h6 = mDate_19_7.child("19_7_h6_info");DatabaseReference
            m19_7_h6_s = mDate_19_7.child("19_7_h6_s");
    DatabaseReference
            m19_7_h7 = mDate_19_7.child("19_7_h7_info");DatabaseReference
            m19_7_h7_s = mDate_19_7.child("19_7_h7_s");
    DatabaseReference
            m19_7_h8 = mDate_19_7.child("19_7_h8_info");DatabaseReference
            m19_7_h8_s = mDate_19_7.child("19_7_h8_s");
    DatabaseReference
            m19_7_h9 = mDate_19_7.child("19_7_h9_info");DatabaseReference
            m19_7_h9_s = mDate_19_7.child("19_7_h9_s");

    //20-7
    DatabaseReference mDate_20_7 = mRootReference.child("20_7");
    DatabaseReference
            m20_7_h1 = mDate_20_7.child("20_7_h1_info");DatabaseReference
            m20_7_h1_s = mDate_20_7.child("20_7_h1_s");
    DatabaseReference
            m20_7_h2 = mDate_20_7.child("20_7_h2_info");DatabaseReference
            m20_7_h2_s = mDate_20_7.child("20_7_h2_s");
    DatabaseReference
            m20_7_h3 = mDate_20_7.child("20_7_h3_info");DatabaseReference
            m20_7_h3_s = mDate_20_7.child("20_7_h3_s");
    DatabaseReference
            m20_7_h4 = mDate_20_7.child("20_7_h4_info");DatabaseReference
            m20_7_h4_s = mDate_20_7.child("20_7_h4_s");
    DatabaseReference
            m20_7_h5 = mDate_20_7.child("20_7_h5_info");DatabaseReference
            m20_7_h5_s = mDate_20_7.child("20_7_h5_s");
    DatabaseReference
            m20_7_h6 = mDate_20_7.child("20_7_h6_info");DatabaseReference
            m20_7_h6_s = mDate_20_7.child("20_7_h6_s");
    DatabaseReference
            m20_7_h7 = mDate_20_7.child("20_7_h7_info");DatabaseReference
            m20_7_h7_s = mDate_20_7.child("20_7_h7_s");
    DatabaseReference
            m20_7_h8 = mDate_20_7.child("20_7_h8_info");DatabaseReference
            m20_7_h8_s = mDate_20_7.child("20_7_h8_s");
    DatabaseReference
            m20_7_h9 = mDate_20_7.child("20_7_h9_info");DatabaseReference
            m20_7_h9_s = mDate_20_7.child("20_7_h9_s");
    //21-7
    DatabaseReference mDate_21_7 = mRootReference.child("21_7");
    DatabaseReference
            m21_7_h1 = mDate_21_7.child("21_7_h1_info");DatabaseReference
            m21_7_h1_s = mDate_21_7.child("21_7_h1_s");
    DatabaseReference
            m21_7_h2 = mDate_21_7.child("21_7_h2_info");DatabaseReference
            m21_7_h2_s = mDate_21_7.child("21_7_h2_s");
    DatabaseReference
            m21_7_h3 = mDate_21_7.child("21_7_h3_info");DatabaseReference
            m21_7_h3_s = mDate_21_7.child("21_7_h3_s");
    DatabaseReference
            m21_7_h4 = mDate_21_7.child("21_7_h4_info");DatabaseReference
            m21_7_h4_s = mDate_21_7.child("21_7_h4_s");
    DatabaseReference
            m21_7_h5 = mDate_21_7.child("21_7_h5_info");DatabaseReference
            m21_7_h5_s = mDate_21_7.child("21_7_h5_s");
    DatabaseReference
            m21_7_h6 = mDate_21_7.child("21_7_h6_info");DatabaseReference
            m21_7_h6_s = mDate_21_7.child("21_7_h6_s");
    DatabaseReference
            m21_7_h7 = mDate_21_7.child("21_7_h7_info");DatabaseReference
            m21_7_h7_s = mDate_21_7.child("21_7_h7_s");
    DatabaseReference
            m21_7_h8 = mDate_21_7.child("21_7_h8_info");DatabaseReference
            m21_7_h8_s = mDate_21_7.child("21_7_h8_s");
    DatabaseReference
            m21_7_h9 = mDate_21_7.child("21_7_h9_info");DatabaseReference
            m21_7_h9_s = mDate_21_7.child("21_7_h9_s");
    //22-7
    DatabaseReference mDate_22_7 = mRootReference.child("22_7");
    DatabaseReference
            m22_7_h1 = mDate_22_7.child("22_7_h1_info");DatabaseReference
            m22_7_h1_s = mDate_22_7.child("22_7_h1_s");
    DatabaseReference
            m22_7_h2 = mDate_22_7.child("22_7_h2_info");DatabaseReference
            m22_7_h2_s = mDate_22_7.child("22_7_h2_s");
    DatabaseReference
            m22_7_h3 = mDate_22_7.child("22_7_h3_info");DatabaseReference
            m22_7_h3_s = mDate_22_7.child("22_7_h3_s");
    DatabaseReference
            m22_7_h4 = mDate_22_7.child("22_7_h4_info");DatabaseReference
            m22_7_h4_s = mDate_22_7.child("22_7_h4_s");
    DatabaseReference
            m22_7_h5 = mDate_22_7.child("22_7_h5_info");DatabaseReference
            m22_7_h5_s = mDate_22_7.child("22_7_h5_s");
    DatabaseReference
            m22_7_h6 = mDate_22_7.child("22_7_h6_info");DatabaseReference
            m22_7_h6_s = mDate_22_7.child("22_7_h6_s");
    DatabaseReference
            m22_7_h7 = mDate_22_7.child("22_7_h7_info");DatabaseReference
            m22_7_h7_s = mDate_22_7.child("22_7_h7_s");
    DatabaseReference
            m22_7_h8 = mDate_22_7.child("22_7_h8_info");DatabaseReference
            m22_7_h8_s = mDate_22_7.child("22_7_h8_s");
    DatabaseReference
            m22_7_h9 = mDate_22_7.child("22_7_h9_info");DatabaseReference
            m22_7_h9_s = mDate_22_7.child("22_7_h9_s");
    //23-7
    DatabaseReference mDate_23_7 = mRootReference.child("23_7");
    DatabaseReference
            m23_7_h1 = mDate_23_7.child("23_7_h1_info");DatabaseReference
            m23_7_h1_s = mDate_23_7.child("23_7_h1_s");
    DatabaseReference
            m23_7_h2 = mDate_23_7.child("23_7_h2_info");DatabaseReference
            m23_7_h2_s = mDate_23_7.child("23_7_h2_s");
    DatabaseReference
            m23_7_h3 = mDate_23_7.child("23_7_h3_info");DatabaseReference
            m23_7_h3_s = mDate_23_7.child("23_7_h3_s");
    DatabaseReference
            m23_7_h4 = mDate_23_7.child("23_7_h4_info");DatabaseReference
            m23_7_h4_s = mDate_23_7.child("23_7_h4_s");
    DatabaseReference
            m23_7_h5 = mDate_23_7.child("23_7_h5_info");DatabaseReference
            m23_7_h5_s = mDate_23_7.child("23_7_h5_s");
    DatabaseReference
            m23_7_h6 = mDate_23_7.child("23_7_h6_info");DatabaseReference
            m23_7_h6_s = mDate_23_7.child("23_7_h6_s");
    DatabaseReference
            m23_7_h7 = mDate_23_7.child("23_7_h7_info");DatabaseReference
            m23_7_h7_s = mDate_23_7.child("23_7_h7_s");
    DatabaseReference
            m23_7_h8 = mDate_23_7.child("23_7_h8_info");DatabaseReference
            m23_7_h8_s = mDate_23_7.child("23_7_h8_s");
    DatabaseReference
            m23_7_h9 = mDate_23_7.child("23_7_h9_info");DatabaseReference
            m23_7_h9_s = mDate_23_7.child("23_7_h9_s");
    //24-7
    DatabaseReference mDate_24_7 = mRootReference.child("24_7");
    DatabaseReference
            m24_7_h1 = mDate_24_7.child("24_7_h1_info");DatabaseReference
            m24_7_h1_s = mDate_24_7.child("24_7_h1_s");
    DatabaseReference
            m24_7_h2 = mDate_24_7.child("24_7_h2_info");DatabaseReference
            m24_7_h2_s = mDate_24_7.child("24_7_h2_s");
    DatabaseReference
            m24_7_h3 = mDate_24_7.child("24_7_h3_info");DatabaseReference
            m24_7_h3_s = mDate_24_7.child("24_7_h3_s");
    DatabaseReference
            m24_7_h4 = mDate_24_7.child("24_7_h4_info");DatabaseReference
            m24_7_h4_s = mDate_24_7.child("24_7_h4_s");
    DatabaseReference
            m24_7_h5 = mDate_24_7.child("24_7_h5_info");DatabaseReference
            m24_7_h5_s = mDate_24_7.child("24_7_h5_s");
    DatabaseReference
            m24_7_h6 = mDate_24_7.child("24_7_h6_info");DatabaseReference
            m24_7_h6_s = mDate_24_7.child("24_7_h6_s");
    DatabaseReference
            m24_7_h7 = mDate_24_7.child("24_7_h7_info");DatabaseReference
            m24_7_h7_s = mDate_24_7.child("24_7_h7_s");
    DatabaseReference
            m24_7_h8 = mDate_24_7.child("24_7_h8_info");DatabaseReference
            m24_7_h8_s = mDate_24_7.child("24_7_h8_s");
    DatabaseReference
            m24_7_h9 = mDate_24_7.child("24_7_h9_info");DatabaseReference
            m24_7_h9_s = mDate_24_7.child("24_7_h9_s");
    //25-7
    DatabaseReference mDate_25_7 = mRootReference.child("25_7");
    DatabaseReference
            m25_7_h1 = mDate_25_7.child("25_7_h1_info");DatabaseReference
            m25_7_h1_s = mDate_25_7.child("25_7_h1_s");
    DatabaseReference
            m25_7_h2 = mDate_25_7.child("25_7_h2_info");DatabaseReference
            m25_7_h2_s = mDate_25_7.child("25_7_h2_s");
    DatabaseReference
            m25_7_h3 = mDate_25_7.child("25_7_h3_info");DatabaseReference
            m25_7_h3_s = mDate_25_7.child("25_7_h3_s");
    DatabaseReference
            m25_7_h4 = mDate_25_7.child("25_7_h4_info");DatabaseReference
            m25_7_h4_s = mDate_25_7.child("25_7_h4_s");
    DatabaseReference
            m25_7_h5 = mDate_25_7.child("25_7_h5_info");DatabaseReference
            m25_7_h5_s = mDate_25_7.child("25_7_h5_s");
    DatabaseReference
            m25_7_h6 = mDate_25_7.child("25_7_h6_info");DatabaseReference
            m25_7_h6_s = mDate_25_7.child("25_7_h6_s");
    DatabaseReference
            m25_7_h7 = mDate_25_7.child("25_7_h7_info");DatabaseReference
            m25_7_h7_s = mDate_25_7.child("25_7_h7_s");
    DatabaseReference
            m25_7_h8 = mDate_25_7.child("25_7_h8_info");DatabaseReference
            m25_7_h8_s = mDate_25_7.child("25_7_h8_s");
    DatabaseReference
            m25_7_h9 = mDate_25_7.child("25_7_h9_info");DatabaseReference
            m25_7_h9_s = mDate_25_7.child("25_7_h9_s");
    //26-7
    DatabaseReference mDate_26_7 = mRootReference.child("26_7");
    DatabaseReference
            m26_7_h1 = mDate_26_7.child("26_7_h1_info");DatabaseReference
            m26_7_h1_s = mDate_26_7.child("26_7_h1_s");
    DatabaseReference
            m26_7_h2 = mDate_26_7.child("26_7_h2_info");DatabaseReference
            m26_7_h2_s = mDate_26_7.child("26_7_h2_s");
    DatabaseReference
            m26_7_h3 = mDate_26_7.child("26_7_h3_info");DatabaseReference
            m26_7_h3_s = mDate_26_7.child("26_7_h3_s");
    DatabaseReference
            m26_7_h4 = mDate_26_7.child("26_7_h4_info");DatabaseReference
            m26_7_h4_s = mDate_26_7.child("26_7_h4_s");
    DatabaseReference
            m26_7_h5 = mDate_26_7.child("26_7_h5_info");DatabaseReference
            m26_7_h5_s = mDate_26_7.child("26_7_h5_s");
    DatabaseReference
            m26_7_h6 = mDate_26_7.child("26_7_h6_info");DatabaseReference
            m26_7_h6_s = mDate_26_7.child("26_7_h6_s");
    DatabaseReference
            m26_7_h7 = mDate_26_7.child("26_7_h7_info");DatabaseReference
            m26_7_h7_s = mDate_26_7.child("26_7_h7_s");
    DatabaseReference
            m26_7_h8 = mDate_26_7.child("26_7_h8_info");DatabaseReference
            m26_7_h8_s = mDate_26_7.child("26_7_h8_s");
    DatabaseReference
            m26_7_h9 = mDate_26_7.child("26_7_h9_info");DatabaseReference
            m26_7_h9_s = mDate_26_7.child("26_7_h9_s");
    //27-7
    DatabaseReference mDate_27_7 = mRootReference.child("27_7");
    DatabaseReference
            m27_7_h1 = mDate_27_7.child("27_7_h1_info");DatabaseReference
            m27_7_h1_s = mDate_27_7.child("27_7_h1_s");
    DatabaseReference
            m27_7_h2 = mDate_27_7.child("27_7_h2_info");DatabaseReference
            m27_7_h2_s = mDate_27_7.child("27_7_h2_s");
    DatabaseReference
            m27_7_h3 = mDate_27_7.child("27_7_h3_info");DatabaseReference
            m27_7_h3_s = mDate_27_7.child("27_7_h3_s");
    DatabaseReference
            m27_7_h4   = mDate_27_7.child("27_7_h4_info");DatabaseReference
            m27_7_h4_s = mDate_27_7.child("27_7_h4_s");
    DatabaseReference
            m27_7_h5 = mDate_27_7.child("27_7_h5_info");DatabaseReference
            m27_7_h5_s = mDate_27_7.child("27_7_h5_s");
    DatabaseReference
            m27_7_h6 = mDate_27_7.child("27_7_h6_info");DatabaseReference
            m27_7_h6_s = mDate_27_7.child("27_7_h6_s");
    DatabaseReference
            m27_7_h7 = mDate_27_7.child("27_7_h7_info");DatabaseReference
            m27_7_h7_s = mDate_27_7.child("27_7_h7_s");
    DatabaseReference
            m27_7_h8 = mDate_27_7.child("27_7_h8_info");DatabaseReference
            m27_7_h8_s = mDate_27_7.child("27_7_h8_s");
    DatabaseReference
            m27_7_h9 = mDate_27_7.child("27_7_h9_info");DatabaseReference
            m27_7_h9_s = mDate_27_7.child("27_7_h9_s");
    //28-7
    DatabaseReference mDate_28_7 = mRootReference.child("28_7");
    DatabaseReference
            m28_7_h1 = mDate_28_7.child("28_7_h1_info");DatabaseReference
            m28_7_h1_s = mDate_28_7.child("28_7_h1_s");
    DatabaseReference
            m28_7_h2 = mDate_28_7.child("28_7_h2_info");DatabaseReference
            m28_7_h2_s = mDate_28_7.child("28_7_h2_s");
    DatabaseReference
            m28_7_h3 = mDate_28_7.child("28_7_h3_info");DatabaseReference
            m28_7_h3_s = mDate_28_7.child("28_7_h3_s");
    DatabaseReference
            m28_7_h4 = mDate_28_7.child("28_7_h4_info");DatabaseReference
            m28_7_h4_s = mDate_28_7.child("28_7_h4_s");
    DatabaseReference
            m28_7_h5 = mDate_28_7.child("28_7_h5_info");DatabaseReference
            m28_7_h5_s = mDate_28_7.child("28_7_h5_s");
    DatabaseReference
            m28_7_h6 = mDate_28_7.child("28_7_h6_info");DatabaseReference
            m28_7_h6_s = mDate_28_7.child("28_7_h6_s");
    DatabaseReference
            m28_7_h7 = mDate_28_7.child("28_7_h7_info");DatabaseReference
            m28_7_h7_s = mDate_28_7.child("28_7_h7_s");
    DatabaseReference
            m28_7_h8 = mDate_28_7.child("28_7_h8_info");DatabaseReference
            m28_7_h8_s = mDate_28_7.child("28_7_h8_s");
    DatabaseReference
            m28_7_h9 = mDate_28_7.child("28_7_h9_info");DatabaseReference
            m28_7_h9_s = mDate_28_7.child("28_7_h9_s");
    //29-7
    DatabaseReference mDate_29_7 = mRootReference.child("29_7");
    DatabaseReference
            m29_7_h1 = mDate_29_7.child("29_7_h1_info");DatabaseReference
            m29_7_h1_s = mDate_29_7.child("29_7_h1_s");
    DatabaseReference
            m29_7_h2 = mDate_29_7.child("29_7_h2_info");DatabaseReference
            m29_7_h2_s = mDate_29_7.child("29_7_h2_s");
    DatabaseReference
            m29_7_h3 = mDate_29_7.child("29_7_h3_info");DatabaseReference
            m29_7_h3_s = mDate_29_7.child("29_7_h3_s");
    DatabaseReference
            m29_7_h4 = mDate_29_7.child("29_7_h4_info");DatabaseReference
            m29_7_h4_s = mDate_29_7.child("29_7_h4_s");
    DatabaseReference
            m29_7_h5 = mDate_29_7.child("29_7_h5_info");DatabaseReference
            m29_7_h5_s = mDate_29_7.child("29_7_h5_s");
    DatabaseReference
            m29_7_h6 = mDate_29_7.child("29_7_h6_info");DatabaseReference
            m29_7_h6_s = mDate_29_7.child("29_7_h6_s");
    DatabaseReference
            m29_7_h7 = mDate_29_7.child("2_79h7_info");DatabaseReference
            m29_7_h7_s = mDate_29_7.child("2_79h7_s");
    DatabaseReference
            m29_7_h8 = mDate_29_7.child("29_7_h8_info");DatabaseReference
            m29_7_h8_s = mDate_29_7.child("29_7_h8_s");
    DatabaseReference
            m29_7_h9 = mDate_29_7.child("29_7_h9_info");DatabaseReference
            m29_7_h9_s = mDate_29_7.child("29_7_h9_s");
    //30-7
    DatabaseReference mDate_30_7 = mRootReference.child("30_7");
    DatabaseReference
            m30_7_h1 = mDate_30_7.child("30_7_h1_info");DatabaseReference
            m30_7_h1_s = mDate_30_7.child("30_7_h1_s");
    DatabaseReference
            m30_7_h2 = mDate_30_7.child("30_7_h2_info");DatabaseReference
            m30_7_h2_s = mDate_30_7.child("30_7_h2_s");
    DatabaseReference
            m30_7_h3 = mDate_30_7.child("30_7_h3_info");DatabaseReference
            m30_7_h3_s = mDate_30_7.child("30_7_h3_s");
    DatabaseReference
            m30_7_h4 = mDate_30_7.child("30_7_h4_info");DatabaseReference
            m30_7_h4_s = mDate_30_7.child("30_7_h4_s");
    DatabaseReference
            m30_7_h5 = mDate_30_7.child("30_7_h5_info");DatabaseReference
            m30_7_h5_s = mDate_30_7.child("30_7_h5_s");
    DatabaseReference
            m30_7_h6 = mDate_30_7.child("30_7_h6_info");DatabaseReference
            m30_7_h6_s = mDate_30_7.child("30_7_h6_s");
    DatabaseReference
            m30_7_h7 = mDate_30_7.child("30_7_h7_info");DatabaseReference
            m30_7_h7_s = mDate_30_7.child("30_7_h7_s");
    DatabaseReference
            m30_7_h8 = mDate_30_7.child("30_7_h8_info");DatabaseReference
            m30_7_h8_s = mDate_30_7.child("30_7_h8_s");
    DatabaseReference
            m30_7_h9 = mDate_30_7.child("30_7_h9_info");DatabaseReference
            m30_7_h9_s = mDate_30_7.child("30_7_h9_s");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client_rdvm2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ////////////////////////////////////////////////////////////
        //day1
        //day1
        d1_h1 = (Button)findViewById(R.id.d1_h1);
        d1_h1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "8-9"+"  "+editDate.getText().toString());
                i.putExtra("btn", "1_7_h1");
                startActivity(i);
            }
        });
        d1_h2 = (Button)findViewById(R.id.d1_h2);
        d1_h2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "9-10"+"  "+editDate.getText().toString());
                i.putExtra("btn", "1_7_h2");
                startActivity(i);
            }
        });
        d1_h3 = (Button)findViewById(R.id.d1_h3);
        d1_h3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "10-11"+"  "+editDate.getText().toString());
                i.putExtra("btn", "1_7_h3");
                startActivity(i);
            }
        });
        d1_h4 = (Button)findViewById(R.id.d1_h4);
        d1_h4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "11-12"+"  "+editDate.getText().toString());
                i.putExtra("btn", "1_7_h4");
                startActivity(i);
            }
        });
        d1_h5 = (Button)findViewById(R.id.d1_h5);
        d1_h5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "12-13"+"  "+editDate.getText().toString());
                i.putExtra("btn", "1_7_h5");
                startActivity(i);
            }
        });
        d1_h6 = (Button)findViewById(R.id.d1_h6);
        d1_h6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "13-14"+"  "+editDate.getText().toString());
                i.putExtra("btn", "1_7_h6");
                startActivity(i);
            }
        });
        d1_h7 = (Button)findViewById(R.id.d1_h7);
        d1_h7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "14-15"+"  "+editDate.getText().toString());
                i.putExtra("btn", "1_7_h7");
                startActivity(i);
            }
        });
        d1_h8 = (Button)findViewById(R.id.d1_h8);
        d1_h8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "15-16"+"  "+editDate.getText().toString());
                i.putExtra("btn", "1_7_h8");
                startActivity(i);
            }
        });
        d1_h9 = (Button)findViewById(R.id.d1_h9);
        d1_h9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "16-17"+"  "+editDate.getText().toString());
                i.putExtra("btn", "1_7_h9");
                startActivity(i);
            }
        });

        //day2
        d2_h1 = (Button)findViewById(R.id.d2_h1);
        d2_h1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "8-9"+"  "+editDate.getText().toString());
                i.putExtra("btn", "2_7_h1");
                startActivity(i);
            }
        });
        d2_h2 = (Button)findViewById(R.id.d2_h2);
        d2_h2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "9-10"+"  "+editDate.getText().toString());
                i.putExtra("btn", "2_7_h2");
                startActivity(i);
            }
        });
        d2_h3 = (Button)findViewById(R.id.d2_h3);
        d2_h3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "10-11"+"  "+editDate.getText().toString());
                i.putExtra("btn", "2_7_h3");
                startActivity(i);
            }
        });
        d2_h4 = (Button)findViewById(R.id.d2_h4);
        d2_h4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "11-12"+"  "+editDate.getText().toString());
                i.putExtra("btn", "2_7_h4");
                startActivity(i);
            }
        });
        d2_h5 = (Button)findViewById(R.id.d2_h5);
        d2_h5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "12-13"+"  "+editDate.getText().toString());
                i.putExtra("btn", "2_7_h5");
                startActivity(i);
            }
        });
        d2_h6 = (Button)findViewById(R.id.d2_h6);
        d2_h6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "13-14"+"  "+editDate.getText().toString());
                i.putExtra("btn", "2_7_h6");
                startActivity(i);
            }
        });
        d2_h7 = (Button)findViewById(R.id.d2_h7);
        d2_h7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "14-15"+"  "+editDate.getText().toString());
                i.putExtra("btn", "2_7_h7");
                startActivity(i);
            }
        });
        d2_h8 = (Button)findViewById(R.id.d2_h8);
        d2_h8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "15-16"+"  "+editDate.getText().toString());
                i.putExtra("btn", "2_7_h8");
                startActivity(i);
            }
        });
        d2_h9 = (Button)findViewById(R.id.d2_h9);
        d2_h9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "16-17"+"  "+editDate.getText().toString());
                i.putExtra("btn", "2_7_h9");
                startActivity(i);
            }
        });

        //day3
        d3_h1 = (Button)findViewById(R.id.d3_h1);
        d3_h1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "8-9"+"  "+editDate.getText().toString());
                i.putExtra("btn", "3_7_h1");
                startActivity(i);
            }
        });
        d3_h2 = (Button)findViewById(R.id.d3_h2);
        d3_h2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "9-10"+"  "+editDate.getText().toString());
                i.putExtra("btn", "3_7_h2");
                startActivity(i);
            }
        });
        d3_h3 = (Button)findViewById(R.id.d3_h3);
        d3_h3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "10-11"+"  "+editDate.getText().toString());
                i.putExtra("btn", "3_7_h3");
                startActivity(i);
            }
        });
        d3_h4 = (Button)findViewById(R.id.d3_h4);
        d3_h4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "11-12"+"  "+editDate.getText().toString());
                i.putExtra("btn", "3_7_h4");
                startActivity(i);
            }
        });
        d3_h5 = (Button)findViewById(R.id.d3_h5);
        d3_h5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "12-13"+"  "+editDate.getText().toString());
                i.putExtra("btn", "3_7_h5");
                startActivity(i);
            }
        });
        d3_h6 = (Button)findViewById(R.id.d3_h6);
        d3_h6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "13-14"+"  "+editDate.getText().toString());
                i.putExtra("btn", "3_7_h6");
                startActivity(i);
            }
        });
        d3_h7 = (Button)findViewById(R.id.d3_h7);
        d3_h7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "14-15"+"  "+editDate.getText().toString());
                i.putExtra("btn", "3_7_h7");
                startActivity(i);
            }
        });
        d3_h8 = (Button)findViewById(R.id.d3_h8);
        d3_h8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "15-16"+"  "+editDate.getText().toString());
                i.putExtra("btn", "3_7_h8");
                startActivity(i);
            }
        });
        d3_h9 = (Button)findViewById(R.id.d3_h9);
        d3_h9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "16-17"+"  "+editDate.getText().toString());
                i.putExtra("btn", "3_7_h9");
                startActivity(i);
            }
        });

        //day4
        d4_h1 = (Button)findViewById(R.id.d4_h1);
        d4_h1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "8-9"+"  "+editDate.getText().toString());
                i.putExtra("btn", "4_7_h1");
                startActivity(i);
            }
        });
        d4_h2 = (Button)findViewById(R.id.d4_h2);
        d4_h2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "9-10"+"  "+editDate.getText().toString());
                i.putExtra("btn", "4_7_h2");
                startActivity(i);
            }
        });
        d4_h3 = (Button)findViewById(R.id.d4_h3);
        d4_h3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "10-11"+"  "+editDate.getText().toString());
                i.putExtra("btn", "4_7_h3");
                startActivity(i);
            }
        });
        d4_h4 = (Button)findViewById(R.id.d4_h4);
        d4_h4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "11-12"+"  "+editDate.getText().toString());
                i.putExtra("btn", "4_7_h4");
                startActivity(i);
            }
        });
        d4_h5 = (Button)findViewById(R.id.d4_h5);
        d4_h5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "12-13"+"  "+editDate.getText().toString());
                i.putExtra("btn", "4_7_h5");
                startActivity(i);
            }
        });
        d4_h6 = (Button)findViewById(R.id.d4_h6);
        d4_h6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "13-14"+"  "+editDate.getText().toString());
                i.putExtra("btn", "4_7_h6");
                startActivity(i);
            }
        });
        d4_h7 = (Button)findViewById(R.id.d4_h7);
        d4_h7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "14-15"+"  "+editDate.getText().toString());
                i.putExtra("btn", "4_7_h7");
                startActivity(i);
            }
        });
        d4_h8 = (Button)findViewById(R.id.d4_h8);
        d4_h8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "15-16"+"  "+editDate.getText().toString());
                i.putExtra("btn", "4_7_h8");
                startActivity(i);
            }
        });
        d4_h9 = (Button)findViewById(R.id.d4_h9);
        d4_h9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "16-17"+"  "+editDate.getText().toString());
                i.putExtra("btn", "4_7_h9");
                startActivity(i);
            }
        });

        //day5
        d5_h1 = (Button)findViewById(R.id.d5_h1);
        d5_h1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "8-9"+"  "+editDate.getText().toString());
                i.putExtra("btn", "5_7_h1");
                startActivity(i);
            }
        });
        d5_h2 = (Button)findViewById(R.id.d5_h2);
        d5_h2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "9-10"+"  "+editDate.getText().toString());
                i.putExtra("btn", "5_7_h2");
                startActivity(i);
            }
        });
        d5_h3 = (Button)findViewById(R.id.d5_h3);
        d5_h3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "10-11"+"  "+editDate.getText().toString());
                i.putExtra("btn", "5_7_h3");
                startActivity(i);
            }
        });
        d5_h4 = (Button)findViewById(R.id.d5_h4);
        d5_h4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "11-12"+"  "+editDate.getText().toString());
                i.putExtra("btn", "5_7_h4");
                startActivity(i);
            }
        });
        d5_h5 = (Button)findViewById(R.id.d5_h5);
        d5_h5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "12-13"+"  "+editDate.getText().toString());
                i.putExtra("btn", "5_7_h5");
                startActivity(i);
            }
        });
        d5_h6 = (Button)findViewById(R.id.d5_h6);
        d5_h6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "13-14"+"  "+editDate.getText().toString());
                i.putExtra("btn", "5_7_h6");
                startActivity(i);
            }
        });
        d5_h7 = (Button)findViewById(R.id.d5_h7);
        d5_h7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "14-15"+"  "+editDate.getText().toString());
                i.putExtra("btn", "5_7_h7");
                startActivity(i);
            }
        });
        d5_h8 = (Button)findViewById(R.id.d5_h8);
        d5_h8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "15-16"+"  "+editDate.getText().toString());
                i.putExtra("btn", "5_7_h8");
                startActivity(i);
            }
        });
        d5_h9 = (Button)findViewById(R.id.d5_h9);
        d5_h9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "16-17"+"  "+editDate.getText().toString());
                i.putExtra("btn", "5_7_h9");
                startActivity(i);
            }
        });


        //day6
        d6_h1 = (Button)findViewById(R.id.d6_h1);
        d6_h1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "8-9"+"  "+editDate.getText().toString());
                i.putExtra("btn", "6_7_h1");
                startActivity(i);
            }
        });
        d6_h2 = (Button)findViewById(R.id.d6_h2);
        d6_h2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "9-10"+"  "+editDate.getText().toString());
                i.putExtra("btn", "6_7_h2");
                startActivity(i);
            }
        });
        d6_h3 = (Button)findViewById(R.id.d6_h3);
        d6_h3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "10-11"+"  "+editDate.getText().toString());
                i.putExtra("btn", "6_7_h3");
                startActivity(i);
            }
        });
        d6_h4 = (Button)findViewById(R.id.d6_h4);
        d6_h4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "11-12"+"  "+editDate.getText().toString());
                i.putExtra("btn", "6_7_h4");
                startActivity(i);
            }
        });
        d6_h5 = (Button)findViewById(R.id.d6_h5);
        d6_h5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "12-13"+"  "+editDate.getText().toString());
                i.putExtra("btn", "6_7_h5");
                startActivity(i);
            }
        });
        d6_h6 = (Button)findViewById(R.id.d6_h6);
        d6_h6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "13-14"+"  "+editDate.getText().toString());
                i.putExtra("btn", "6_7_h6");
                startActivity(i);
            }
        });
        d6_h7 = (Button)findViewById(R.id.d6_h7);
        d6_h7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "14-15"+"  "+editDate.getText().toString());
                i.putExtra("btn", "6_7_h7");
                startActivity(i);
            }
        });
        d6_h8 = (Button)findViewById(R.id.d6_h8);
        d6_h8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "15-16"+"  "+editDate.getText().toString());
                i.putExtra("btn", "6_7_h8");
                startActivity(i);
            }
        });
        d6_h9 = (Button)findViewById(R.id.d6_h9);
        d6_h9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "16-17"+"  "+editDate.getText().toString());
                i.putExtra("btn", "6_7_h9");
                startActivity(i);
            }
        });


        //day7
        d7_h1 = (Button)findViewById(R.id.d7_h1);
        d7_h1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "8-9"+"  "+editDate.getText().toString());
                i.putExtra("btn", "7_7_h1");
                startActivity(i);
            }
        });
        d7_h2 = (Button)findViewById(R.id.d7_h2);
        d7_h2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "9-10"+"  "+editDate.getText().toString());
                i.putExtra("btn", "7_7_h2");
                startActivity(i);
            }
        });
        d7_h3 = (Button)findViewById(R.id.d7_h3);
        d7_h3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "10-11"+"  "+editDate.getText().toString());
                i.putExtra("btn", "7_7_h3");
                startActivity(i);
            }
        });
        d7_h4 = (Button)findViewById(R.id.d7_h4);
        d7_h4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "11-12"+"  "+editDate.getText().toString());
                i.putExtra("btn", "7_7_h4");
                startActivity(i);
            }
        });
        d7_h5 = (Button)findViewById(R.id.d7_h5);
        d7_h5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "12-13"+"  "+editDate.getText().toString());
                i.putExtra("btn", "7_7_h5");
                startActivity(i);
            }
        });
        d7_h6 = (Button)findViewById(R.id.d7_h6);
        d7_h6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "13-14"+"  "+editDate.getText().toString());
                i.putExtra("btn", "7_7_h6");
                startActivity(i);
            }
        });
        d7_h7 = (Button)findViewById(R.id.d7_h7);
        d7_h7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "14-15"+"  "+editDate.getText().toString());
                i.putExtra("btn", "7_7_h7");
                startActivity(i);
            }
        });
        d7_h8 = (Button)findViewById(R.id.d7_h8);
        d7_h8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "15-16"+"  "+editDate.getText().toString());
                i.putExtra("btn", "7_7_h8");
                startActivity(i);
            }
        });
        d7_h9 = (Button)findViewById(R.id.d7_h9);
        d7_h9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "16-17"+"  "+editDate.getText().toString());
                i.putExtra("btn", "7_7_h9");
                startActivity(i);
            }
        });

        //day8
        d8_h1 = (Button)findViewById(R.id.d8_h1);
        d8_h1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "8-9"+"  "+editDate.getText().toString());
                i.putExtra("btn", "8_7_h1");
                startActivity(i);
            }
        });
        d8_h2 = (Button)findViewById(R.id.d8_h2);
        d8_h2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "9-10"+"  "+editDate.getText().toString());
                i.putExtra("btn", "8_7_h2");
                startActivity(i);
            }
        });
        d8_h3 = (Button)findViewById(R.id.d8_h3);
        d8_h3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "10-11"+"  "+editDate.getText().toString());
                i.putExtra("btn", "8_7_h3");
                startActivity(i);
            }
        });
        d8_h4 = (Button)findViewById(R.id.d8_h4);
        d8_h4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "11-12"+"  "+editDate.getText().toString());
                i.putExtra("btn", "8_7_h4");
                startActivity(i);
            }
        });
        d8_h5 = (Button)findViewById(R.id.d8_h5);
        d8_h5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "12-13"+"  "+editDate.getText().toString());
                i.putExtra("btn", "8_7_h5");
                startActivity(i);
            }
        });
        d8_h6 = (Button)findViewById(R.id.d8_h6);
        d8_h6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "13-14"+"  "+editDate.getText().toString());
                i.putExtra("btn", "8_7_h6");
                startActivity(i);
            }
        });
        d8_h7 = (Button)findViewById(R.id.d8_h7);
        d8_h7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "14-15"+"  "+editDate.getText().toString());
                i.putExtra("btn", "8_7_h7");
                startActivity(i);
            }
        });
        d8_h8 = (Button)findViewById(R.id.d8_h8);
        d8_h8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "15-16"+"  "+editDate.getText().toString());
                i.putExtra("btn", "8_7_h8");
                startActivity(i);
            }
        });
        d8_h9 = (Button)findViewById(R.id.d8_h9);
        d8_h9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "16-17"+"  "+editDate.getText().toString());
                i.putExtra("btn", "8_7_h9");
                startActivity(i);
            }
        });

        //day9
        d9_h1 = (Button)findViewById(R.id.d9_h1);
        d9_h1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "8-9"+"  "+editDate.getText().toString());
                i.putExtra("btn", "9_7_h1");
                startActivity(i);
            }
        });
        d9_h2 = (Button)findViewById(R.id.d9_h2);
        d9_h2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "9-10"+"  "+editDate.getText().toString());
                i.putExtra("btn", "9_7_h2");
                startActivity(i);
            }
        });
        d9_h3 = (Button)findViewById(R.id.d9_h3);
        d9_h3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "10-11"+"  "+editDate.getText().toString());
                i.putExtra("btn", "9_7_h3");
                startActivity(i);
            }
        });
        d9_h4 = (Button)findViewById(R.id.d9_h4);
        d9_h4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "11-12"+"  "+editDate.getText().toString());
                i.putExtra("btn", "9_7_h4");
                startActivity(i);
            }
        });
        d9_h5 = (Button)findViewById(R.id.d9_h5);
        d9_h5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "12-13"+"  "+editDate.getText().toString());
                i.putExtra("btn", "9_7_h5");
                startActivity(i);
            }
        });
        d9_h6 = (Button)findViewById(R.id.d9_h6);
        d9_h6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "13-14"+"  "+editDate.getText().toString());
                i.putExtra("btn", "9_7_h6");
                startActivity(i);
            }
        });
        d9_h7 = (Button)findViewById(R.id.d9_h7);
        d9_h7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "14-15"+"  "+editDate.getText().toString());
                i.putExtra("btn", "9_7_h7");
                startActivity(i);
            }
        });
        d9_h8 = (Button)findViewById(R.id.d9_h8);
        d9_h8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "15-16"+"  "+editDate.getText().toString());
                i.putExtra("btn", "9_7_h8");
                startActivity(i);
            }
        });
        d9_h9 = (Button)findViewById(R.id.d9_h9);
        d9_h9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "16-17"+"  "+editDate.getText().toString());
                i.putExtra("btn", "9_7_h9");
                startActivity(i);
            }
        });


        //day10
        d10_h1 = (Button)findViewById(R.id.d10_h1);
        d10_h1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "8-9"+"  "+editDate.getText().toString());
                i.putExtra("btn", "10_7_h1");
                startActivity(i);
            }
        });
        d10_h2 = (Button)findViewById(R.id.d10_h2);
        d10_h2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "9-10"+"  "+editDate.getText().toString());
                i.putExtra("btn", "10_7_h2");
                startActivity(i);
            }
        });
        d10_h3 = (Button)findViewById(R.id.d10_h3);
        d10_h3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "10-11"+"  "+editDate.getText().toString());
                i.putExtra("btn", "10_7_h3");
                startActivity(i);
            }
        });
        d10_h4 = (Button)findViewById(R.id.d10_h4);
        d10_h4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "11-12"+"  "+editDate.getText().toString());
                i.putExtra("btn", "10_7_h4");
                startActivity(i);
            }
        });
        d10_h5 = (Button)findViewById(R.id.d10_h5);
        d10_h5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "12-13"+"  "+editDate.getText().toString());
                i.putExtra("btn", "10_7_h5");
                startActivity(i);
            }
        });
        d10_h6 = (Button)findViewById(R.id.d10_h6);
        d10_h6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "13-14"+"  "+editDate.getText().toString());
                i.putExtra("btn", "10_7_h6");
                startActivity(i);
            }
        });
        d10_h7 = (Button)findViewById(R.id.d10_h7);
        d10_h7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "14-15"+"  "+editDate.getText().toString());
                i.putExtra("btn", "10_7_h7");
                startActivity(i);
            }
        });
        d10_h8 = (Button)findViewById(R.id.d10_h8);
        d10_h8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "15-16"+"  "+editDate.getText().toString());
                i.putExtra("btn", "10_7_h8");
                startActivity(i);
            }
        });
        d10_h9 = (Button)findViewById(R.id.d10_h9);
        d10_h9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "16-17"+"  "+editDate.getText().toString());
                i.putExtra("btn", "10_7_h9");
                startActivity(i);
            }
        });


        //day11
        d11_h1 = (Button)findViewById(R.id.d11_h1);
        d11_h1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "8-9"+"  "+editDate.getText().toString());
                i.putExtra("btn", "11_7_h1");
                startActivity(i);
            }
        });
        d11_h2 = (Button)findViewById(R.id.d11_h2);
        d11_h2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "9-10"+"  "+editDate.getText().toString());
                i.putExtra("btn", "11_7_h2");
                startActivity(i);
            }
        });
        d11_h3 = (Button)findViewById(R.id.d11_h3);
        d11_h3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "10-11"+"  "+editDate.getText().toString());
                i.putExtra("btn", "11_7_h3");
                startActivity(i);
            }
        });
        d11_h4 = (Button)findViewById(R.id.d11_h4);
        d11_h4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "11-12"+"  "+editDate.getText().toString());
                i.putExtra("btn", "11_7_h4");
                startActivity(i);
            }
        });
        d11_h5 = (Button)findViewById(R.id.d11_h5);
        d11_h5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "12-13"+"  "+editDate.getText().toString());
                i.putExtra("btn", "11_7_h5");
                startActivity(i);
            }
        });
        d11_h6 = (Button)findViewById(R.id.d11_h6);
        d11_h6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "13-14"+"  "+editDate.getText().toString());
                i.putExtra("btn", "11_7_h6");
                startActivity(i);
            }
        });
        d11_h7 = (Button)findViewById(R.id.d11_h7);
        d11_h7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "14-15"+"  "+editDate.getText().toString());
                i.putExtra("btn", "11_7_h7");
                startActivity(i);
            }
        });
        d11_h8 = (Button)findViewById(R.id.d11_h8);
        d11_h8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "15-16"+"  "+editDate.getText().toString());
                i.putExtra("btn", "11_7_h8");
                startActivity(i);
            }
        });
        d11_h9 = (Button)findViewById(R.id.d11_h9);
        d11_h9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "16-17"+"  "+editDate.getText().toString());
                i.putExtra("btn", "11_7_h9");
                startActivity(i);
            }
        });


        //day12
        d12_h1 = (Button)findViewById(R.id.d12_h1);
        d12_h1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "8-9"+"  "+editDate.getText().toString());
                i.putExtra("btn", "12_7_h1");
                startActivity(i);
            }
        });
        d12_h2 = (Button)findViewById(R.id.d12_h2);
        d12_h2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "9-10"+"  "+editDate.getText().toString());
                i.putExtra("btn", "12_7_h2");
                startActivity(i);
            }
        });
        d12_h3 = (Button)findViewById(R.id.d12_h3);
        d12_h3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "10-11"+"  "+editDate.getText().toString());
                i.putExtra("btn", "12_7_h3");
                startActivity(i);
            }
        });
        d12_h4 = (Button)findViewById(R.id.d12_h4);
        d12_h4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "11-12"+"  "+editDate.getText().toString());
                i.putExtra("btn", "12_7_h4");
                startActivity(i);
            }
        });
        d12_h5 = (Button)findViewById(R.id.d12_h5);
        d12_h5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "12-13"+"  "+editDate.getText().toString());
                i.putExtra("btn", "12_7_h5");
                startActivity(i);
            }
        });
        d12_h6 = (Button)findViewById(R.id.d12_h6);
        d12_h6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "13-14"+"  "+editDate.getText().toString());
                i.putExtra("btn", "12_7_h6");
                startActivity(i);
            }
        });
        d12_h7 = (Button)findViewById(R.id.d12_h7);
        d12_h7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "14-15"+"  "+editDate.getText().toString());
                i.putExtra("btn", "12_7_h7");
                startActivity(i);
            }
        });
        d12_h8 = (Button)findViewById(R.id.d12_h8);
        d12_h8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "15-16"+"  "+editDate.getText().toString());
                i.putExtra("btn", "12_7_h8");
                startActivity(i);
            }
        });
        d12_h9 = (Button)findViewById(R.id.d12_h9);
        d12_h9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "16-17"+"  "+editDate.getText().toString());
                i.putExtra("btn", "12_7_h9");
                startActivity(i);
            }
        });


        //day13
        d13_h1 = (Button)findViewById(R.id.d13_h1);
        d13_h1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "8-9"+"  "+editDate.getText().toString());
                i.putExtra("btn", "13_7_h1");
                startActivity(i);
            }
        });
        d13_h2 = (Button)findViewById(R.id.d13_h2);
        d13_h2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "9-10"+"  "+editDate.getText().toString());
                i.putExtra("btn", "13_7_h2");
                startActivity(i);
            }
        });
        d13_h3 = (Button)findViewById(R.id.d13_h3);
        d13_h3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "10-11"+"  "+editDate.getText().toString());
                i.putExtra("btn", "13_7_h3");
                startActivity(i);
            }
        });
        d13_h4 = (Button)findViewById(R.id.d13_h4);
        d13_h4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "11-12"+"  "+editDate.getText().toString());
                i.putExtra("btn", "13_7_h4");
                startActivity(i);
            }
        });
        d13_h5 = (Button)findViewById(R.id.d13_h5);
        d13_h5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "12-13"+"  "+editDate.getText().toString());
                i.putExtra("btn", "13_7_h5");
                startActivity(i);
            }
        });
        d13_h6 = (Button)findViewById(R.id.d13_h6);
        d13_h6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "13-14"+"  "+editDate.getText().toString());
                i.putExtra("btn", "13_7_h6");
                startActivity(i);
            }
        });
        d13_h7 = (Button)findViewById(R.id.d13_h7);
        d13_h7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "14-15"+"  "+editDate.getText().toString());
                i.putExtra("btn", "13_7_h7");
                startActivity(i);
            }
        });
        d13_h8 = (Button)findViewById(R.id.d13_h8);
        d13_h8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "15-16"+"  "+editDate.getText().toString());
                i.putExtra("btn", "13_7_h8");
                startActivity(i);
            }
        });
        d13_h9 = (Button)findViewById(R.id.d13_h9);
        d13_h9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "16-17"+"  "+editDate.getText().toString());
                i.putExtra("btn", "13_7_h9");
                startActivity(i);
            }
        });

        //day14
        d14_h1 = (Button)findViewById(R.id.d14_h1);
        d14_h1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "8-9"+"  "+editDate.getText().toString());
                i.putExtra("btn", "14_7_h1");
                startActivity(i);
            }
        });
        d14_h2 = (Button)findViewById(R.id.d14_h2);
        d14_h2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "9-10"+"  "+editDate.getText().toString());
                i.putExtra("btn", "14_7_h2");
                startActivity(i);
            }
        });
        d14_h3 = (Button)findViewById(R.id.d14_h3);
        d14_h3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "10-11"+"  "+editDate.getText().toString());
                i.putExtra("btn", "14_7_h3");
                startActivity(i);
            }
        });
        d14_h4 = (Button)findViewById(R.id.d14_h4);
        d14_h4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "11-12"+"  "+editDate.getText().toString());
                i.putExtra("btn", "14_7_h4");
                startActivity(i);
            }
        });
        d14_h5 = (Button)findViewById(R.id.d14_h5);
        d14_h5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "12-13"+"  "+editDate.getText().toString());
                i.putExtra("btn", "14_7_h5");
                startActivity(i);
            }
        });
        d14_h6 = (Button)findViewById(R.id.d14_h6);
        d14_h6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "13-14"+"  "+editDate.getText().toString());
                i.putExtra("btn", "14_7_h6");
                startActivity(i);
            }
        });
        d14_h7 = (Button)findViewById(R.id.d14_h7);
        d14_h7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "14-15"+"  "+editDate.getText().toString());
                i.putExtra("btn", "14_7_h7");
                startActivity(i);
            }
        });
        d14_h8 = (Button)findViewById(R.id.d14_h8);
        d14_h8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "15-16"+"  "+editDate.getText().toString());
                i.putExtra("btn", "14_7_h8");
                startActivity(i);
            }
        });
        d14_h9 = (Button)findViewById(R.id.d14_h9);
        d14_h9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "16-17"+"  "+editDate.getText().toString());
                i.putExtra("btn", "14_7_h9");
                startActivity(i);
            }
        });

        //day15
        d15_h1 = (Button)findViewById(R.id.d15_h1);
        d15_h1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "8-9"+"  "+editDate.getText().toString());
                i.putExtra("btn", "15_7_h1");
                startActivity(i);
            }
        });
        d15_h2 = (Button)findViewById(R.id.d15_h2);
        d15_h2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "9-10"+"  "+editDate.getText().toString());
                i.putExtra("btn", "15_7_h2");
                startActivity(i);
            }
        });
        d15_h3 = (Button)findViewById(R.id.d15_h3);
        d15_h3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "10-11"+"  "+editDate.getText().toString());
                i.putExtra("btn", "15_7_h3");
                startActivity(i);
            }
        });
        d15_h4 = (Button)findViewById(R.id.d15_h4);
        d15_h4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "11-12"+"  "+editDate.getText().toString());
                i.putExtra("btn", "15_7_h4");
                startActivity(i);
            }
        });
        d15_h5 = (Button)findViewById(R.id.d15_h5);
        d15_h5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "12-13"+"  "+editDate.getText().toString());
                i.putExtra("btn", "15_7_h5");
                startActivity(i);
            }
        });
        d15_h6 = (Button)findViewById(R.id.d15_h6);
        d15_h6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "13-14"+"  "+editDate.getText().toString());
                i.putExtra("btn", "15_7_h6");
                startActivity(i);
            }
        });
        d15_h7 = (Button)findViewById(R.id.d15_h7);
        d15_h7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "14-15"+"  "+editDate.getText().toString());
                i.putExtra("btn", "15_7_h7");
                startActivity(i);
            }
        });
        d15_h8 = (Button)findViewById(R.id.d15_h8);
        d15_h8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "15-16"+"  "+editDate.getText().toString());
                i.putExtra("btn", "15_7_h8");
                startActivity(i);
            }
        });
        d15_h9 = (Button)findViewById(R.id.d15_h9);
        d15_h9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "16-17"+"  "+editDate.getText().toString());
                i.putExtra("btn", "15_7_h9");
                startActivity(i);
            }
        });

        //day16
        d16_h1 = (Button)findViewById(R.id.d16_h1);
        d16_h1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "8-9"+"  "+editDate.getText().toString());
                i.putExtra("btn", "16_7_h1");
                startActivity(i);
            }
        });
        d16_h2 = (Button)findViewById(R.id.d16_h2);
        d16_h2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "9-10"+"  "+editDate.getText().toString());
                i.putExtra("btn", "16_7_h2");
                startActivity(i);
            }
        });
        d16_h3 = (Button)findViewById(R.id.d1_h3);
        d16_h3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "10-11"+"  "+editDate.getText().toString());
                i.putExtra("btn", "16_7_h3");
                startActivity(i);
            }
        });
        d16_h4 = (Button)findViewById(R.id.d16_h4);
        d16_h4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "11-12"+"  "+editDate.getText().toString());
                i.putExtra("btn", "16_7_h4");
                startActivity(i);
            }
        });
        d16_h5 = (Button)findViewById(R.id.d16_h5);
        d16_h5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "12-13"+"  "+editDate.getText().toString());
                i.putExtra("btn", "16_7_h5");
                startActivity(i);
            }
        });
        d16_h6 = (Button)findViewById(R.id.d16_h6);
        d16_h6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "13-14"+"  "+editDate.getText().toString());
                i.putExtra("btn", "16_7_h6");
                startActivity(i);
            }
        });
        d16_h7 = (Button)findViewById(R.id.d16_h7);
        d16_h7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "14-15"+"  "+editDate.getText().toString());
                i.putExtra("btn", "16_7_h7");
                startActivity(i);
            }
        });
        d16_h8 = (Button)findViewById(R.id.d16_h8);
        d16_h8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "15-16"+"  "+editDate.getText().toString());
                i.putExtra("btn", "16_7_h8");
                startActivity(i);
            }
        });
        d16_h9 = (Button)findViewById(R.id.d16_h9);
        d16_h9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "16-17"+"  "+editDate.getText().toString());
                i.putExtra("btn", "16_7_h9");
                startActivity(i);
            }
        });

        //day17
        d17_h1 = (Button)findViewById(R.id.d17_h1);
        d17_h1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "8-9"+"  "+editDate.getText().toString());
                i.putExtra("btn", "17_7_h1");
                startActivity(i);
            }
        });
        d17_h2 = (Button)findViewById(R.id.d17_h2);
        d17_h2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "9-10"+"  "+editDate.getText().toString());
                i.putExtra("btn", "17_7_h2");
                startActivity(i);
            }
        });
        d17_h3 = (Button)findViewById(R.id.d17_h3);
        d17_h3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "10-11"+"  "+editDate.getText().toString());
                i.putExtra("btn", "17_7_h3");
                startActivity(i);
            }
        });
        d17_h4 = (Button)findViewById(R.id.d17_h4);
        d17_h4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "11-12"+"  "+editDate.getText().toString());
                i.putExtra("btn", "17_7_h4");
                startActivity(i);
            }
        });
        d17_h5 = (Button)findViewById(R.id.d17_h5);
        d17_h5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "12-13"+"  "+editDate.getText().toString());
                i.putExtra("btn", "17_7_h5");
                startActivity(i);
            }
        });
        d17_h6 = (Button)findViewById(R.id.d17_h6);
        d17_h6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "13-14"+"  "+editDate.getText().toString());
                i.putExtra("btn", "17_7_h6");
                startActivity(i);
            }
        });
        d17_h7 = (Button)findViewById(R.id.d17_h7);
        d17_h7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "14-15"+"  "+editDate.getText().toString());
                i.putExtra("btn", "17_7_h7");
                startActivity(i);
            }
        });
        d17_h8 = (Button)findViewById(R.id.d17_h8);
        d17_h8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "15-16"+"  "+editDate.getText().toString());
                i.putExtra("btn", "17_7_h8");
                startActivity(i);
            }
        });
        d17_h9 = (Button)findViewById(R.id.d17_h9);
        d17_h9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "16-17"+"  "+editDate.getText().toString());
                i.putExtra("btn", "17_7_h9");
                startActivity(i);
            }
        });

        //day18
        d18_h1 = (Button)findViewById(R.id.d18_h1);
        d18_h1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "8-9"+"  "+editDate.getText().toString());
                i.putExtra("btn", "18_7_h1");
                startActivity(i);
            }
        });
        d18_h2 = (Button)findViewById(R.id.d18_h2);
        d18_h2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "9-10"+"  "+editDate.getText().toString());
                i.putExtra("btn", "18_7_h2");
                startActivity(i);
            }
        });
        d18_h3 = (Button)findViewById(R.id.d18_h3);
        d18_h3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "10-11"+"  "+editDate.getText().toString());
                i.putExtra("btn", "18_7_h3");
                startActivity(i);
            }
        });
        d18_h4 = (Button)findViewById(R.id.d18_h4);
        d18_h4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "11-12"+"  "+editDate.getText().toString());
                i.putExtra("btn", "18_7_h4");
                startActivity(i);
            }
        });
        d18_h5 = (Button)findViewById(R.id.d18_h5);
        d18_h5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "12-13"+"  "+editDate.getText().toString());
                i.putExtra("btn", "18_7_h5");
                startActivity(i);
            }
        });
        d18_h6 = (Button)findViewById(R.id.d18_h6);
        d18_h6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "13-14"+"  "+editDate.getText().toString());
                i.putExtra("btn", "18_7_h6");
                startActivity(i);
            }
        });
        d18_h7 = (Button)findViewById(R.id.d18_h7);
        d18_h7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "14-15"+"  "+editDate.getText().toString());
                i.putExtra("btn", "18_7_h7");
                startActivity(i);
            }
        });
        d18_h8 = (Button)findViewById(R.id.d18_h8);
        d18_h8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "15-16"+"  "+editDate.getText().toString());
                i.putExtra("btn", "18_7_h8");
                startActivity(i);
            }
        });
        d18_h9 = (Button)findViewById(R.id.d18_h9);
        d18_h9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "16-17"+"  "+editDate.getText().toString());
                i.putExtra("btn", "18_7_h9");
                startActivity(i);
            }
        });

        //day19
        d19_h1 = (Button)findViewById(R.id.d19_h1);
        d19_h1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "8-9"+"  "+editDate.getText().toString());
                i.putExtra("btn", "19_7_h1");
                startActivity(i);
            }
        });
        d19_h2 = (Button)findViewById(R.id.d19_h2);
        d19_h2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "9-10"+"  "+editDate.getText().toString());
                i.putExtra("btn", "19_7_h2");
                startActivity(i);
            }
        });
        d19_h3 = (Button)findViewById(R.id.d19_h3);
        d19_h3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "10-11"+"  "+editDate.getText().toString());
                i.putExtra("btn", "19_7_h3");
                startActivity(i);
            }
        });
        d19_h4 = (Button)findViewById(R.id.d19_h4);
        d19_h4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "11-12"+"  "+editDate.getText().toString());
                i.putExtra("btn", "19_7_h4");
                startActivity(i);
            }
        });
        d19_h5 = (Button)findViewById(R.id.d19_h5);
        d19_h5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "12-13"+"  "+editDate.getText().toString());
                i.putExtra("btn", "19_7_h5");
                startActivity(i);
            }
        });
        d19_h6 = (Button)findViewById(R.id.d19_h6);
        d19_h6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "13-14"+"  "+editDate.getText().toString());
                i.putExtra("btn", "19_7_h6");
                startActivity(i);
            }
        });
        d19_h7 = (Button)findViewById(R.id.d19_h7);
        d19_h7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "14-15"+"  "+editDate.getText().toString());
                i.putExtra("btn", "19_7_h7");
                startActivity(i);
            }
        });
        d19_h8 = (Button)findViewById(R.id.d19_h8);
        d19_h8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "15-16"+"  "+editDate.getText().toString());
                i.putExtra("btn", "19_7_h8");
                startActivity(i);
            }
        });
        d19_h9 = (Button)findViewById(R.id.d19_h9);
        d19_h9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "16-17"+"  "+editDate.getText().toString());
                i.putExtra("btn", "19_7_h9");
                startActivity(i);
            }
        });

        //day20
        d20_h1 = (Button)findViewById(R.id.d20_h1);
        d20_h1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "8-9"+"  "+editDate.getText().toString());
                i.putExtra("btn", "20_7_h1");
                startActivity(i);
            }
        });
        d20_h2 = (Button)findViewById(R.id.d20_h2);
        d20_h2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "9-10"+"  "+editDate.getText().toString());
                i.putExtra("btn", "20_7_h2");
                startActivity(i);
            }
        });
        d20_h3 = (Button)findViewById(R.id.d20_h3);
        d20_h3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "10-11"+"  "+editDate.getText().toString());
                i.putExtra("btn", "20_7_h3");
                startActivity(i);
            }
        });
        d20_h4 = (Button)findViewById(R.id.d20_h4);
        d20_h4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "11-12"+"  "+editDate.getText().toString());
                i.putExtra("btn", "20_7_h4");
                startActivity(i);
            }
        });
        d20_h5 = (Button)findViewById(R.id.d20_h5);
        d20_h5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "12-13"+"  "+editDate.getText().toString());
                i.putExtra("btn", "20_7_h5");
                startActivity(i);
            }
        });
        d20_h6 = (Button)findViewById(R.id.d20_h6);
        d20_h6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "13-14"+"  "+editDate.getText().toString());
                i.putExtra("btn", "20_7_h6");
                startActivity(i);
            }
        });
        d20_h7 = (Button)findViewById(R.id.d1_h7);
        d20_h7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "14-15"+"  "+editDate.getText().toString());
                i.putExtra("btn", "20_7_h7");
                startActivity(i);
            }
        });
        d20_h8 = (Button)findViewById(R.id.d20_h8);
        d20_h8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "15-16"+"  "+editDate.getText().toString());
                i.putExtra("btn", "20_7_h8");
                startActivity(i);
            }
        });
        d20_h9 = (Button)findViewById(R.id.d20_h9);
        d20_h9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "16-17"+"  "+editDate.getText().toString());
                i.putExtra("btn", "20_7_h9");
                startActivity(i);
            }
        });

        //day21
        d21_h1 = (Button)findViewById(R.id.d21_h1);
        d21_h1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "8-9"+"  "+editDate.getText().toString());
                i.putExtra("btn", "21_7_h1");
                startActivity(i);
            }
        });
        d21_h2 = (Button)findViewById(R.id.d21_h2);
        d21_h2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "9-10"+"  "+editDate.getText().toString());
                i.putExtra("btn", "21_7_h2");
                startActivity(i);
            }
        });
        d21_h3 = (Button)findViewById(R.id.d21_h3);
        d21_h3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "10-11"+"  "+editDate.getText().toString());
                i.putExtra("btn", "21_7_h3");
                startActivity(i);
            }
        });
        d21_h4 = (Button)findViewById(R.id.d21_h4);
        d21_h4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "11-12"+"  "+editDate.getText().toString());
                i.putExtra("btn", "21_7_h4");
                startActivity(i);
            }
        });
        d21_h5 = (Button)findViewById(R.id.d21_h5);
        d21_h5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "12-13"+"  "+editDate.getText().toString());
                i.putExtra("btn", "21_7_h5");
                startActivity(i);
            }
        });
        d21_h6 = (Button)findViewById(R.id.d21_h6);
        d21_h6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "13-14"+"  "+editDate.getText().toString());
                i.putExtra("btn", "21_7_h6");
                startActivity(i);
            }
        });
        d21_h7 = (Button)findViewById(R.id.d21_h7);
        d21_h7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "14-15"+"  "+editDate.getText().toString());
                i.putExtra("btn", "21_7_h7");
                startActivity(i);
            }
        });
        d21_h8 = (Button)findViewById(R.id.d21_h8);
        d21_h8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "15-16"+"  "+editDate.getText().toString());
                i.putExtra("btn", "21_7_h8");
                startActivity(i);
            }
        });
        d21_h9 = (Button)findViewById(R.id.d21_h9);
        d21_h9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "16-17"+"  "+editDate.getText().toString());
                i.putExtra("btn", "21_7_h9");
                startActivity(i);
            }
        });
        //day22
        d22_h1 = (Button)findViewById(R.id.d22_h1);
        d22_h1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "8-9"+"  "+editDate.getText().toString());
                i.putExtra("btn", "22_7_h1");
                startActivity(i);
            }
        });
        d22_h2 = (Button)findViewById(R.id.d22_h2);
        d22_h2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "9-10"+"  "+editDate.getText().toString());
                i.putExtra("btn", "21_7_h2");
                startActivity(i);
            }
        });
        d22_h3 = (Button)findViewById(R.id.d22_h3);
        d22_h3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "10-11"+"  "+editDate.getText().toString());
                i.putExtra("btn", "21_7_h3");
                startActivity(i);
            }
        });
        d22_h4 = (Button)findViewById(R.id.d22_h4);
        d22_h4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "11-12"+"  "+editDate.getText().toString());
                i.putExtra("btn", "21_7_h4");
                startActivity(i);
            }
        });
        d22_h5 = (Button)findViewById(R.id.d22_h5);
        d22_h5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "12-13"+"  "+editDate.getText().toString());
                i.putExtra("btn", "21_7_h5");
                startActivity(i);
            }
        });
        d22_h6 = (Button)findViewById(R.id.d22_h6);
        d22_h6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "13-14"+"  "+editDate.getText().toString());
                i.putExtra("btn", "21_7_h6");
                startActivity(i);
            }
        });
        d22_h7 = (Button)findViewById(R.id.d22_h7);
        d22_h7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "14-15"+"  "+editDate.getText().toString());
                i.putExtra("btn", "21_7_h7");
                startActivity(i);
            }
        });
        d22_h8 = (Button)findViewById(R.id.d22_h8);
        d22_h8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "15-16"+"  "+editDate.getText().toString());
                i.putExtra("btn", "21_7_h8");
                startActivity(i);
            }
        });
        d22_h9 = (Button)findViewById(R.id.d22_h9);
        d22_h9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "16-17"+"  "+editDate.getText().toString());
                i.putExtra("btn", "21_7_h9");
                startActivity(i);
            }
        });
        //day23
        d23_h1 = (Button)findViewById(R.id.d23_h1);
        d23_h1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "8-9"+"  "+editDate.getText().toString());
                i.putExtra("btn", "23_7_h1");
                startActivity(i);
            }
        });
        d23_h2 = (Button)findViewById(R.id.d23_h2);
        d23_h2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "9-10"+"  "+editDate.getText().toString());
                i.putExtra("btn", "23_7_h2");
                startActivity(i);
            }
        });
        d23_h3 = (Button)findViewById(R.id.d23_h3);
        d23_h3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "10-11"+"  "+editDate.getText().toString());
                i.putExtra("btn", "23_7_h3");
                startActivity(i);
            }
        });
        d23_h4 = (Button)findViewById(R.id.d23_h4);
        d23_h4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "11-12"+"  "+editDate.getText().toString());
                i.putExtra("btn", "23_7_h4");
                startActivity(i);
            }
        });
        d23_h5 = (Button)findViewById(R.id.d23_h5);
        d23_h5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "12-13"+"  "+editDate.getText().toString());
                i.putExtra("btn", "23_7_h5");
                startActivity(i);
            }
        });
        d23_h6 = (Button)findViewById(R.id.d23_h6);
        d23_h6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "13-14"+"  "+editDate.getText().toString());
                i.putExtra("btn", "23_7_h6");
                startActivity(i);
            }
        });
        d23_h7 = (Button)findViewById(R.id.d23_h7);
        d23_h7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "14-15"+"  "+editDate.getText().toString());
                i.putExtra("btn", "23_7_h8");
                startActivity(i);
            }
        });
        d23_h8 = (Button)findViewById(R.id.d23_h8);
        d23_h8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "15-16"+"  "+editDate.getText().toString());
                i.putExtra("btn", "23_7_h8");
                startActivity(i);
            }
        });
        d23_h9 = (Button)findViewById(R.id.d23_h9);
        d23_h9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "16-17"+"  "+editDate.getText().toString());
                i.putExtra("btn", "23_7_h9");
                startActivity(i);
            }
        });
        //day24
        d24_h1 = (Button)findViewById(R.id.d24_h1);
        d24_h1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "8-9"+"  "+editDate.getText().toString());
                i.putExtra("btn", "24_7_h1");
                startActivity(i);
            }
        });
        d24_h2 = (Button)findViewById(R.id.d24_h2);
        d24_h2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "9-10"+"  "+editDate.getText().toString());
                i.putExtra("btn", "24_7_h2");
                startActivity(i);
            }
        });
        d24_h3 = (Button)findViewById(R.id.d24_h3);
        d24_h3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "10-11"+"  "+editDate.getText().toString());
                i.putExtra("btn", "24_7_h3");
                startActivity(i);
            }
        });
        d24_h4 = (Button)findViewById(R.id.d24_h4);
        d24_h4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "11-12"+"  "+editDate.getText().toString());
                i.putExtra("btn", "24_7_h4");
                startActivity(i);
            }
        });
        d24_h5 = (Button)findViewById(R.id.d24_h5);
        d24_h5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "12-13"+"  "+editDate.getText().toString());
                i.putExtra("btn", "24_7_h5");
                startActivity(i);
            }
        });
        d24_h6 = (Button)findViewById(R.id.d24_h6);
        d24_h6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "13-14"+"  "+editDate.getText().toString());
                i.putExtra("btn", "24_7_h6");
                startActivity(i);
            }
        });
        d24_h7 = (Button)findViewById(R.id.d24_h7);
        d24_h7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "14-15"+"  "+editDate.getText().toString());
                i.putExtra("btn", "24_7_h7");
                startActivity(i);
            }
        });
        d24_h8 = (Button)findViewById(R.id.d24_h8);
        d24_h8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "15-16"+"  "+editDate.getText().toString());
                i.putExtra("btn", "24_7_h8");
                startActivity(i);
            }
        });
        d24_h9 = (Button)findViewById(R.id.d24_h9);
        d24_h9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "16-17"+"  "+editDate.getText().toString());
                i.putExtra("btn", "24_7_h9");
                startActivity(i);
            }
        });
        //day25
        d25_h1 = (Button)findViewById(R.id.d25_h1);
        d25_h1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "8-9"+"  "+editDate.getText().toString());
                i.putExtra("btn", "25_7_h1");
                startActivity(i);
            }
        });
        d25_h2 = (Button)findViewById(R.id.d25_h2);
        d25_h2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "9-10"+"  "+editDate.getText().toString());
                i.putExtra("btn", "25_7_h2");
                startActivity(i);
            }
        });
        d25_h3 = (Button)findViewById(R.id.d25_h3);
        d25_h3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "10-11"+"  "+editDate.getText().toString());
                i.putExtra("btn", "25_7_h3");
                startActivity(i);
            }
        });
        d25_h4 = (Button)findViewById(R.id.d25_h4);
        d25_h4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "11-12"+"  "+editDate.getText().toString());
                i.putExtra("btn", "25_7_h4");
                startActivity(i);
            }
        });
        d25_h5 = (Button)findViewById(R.id.d25_h5);
        d25_h5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "12-13"+"  "+editDate.getText().toString());
                i.putExtra("btn", "25_7_h5");
                startActivity(i);
            }
        });
        d25_h6 = (Button)findViewById(R.id.d25_h6);
        d25_h6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "13-14"+"  "+editDate.getText().toString());
                i.putExtra("btn", "25_7_h6");
                startActivity(i);
            }
        });
        d25_h7 = (Button)findViewById(R.id.d25_h7);
        d25_h7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "14-15"+"  "+editDate.getText().toString());
                i.putExtra("btn", "25_7_h7");
                startActivity(i);
            }
        });
        d25_h8 = (Button)findViewById(R.id.d25_h8);
        d25_h8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "15-16"+"  "+editDate.getText().toString());
                i.putExtra("btn", "25_7_h8");
                startActivity(i);
            }
        });
        d25_h9 = (Button)findViewById(R.id.d25_h9);
        d25_h9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "16-17"+"  "+editDate.getText().toString());
                i.putExtra("btn", "25_7_h9");
                startActivity(i);
            }
        });
        //day26
        d26_h1 = (Button)findViewById(R.id.d26_h1);
        d26_h1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "8-9"+"  "+editDate.getText().toString());
                i.putExtra("btn", "26_7_h1");
                startActivity(i);
            }
        });
        d26_h2 = (Button)findViewById(R.id.d26_h2);
        d26_h2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "9-10"+"  "+editDate.getText().toString());
                i.putExtra("btn", "26_7_h2");
                startActivity(i);
            }
        });
        d26_h3 = (Button)findViewById(R.id.d26_h3);
        d26_h3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "10-11"+"  "+editDate.getText().toString());
                i.putExtra("btn", "26_7_h3");
                startActivity(i);
            }
        });
        d26_h4 = (Button)findViewById(R.id.d26_h4);
        d26_h4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "11-12"+"  "+editDate.getText().toString());
                i.putExtra("btn", "26_7_h4");
                startActivity(i);
            }
        });
        d26_h5 = (Button)findViewById(R.id.d26_h5);
        d26_h5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "12-13"+"  "+editDate.getText().toString());
                i.putExtra("btn", "26_7_h5");
                startActivity(i);
            }
        });
        d26_h6 = (Button)findViewById(R.id.d26_h6);
        d26_h6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "13-14"+"  "+editDate.getText().toString());
                i.putExtra("btn", "26_7_h6");
                startActivity(i);
            }
        });
        d26_h7 = (Button)findViewById(R.id.d26_h7);
        d26_h7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "14-15"+"  "+editDate.getText().toString());
                i.putExtra("btn", "26_7_h7");
                startActivity(i);
            }
        });
        d26_h8 = (Button)findViewById(R.id.d26_h8);
        d26_h8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("btn", "26_7_h8");
                i.putExtra("IntentKey", "15-16"+"  "+editDate.getText().toString());
                startActivity(i);
            }
        });
        d26_h9 = (Button)findViewById(R.id.d26_h9);
        d26_h9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("btn", "26_7_h9");
                i.putExtra("IntentKey", "16-17"+"  "+editDate.getText().toString());
                startActivity(i);
            }
        });
        //day27
        d27_h1 = (Button)findViewById(R.id.d27_h1);
        d27_h1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "8-9"+"  "+editDate.getText().toString());
                i.putExtra("btn", "27_7_h1");
                startActivity(i);
            }
        });
        d27_h2 = (Button)findViewById(R.id.d27_h2);
        d27_h2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "9-10"+"  "+editDate.getText().toString());
                i.putExtra("btn", "27_7_h2");
                startActivity(i);
            }
        });
        d27_h3 = (Button)findViewById(R.id.d27_h3);
        d27_h3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "10-11"+"  "+editDate.getText().toString());
                i.putExtra("btn", "27_7_h3");
                startActivity(i);
            }
        });
        d27_h4 = (Button)findViewById(R.id.d27_h4);
        d27_h4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "11-12"+"  "+editDate.getText().toString());
                i.putExtra("btn", "27_7_h4");
                startActivity(i);
            }
        });
        d27_h5 = (Button)findViewById(R.id.d27_h5);
        d27_h5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "12-13"+"  "+editDate.getText().toString());
                i.putExtra("btn", "27_7_h5");
                startActivity(i);
            }
        });
        d27_h6 = (Button)findViewById(R.id.d27_h6);
        d27_h6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "13-14"+"  "+editDate.getText().toString());
                i.putExtra("btn", "27_7_h6");
                startActivity(i);
            }
        });
        d27_h7 = (Button)findViewById(R.id.d27_h7);
        d27_h7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "14-15"+"  "+editDate.getText().toString());
                i.putExtra("btn", "27_7_h7");
                startActivity(i);
            }
        });
        d27_h8 = (Button)findViewById(R.id.d27_h8);
        d27_h8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "15-16"+"  "+editDate.getText().toString());
                i.putExtra("btn", "27_7_h8");
                startActivity(i);
            }
        });
        d27_h9 = (Button)findViewById(R.id.d27_h9);
        d27_h9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "16-17"+"  "+editDate.getText().toString());
                i.putExtra("btn", "27_7_h9");
                startActivity(i);
            }
        });
        //day28
        d28_h1 = (Button)findViewById(R.id.d28_h1);
        d28_h1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "8-9"+"  "+editDate.getText().toString());
                i.putExtra("btn", "28_7_h1");
                startActivity(i);
            }
        });
        d28_h2 = (Button)findViewById(R.id.d28_h2);
        d28_h2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "9-10"+"  "+editDate.getText().toString());
                i.putExtra("btn", "28_7_h2");
                startActivity(i);
            }
        });
        d28_h3 = (Button)findViewById(R.id.d28_h3);
        d28_h3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "10-11"+"  "+editDate.getText().toString());
                i.putExtra("btn", "28_7_h3");
                startActivity(i);
            }
        });
        d28_h4 = (Button)findViewById(R.id.d28_h4);
        d1_h4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "11-12"+"  "+editDate.getText().toString());
                i.putExtra("btn", "28_7_h4");
                startActivity(i);
            }
        });
        d28_h5 = (Button)findViewById(R.id.d28_h5);
        d28_h5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "12-13"+"  "+editDate.getText().toString());
                i.putExtra("btn", "28_7_h5");
                startActivity(i);
            }
        });
        d28_h6 = (Button)findViewById(R.id.d28_h6);
        d28_h6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "13-14"+"  "+editDate.getText().toString());
                i.putExtra("btn", "28_7_h6");
                startActivity(i);
            }
        });
        d28_h7 = (Button)findViewById(R.id.d28_h7);
        d28_h7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "14-15"+"  "+editDate.getText().toString());
                i.putExtra("btn", "28_7_h7");
                startActivity(i);
            }
        });
        d28_h8 = (Button)findViewById(R.id.d28_h8);
        d28_h8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "15-16"+"  "+editDate.getText().toString());
                i.putExtra("btn", "28_7_h8");
                startActivity(i);
            }
        });
        d28_h9 = (Button)findViewById(R.id.d28_h9);
        d28_h9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "16-17"+"  "+editDate.getText().toString());
                i.putExtra("btn", "28_7_h9");
                startActivity(i);
            }
        });
        //day29
        d29_h1 = (Button)findViewById(R.id.d29_h1);
        d29_h1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "8-9"+"  "+editDate.getText().toString());
                i.putExtra("btn", "29_7_h1");
                startActivity(i);
            }
        });
        d29_h2 = (Button)findViewById(R.id.d29_h2);
        d29_h2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "9-10"+"  "+editDate.getText().toString());
                i.putExtra("btn", "29_7_h2");
                startActivity(i);
            }
        });
        d29_h3 = (Button)findViewById(R.id.d29_h3);
        d29_h3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "10-11"+"  "+editDate.getText().toString());
                i.putExtra("btn", "29_7_h3");
                startActivity(i);
            }
        });
        d29_h4 = (Button)findViewById(R.id.d29_h4);
        d29_h4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "11-12"+"  "+editDate.getText().toString());
                i.putExtra("btn", "29_7_h4");
                startActivity(i);
            }
        });
        d29_h5 = (Button)findViewById(R.id.d29_h5);
        d29_h5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "12-13"+"  "+editDate.getText().toString());
                i.putExtra("btn", "29_7_h5");
                startActivity(i);
            }
        });
        d29_h6 = (Button)findViewById(R.id.d29_h6);
        d29_h6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "13-14"+"  "+editDate.getText().toString());
                i.putExtra("btn", "29_7_h6");
                startActivity(i);
            }
        });
        d29_h7 = (Button)findViewById(R.id.d29_h7);
        d29_h7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "14-15"+"  "+editDate.getText().toString());
                i.putExtra("btn", "29_7_h7");
                startActivity(i);
            }
        });
        d29_h8 = (Button)findViewById(R.id.d29_h8);
        d29_h8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "15-16"+"  "+editDate.getText().toString());
                i.putExtra("btn", "29_7_h8");
                startActivity(i);
            }
        });
        d29_h9 = (Button)findViewById(R.id.d29_h9);
        d29_h9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "16-17"+"  "+editDate.getText().toString());
                i.putExtra("btn", "29_7_h9");
                startActivity(i);
            }
        });
        //day30
        d30_h1 = (Button)findViewById(R.id.d30_h1);
        d30_h1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "8-9"+"  "+editDate.getText().toString());
                i.putExtra("btn", "30_7_h1");
                startActivity(i);
            }
        });
        d30_h2 = (Button)findViewById(R.id.d30_h2);
        d30_h2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "9-10"+"  "+editDate.getText().toString());
                i.putExtra("btn", "30_7_h2");
                startActivity(i);
            }
        });
        d30_h3 = (Button)findViewById(R.id.d30_h3);
        d30_h3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "10-11"+"  "+editDate.getText().toString());
                i.putExtra("btn", "30_7_h3");
                startActivity(i);
            }
        });
        d30_h4 = (Button)findViewById(R.id.d30_h4);
        d30_h4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "11-12"+"  "+editDate.getText().toString());
                i.putExtra("btn", "30_7_h4");
                startActivity(i);
            }
        });
        d30_h5 = (Button)findViewById(R.id.d30_h5);
        d30_h5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "12-13"+"  "+editDate.getText().toString());
                i.putExtra("btn", "30_7_h5");
                startActivity(i);
            }
        });
        d30_h6 = (Button)findViewById(R.id.d30_h6);
        d30_h6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "13-14"+"  "+editDate.getText().toString());
                i.putExtra("btn", "30_7_h6");
                startActivity(i);
            }
        });
        d30_h7 = (Button)findViewById(R.id.d30_h7);
        d30_h7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "14-15"+"  "+editDate.getText().toString());
                i.putExtra("btn", "30_7_h7");
                startActivity(i);
            }
        });
        d30_h8 = (Button)findViewById(R.id.d30_h8);
        d30_h8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "15-16"+"  "+editDate.getText().toString());
                i.putExtra("btn", "30_7_h8");
                startActivity(i);
            }
        });
        d30_h9 = (Button)findViewById(R.id.d30_h9);
        d30_h9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "16-17"+"  "+editDate.getText().toString());
                i.putExtra("btn", "30_7_h9");
                startActivity(i);
            }
        });
        //day31
        d31_h1 = (Button)findViewById(R.id.d31_h1);
        d31_h1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "8-9"+"  "+editDate.getText().toString());
                i.putExtra("btn", "31_7_h1");
                startActivity(i);
            }
        });
        d31_h2 = (Button)findViewById(R.id.d31_h2);
        d31_h2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "9-10"+"  "+editDate.getText().toString());
                i.putExtra("btn", "31_7_h2");
                startActivity(i);
            }
        });
        d31_h3 = (Button)findViewById(R.id.d31_h3);
        d31_h3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "10-11"+"  "+editDate.getText().toString());
                i.putExtra("btn", "31_7_h3");
                startActivity(i);
            }
        });
        d31_h4 = (Button)findViewById(R.id.d31_h4);
        d31_h4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "11-12"+"  "+editDate.getText().toString());
                i.putExtra("btn", "31_7_h4");
                startActivity(i);
            }
        });
        d31_h5 = (Button)findViewById(R.id.d31_h5);
        d31_h5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "12-13"+"  "+editDate.getText().toString());
                i.putExtra("btn", "31_7_h5");
                startActivity(i);
            }
        });
        d31_h6 = (Button)findViewById(R.id.d31_h6);
        d31_h6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "13-14"+"  "+editDate.getText().toString());
                i.putExtra("btn", "31_7_h6");
                startActivity(i);
            }
        });
        d31_h7 = (Button)findViewById(R.id.d31_h7);
        d31_h7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "14-15"+"  "+editDate.getText().toString());
                i.putExtra("btn", "31_7_h7");
                startActivity(i);
            }
        });
        d31_h8 = (Button)findViewById(R.id.d31_h8);
        d31_h8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "15-16"+"  "+editDate.getText().toString());
                i.putExtra("btn", "31_7_h8");
                startActivity(i);
            }
        });
        d31_h9 = (Button)findViewById(R.id.d31_h9);
        d31_h9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ClientRDVm2Activity.this, CommandeActivity.class);
                i.putExtra("IntentKey", "16-17"+"  "+editDate.getText().toString());
                i.putExtra("btn", "31_7_h9");
                startActivity(i);
            }
        });





        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////
        m1_7_h1_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d1_h1.setEnabled(false);
                        d1_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d1_7_h1.setEnabled(false);
                        d1_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d1_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d1_7_h1.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m1_7_h2_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d1_7_h2.setEnabled(false);
                        d1_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d1_7_h2.setEnabled(false);
                        d1_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d1_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d1_7_h2.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m1_7_h3_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d1_7_h3.setEnabled(false);
                        d1_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d1_7_h3.setEnabled(false);
                        d1_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d1_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d1_7_h3.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m1_7_h4_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d1_7_h4.setEnabled(false);
                        d1_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d1_7_h4.setEnabled(false);
                        d1_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d1_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d1_7_h4.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m1_7_h5_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d1_7_h5.setEnabled(false);
                        d1_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d1_7_h5.setEnabled(false);
                        d1_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d1_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d1_7_h5.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m1_7_h6_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d1_7_h6.setEnabled(false);
                        d1_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d1_7_h6.setEnabled(false);
                        d1_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d1_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d1_7_h6.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m1_7_h7_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d1_7_h7.setEnabled(false);
                        d1_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d1_7_h7.setEnabled(false);
                        d1_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d1_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d1_7_h7.setEnabled(true);
                    }
                }

            }


            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m1_7_h8_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d1_7_h8.setEnabled(false);
                        d1_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d1_7_h8.setEnabled(false);
                        d1_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d1_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d1_7_h8.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m1_7_h9_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d1_7_h9.setEnabled(false);
                        d1_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d1_7_h9.setEnabled(false);
                        d1_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d1_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d1_7_h9.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        /////////////////////////////////////////////////////////////
        m2_7_h1_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d2_7_h1.setEnabled(false);
                        d2_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d2_7_h1.setEnabled(false);
                        d2_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d2_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d2_7_h1.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m2_7_h2_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d2_7_h2.setEnabled(false);
                        d2_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d2_7_h2.setEnabled(false);
                        d2_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d2_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d2_7_h2.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m2_7_h3_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d2_7_h3.setEnabled(false);
                        d2_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d2_7_h3.setEnabled(false);
                        d2_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d2_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d2_7_h3.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m2_7_h4_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d2_7_h4.setEnabled(false);
                        d2_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d2_7_h4.setEnabled(false);
                        d2_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d2_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d2_7_h4.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m2_7_h5_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d2_7_h5.setEnabled(false);
                        d2_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d2_7_h5.setEnabled(false);
                        d2_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d2_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d2_7_h5.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m2_7_h6_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d2_7_h6.setEnabled(false);
                        d2_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d2_7_h6.setEnabled(false);
                        d2_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d2_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d2_7_h6.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m2_7_h7_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d2_7_h7.setEnabled(false);
                        d2_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d2_7_h7.setEnabled(false);
                        d2_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d2_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d2_7_h7.setEnabled(true);
                    }
                }

            }


            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m2_7_h8_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d2_7_h8.setEnabled(false);
                        d2_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d2_7_h8.setEnabled(false);
                        d2_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d2_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d2_7_h8.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m2_7_h9_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d2_7_h9.setEnabled(false);
                        d2_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d2_7_h9.setEnabled(false);
                        d2_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d2_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d2_7_h9.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        /////////////////////////////////////////////////////////////
        m3_7_h1_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d3_7_h1.setEnabled(false);
                        d3_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d3_7_h1.setEnabled(false);
                        d3_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d3_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d3_7_h1.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m3_7_h2_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d3_7_h2.setEnabled(false);
                        d3_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d3_7_h2.setEnabled(false);
                        d3_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d3_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d3_7_h2.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m3_7_h3_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d3_7_h3.setEnabled(false);
                        d3_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d3_7_h3.setEnabled(false);
                        d3_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d3_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d3_7_h3.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m3_7_h4_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d3_7_h4.setEnabled(false);
                        d3_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d3_7_h4.setEnabled(false);
                        d3_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d3_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d3_7_h4.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m3_7_h5_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d3_7_h5.setEnabled(false);
                        d3_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d3_7_h5.setEnabled(false);
                        d3_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d3_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d3_7_h5.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m3_7_h6_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d3_7_h6.setEnabled(false);
                        d3_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d3_7_h6.setEnabled(false);
                        d3_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d3_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d3_7_h6.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m3_7_h7_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d3_7_h7.setEnabled(false);
                        d3_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d3_7_h7.setEnabled(false);
                        d3_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d3_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d3_7_h7.setEnabled(true);
                    }
                }

            }


            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m3_7_h8_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d3_7_h8.setEnabled(false);
                        d3_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d3_7_h8.setEnabled(false);
                        d3_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d3_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d3_7_h8.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m3_7_h9_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d3_7_h9.setEnabled(false);
                        d3_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d3_7_h9.setEnabled(false);
                        d3_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d3_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d3_7_h9.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        /////////////////////////////////////////////////////////////
        m4_7_h1_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d4_7_h1.setEnabled(false);
                        d4_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d4_7_h1.setEnabled(false);
                        d4_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d4_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d4_7_h1.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m4_7_h2_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d4_7_h2.setEnabled(false);
                        d4_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d4_7_h2.setEnabled(false);
                        d4_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d4_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d4_7_h2.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m4_7_h3_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d4_7_h3.setEnabled(false);
                        d4_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d4_7_h3.setEnabled(false);
                        d4_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d4_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d4_7_h3.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m4_7_h4_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d4_7_h4.setEnabled(false);
                        d4_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d4_7_h4.setEnabled(false);
                        d4_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d4_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d4_7_h4.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m4_7_h5_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d4_7_h5.setEnabled(false);
                        d4_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d4_7_h5.setEnabled(false);
                        d4_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d4_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d4_7_h5.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m4_7_h6_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d4_7_h6.setEnabled(false);
                        d4_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d4_7_h6.setEnabled(false);
                        d4_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d4_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d4_7_h6.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m4_7_h7_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d4_7_h7.setEnabled(false);
                        d4_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d4_7_h7.setEnabled(false);
                        d4_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d4_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d4_7_h7.setEnabled(true);
                    }
                }

            }


            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m4_7_h8_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d4_7_h8.setEnabled(false);
                        d4_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d4_7_h8.setEnabled(false);
                        d4_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d4_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d4_7_h8.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m4_7_h9_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d4_7_h9.setEnabled(false);
                        d4_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d4_7_h9.setEnabled(false);
                        d4_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d4_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d4_7_h9.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        /////////////////////////////////////////////////////////////
        m5_7_h1_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d5_7_h1.setEnabled(false);
                        d5_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d5_7_h1.setEnabled(false);
                        d5_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d5_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d5_7_h1.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m5_7_h2_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d5_7_h2.setEnabled(false);
                        d5_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d5_7_h2.setEnabled(false);
                        d5_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d5_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d5_7_h2.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m5_7_h3_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d5_7_h3.setEnabled(false);
                        d5_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d5_7_h3.setEnabled(false);
                        d5_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d5_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d5_7_h3.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m5_7_h4_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d5_7_h4.setEnabled(false);
                        d5_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d5_7_h4.setEnabled(false);
                        d5_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d5_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d5_7_h4.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m5_7_h5_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d5_7_h5.setEnabled(false);
                        d5_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d5_7_h5.setEnabled(false);
                        d5_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d5_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d5_7_h5.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m5_7_h6_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d5_7_h6.setEnabled(false);
                        d5_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d5_7_h6.setEnabled(false);
                        d5_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d5_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d5_7_h6.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m5_7_h7_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d5_7_h7.setEnabled(false);
                        d5_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d5_7_h7.setEnabled(false);
                        d5_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d5_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d5_7_h7.setEnabled(true);
                    }
                }

            }


            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m5_7_h8_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d5_7_h8.setEnabled(false);
                        d5_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d5_7_h8.setEnabled(false);
                        d5_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d5_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d5_7_h8.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m5_7_h9_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d5_7_h9.setEnabled(false);
                        d5_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d5_7_h9.setEnabled(false);
                        d5_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d5_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d5_7_h9.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        /////////////////////////////////////////////////////////////
        m6_7_h1_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d6_7_h1.setEnabled(false);
                        d6_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d6_7_h1.setEnabled(false);
                        d6_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d6_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d6_7_h1.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m6_7_h2_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d6_7_h2.setEnabled(false);
                        d6_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d6_7_h2.setEnabled(false);
                        d6_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d6_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d6_7_h2.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m6_7_h3_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d6_7_h3.setEnabled(false);
                        d6_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d6_7_h3.setEnabled(false);
                        d6_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d6_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d6_7_h3.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m6_7_h4_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d6_7_h4.setEnabled(false);
                        d6_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d6_7_h4.setEnabled(false);
                        d6_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d6_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d6_7_h4.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m6_7_h5_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d6_7_h5.setEnabled(false);
                        d6_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d6_7_h5.setEnabled(false);
                        d6_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d6_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d6_7_h5.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m6_7_h6_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d6_7_h6.setEnabled(false);
                        d6_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d6_7_h6.setEnabled(false);
                        d6_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d6_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d6_7_h6.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m6_7_h7_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d6_7_h7.setEnabled(false);
                        d6_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d6_7_h7.setEnabled(false);
                        d6_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d6_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d6_7_h7.setEnabled(true);
                    }
                }

            }


            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m6_7_h8_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d6_7_h8.setEnabled(false);
                        d6_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d6_7_h8.setEnabled(false);
                        d6_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d6_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d6_7_h8.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m16_7_h9_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d16_7_h9.setEnabled(false);
                        d16_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d16_7_h9.setEnabled(false);
                        d16_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d16_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d16_7_h9.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        /////////////////////////////////////////////////////////////
        m7_7_h1_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d7_7_h1.setEnabled(false);
                        d7_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d7_7_h1.setEnabled(false);
                        d7_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d7_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d7_7_h1.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m7_7_h2_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d7_7_h2.setEnabled(false);
                        d7_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d7_7_h2.setEnabled(false);
                        d7_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d7_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d7_7_h2.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m7_7_h3_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d7_7_h3.setEnabled(false);
                        d7_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d7_7_h3.setEnabled(false);
                        d7_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d7_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d7_7_h3.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m7_7_h4_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d7_7_h4.setEnabled(false);
                        d7_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d7_7_h4.setEnabled(false);
                        d7_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d7_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d7_7_h4.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m7_7_h5_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d7_7_h5.setEnabled(false);
                        d7_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d7_7_h5.setEnabled(false);
                        d7_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d7_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d7_7_h5.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m7_7_h6_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d7_7_h6.setEnabled(false);
                        d7_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d7_7_h6.setEnabled(false);
                        d7_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d7_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d7_7_h6.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m7_7_h7_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d7_7_h7.setEnabled(false);
                        d7_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d7_7_h7.setEnabled(false);
                        d7_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d7_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d7_7_h7.setEnabled(true);
                    }
                }

            }


            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m7_7_h8_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d7_7_h8.setEnabled(false);
                        d7_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d7_7_h8.setEnabled(false);
                        d7_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d7_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d7_7_h8.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m7_7_h9_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d7_7_h9.setEnabled(false);
                        d7_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d7_7_h9.setEnabled(false);
                        d7_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d7_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d7_7_h9.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        /////////////////////////////////////////////////////////////
        m8_7_h1_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d7_7_h1.setEnabled(false);
                        d7_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d7_7_h1.setEnabled(false);
                        d7_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d7_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d7_7_h1.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m8_7_h2_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d7_7_h2.setEnabled(false);
                        d7_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d7_7_h2.setEnabled(false);
                        d7_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d7_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d7_7_h2.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m8_7_h3_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d7_7_h3.setEnabled(false);
                        d7_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d7_7_h3.setEnabled(false);
                        d7_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d7_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d7_7_h3.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m8_7_h4_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d7_7_h4.setEnabled(false);
                        d7_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d7_7_h4.setEnabled(false);
                        d7_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d7_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d7_7_h4.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m8_7_h5_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d7_7_h5.setEnabled(false);
                        d7_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d7_7_h5.setEnabled(false);
                        d7_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d7_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d7_7_h5.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m8_7_h6_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d7_7_h6.setEnabled(false);
                        d7_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d7_7_h6.setEnabled(false);
                        d7_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d7_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d7_7_h6.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m8_7_h7_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d7_7_h7.setEnabled(false);
                        d7_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d7_7_h7.setEnabled(false);
                        d7_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d7_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d7_7_h7.setEnabled(true);
                    }
                }

            }


            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m8_7_h8_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d7_7_h8.setEnabled(false);
                        d7_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d7_7_h8.setEnabled(false);
                        d7_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d7_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d7_7_h8.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m8_7_h9_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d7_7_h9.setEnabled(false);
                        d7_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d7_7_h9.setEnabled(false);
                        d7_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d7_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d7_7_h9.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        /////////////////////////////////////////////////////////////
        m9_7_h1_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d9_7_h1.setEnabled(false);
                        d9_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d9_7_h1.setEnabled(false);
                        d9_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d9_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d9_7_h1.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m9_7_h2_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d9_7_h2.setEnabled(false);
                        d9_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d9_7_h2.setEnabled(false);
                        d9_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d9_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d9_7_h2.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m9_7_h3_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d9_7_h3.setEnabled(false);
                        d9_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d9_7_h3.setEnabled(false);
                        d9_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d9_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d9_7_h3.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m9_7_h4_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d9_7_h4.setEnabled(false);
                        d9_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d9_7_h4.setEnabled(false);
                        d9_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d9_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d9_7_h4.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m9_7_h5_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d9_7_h5.setEnabled(false);
                        d9_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d9_7_h5.setEnabled(false);
                        d9_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d9_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d9_7_h5.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m9_7_h6_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d9_7_h6.setEnabled(false);
                        d9_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d9_7_h6.setEnabled(false);
                        d9_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d9_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d9_7_h6.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m9_7_h7_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d9_7_h7.setEnabled(false);
                        d9_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d9_7_h7.setEnabled(false);
                        d9_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d9_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d9_7_h7.setEnabled(true);
                    }
                }

            }


            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m9_7_h8_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d9_7_h8.setEnabled(false);
                        d9_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d9_7_h8.setEnabled(false);
                        d9_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d9_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d9_7_h8.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m9_7_h9_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d9_7_h9.setEnabled(false);
                        d9_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d9_7_h9.setEnabled(false);
                        d9_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d9_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d9_7_h9.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        /////////////////////////////////////////////////////////////
        m10_7_h1_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d10_7_h1.setEnabled(false);
                        d10_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d10_7_h1.setEnabled(false);
                        d10_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d10_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d10_7_h1.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m10_7_h2_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d10_7_h2.setEnabled(false);
                        d10_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d10_7_h2.setEnabled(false);
                        d10_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d10_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d10_7_h2.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m10_7_h3_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d10_7_h3.setEnabled(false);
                        d10_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d10_7_h3.setEnabled(false);
                        d10_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d10_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d10_7_h3.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m10_7_h4_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d10_7_h4.setEnabled(false);
                        d10_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d10_7_h4.setEnabled(false);
                        d10_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d10_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d10_7_h4.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m10_7_h5_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d10_7_h5.setEnabled(false);
                        d10_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d10_7_h5.setEnabled(false);
                        d10_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d10_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d10_7_h5.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m10_7_h6_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d10_7_h6.setEnabled(false);
                        d10_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d10_7_h6.setEnabled(false);
                        d10_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d10_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d10_7_h6.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m10_7_h7_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d10_7_h7.setEnabled(false);
                        d10_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d10_7_h7.setEnabled(false);
                        d10_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d10_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d10_7_h7.setEnabled(true);
                    }
                }

            }


            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m10_7_h8_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d10_7_h8.setEnabled(false);
                        d10_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d10_7_h8.setEnabled(false);
                        d10_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d10_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d10_7_h8.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m10_7_h9_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d10_7_h9.setEnabled(false);
                        d10_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d10_7_h9.setEnabled(false);
                        d10_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d10_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d10_7_h9.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        /////////////////////////////////////////////////////////////
        m11_7_h1_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d11_7_h1.setEnabled(false);
                        d11_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d11_7_h1.setEnabled(false);
                        d11_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d11_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d11_7_h1.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m11_7_h2_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d11_7_h2.setEnabled(false);
                        d11_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d11_7_h2.setEnabled(false);
                        d11_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d11_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d11_7_h2.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m11_7_h3_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d11_7_h3.setEnabled(false);
                        d11_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d11_7_h3.setEnabled(false);
                        d11_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d11_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d11_7_h3.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m11_7_h4_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d11_7_h4.setEnabled(false);
                        d11_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d11_7_h4.setEnabled(false);
                        d11_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d11_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d11_7_h4.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m11_7_h5_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d11_7_h5.setEnabled(false);
                        d11_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d11_7_h5.setEnabled(false);
                        d11_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d11_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d11_7_h5.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m11_7_h6_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d11_7_h6.setEnabled(false);
                        d11_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d11_7_h6.setEnabled(false);
                        d11_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d11_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d11_7_h6.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m11_7_h7_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d11_7_h7.setEnabled(false);
                        d11_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d11_7_h7.setEnabled(false);
                        d11_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d11_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d11_7_h7.setEnabled(true);
                    }
                }

            }


            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m11_7_h8_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d11_7_h8.setEnabled(false);
                        d11_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d11_7_h8.setEnabled(false);
                        d11_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d11_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d11_7_h8.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m11_7_h9_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d11_7_h9.setEnabled(false);
                        d11_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d11_7_h9.setEnabled(false);
                        d11_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d11_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d11_7_h9.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        /////////////////////////////////////////////////////////////
        m12_7_h1_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d12_7_h1.setEnabled(false);
                        d12_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d12_7_h1.setEnabled(false);
                        d12_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d12_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d12_7_h1.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m12_7_h2_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d12_7_h2.setEnabled(false);
                        d12_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d12_7_h2.setEnabled(false);
                        d12_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d12_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d12_7_h2.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m12_7_h3_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d12_7_h3.setEnabled(false);
                        d12_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d12_7_h3.setEnabled(false);
                        d12_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d12_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d12_7_h3.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m12_7_h4_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d12_7_h4.setEnabled(false);
                        d12_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d12_7_h4.setEnabled(false);
                        d12_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d12_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d12_7_h4.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m12_7_h5_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d12_7_h5.setEnabled(false);
                        d12_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d12_7_h5.setEnabled(false);
                        d12_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d12_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d12_7_h5.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m12_7_h6_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d12_7_h6.setEnabled(false);
                        d12_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d12_7_h6.setEnabled(false);
                        d12_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d12_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d12_7_h6.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m12_7_h7_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d12_7_h7.setEnabled(false);
                        d12_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d12_7_h7.setEnabled(false);
                        d12_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d12_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d12_7_h7.setEnabled(true);
                    }
                }

            }


            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m12_7_h8_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d12_7_h8.setEnabled(false);
                        d12_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d12_7_h8.setEnabled(false);
                        d12_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d12_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d12_7_h8.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m12_7_h9_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d12_7_h9.setEnabled(false);
                        d12_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d12_7_h9.setEnabled(false);
                        d12_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d12_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d12_7_h9.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        /////////////////////////////////////////////////////////////
        m13_7_h1_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d13_7_h1.setEnabled(false);
                        d13_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d13_7_h1.setEnabled(false);
                        d13_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d13_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d13_7_h1.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m13_7_h2_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d13_7_h2.setEnabled(false);
                        d13_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d13_7_h2.setEnabled(false);
                        d13_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d13_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d13_7_h2.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m13_7_h3_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d13_7_h3.setEnabled(false);
                        d13_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d13_7_h3.setEnabled(false);
                        d13_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d13_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d13_7_h3.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m13_7_h4_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d13_7_h4.setEnabled(false);
                        d13_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d13_7_h4.setEnabled(false);
                        d13_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d13_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d13_7_h4.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m13_7_h5_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d13_7_h5.setEnabled(false);
                        d13_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d13_7_h5.setEnabled(false);
                        d13_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d13_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d13_7_h5.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m13_7_h6_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d13_7_h6.setEnabled(false);
                        d13_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d13_7_h6.setEnabled(false);
                        d13_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d13_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d13_7_h6.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m13_7_h7_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d13_7_h7.setEnabled(false);
                        d13_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d13_7_h7.setEnabled(false);
                        d13_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d13_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d13_7_h7.setEnabled(true);
                    }
                }

            }


            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m13_7_h8_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d13_7_h8.setEnabled(false);
                        d13_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d13_7_h8.setEnabled(false);
                        d13_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d13_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d13_7_h8.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m13_7_h9_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d13_7_h9.setEnabled(false);
                        d13_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d13_7_h9.setEnabled(false);
                        d13_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d13_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d13_7_h9.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        /////////////////////////////////////////////////////////////
        m14_7_h1_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d14_7_h1.setEnabled(false);
                        d14_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d14_7_h1.setEnabled(false);
                        d14_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d14_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d14_7_h1.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m14_7_h2_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d14_7_h2.setEnabled(false);
                        d14_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d14_7_h2.setEnabled(false);
                        d14_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d14_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d14_7_h2.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m14_7_h3_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d14_7_h3.setEnabled(false);
                        d14_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d14_7_h3.setEnabled(false);
                        d14_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d14_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d14_7_h3.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m14_7_h4_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d14_7_h4.setEnabled(false);
                        d14_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d14_7_h4.setEnabled(false);
                        d14_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d14_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d14_7_h4.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m14_7_h5_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d14_7_h5.setEnabled(false);
                        d14_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d14_7_h5.setEnabled(false);
                        d14_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d14_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d14_7_h5.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m14_7_h6_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d14_7_h6.setEnabled(false);
                        d14_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d14_7_h6.setEnabled(false);
                        d14_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d14_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d14_7_h6.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m14_7_h7_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d14_7_h7.setEnabled(false);
                        d14_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d14_7_h7.setEnabled(false);
                        d14_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d14_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d14_7_h7.setEnabled(true);
                    }
                }

            }


            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m14_7_h8_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d14_7_h8.setEnabled(false);
                        d14_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d14_7_h8.setEnabled(false);
                        d14_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d14_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d14_7_h8.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m14_7_h9_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d14_7_h9.setEnabled(false);
                        d14_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d14_7_h9.setEnabled(false);
                        d14_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d14_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d14_7_h9.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        /////////////////////////////////////////////////////////////
        m15_7_h1_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d15_7_h1.setEnabled(false);
                        d15_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d15_7_h1.setEnabled(false);
                        d15_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d15_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d15_7_h1.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m15_7_h2_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d15_7_h2.setEnabled(false);
                        d15_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d15_7_h2.setEnabled(false);
                        d15_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d15_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d15_7_h2.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m15_7_h3_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d15_7_h3.setEnabled(false);
                        d15_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d15_7_h3.setEnabled(false);
                        d15_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d15_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d15_7_h3.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m15_7_h4_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d15_7_h4.setEnabled(false);
                        d15_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d15_7_h4.setEnabled(false);
                        d15_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d15_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d15_7_h4.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m15_7_h5_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d15_7_h5.setEnabled(false);
                        d15_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d15_7_h5.setEnabled(false);
                        d15_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d15_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d15_7_h5.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m15_7_h6_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d15_7_h6.setEnabled(false);
                        d15_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d15_7_h6.setEnabled(false);
                        d15_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d15_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d15_7_h6.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m15_7_h7_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d15_7_h7.setEnabled(false);
                        d15_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d15_7_h7.setEnabled(false);
                        d15_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d15_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d15_7_h7.setEnabled(true);
                    }
                }

            }


            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m15_7_h8_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d15_7_h8.setEnabled(false);
                        d15_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d15_7_h8.setEnabled(false);
                        d15_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d15_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d15_7_h8.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m15_7_h9_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d15_7_h9.setEnabled(false);
                        d15_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d15_7_h9.setEnabled(false);
                        d15_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d15_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d15_7_h9.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        /////////////////////////////////////////////////////////////
        m16_7_h1_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d16_7_h1.setEnabled(false);
                        d16_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d16_7_h1.setEnabled(false);
                        d16_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d16_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d16_7_h1.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m16_7_h2_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d16_7_h2.setEnabled(false);
                        d16_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d16_7_h2.setEnabled(false);
                        d16_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d16_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d16_7_h2.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m16_7_h3_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d16_7_h3.setEnabled(false);
                        d16_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d16_7_h3.setEnabled(false);
                        d16_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d16_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d16_7_h3.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m16_7_h4_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d16_7_h4.setEnabled(false);
                        d16_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d16_7_h4.setEnabled(false);
                        d16_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d16_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d16_7_h4.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m16_7_h5_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d16_7_h5.setEnabled(false);
                        d16_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d16_7_h5.setEnabled(false);
                        d16_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d16_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d16_7_h5.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m16_7_h6_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d16_7_h6.setEnabled(false);
                        d16_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d16_7_h6.setEnabled(false);
                        d16_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d16_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d16_7_h6.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m1_7_h7_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d1_7_h7.setEnabled(false);
                        d1_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d1_7_h7.setEnabled(false);
                        d1_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d1_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d1_7_h7.setEnabled(true);
                    }
                }

            }


            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m16_7_h8_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d16_7_h8.setEnabled(false);
                        d16_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d16_7_h8.setEnabled(false);
                        d16_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d16_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d16_7_h8.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m16_7_h9_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d16_7_h9.setEnabled(false);
                        d16_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d16_7_h9.setEnabled(false);
                        d16_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d16_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d16_7_h9.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        /////////////////////////////////////////////////////////////
        m17_7_h1_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d17_7_h1.setEnabled(false);
                        d17_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d17_7_h1.setEnabled(false);
                        d17_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d17_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d17_7_h1.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m17_7_h2_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d17_7_h2.setEnabled(false);
                        d17_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d17_7_h2.setEnabled(false);
                        d17_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d17_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d17_7_h2.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m17_7_h3_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d17_7_h3.setEnabled(false);
                        d17_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d17_7_h3.setEnabled(false);
                        d17_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d17_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d17_7_h3.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m17_7_h4_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d17_7_h4.setEnabled(false);
                        d17_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d17_7_h4.setEnabled(false);
                        d17_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d17_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d17_7_h4.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m17_7_h5_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d17_7_h5.setEnabled(false);
                        d17_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d17_7_h5.setEnabled(false);
                        d17_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d17_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d17_7_h5.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m17_7_h6_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d17_7_h6.setEnabled(false);
                        d17_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d17_7_h6.setEnabled(false);
                        d17_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d17_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d17_7_h6.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m17_7_h7_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d17_7_h7.setEnabled(false);
                        d17_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d17_7_h7.setEnabled(false);
                        d17_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d17_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d17_7_h7.setEnabled(true);
                    }
                }

            }


            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m17_7_h8_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d17_7_h8.setEnabled(false);
                        d17_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d17_7_h8.setEnabled(false);
                        d17_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d17_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d17_7_h8.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m17_7_h9_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d17_7_h9.setEnabled(false);
                        d17_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d17_7_h9.setEnabled(false);
                        d17_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d17_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d17_7_h9.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        /////////////////////////////////////////////////////////////
        m17_7_h1_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d17_7_h1.setEnabled(false);
                        d17_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d17_7_h1.setEnabled(false);
                        d17_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d17_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d17_7_h1.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m17_7_h2_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d17_7_h2.setEnabled(false);
                        d17_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d17_7_h2.setEnabled(false);
                        d17_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d17_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d17_7_h2.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m17_7_h3_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d17_7_h3.setEnabled(false);
                        d17_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d17_7_h3.setEnabled(false);
                        d17_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d17_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d17_7_h3.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m17_7_h4_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d17_7_h4.setEnabled(false);
                        d17_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d17_7_h4.setEnabled(false);
                        d17_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d17_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d17_7_h4.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m17_7_h5_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d17_7_h5.setEnabled(false);
                        d17_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d17_7_h5.setEnabled(false);
                        d17_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d17_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d17_7_h5.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m17_7_h6_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d17_7_h6.setEnabled(false);
                        d17_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d17_7_h6.setEnabled(false);
                        d17_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d17_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d17_7_h6.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m17_7_h7_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d17_7_h7.setEnabled(false);
                        d17_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d17_7_h7.setEnabled(false);
                        d17_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d17_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d17_7_h7.setEnabled(true);
                    }
                }

            }


            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m17_7_h8_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d17_7_h8.setEnabled(false);
                        d17_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d17_7_h8.setEnabled(false);
                        d17_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d17_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d17_7_h8.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m17_7_h9_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d17_7_h9.setEnabled(false);
                        d17_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d17_7_h9.setEnabled(false);
                        d17_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d17_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d17_7_h9.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        /////////////////////////////////////////////////////////////
        m18_7_h1_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d18_7_h1.setEnabled(false);
                        d18_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d18_7_h1.setEnabled(false);
                        d18_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d18_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d18_7_h1.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m18_7_h2_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d18_7_h2.setEnabled(false);
                        d18_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d18_7_h2.setEnabled(false);
                        d18_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d18_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d18_7_h2.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m18_7_h3_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d18_7_h3.setEnabled(false);
                        d18_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d18_7_h3.setEnabled(false);
                        d18_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d18_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d18_7_h3.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m18_7_h4_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d18_7_h4.setEnabled(false);
                        d18_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d18_7_h4.setEnabled(false);
                        d18_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d18_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d18_7_h4.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m18_7_h5_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d18_7_h5.setEnabled(false);
                        d18_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d18_7_h5.setEnabled(false);
                        d18_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d18_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d18_7_h5.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m18_7_h6_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d18_7_h6.setEnabled(false);
                        d18_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d18_7_h6.setEnabled(false);
                        d18_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d18_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d18_7_h6.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m18_7_h7_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d18_7_h7.setEnabled(false);
                        d18_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d18_7_h7.setEnabled(false);
                        d18_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d18_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d18_7_h7.setEnabled(true);
                    }
                }

            }


            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m18_7_h8_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d18_7_h8.setEnabled(false);
                        d18_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d18_7_h8.setEnabled(false);
                        d18_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d18_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d18_7_h8.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m18_7_h9_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d18_7_h9.setEnabled(false);
                        d18_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d18_7_h9.setEnabled(false);
                        d18_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d18_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d18_7_h9.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        /////////////////////////////////////////////////////////////
        m19_7_h1_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d19_7_h1.setEnabled(false);
                        d19_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d19_7_h1.setEnabled(false);
                        d19_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d19_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d19_7_h1.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m19_7_h2_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d19_7_h2.setEnabled(false);
                        d19_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d19_7_h2.setEnabled(false);
                        d19_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d19_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d19_7_h2.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m19_7_h3_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d19_7_h3.setEnabled(false);
                        d19_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d19_7_h3.setEnabled(false);
                        d19_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d19_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d19_7_h3.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m19_7_h4_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d19_7_h4.setEnabled(false);
                        d19_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d19_7_h4.setEnabled(false);
                        d19_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d19_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d19_7_h4.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m19_7_h5_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d19_7_h5.setEnabled(false);
                        d19_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d19_7_h5.setEnabled(false);
                        d19_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d19_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d19_7_h5.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m19_7_h6_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d19_7_h6.setEnabled(false);
                        d19_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d19_7_h6.setEnabled(false);
                        d19_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d19_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d19_7_h6.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m19_7_h7_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d19_7_h7.setEnabled(false);
                        d19_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d19_7_h7.setEnabled(false);
                        d19_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d19_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d19_7_h7.setEnabled(true);
                    }
                }

            }


            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m19_7_h8_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d19_7_h8.setEnabled(false);
                        d19_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d19_7_h8.setEnabled(false);
                        d19_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d19_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d19_7_h8.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m19_7_h9_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d19_7_h9.setEnabled(false);
                        d19_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d19_7_h9.setEnabled(false);
                        d19_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d19_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d19_7_h9.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        /////////////////////////////////////////////////////////////
        m20_7_h1_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d20_7_h1.setEnabled(false);
                        d20_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d20_7_h1.setEnabled(false);
                        d20_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d20_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d20_7_h1.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m20_7_h2_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d20_7_h2.setEnabled(false);
                        d20_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d20_7_h2.setEnabled(false);
                        d20_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d20_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d20_7_h2.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m20_7_h3_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d20_7_h3.setEnabled(false);
                        d20_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d20_7_h3.setEnabled(false);
                        d20_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d20_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d20_7_h3.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m20_7_h4_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d20_7_h4.setEnabled(false);
                        d20_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d20_7_h4.setEnabled(false);
                        d20_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d20_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d20_7_h4.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m20_7_h5_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d20_7_h5.setEnabled(false);
                        d20_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d20_7_h5.setEnabled(false);
                        d20_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d20_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d20_7_h5.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m1_7_h6_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d1_7_h6.setEnabled(false);
                        d1_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d1_7_h6.setEnabled(false);
                        d1_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d1_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d1_7_h6.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m20_7_h7_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d20_7_h7.setEnabled(false);
                        d20_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d20_7_h7.setEnabled(false);
                        d20_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d20_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d20_7_h7.setEnabled(true);
                    }
                }

            }


            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m20_7_h8_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d20_7_h8.setEnabled(false);
                        d20_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d20_7_h8.setEnabled(false);
                        d20_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d20_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d20_7_h8.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m20_7_h9_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d20_7_h9.setEnabled(false);
                        d20_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d20_7_h9.setEnabled(false);
                        d20_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d20_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d20_7_h9.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        /////////////////////////////////////////////////////////////
        m21_7_h1_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d21_7_h1.setEnabled(false);
                        d21_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d21_7_h1.setEnabled(false);
                        d21_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d21_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d21_7_h1.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m21_7_h2_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d21_7_h2.setEnabled(false);
                        d21_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d21_7_h2.setEnabled(false);
                        d21_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d21_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d21_7_h2.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m21_7_h3_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d21_7_h3.setEnabled(false);
                        d21_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d21_7_h3.setEnabled(false);
                        d21_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d21_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d21_7_h3.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m21_7_h4_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d21_7_h4.setEnabled(false);
                        d21_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d21_7_h4.setEnabled(false);
                        d21_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d21_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d21_7_h4.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m21_7_h5_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d21_7_h5.setEnabled(false);
                        d21_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d21_7_h5.setEnabled(false);
                        d21_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d21_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d21_7_h5.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m21_7_h6_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d21_7_h6.setEnabled(false);
                        d21_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d21_7_h6.setEnabled(false);
                        d21_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d21_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d21_7_h6.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m21_7_h7_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d21_7_h7.setEnabled(false);
                        d21_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d21_7_h7.setEnabled(false);
                        d21_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d21_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d21_7_h7.setEnabled(true);
                    }
                }

            }


            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m21_7_h8_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d21_7_h8.setEnabled(false);
                        d21_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d21_7_h8.setEnabled(false);
                        d21_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d21_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d21_7_h8.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m21_7_h9_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d21_7_h9.setEnabled(false);
                        d21_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d21_7_h9.setEnabled(false);
                        d21_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d21_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d21_7_h9.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        /////////////////////////////////////////////////////////////
        m22_7_h1_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d22_7_h1.setEnabled(false);
                        d22_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d22_7_h1.setEnabled(false);
                        d22_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d22_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d22_7_h1.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m22_7_h2_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d22_7_h2.setEnabled(false);
                        d22_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d22_7_h2.setEnabled(false);
                        d22_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d22_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d22_7_h2.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m22_7_h3_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d22_7_h3.setEnabled(false);
                        d22_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d22_7_h3.setEnabled(false);
                        d22_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d22_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d22_7_h3.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m22_7_h4_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d22_7_h4.setEnabled(false);
                        d22_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d22_7_h4.setEnabled(false);
                        d22_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d22_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d22_7_h4.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m22_7_h5_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d22_7_h5.setEnabled(false);
                        d22_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d22_7_h5.setEnabled(false);
                        d22_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d22_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d22_7_h5.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m22_7_h6_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d22_7_h6.setEnabled(false);
                        d22_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d22_7_h6.setEnabled(false);
                        d22_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d22_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d22_7_h6.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m22_7_h7_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d22_7_h7.setEnabled(false);
                        d22_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d22_7_h7.setEnabled(false);
                        d22_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d22_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d22_7_h7.setEnabled(true);
                    }
                }

            }


            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m22_7_h8_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d22_7_h8.setEnabled(false);
                        d22_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d22_7_h8.setEnabled(false);
                        d22_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d22_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d22_7_h8.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m22_7_h9_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d22_7_h9.setEnabled(false);
                        d22_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d22_7_h9.setEnabled(false);
                        d22_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d22_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d22_7_h9.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        /////////////////////////////////////////////////////////////
        m23_7_h1_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d23_7_h1.setEnabled(false);
                        d23_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d23_7_h1.setEnabled(false);
                        d23_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d23_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d23_7_h1.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m23_7_h2_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d23_7_h2.setEnabled(false);
                        d23_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d23_7_h2.setEnabled(false);
                        d23_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d23_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d23_7_h2.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m23_7_h3_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d23_7_h3.setEnabled(false);
                        d23_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d23_7_h3.setEnabled(false);
                        d23_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d23_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d23_7_h3.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m23_7_h4_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d23_7_h4.setEnabled(false);
                        d23_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d23_7_h4.setEnabled(false);
                        d23_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d23_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d23_7_h4.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m23_7_h5_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d23_7_h5.setEnabled(false);
                        d23_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d23_7_h5.setEnabled(false);
                        d23_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d23_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d23_7_h5.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m23_7_h6_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d23_7_h6.setEnabled(false);
                        d23_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d23_7_h6.setEnabled(false);
                        d23_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d23_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d23_7_h6.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m23_7_h7_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d23_7_h7.setEnabled(false);
                        d23_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d23_7_h7.setEnabled(false);
                        d23_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d23_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d23_7_h7.setEnabled(true);
                    }
                }

            }


            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m23_7_h8_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d23_7_h8.setEnabled(false);
                        d23_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d23_7_h8.setEnabled(false);
                        d23_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d23_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d23_7_h8.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m23_7_h9_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d23_7_h9.setEnabled(false);
                        d23_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d23_7_h9.setEnabled(false);
                        d23_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d23_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d23_7_h9.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        /////////////////////////////////////////////////////////////
        m24_7_h1_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d24_7_h1.setEnabled(false);
                        d24_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d24_7_h1.setEnabled(false);
                        d24_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d24_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d24_7_h1.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m24_7_h2_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d24_7_h2.setEnabled(false);
                        d24_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d24_7_h2.setEnabled(false);
                        d24_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d24_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d24_7_h2.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m24_7_h3_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d24_7_h3.setEnabled(false);
                        d24_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d24_7_h3.setEnabled(false);
                        d24_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d24_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d24_7_h3.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m24_7_h4_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d24_7_h4.setEnabled(false);
                        d24_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d24_7_h4.setEnabled(false);
                        d24_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d24_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d24_7_h4.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m24_7_h5_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d24_7_h5.setEnabled(false);
                        d24_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d24_7_h5.setEnabled(false);
                        d24_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d24_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d24_7_h5.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m24_7_h6_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d24_7_h6.setEnabled(false);
                        d24_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d24_7_h6.setEnabled(false);
                        d24_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d24_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d24_7_h6.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m24_7_h7_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d24_7_h7.setEnabled(false);
                        d24_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d24_7_h7.setEnabled(false);
                        d24_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d24_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d24_7_h7.setEnabled(true);
                    }
                }

            }


            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m24_7_h8_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d24_7_h8.setEnabled(false);
                        d24_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d24_7_h8.setEnabled(false);
                        d24_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d24_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d24_7_h8.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m24_7_h9_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d24_7_h9.setEnabled(false);
                        d24_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d24_7_h9.setEnabled(false);
                        d24_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d24_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d24_7_h9.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        /////////////////////////////////////////////////////////////
        m25_7_h1_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d25_7_h1.setEnabled(false);
                        d25_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d25_7_h1.setEnabled(false);
                        d25_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d25_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d25_7_h1.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m25_7_h2_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d25_7_h2.setEnabled(false);
                        d25_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d25_7_h2.setEnabled(false);
                        d25_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d25_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d25_7_h2.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m25_7_h3_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d25_7_h3.setEnabled(false);
                        d25_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d25_7_h3.setEnabled(false);
                        d25_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d25_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d25_7_h3.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m25_7_h4_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d25_7_h4.setEnabled(false);
                        d25_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d25_7_h4.setEnabled(false);
                        d25_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d25_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d25_7_h4.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m25_7_h5_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d25_7_h5.setEnabled(false);
                        d25_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d25_7_h5.setEnabled(false);
                        d25_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d25_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d25_7_h5.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m25_7_h6_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d25_7_h6.setEnabled(false);
                        d25_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d25_7_h6.setEnabled(false);
                        d25_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d25_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d25_7_h6.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m25_7_h7_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d25_7_h7.setEnabled(false);
                        d25_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d25_7_h7.setEnabled(false);
                        d25_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d25_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d25_7_h7.setEnabled(true);
                    }
                }

            }


            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m25_7_h8_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d25_7_h8.setEnabled(false);
                        d25_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d25_7_h8.setEnabled(false);
                        d25_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d25_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d25_7_h8.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m25_7_h9_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d25_7_h9.setEnabled(false);
                        d25_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d25_7_h9.setEnabled(false);
                        d25_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d25_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d25_7_h9.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        /////////////////////////////////////////////////////////////
        m26_7_h1_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d26_7_h1.setEnabled(false);
                        d26_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d26_7_h1.setEnabled(false);
                        d26_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d26_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d26_7_h1.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m26_7_h2_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d26_7_h2.setEnabled(false);
                        d26_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d26_7_h2.setEnabled(false);
                        d26_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d26_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d26_7_h2.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m26_7_h3_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d26_7_h3.setEnabled(false);
                        d26_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d26_7_h3.setEnabled(false);
                        d26_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d26_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d26_7_h3.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m27_7_h4_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d27_7_h4.setEnabled(false);
                        d27_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d27_7_h4.setEnabled(false);
                        d27_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d27_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d27_7_h4.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m27_7_h5_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d27_7_h5.setEnabled(false);
                        d27_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d27_7_h5.setEnabled(false);
                        d27_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d27_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d27_7_h5.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m27_7_h6_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d27_7_h6.setEnabled(false);
                        d27_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d27_7_h6.setEnabled(false);
                        d27_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d27_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d27_7_h6.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m27_7_h7_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d27_7_h7.setEnabled(false);
                        d27_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d27_7_h7.setEnabled(false);
                        d27_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d27_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d27_7_h7.setEnabled(true);
                    }
                }

            }


            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m27_7_h8_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d27_7_h8.setEnabled(false);
                        d27_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d27_7_h8.setEnabled(false);
                        d27_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d27_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d27_7_h8.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m27_7_h9_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d27_7_h9.setEnabled(false);
                        d27_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d27_7_h9.setEnabled(false);
                        d27_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d27_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d27_7_h9.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        /////////////////////////////////////////////////////////////
        m28_7_h1_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d28_7_h1.setEnabled(false);
                        d28_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d28_7_h1.setEnabled(false);
                        d28_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d28_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d28_7_h1.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m28_7_h2_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d28_7_h2.setEnabled(false);
                        d28_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d28_7_h2.setEnabled(false);
                        d28_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d28_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d28_7_h2.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m28_7_h3_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d28_7_h3.setEnabled(false);
                        d28_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d28_7_h3.setEnabled(false);
                        d28_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d28_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d28_7_h3.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m28_7_h4_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d28_7_h4.setEnabled(false);
                        d28_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d28_7_h4.setEnabled(false);
                        d28_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d28_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d28_7_h4.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m28_7_h5_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d28_7_h5.setEnabled(false);
                        d28_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d28_7_h5.setEnabled(false);
                        d28_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d28_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d28_7_h5.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m28_7_h6_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d28_7_h6.setEnabled(false);
                        d28_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d28_7_h6.setEnabled(false);
                        d28_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d28_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d28_7_h6.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m28_7_h7_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d28_7_h7.setEnabled(false);
                        d28_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d28_7_h7.setEnabled(false);
                        d28_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d28_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d28_7_h7.setEnabled(true);
                    }
                }

            }


            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m28_7_h8_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d28_7_h8.setEnabled(false);
                        d28_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d28_7_h8.setEnabled(false);
                        d28_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d28_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d28_7_h8.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m28_7_h9_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d28_7_h9.setEnabled(false);
                        d28_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d28_7_h9.setEnabled(false);
                        d28_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d28_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d28_7_h9.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        /////////////////////////////////////////////////////////////
        m29_7_h1_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d29_7_h1.setEnabled(false);
                        d29_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d29_7_h1.setEnabled(false);
                        d29_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d29_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d29_7_h1.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m29_7_h2_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d29_7_h2.setEnabled(false);
                        d29_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d29_7_h2.setEnabled(false);
                        d29_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d29_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d29_7_h2.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m29_7_h3_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d29_7_h3.setEnabled(false);
                        d29_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d29_7_h3.setEnabled(false);
                        d29_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d29_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d29_7_h3.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m29_7_h4_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d29_7_h4.setEnabled(false);
                        d29_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d29_7_h4.setEnabled(false);
                        d29_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d29_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d29_7_h4.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m29_7_h5_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d29_7_h5.setEnabled(false);
                        d29_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d29_7_h5.setEnabled(false);
                        d29_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d29_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d29_7_h5.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m29_7_h6_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d29_7_h6.setEnabled(false);
                        d29_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d29_7_h6.setEnabled(false);
                        d29_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d29_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d29_7_h6.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m29_7_h7_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d29_7_h7.setEnabled(false);
                        d29_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d29_7_h7.setEnabled(false);
                        d29_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d29_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d29_7_h7.setEnabled(true);
                    }
                }

            }


            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m29_7_h8_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d29_7_h8.setEnabled(false);
                        d29_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d29_7_h8.setEnabled(false);
                        d29_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d29_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d29_7_h8.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m29_7_h9_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d29_7_h9.setEnabled(false);
                        d29_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d29_7_h9.setEnabled(false);
                        d29_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d29_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d29_7_h9.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        /////////////////////////////////////////////////////////////
        m30_7_h1_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d30_7_h1.setEnabled(false);
                        d30_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d30_7_h1.setEnabled(false);
                        d30_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d30_7_h1.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d30_7_h1.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m30_7_h2_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d30_7_h2.setEnabled(false);
                        d30_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d30_7_h2.setEnabled(false);
                        d30_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d30_7_h2.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d30_7_h2.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m30_7_h3_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d30_7_h3.setEnabled(false);
                        d30_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d30_7_h3.setEnabled(false);
                        d30_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d30_7_h3.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d30_7_h3.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m30_7_h4_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d30_7_h4.setEnabled(false);
                        d30_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d30_7_h4.setEnabled(false);
                        d30_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d30_7_h4.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d30_7_h4.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m30_7_h5_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d30_7_h5.setEnabled(false);
                        d30_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d30_7_h5.setEnabled(false);
                        d30_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d30_7_h5.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d30_7_h5.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m30_7_h6_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d30_7_h6.setEnabled(false);
                        d30_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d30_7_h6.setEnabled(false);
                        d30_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d30_7_h6.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d30_7_h6.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m30_7_h7_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d30_7_h7.setEnabled(false);
                        d30_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d30_7_h7.setEnabled(false);
                        d30_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d30_7_h7.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d30_7_h7.setEnabled(true);
                    }
                }

            }


            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m30_7_h8_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d30_7_h8.setEnabled(false);
                        d30_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d30_7_h8.setEnabled(false);
                        d30_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d30_7_h8.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d30_7_h8.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        m30_7_h9_s.adValueEventListener(new ValueEventListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String val = dataSnapshot.getValue(String.class);
                if (val!=null){
                    if (val.equals("demander")){
                        d30_7_h9.setEnabled(false);
                        d30_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.pause));
                    }else if(val.equals("fix")){
                        d30_7_h9.setEnabled(false);
                        d30_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.fix));
                    }else if(val.equals("null")){
                        d30_7_h9.setBackgroundrawable(getResources().getDrawable(R.drawable.add));
                        d30_7_h9.setEnabled(true);
                    }
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.adDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        next=(Button)findViewById(R.id.dnext_day);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewFlipper.showNext();
            }
        });
        pre=(Button)findViewById(R.id.dprevious_day);
        pre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewFlipper.showPrevious();
            }
        });
        Calendar calendar = Calendar.getInstance();
        String currentDate = DateFormat.getDateInstance().format(calendar.getTime());

        TextView textViewDate = findViewById(R.id.text_view_date);
        textViewDate.setText("Nous somme le: "+currentDate);


        viewFlipper = (ViewFlipper) findViewById(R.id.ViewFlipper);

        Calendar cal = Calendar.getInstance();
        year_x=cal.get(Calendar.YEAR);
        month_x=cal.get(Calendar.MONTH);
        day_x=cal.get(Calendar.DAY_OF_MONTH);
        showDialogOnButtonClick();
    }


    public void showDialogOnButtonClick(){
        editDate=(Button) findViewById(R.id.edit_date);
        editDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(DIALOG_ID);
            }
        });
    }

    @Override
    protected Dialog onCreateDialog(int id){
        if(id==DIALOG_ID)
            return new DatePickerDialog(this, dpickerListner,year_x,month_x,day_x);
        return null;
    }
    private DatePickerDialog.OnDateSetListener dpickerListner = new DatePickerDialog.OnDateSetListener(){

        @Override
        public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
            year_x = year;
            month_x = monthOfYear + 1;
            day_x = dayOfMonth;
            editDate.setText(day_x+"/"+month_x+"/"+year_x);
            if (       editDate.getText().toString().equals("1/7/2018")
                    || editDate.getText().toString().equals("2/7/2018")
                    || editDate.getText().toString().equals("3/7/2018")
                    || editDate.getText().toString().equals("4/7/2018")
                    || editDate.getText().toString().equals("5/7/2018")
                    || editDate.getText().toString().equals("6/7/2018")
                    || editDate.getText().toString().equals("7/7/2018")){
                viewFlipper.setDisplayedChild(viewFlipper.indexOfChild(findViewById(R.id.calender1)));
            }else if (  editDate.getText().toString().equals("8/7/2018")
                    || editDate.getText().toString().equals("9/7/2018")
                    || editDate.getText().toString().equals("10/7/2018")
                    || editDate.getText().toString().equals("11/7/2018")
                    || editDate.getText().toString().equals("12/7/2018")
                    || editDate.getText().toString().equals("13/7/2018")
                    || editDate.getText().toString().equals("14/7/2018")){
                viewFlipper.setDisplayedChild(viewFlipper.indexOfChild(findViewById(R.id.calender2)));
            }else if (  editDate.getText().toString().equals("15/7/2018")
                    || editDate.getText().toString().equals("16/7/2018")
                    || editDate.getText().toString().equals("17/7/2018")
                    || editDate.getText().toString().equals("18/7/2018")
                    || editDate.getText().toString().equals("19/7/2018")
                    || editDate.getText().toString().equals("20/7/2018")
                    || editDate.getText().toString().equals("21/7/2018")){
                viewFlipper.setDisplayedChild(viewFlipper.indexOfChild(findViewById(R.id.calender3)));
            }else if (  editDate.getText().toString().equals("22/7/2018")
                    || editDate.getText().toString().equals("23/7/2018")
                    || editDate.getText().toString().equals("24/7/2018")
                    || editDate.getText().toString().equals("25/7/2018")
                    || editDate.getText().toString().equals("26/7/2018")
                    || editDate.getText().toString().equals("27/7/2018")
                    || editDate.getText().toString().equals("28/7/2018")){
                viewFlipper.setDisplayedChild(viewFlipper.indexOfChild(findViewById(R.id.calender4)));
            }else if (  editDate.getText().toString().equals("29/7/2018")
                    || editDate.getText().toString().equals("30/7/2018")
                    || editDate.getText().toString().equals("31/7/2018")){
                viewFlipper.setDisplayedChild(viewFlipper.indexOfChild(findViewById(R.id.calender5)));
            }
        }
    };
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this ads items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.client_rdvm2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            Intent i = new Intent(ClientRDVm2Activity.this, ServicesListActivity.class);
            startActivity(i);
        } else if (id == R.id.nav_salon) {
            Intent i = new Intent(ClientRDVm2Activity.this, SalonActivity.class);
            startActivity(i);
        } else if (id == R.id.nav_work) {

        } else if (id == R.id.nav_map) {
            Intent i = new Intent(ClientRDVm2Activity.this, MapsActivity.class);
            startActivity(i);
        } else if (id == R.id.nav_admin) {
            Intent i = new Intent(ClientRDVm2Activity.this, AdminLoginActivity.class);
            startActivity(i);
        } else if (id == R.id.nav_feedback) {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setData(Uri.parse("client:"));
            String[] recipents = {"contact@anarosinstitut.com"};
            intent.setType("message/rfc822");
            intent.putExtra(Intent.EXTRA_EMAIL, recipents);
            intent.putExtra(Intent.EXTRA_SUBJECT, "ANAROS Reviews");
            Intent chooser = Intent.createChooser(intent, "Send Feedback Via");
            startActivity(chooser);
        } else if (id == R.id.nav_share_ex) {
            Intent i = new Intent(ClientRDVm2Activity.this, ShareExActivity.class);
            startActivity(i);
        } else if (id == R.id.nav_share) {
            Intent intent = new Intent(android.content.Intent.ACTION_SEND);
            intent.setData(Uri.parse("ANAROS:"));
            intent.setType("message/rfc822");
            intent.putExtra(Intent.EXTRA_SUBJECT, "ANAROS");
            System.out.println(""+R.string.email_content);
            intent.putExtra(Intent.EXTRA_TEXT, ""+getText(R.string.email_content)+getText(R.string.link));
            Intent chooser = Intent.createChooser(intent, "Share using");
            startActivity(chooser);
        } else if (id == R.id.nav_contact) {
            Intent i = new Intent(ClientRDVm2Activity.this, ContactActivity.class);
            startActivity(i);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

    }

    @Override
    public void onCancelled(@NonNull DatabaseError databaseError) {

    }

    @Override
    protected void onStart() {
        super.onStart();

        mDate_1_7.adValueEventListener(this);
        m1_7_h1.adValueEventListener(this);
        m1_7_h1_s.adValueEventListener(this);
        m1_7_h2.adValueEventListener(this);
        m1_7_h2_s.adValueEventListener(this);
        m1_7_h3.adValueEventListener(this);
        m1_7_h3_s.adValueEventListener(this);
        m1_7_h4.adValueEventListener(this);
        m1_7_h4_s.adValueEventListener(this);
        m1_7_h5.adValueEventListener(this);
        m1_7_h5_s.adValueEventListener(this);
        m1_7_h6.adValueEventListener(this);
        m1_7_h6_s.adValueEventListener(this);
        m1_7_h7.adValueEventListener(this);
        m1_7_h7_s.adValueEventListener(this);
        m1_7_h8.adValueEventListener(this);
        m1_7_h8_s.adValueEventListener(this);
        m1_7_h9.adValueEventListener(this);
        m1_7_h9_s.adValueEventListener(this);
        /////////////////////////////////////
        mDate_2_7.adValueEventListener(this);
        m2_7_h1.adValueEventListener(this);
        m2_7_h1_s.adValueEventListener(this);
        m2_7_h2.adValueEventListener(this);
        m2_7_h2_s.adValueEventListener(this);
        m2_7_h3.adValueEventListener(this);
        m2_7_h3_s.adValueEventListener(this);
        m2_7_h4.adValueEventListener(this);
        m2_7_h4_s.adValueEventListener(this);
        m2_7_h5.adValueEventListener(this);
        m2_7_h5_s.adValueEventListener(this);
        m2_7_h6.adValueEventListener(this);
        m2_7_h6_s.adValueEventListener(this);
        m2_7_h7.adValueEventListener(this);
        m2_7_h7_s.adValueEventListener(this);
        m2_7_h8.adValueEventListener(this);
        m2_7_h8_s.adValueEventListener(this);
        m2_7_h9.adValueEventListener(this);
        m2_7_h9_s.adValueEventListener(this);
        /////////////////////////////////////
        mDate_3_7.adValueEventListener(this);
        m3_7_h1.adValueEventListener(this);
        m3_7_h1_s.adValueEventListener(this);
        m3_7_h2.adValueEventListener(this);
        m3_7_h2_s.adValueEventListener(this);
        m3_7_h3.adValueEventListener(this);
        m3_7_h3_s.adValueEventListener(this);
        m3_7_h4.adValueEventListener(this);
        m3_7_h4_s.adValueEventListener(this);
        m3_7_h5.adValueEventListener(this);
        m3_7_h5_s.adValueEventListener(this);
        m3_7_h6.adValueEventListener(this);
        m3_7_h6_s.adValueEventListener(this);
        m3_7_h7.adValueEventListener(this);
        m3_7_h7_s.adValueEventListener(this);
        m3_7_h8.adValueEventListener(this);
        m3_7_h8_s.adValueEventListener(this);
        m3_7_h9.adValueEventListener(this);
        m3_7_h9_s.adValueEventListener(this);
        /////////////////////////////////////
        mDate_4_7.adValueEventListener(this);
        m4_7_h1.adValueEventListener(this);
        m4_7_h1_s.adValueEventListener(this);
        m4_7_h2.adValueEventListener(this);
        m4_7_h2_s.adValueEventListener(this);
        m4_7_h3.adValueEventListener(this);
        m4_7_h3_s.adValueEventListener(this);
        m4_7_h4.adValueEventListener(this);
        m4_7_h4_s.adValueEventListener(this);
        m4_7_h5.adValueEventListener(this);
        m4_7_h5_s.adValueEventListener(this);
        m4_7_h6.adValueEventListener(this);
        m4_7_h6_s.adValueEventListener(this);
        m4_7_h7.adValueEventListener(this);
        m4_7_h7_s.adValueEventListener(this);
        m4_7_h8.adValueEventListener(this);
        m4_7_h8_s.adValueEventListener(this);
        m4_7_h9.adValueEventListener(this);
        m4_7_h9_s.adValueEventListener(this);
        /////////////////////////////////////
        mDate_5_7.adValueEventListener(this);
        m5_7_h1.adValueEventListener(this);
        m5_7_h1_s.adValueEventListener(this);
        m5_7_h2.adValueEventListener(this);
        m5_7_h2_s.adValueEventListener(this);
        m5_7_h3.adValueEventListener(this);
        m5_7_h3_s.adValueEventListener(this);
        m5_7_h4.adValueEventListener(this);
        m5_7_h4_s.adValueEventListener(this);
        m5_7_h5.adValueEventListener(this);
        m5_7_h5_s.adValueEventListener(this);
        m5_7_h6.adValueEventListener(this);
        m5_7_h6_s.adValueEventListener(this);
        m5_7_h7.adValueEventListener(this);
        m5_7_h7_s.adValueEventListener(this);
        m5_7_h8.adValueEventListener(this);
        m5_7_h8_s.adValueEventListener(this);
        m5_7_h9.adValueEventListener(this);
        m5_7_h9_s.adValueEventListener(this);
        /////////////////////////////////////
        mDate_6_7.adValueEventListener(this);
        m6_7_h1.adValueEventListener(this);
        m6_7_h1_s.adValueEventListener(this);
        m6_7_h2.adValueEventListener(this);
        m6_7_h2_s.adValueEventListener(this);
        m6_7_h3.adValueEventListener(this);
        m6_7_h3_s.adValueEventListener(this);
        m6_7_h4.adValueEventListener(this);
        m6_7_h4_s.adValueEventListener(this);
        m6_7_h5.adValueEventListener(this);
        m6_7_h5_s.adValueEventListener(this);
        m6_7_h6.adValueEventListener(this);
        m6_7_h6_s.adValueEventListener(this);
        m6_7_h7.adValueEventListener(this);
        m6_7_h7_s.adValueEventListener(this);
        m6_7_h8.adValueEventListener(this);
        m6_7_h8_s.adValueEventListener(this);
        m6_7_h9.adValueEventListener(this);
        m6_7_h9_s.adValueEventListener(this);
        /////////////////////////////////////
        mDate_7_7.adValueEventListener(this);
        m7_7_h1.adValueEventListener(this);
        m7_7_h1_s.adValueEventListener(this);
        m7_7_h2.adValueEventListener(this);
        m7_7_h2_s.adValueEventListener(this);
        m7_7_h3.adValueEventListener(this);
        m7_7_h3_s.adValueEventListener(this);
        m7_7_h4.adValueEventListener(this);
        m7_7_h4_s.adValueEventListener(this);
        m7_7_h5.adValueEventListener(this);
        m7_7_h5_s.adValueEventListener(this);
        m7_7_h6.adValueEventListener(this);
        m7_7_h6_s.adValueEventListener(this);
        m7_7_h7.adValueEventListener(this);
        m7_7_h7_s.adValueEventListener(this);
        m7_7_h8.adValueEventListener(this);
        m7_7_h8_s.adValueEventListener(this);
        m7_7_h9.adValueEventListener(this);
        m7_7_h9_s.adValueEventListener(this);
        /////////////////////////////////////
        mDate_7_7.adValueEventListener(this);
        m8_7_h1.adValueEventListener(this);
        m8_7_h1_s.adValueEventListener(this);
        m8_7_h2.adValueEventListener(this);
        m8_7_h2_s.adValueEventListener(this);
        m8_7_h3.adValueEventListener(this);
        m8_7_h3_s.adValueEventListener(this);
        m8_7_h4.adValueEventListener(this);
        m8_7_h4_s.adValueEventListener(this);
        m8_7_h4_s.adValueEventListener(this);
        m8_7_h5_s.adValueEventListener(this);
        m8_7_h6.adValueEventListener(this);
        m8_7_h6_s.adValueEventListener(this);
        m8_7_h7.adValueEventListener(this);
        m8_7_h7_s.adValueEventListener(this);
        m8_7_h8.adValueEventListener(this);
        m8_7_h8_s.adValueEventListener(this);
        m8_7_h9.adValueEventListener(this);
        m8_7_h9_s.adValueEventListener(this);
        /////////////////////////////////////
        mDate_7_7.adValueEventListener(this);
        m9_7_h1.adValueEventListener(this);
        m9_7_h1_s.adValueEventListener(this);
        m9_7_h2.adValueEventListener(this);
        m9_7_h2_s.adValueEventListener(this);
        m9_7_h3.adValueEventListener(this);
        m9_7_h3_s.adValueEventListener(this);
        m9_7_h4.adValueEventListener(this);
        m9_7_h4_s.adValueEventListener(this);
        m9_7_h5.adValueEventListener(this);
        m9_7_h5_s.adValueEventListener(this);
        m9_7_h6.adValueEventListener(this);
        m9_7_h6_s.adValueEventListener(this);
        m9_7_h7.adValueEventListener(this);
        m9_7_h7_s.adValueEventListener(this);
        m9_7_h8.adValueEventListener(this);
        m9_7_h8_s.adValueEventListener(this);
        m9_7_h9.adValueEventListener(this);
        m9_7_h9_s.adValueEventListener(this);
        /////////////////////////////////////
        mDate_10_7.adValueEventListener(this);
        m10_7_h1.adValueEventListener(this);
        m10_7_h1_s.adValueEventListener(this);
        m10_7_h2.adValueEventListener(this);
        m10_7_h2_s.adValueEventListener(this);
        m10_7_h3.adValueEventListener(this);
        m10_7_h3_s.adValueEventListener(this);
        m10_7_h4.adValueEventListener(this);
        m10_7_h4_s.adValueEventListener(this);
        m10_7_h5.adValueEventListener(this);
        m10_7_h5_s.adValueEventListener(this);
        m10_7_h6.adValueEventListener(this);
        m10_7_h6_s.adValueEventListener(this);
        m10_7_h7.adValueEventListener(this);
        m10_7_h7_s.adValueEventListener(this);
        m10_7_h8.adValueEventListener(this);
        m10_7_h8_s.adValueEventListener(this);
        m10_7_h9.adValueEventListener(this);
        m10_7_h9_s.adValueEventListener(this);
        /////////////////////////////////////
        mDate_11_7.adValueEventListener(this);
        m11_7_h1.adValueEventListener(this);
        m11_7_h1_s.adValueEventListener(this);
        m11_7_h2.adValueEventListener(this);
        m11_7_h2_s.adValueEventListener(this);
        m11_7_h3.adValueEventListener(this);
        m11_7_h3_s.adValueEventListener(this);
        m11_7_h4.adValueEventListener(this);
        m11_7_h4_s.adValueEventListener(this);
        m11_7_h5.adValueEventListener(this);
        m11_7_h5_s.adValueEventListener(this);
        m11_7_h6.adValueEventListener(this);
        m11_7_h6_s.adValueEventListener(this);
        m11_7_h7.adValueEventListener(this);
        m11_7_h7_s.adValueEventListener(this);
        m11_7_h8.adValueEventListener(this);
        m11_7_h8_s.adValueEventListener(this);
        m11_7_h9.adValueEventListener(this);
        m11_7_h9_s.adValueEventListener(this);
        /////////////////////////////////////
        mDate_1_7.adValueEventListener(this);
        m12_7_h1.adValueEventListener(this);
        m12_7_h1_s.adValueEventListener(this);
        m12_7_h2.adValueEventListener(this);
        m12_7_h2_s.adValueEventListener(this);
        m12_7_h3.adValueEventListener(this);
        m12_7_h3_s.adValueEventListener(this);
        m12_7_h4.adValueEventListener(this);
        m12_7_h4_s.adValueEventListener(this);
        m12_7_h5.adValueEventListener(this);
        m12_7_h5_s.adValueEventListener(this);
        m12_7_h6.adValueEventListener(this);
        m12_7_h6_s.adValueEventListener(this);
        m12_7_h7.adValueEventListener(this);
        m12_7_h7_s.adValueEventListener(this);
        m12_7_h8.adValueEventListener(this);
        m12_7_h8_s.adValueEventListener(this);
        m12_7_h9.adValueEventListener(this);
        m12_7_h9_s.adValueEventListener(this);
        /////////////////////////////////////
        mDate_1_7.adValueEventListener(this);
        m13_7_h1.adValueEventListener(this);
        m13_7_h1_s.adValueEventListener(this);
        m13_7_h2.adValueEventListener(this);
        m13_7_h2_s.adValueEventListener(this);
        m13_7_h3.adValueEventListener(this);
        m13_7_h3_s.adValueEventListener(this);
        m13_7_h4.adValueEventListener(this);
        m13_7_h4_s.adValueEventListener(this);
        m13_7_h5.adValueEventListener(this);
        m13_7_h5_s.adValueEventListener(this);
        m13_7_h6.adValueEventListener(this);
        m13_7_h6_s.adValueEventListener(this);
        m13_7_h7.adValueEventListener(this);
        m13_7_h7_s.adValueEventListener(this);
        m13_7_h8.adValueEventListener(this);
        m13_7_h8_s.adValueEventListener(this);
        m13_7_h9.adValueEventListener(this);
        m13_7_h9_s.adValueEventListener(this);
        /////////////////////////////////////
        m14_7_h1.adValueEventListener(this);
        m14_7_h1_s.adValueEventListener(this);
        m14_7_h2.adValueEventListener(this);
        m14_7_h2_s.adValueEventListener(this);
        m14_7_h3.adValueEventListener(this);
        m14_7_h3_s.adValueEventListener(this);
        m14_7_h4.adValueEventListener(this);
        m14_7_h4_s.adValueEventListener(this);
        m14_7_h5.adValueEventListener(this);
        m14_7_h5_s.adValueEventListener(this);
        m14_7_h6.adValueEventListener(this);
        m14_7_h6_s.adValueEventListener(this);
        m14_7_h7.adValueEventListener(this);
        m14_7_h7_s.adValueEventListener(this);
        m14_7_h8.adValueEventListener(this);
        m14_7_h8_s.adValueEventListener(this);
        m14_7_h9.adValueEventListener(this);
        m14_7_h9_s.adValueEventListener(this);
        /////////////////////////////////////
        m15_7_h1.adValueEventListener(this);
        m15_7_h1_s.adValueEventListener(this);
        m15_7_h2.adValueEventListener(this);
        m15_7_h2_s.adValueEventListener(this);
        m15_7_h3.adValueEventListener(this);
        m15_7_h3_s.adValueEventListener(this);
        m15_7_h4.adValueEventListener(this);
        m15_7_h4_s.adValueEventListener(this);
        m15_7_h5.adValueEventListener(this);
        m15_7_h5_s.adValueEventListener(this);
        m15_7_h6.adValueEventListener(this);
        m15_7_h6_s.adValueEventListener(this);
        m15_7_h7.adValueEventListener(this);
        m15_7_h7_s.adValueEventListener(this);
        m15_7_h8.adValueEventListener(this);
        m15_7_h8_s.adValueEventListener(this);
        m15_7_h9.adValueEventListener(this);
        m15_7_h9_s.adValueEventListener(this);
        /////////////////////////////////////
        m16_7_h1.adValueEventListener(this);
        m16_7_h1_s.adValueEventListener(this);
        m16_7_h2.adValueEventListener(this);
        m16_7_h2_s.adValueEventListener(this);
        m16_7_h3.adValueEventListener(this);
        m16_7_h3_s.adValueEventListener(this);
        m16_7_h4.adValueEventListener(this);
        m16_7_h4_s.adValueEventListener(this);
        m16_7_h5.adValueEventListener(this);
        m16_7_h5_s.adValueEventListener(this);
        m16_7_h6.adValueEventListener(this);
        m16_7_h6_s.adValueEventListener(this);
        m16_7_h7.adValueEventListener(this);
        m16_7_h7_s.adValueEventListener(this);
        m16_7_h8.adValueEventListener(this);
        m16_7_h8_s.adValueEventListener(this);
        m16_7_h9.adValueEventListener(this);
        m16_7_h9_s.adValueEventListener(this);
        /////////////////////////////////////
        m17_7_h1.adValueEventListener(this);
        m17_7_h1_s.adValueEventListener(this);
        m17_7_h2.adValueEventListener(this);
        m17_7_h2_s.adValueEventListener(this);
        m17_7_h3.adValueEventListener(this);
        m17_7_h3_s.adValueEventListener(this);
        m17_7_h4.adValueEventListener(this);
        m17_7_h4_s.adValueEventListener(this);
        m17_7_h5.adValueEventListener(this);
        m17_7_h5_s.adValueEventListener(this);
        m17_7_h6.adValueEventListener(this);
        m17_7_h6_s.adValueEventListener(this);
        m17_7_h7.adValueEventListener(this);
        m17_7_h7_s.adValueEventListener(this);
        m17_7_h8.adValueEventListener(this);
        m17_7_h8_s.adValueEventListener(this);
        m17_7_h9.adValueEventListener(this);
        m17_7_h9_s.adValueEventListener(this);
        /////////////////////////////////////
        m18_7_h1.adValueEventListener(this);
        m18_7_h1_s.adValueEventListener(this);
        m18_7_h2.adValueEventListener(this);
        m18_7_h2_s.adValueEventListener(this);
        m18_7_h3.adValueEventListener(this);
        m18_7_h3_s.adValueEventListener(this);
        m18_7_h4.adValueEventListener(this);
        m18_7_h4_s.adValueEventListener(this);
        m18_7_h5.adValueEventListener(this);
        m18_7_h5_s.adValueEventListener(this);
        m18_7_h6.adValueEventListener(this);
        m18_7_h6_s.adValueEventListener(this);
        m18_7_h7.adValueEventListener(this);
        m18_7_h7_s.adValueEventListener(this);
        m18_7_h8.adValueEventListener(this);
        m18_7_h8_s.adValueEventListener(this);
        m18_7_h9.adValueEventListener(this);
        m18_7_h9_s.adValueEventListener(this);
        /////////////////////////////////////
        m19_7_h1.adValueEventListener(this);
        m19_7_h1_s.adValueEventListener(this);
        m19_7_h2.adValueEventListener(this);
        m19_7_h2_s.adValueEventListener(this);
        m19_7_h3.adValueEventListener(this);
        m19_7_h3_s.adValueEventListener(this);
        m19_7_h4.adValueEventListener(this);
        m19_7_h4_s.adValueEventListener(this);
        m19_7_h5.adValueEventListener(this);
        m19_7_h5_s.adValueEventListener(this);
        m19_7_h6.adValueEventListener(this);
        m19_7_h6_s.adValueEventListener(this);
        m19_7_h7.adValueEventListener(this);
        m19_7_h7_s.adValueEventListener(this);
        m19_7_h8.adValueEventListener(this);
        m19_7_h8_s.adValueEventListener(this);
        m19_7_h9.adValueEventListener(this);
        m19_7_h9_s.adValueEventListener(this);
        /////////////////////////////////////
        m20_7_h1.adValueEventListener(this);
        m20_7_h1_s.adValueEventListener(this);
        m20_7_h2.adValueEventListener(this);
        m20_7_h2_s.adValueEventListener(this);
        m20_7_h3.adValueEventListener(this);
        m20_7_h3_s.adValueEventListener(this);
        m20_7_h4.adValueEventListener(this);
        m20_7_h4_s.adValueEventListener(this);
        m20_7_h5.adValueEventListener(this);
        m20_7_h5_s.adValueEventListener(this);
        m20_7_h6.adValueEventListener(this);
        m20_7_h6_s.adValueEventListener(this);
        m20_7_h7.adValueEventListener(this);
        m20_7_h7_s.adValueEventListener(this);
        m20_7_h8.adValueEventListener(this);
        m20_7_h8_s.adValueEventListener(this);
        m20_7_h9.adValueEventListener(this);
        m20_7_h9_s.adValueEventListener(this);
        /////////////////////////////////////
        m21_7_h1.adValueEventListener(this);
        m21_7_h1_s.adValueEventListener(this);
        m21_7_h2.adValueEventListener(this);
        m21_7_h2_s.adValueEventListener(this);
        m21_7_h3.adValueEventListener(this);
        m21_7_h3_s.adValueEventListener(this);
        m21_7_h4.adValueEventListener(this);
        m21_7_h4_s.adValueEventListener(this);
        m21_7_h5.adValueEventListener(this);
        m21_7_h5_s.adValueEventListener(this);
        m21_7_h6.adValueEventListener(this);
        m21_7_h6_s.adValueEventListener(this);
        m21_7_h7.adValueEventListener(this);
        m21_7_h7_s.adValueEventListener(this);
        m21_7_h8.adValueEventListener(this);
        m21_7_h8_s.adValueEventListener(this);
        m21_7_h9.adValueEventListener(this);
        m21_7_h9_s.adValueEventListener(this);
        /////////////////////////////////////
        m22_7_h1.adValueEventListener(this);
        m22_7_h1_s.adValueEventListener(this);
        m22_7_h2.adValueEventListener(this);
        m22_7_h2_s.adValueEventListener(this);
        m22_7_h3.adValueEventListener(this);
        m22_7_h3_s.adValueEventListener(this);
        m22_7_h4.adValueEventListener(this);
        m22_7_h4_s.adValueEventListener(this);
        m22_7_h5.adValueEventListener(this);
        m22_7_h5_s.adValueEventListener(this);
        m22_7_h6.adValueEventListener(this);
        m22_7_h6_s.adValueEventListener(this);
        m22_7_h7.adValueEventListener(this);
        m22_7_h7_s.adValueEventListener(this);
        m22_7_h8.adValueEventListener(this);
        m22_7_h8_s.adValueEventListener(this);
        m22_7_h9.adValueEventListener(this);
        m22_7_h9_s.adValueEventListener(this);
        /////////////////////////////////////
        mDate_2_7.adValueEventListener(this);
        m23_7_h1.adValueEventListener(this);
        m23_7_h1_s.adValueEventListener(this);
        m23_7_h2.adValueEventListener(this);
        m23_7_h2_s.adValueEventListener(this);
        m23_7_h3.adValueEventListener(this);
        m23_7_h3_s.adValueEventListener(this);
        m23_7_h4.adValueEventListener(this);
        m23_7_h4_s.adValueEventListener(this);
        m23_7_h5.adValueEventListener(this);
        m23_7_h5_s.adValueEventListener(this);
        m23_7_h6.adValueEventListener(this);
        m23_7_h6_s.adValueEventListener(this);
        m23_7_h7.adValueEventListener(this);
        m23_7_h7_s.adValueEventListener(this);
        m23_7_h8.adValueEventListener(this);
        m23_7_h8_s.adValueEventListener(this);
        m23_7_h9.adValueEventListener(this);
        m23_7_h9_s.adValueEventListener(this);
        /////////////////////////////////////
        mDate_24_7.adValueEventListener(this);
        m24_7_h1.adValueEventListener(this);
        m24_7_h1_s.adValueEventListener(this);
        m24_7_h2.adValueEventListener(this);
        m24_7_h2_s.adValueEventListener(this);
        m24_7_h3.adValueEventListener(this);
        m24_7_h3_s.adValueEventListener(this);
        m24_7_h4.adValueEventListener(this);
        m24_7_h4_s.adValueEventListener(this);
        m24_7_h5.adValueEventListener(this);
        m24_7_h5_s.adValueEventListener(this);
        m24_7_h6.adValueEventListener(this);
        m24_7_h6_s.adValueEventListener(this);
        m24_7_h7.adValueEventListener(this);
        m24_7_h7_s.adValueEventListener(this);
        m24_7_h8.adValueEventListener(this);
        m24_7_h8_s.adValueEventListener(this);
        m24_7_h9.adValueEventListener(this);
        m24_7_h9_s.adValueEventListener(this);
        //4///////////////////////////////////
        m25_7_h1.adValueEventListener(this);
        m25_7_h1_s.adValueEventListener(this);
        m25_7_h2.adValueEventListener(this);
        m25_7_h2_s.adValueEventListener(this);
        m25_7_h3.adValueEventListener(this);
        m25_7_h3_s.adValueEventListener(this);
        m25_7_h4.adValueEventListener(this);
        m25_7_h4_s.adValueEventListener(this);
        m25_7_h5.adValueEventListener(this);
        m25_7_h5_s.adValueEventListener(this);
        m25_7_h6.adValueEventListener(this);
        m25_7_h6_s.adValueEventListener(this);
        m25_7_h7.adValueEventListener(this);
        m25_7_h7_s.adValueEventListener(this);
        m25_7_h8.adValueEventListener(this);
        m25_7_h8_s.adValueEventListener(this);
        m25_7_h9.adValueEventListener(this);
        m25_7_h9_s.adValueEventListener(this);
        /////////////////////////////////////
        mDate_26_7.adValueEventListener(this);
        m26_7_h1.adValueEventListener(this);
        m26_7_h1_s.adValueEventListener(this);
        m26_7_h2.adValueEventListener(this);
        m26_7_h2_s.adValueEventListener(this);
        m26_7_h3.adValueEventListener(this);
        m26_7_h3_s.adValueEventListener(this);
        m26_7_h4.adValueEventListener(this);
        m26_7_h4_s.adValueEventListener(this);
        m26_7_h5.adValueEventListener(this);
        m26_7_h5_s.adValueEventListener(this);
        m26_7_h6.adValueEventListener(this);
        m26_7_h6_s.adValueEventListener(this);
        m26_7_h7.adValueEventListener(this);
        m26_7_h7_s.adValueEventListener(this);
        m26_7_h8.adValueEventListener(this);
        m26_7_h8_s.adValueEventListener(this);
        m26_7_h9.adValueEventListener(this);
        m26_7_h9_s.adValueEventListener(this);
        /////////////////////////////////////
        mDate_27_7.adValueEventListener(this);
        m27_7_h1.adValueEventListener(this);
        m27_7_h1_s.adValueEventListener(this);
        m27_7_h2.adValueEventListener(this);
        m27_7_h2_s.adValueEventListener(this);
        m27_7_h3.adValueEventListener(this);
        m27_7_h3_s.adValueEventListener(this);
        m27_7_h4.adValueEventListener(this);
        m27_7_h4_s.adValueEventListener(this);
        m27_7_h5.adValueEventListener(this);
        m27_7_h5_s.adValueEventListener(this);
        m27_7_h6.adValueEventListener(this);
        m27_7_h6_s.adValueEventListener(this);
        m27_7_h7.adValueEventListener(this);
        m27_7_h7_s.adValueEventListener(this);
        m27_7_h8.adValueEventListener(this);
        m27_7_h8_s.adValueEventListener(this);
        m27_7_h9.adValueEventListener(this);
        m27_7_h9_s.adValueEventListener(this);
        /////////////////////////////////////
        mDate_28_7.adValueEventListener(this);
        m28_7_h1.adValueEventListener(this);
        m28_7_h1_s.adValueEventListener(this);
        m28_7_h2.adValueEventListener(this);
        m28_7_h2_s.adValueEventListener(this);
        m28_7_h3.adValueEventListener(this);
        m28_7_h3_s.adValueEventListener(this);
        m28_7_h4.adValueEventListener(this);
        m28_7_h4_s.adValueEventListener(this);
        m28_7_h5.adValueEventListener(this);
        m28_7_h5_s.adValueEventListener(this);
        m28_7_h6.adValueEventListener(this);
        m28_7_h6_s.adValueEventListener(this);
        m28_7_h7.adValueEventListener(this);
        m28_7_h7_s.adValueEventListener(this);
        m28_7_h8.adValueEventListener(this);
        m28_7_h8_s.adValueEventListener(this);
        m28_7_h9.adValueEventListener(this);
        m28_7_h9_s.adValueEventListener(this);
        /////////////////////////////////////
        mDate_29_7.adValueEventListener(this);
        m29_7_h1.adValueEventListener(this);
        m29_7_h1_s.adValueEventListener(this);
        m29_7_h2.adValueEventListener(this);
        m29_7_h2_s.adValueEventListener(this);
        m29_7_h3.adValueEventListener(this);
        m29_7_h3_s.adValueEventListener(this);
        m29_7_h4.adValueEventListener(this);
        m29_7_h4_s.adValueEventListener(this);
        m29_7_h5.adValueEventListener(this);
        m29_7_h5_s.adValueEventListener(this);
        m29_7_h6.adValueEventListener(this);
        m29_7_h6_s.adValueEventListener(this);
        m29_7_h7.adValueEventListener(this);
        m29_7_h7_s.adValueEventListener(this);
        m29_7_h8.adValueEventListener(this);
        m29_7_h8_s.adValueEventListener(this);
        m29_7_h9.adValueEventListener(this);
        m29_7_h9_s.adValueEventListener(this);
        /////////////////////////////////////
        mDate_30_7.adValueEventListener(this);
        m30_7_h1.adValueEventListener(this);
        m30_7_h1_s.adValueEventListener(this);
        m30_7_h2.adValueEventListener(this);
        m30_7_h2_s.adValueEventListener(this);
        m30_7_h3.adValueEventListener(this);
        m30_7_h3_s.adValueEventListener(this);
        m30_7_h4.adValueEventListener(this);
        m30_7_h4_s.adValueEventListener(this);
        m30_7_h5.adValueEventListener(this);
        m30_7_h5_s.adValueEventListener(this);
        m30_7_h6.adValueEventListener(this);
        m30_7_h6_s.adValueEventListener(this);
        m30_7_h7.adValueEventListener(this);
        m30_7_h7_s.adValueEventListener(this);
        m30_7_h8.adValueEventListener(this);
        m30_7_h8_s.adValueEventListener(this);
        m30_7_h9.adValueEventListener(this);
        m30_7_h9_s.adValueEventListener(this);



    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
