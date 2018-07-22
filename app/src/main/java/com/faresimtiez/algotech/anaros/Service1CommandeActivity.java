package com.faresimtiez.algotech.anaros;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.NotificationCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class Service1CommandeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener,AdapterView.OnItemSelectedListener, ValueEventListener {
    Button btn_send_message,confirm;
    EditText input_msg,chat_nom,chat_prenom,chat_email,chat_tel;
    TextView chat_conversation,final_r ;
    private String user_name,room_name;
    private DatabaseReference root;
    private String temp_key;
    String tmp;
    String txt_nom,txt_prenom,txt_email,txt_tel,txt_service;
    CheckBox mbx_ser_1_a1,mbx_ser_1_a2,mbx_ser_1_a3,mbx_ser_1_a4,mbx_ser_1_a5,mbx_ser_1_a6,mbx_ser_1_a7,mbx_ser_1_a8,mbx_ser_1_a9,mbx_ser_1_a10,mbx_ser_1_a11,mbx_ser_1_a12,mbx_ser_1_a13,mbx_ser_1_a14,mbx_ser_1_a15;
    ArrayList<String> selection = new ArrayList<String>();

    NotificationCompat.Builder notification;
    private static final int uniqueID=375451;
    EditText to, from , subject , message;

    String final_services_selection="";
    String btn="";


    FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    DatabaseReference mRootReference = firebaseDatabase.getInstance().getReference("RDV");
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
            m2_7_h1 = mDate_2_7.child("2_7_h1_info");DatabaseReference
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
            m7_7_h3 = mDate_1_7.child("7_7_h3_info");DatabaseReference
            m7_7_h3_s = mDate_1_7.child("7_7_h3_s");
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
            m9_7_h8 = mDate_9_7.child("9_7_h8_info");DatabaseReference
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
    DatabaseReference mDate_11_7 = mRootReference.child("2_7");
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
    DatabaseReference mDate_12_7 = mRootReference.child("122_7");
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
    DatabaseReference mDate_14_7 = mRootReference.child("2_7");
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
    DatabaseReference mDate_16_7 = mRootReference.child("2_7");
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
            m29_7_h7 = mDate_29_7.child("2_7_h7_info");DatabaseReference
            m29_7_h7_s = mDate_29_7.child("2_7_h7_s");
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
    //31-7
    DatabaseReference mDate_31_7 = mRootReference.child("31_7");
    DatabaseReference
            m31_7_h1 = mDate_31_7.child("31_7_h1_info");DatabaseReference
            m31_7_h1_s = mDate_31_7.child("31_7_h1_s");
    DatabaseReference
            m31_7_h2 = mDate_31_7.child("31_7_h2_info");DatabaseReference
            m31_7_h2_s = mDate_31_7.child("31_7_h2_s");
    DatabaseReference
            m31_7_h3 = mDate_31_7.child("31_7_h3_info");DatabaseReference
            m31_7_h3_s = mDate_31_7.child("31_7_h3_s");
    DatabaseReference
            m31_7_h4 = mDate_31_7.child("31_7_h4_info");DatabaseReference
            m31_7_h4_s = mDate_31_7.child("31_7_h4_s");
    DatabaseReference
            m31_7_h5 = mDate_31_7.child("31_7_h5_info");DatabaseReference
            m31_7_h5_s = mDate_31_7.child("31_7_h5_s");
    DatabaseReference
            m31_7_h6 = mDate_31_7.child("31_7_h6_info");DatabaseReference
            m31_7_h6_s = mDate_31_7.child("31_7_h6_s");
    DatabaseReference
            m31_7_h7 = mDate_31_7.child("31_7_h7_info");DatabaseReference
            m31_7_h7_s = mDate_31_7.child("31_7_h7_s");
    DatabaseReference
            m31_7_h8 = mDate_31_7.child("31_7_h8_info");DatabaseReference
            m31_7_h8_s = mDate_31_7.child("31_7_h8_s");
    DatabaseReference
            m31_7_h9 = mDate_31_7.child("31_7_h9_info");DatabaseReference
            m31_7_h9_s = mDate_31_7.child("31_7_h9_s");



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service1_commande);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        Intent i = getIntent();
        Bundle extras = i.getExtras();
        final String tmp = extras.getString("IntentKey");
        btn = extras.getString("btn");



        btn_send_message = (Button)findViewById(R.id.btn_send);
        btn_send_message.setEnabled(false);
        input_msg = (EditText)findViewById(R.id.msg_input);
        chat_conversation = (TextView)findViewById(R.id.textView2);

        confirm = (Button)findViewById(R.id.confirm);



        final_r = (TextView)findViewById(R.id.final_result);



        mbx_ser_1_a1 = (CheckBox)findViewById(R.id.bx_ser_1_a1);
        mbx_ser_1_a2 = (CheckBox)findViewById(R.id.bx_ser_1_a2);
        mbx_ser_1_a3 = (CheckBox)findViewById(R.id.bx_ser_1_a3);
        mbx_ser_1_a4 = (CheckBox)findViewById(R.id.bx_ser_1_a4);
        mbx_ser_1_a5 = (CheckBox)findViewById(R.id.bx_ser_1_a5);
        mbx_ser_1_a6 = (CheckBox)findViewById(R.id.bx_ser_1_a6);
        mbx_ser_1_a7 = (CheckBox)findViewById(R.id.bx_ser_1_a7);
        mbx_ser_1_a8 = (CheckBox)findViewById(R.id.bx_ser_1_a8);
        mbx_ser_1_a9 = (CheckBox)findViewById(R.id.bx_ser_1_a9);
        mbx_ser_1_a10 = (CheckBox)findViewById(R.id.bx_ser_1_a10);
        mbx_ser_1_a11 = (CheckBox)findViewById(R.id.bx_ser_1_a11);
        mbx_ser_1_a12 = (CheckBox)findViewById(R.id.bx_ser_1_a12);
        mbx_ser_1_a13 = (CheckBox)findViewById(R.id.bx_ser_1_a13);
        mbx_ser_1_a14 = (CheckBox)findViewById(R.id.bx_ser_1_a14);


        btn_send_message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.service1_commande, menu);
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
            Intent i = new Intent(Service1CommandeActivity.this, ServicesListActivity.class);
            startActivity(i);
        } else if (id == R.id.nav_salon) {
            Intent i = new Intent(Service1CommandeActivity.this, SalonActivity.class);
            startActivity(i);
        } else if (id == R.id.nav_work) {

        } else if (id == R.id.nav_admin) {
            Intent i = new Intent(Service1CommandeActivity.this, AdminLoginActivity.class);
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
            Intent i = new Intent(Service1CommandeActivity.this, ShareExActivity.class);
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
            Intent i = new Intent(Service1CommandeActivity.this, ContactActivity.class);
            startActivity(i);
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void finalSelection(View view){
        final_services_selection="";
        for (String Selections : selection){
            final_services_selection = final_services_selection + Selections + "\n";
        }
        confirm.setEnabled(false);
        final_r.setText(final_services_selection);
        chat_nom = (EditText)findViewById(R.id.chat_nom);
        chat_prenom = (EditText)findViewById(R.id.chat_prenom);
        chat_email = (EditText)findViewById(R.id.chat_email);
        chat_tel = (EditText)findViewById(R.id.chat_tel);
        txt_nom = chat_nom.getText().toString().trim();
        txt_prenom = chat_prenom.getText().toString().trim();
        txt_email = chat_email.getText().toString().trim();
        txt_tel = chat_tel.getText().toString().trim();
        txt_service = final_r.getText().toString().trim();
        input_msg.setText(txt_nom+"\n"+txt_prenom+"\n"+txt_email+"\n"+txt_tel+"\n"+tmp+"\b"+final_services_selection);

        //btn_send_message.setEnabled(true);

        switch (btn){
            ////////////////////////////////////////////////////
            case "1_7_h1":
                m1_7_h1_s.setValue("demander");
                m1_7_h1.setValue(input_msg.getText().toString());
                break;
            case "1_7_h2":
                m1_7_h2_s.setValue("demander");
                m1_7_h2.setValue(input_msg.getText().toString());
                break;
            case "1_7_h3":
                m1_7_h3_s.setValue("demander");
                m1_7_h3.setValue(input_msg.getText().toString());
                break;
            case "1_7_h4":
                m1_7_h4_s.setValue("demander");
                m1_7_h4.setValue(input_msg.getText().toString());
                break;
            case "1_7_h5":
                m1_7_h5_s.setValue("demander");
                m1_7_h5.setValue(input_msg.getText().toString());
                break;
            case "1_7_h6":
                m1_7_h6_s.setValue("demander");
                m1_7_h6.setValue(input_msg.getText().toString());
                break;
            case "1_7_h7":
                m1_7_h7_s.setValue("demander");
                m1_7_h7.setValue(input_msg.getText().toString());
                break;
            case "1_7_h8":
                m1_7_h8_s.setValue("demander");
                m1_7_h8.setValue(input_msg.getText().toString());
                break;
            case "1_7_h9":
                m1_7_h9_s.setValue("demander");
                m1_7_h9.setValue(input_msg.getText().toString());
                break;
            ////////////////////////////////////////////////////
            case "2_7_h1":
                m2_7_h1_s.setValue("demander");
                m2_7_h1.setValue(input_msg.getText().toString());
                break;
            case "2_7_h2":
                m2_7_h2_s.setValue("demander");
                m2_7_h2.setValue(input_msg.getText().toString());
                break;
            case "2_7_h3":
                m2_7_h3_s.setValue("demander");
                m2_7_h3.setValue(input_msg.getText().toString());
                break;
            case "2_7_h4":
                m2_7_h4_s.setValue("demander");
                m2_7_h4.setValue(input_msg.getText().toString());
                break;
            case "2_7_h5":
                m2_7_h5_s.setValue("demander");
                m2_7_h5.setValue(input_msg.getText().toString());
                break;
            case "2_7_h6":
                m2_7_h6_s.setValue("demander");
                m2_7_h6.setValue(input_msg.getText().toString());
                break;
            case "2_7_h7":
                m2_7_h7_s.setValue("demander");
                m2_7_h7.setValue(input_msg.getText().toString());
                break;
            case "2_7_h8":
                m2_7_h8_s.setValue("demander");
                m2_7_h8.setValue(input_msg.getText().toString());
                break;
            case "2_7_h9":
                m2_7_h9_s.setValue("demander");
                m2_7_h9.setValue(input_msg.getText().toString());
                break;
            ////////////////////////////////////////////////////
            case "3_7_h1":
                m3_7_h1_s.setValue("demander");
                m3_7_h1.setValue(input_msg.getText().toString());
                break;
            case "3_7_h2":
                m3_7_h2_s.setValue("demander");
                m3_7_h2.setValue(input_msg.getText().toString());
                break;
            case "3_7_h3":
                m3_7_h3_s.setValue("demander");
                m3_7_h3.setValue(input_msg.getText().toString());
                break;
            case "3_7_h4":
                m3_7_h4_s.setValue("demander");
                m3_7_h4.setValue(input_msg.getText().toString());
                break;
            case "3_7_h5":
                m3_7_h5_s.setValue("demander");
                m3_7_h5.setValue(input_msg.getText().toString());
                break;
            case "3_7_h6":
                m3_7_h6_s.setValue("demander");
                m3_7_h6.setValue(input_msg.getText().toString());
                break;
            case "3_7_h7":
                m3_7_h7_s.setValue("demander");
                m3_7_h7.setValue(input_msg.getText().toString());
                break;
            case "3_7_h8":
                m3_7_h8_s.setValue("demander");
                m3_7_h8.setValue(input_msg.getText().toString());
                break;
            case "3_7_h9":
                m3_7_h9_s.setValue("demander");
                m3_7_h9.setValue(input_msg.getText().toString());
                break;
            ////////////////////////////////////////////////////
            case "4_7_h1":
                m4_7_h1_s.setValue("demander");
                m4_7_h1.setValue(input_msg.getText().toString());
                break;
            case "4_7_h2":
                m4_7_h2_s.setValue("demander");
                m4_7_h2.setValue(input_msg.getText().toString());
                break;
            case "4_7_h3":
                m4_7_h3_s.setValue("demander");
                m4_7_h3.setValue(input_msg.getText().toString());
                break;
            case "4_7_h4":
                m4_7_h4_s.setValue("demander");
                m4_7_h4.setValue(input_msg.getText().toString());
                break;
            case "4_7_h5":
                m4_7_h5_s.setValue("demander");
                m4_7_h5.setValue(input_msg.getText().toString());
                break;
            case "4_7_h6":
                m4_7_h6_s.setValue("demander");
                m4_7_h6.setValue(input_msg.getText().toString());
                break;
            case "4_7_h7":
                m4_7_h7_s.setValue("demander");
                m4_7_h7.setValue(input_msg.getText().toString());
                break;
            case "4_7_h8":
                m4_7_h8_s.setValue("demander");
                m4_7_h8.setValue(input_msg.getText().toString());
                break;
            case "4_7_h9":
                m4_7_h9_s.setValue("demander");
                m4_7_h9.setValue(input_msg.getText().toString());
                break;
            ////////////////////////////////////////////////////
            case "5_7_h1":
                m5_7_h1_s.setValue("demander");
                m5_7_h1.setValue(input_msg.getText().toString());
                break;
            case "5_7_h2":
                m5_7_h2_s.setValue("demander");
                m5_7_h2.setValue(input_msg.getText().toString());
                break;
            case "5_7_h3":
                m5_7_h3_s.setValue("demander");
                m5_7_h3.setValue(input_msg.getText().toString());
                break;
            case "5_7_h4":
                m5_7_h4_s.setValue("demander");
                m5_7_h4.setValue(input_msg.getText().toString());
                break;
            case "5_7_h5":
                m5_7_h5_s.setValue("demander");
                m5_7_h5.setValue(input_msg.getText().toString());
                break;
            case "5_7_h6":
                m5_7_h6_s.setValue("demander");
                m5_7_h6.setValue(input_msg.getText().toString());
                break;
            case "5_7_h7":
                m5_7_h7_s.setValue("demander");
                m5_7_h7.setValue(input_msg.getText().toString());
                break;
            case "5_7_h8":
                m5_7_h8_s.setValue("demander");
                m5_7_h8.setValue(input_msg.getText().toString());
                break;
            case "5_7_h9":
                m5_7_h9_s.setValue("demander");
                m5_7_h9.setValue(input_msg.getText().toString());
                break;
            ////////////////////////////////////////////////////
            case "6_7_h1":
                m6_7_h1_s.setValue("demander");
                m6_7_h1.setValue(input_msg.getText().toString());
                break;
            case "6_7_h2":
                m6_7_h2_s.setValue("demander");
                m6_7_h2.setValue(input_msg.getText().toString());
                break;
            case "6_7_h3":
                m6_7_h3_s.setValue("demander");
                m6_7_h3.setValue(input_msg.getText().toString());
                break;
            case "6_7_h4":
                m6_7_h4_s.setValue("demander");
                m6_7_h4.setValue(input_msg.getText().toString());
                break;
            case "6_7_h5":
                m6_7_h5_s.setValue("demander");
                m6_7_h5.setValue(input_msg.getText().toString());
                break;
            case "6_7_h6":
                m6_7_h6_s.setValue("demander");
                m6_7_h6.setValue(input_msg.getText().toString());
                break;
            case "6_7_h7":
                m6_7_h7_s.setValue("demander");
                m6_7_h7.setValue(input_msg.getText().toString());
                break;
            case "6_7_h8":
                m6_7_h8_s.setValue("demander");
                m6_7_h8.setValue(input_msg.getText().toString());
                break;
            case "6_7_h9":
                m6_7_h9_s.setValue("demander");
                m6_7_h9.setValue(input_msg.getText().toString());
                break;
            ////////////////////////////////////////////////////
            case "7_7_h1":
                m7_7_h1_s.setValue("demander");
                m7_7_h1.setValue(input_msg.getText().toString());
                break;
            case "7_7_h2":
                m7_7_h2_s.setValue("demander");
                m7_7_h2.setValue(input_msg.getText().toString());
                break;
            case "7_7_h3":
                m7_7_h3_s.setValue("demander");
                m7_7_h3.setValue(input_msg.getText().toString());
                break;
            case "7_7_h4":
                m7_7_h4_s.setValue("demander");
                m7_7_h4.setValue(input_msg.getText().toString());
                break;
            case "7_7_h5":
                m7_7_h5_s.setValue("demander");
                m7_7_h5.setValue(input_msg.getText().toString());
                break;
            case "7_7_h6":
                m7_7_h6_s.setValue("demander");
                m7_7_h6.setValue(input_msg.getText().toString());
                break;
            case "7_7_h7":
                m7_7_h7_s.setValue("demander");
                m7_7_h7.setValue(input_msg.getText().toString());
                break;
            case "7_7_h8":
                m7_7_h8_s.setValue("demander");
                m7_7_h8.setValue(input_msg.getText().toString());
                break;
            case "7_7_h9":
                m7_7_h9_s.setValue("demander");
                m7_7_h9.setValue(input_msg.getText().toString());
                break;
            ////////////////////////////////////////////////////
            case "8_7_h1":
                m8_7_h1_s.setValue("demander");
                m8_7_h1.setValue(input_msg.getText().toString());
                break;
            case "8_7_h2":
                m8_7_h2_s.setValue("demander");
                m8_7_h2.setValue(input_msg.getText().toString());
                break;
            case "8_7_h3":
                m8_7_h3_s.setValue("demander");
                m8_7_h3.setValue(input_msg.getText().toString());
                break;
            case "8_7_h4":
                m8_7_h4_s.setValue("demander");
                m8_7_h4.setValue(input_msg.getText().toString());
                break;
            case "8_7_h5":
                m8_7_h5_s.setValue("demander");
                m8_7_h5.setValue(input_msg.getText().toString());
                break;
            case "8_7_h6":
                m8_7_h6_s.setValue("demander");
                m8_7_h6.setValue(input_msg.getText().toString());
                break;
            case "8_7_h7":
                m8_7_h7_s.setValue("demander");
                m8_7_h7.setValue(input_msg.getText().toString());
                break;
            case "8_7_h8":
                m8_7_h8_s.setValue("demander");
                m8_7_h8.setValue(input_msg.getText().toString());
                break;
            case "8_7_h9":
                m8_7_h9_s.setValue("demander");
                m8_7_h9.setValue(input_msg.getText().toString());
                break;
            ////////////////////////////////////////////////////
            case "9_7_h1":
                m9_7_h1_s.setValue("demander");
                m9_7_h1.setValue(input_msg.getText().toString());
                break;
            case "9_7_h2":
                m9_7_h2_s.setValue("demander");
                m9_7_h2.setValue(input_msg.getText().toString());
                break;
            case "9_7_h3":
                m9_7_h3_s.setValue("demander");
                m9_7_h3.setValue(input_msg.getText().toString());
                break;
            case "9_7_h4":
                m9_7_h4_s.setValue("demander");
                m9_7_h4.setValue(input_msg.getText().toString());
                break;
            case "9_7_h5":
                m9_7_h5_s.setValue("demander");
                m9_7_h5.setValue(input_msg.getText().toString());
                break;
            case "9_7_h6":
                m9_7_h6_s.setValue("demander");
                m9_7_h6.setValue(input_msg.getText().toString());
                break;
            case "9_7_h7":
                m9_7_h7_s.setValue("demander");
                m9_7_h7.setValue(input_msg.getText().toString());
                break;
            case "9_7_h8":
                m9_7_h8_s.setValue("demander");
                m9_7_h8.setValue(input_msg.getText().toString());
                break;
            case "9_7_h9":
                m9_7_h9_s.setValue("demander");
                m9_7_h9.setValue(input_msg.getText().toString());
                break;
            ////////////////////////////////////////////////////
            case "10_7_h1":
                m10_7_h1_s.setValue("demander");
                m10_7_h1.setValue(input_msg.getText().toString());
                break;
            case "10_7_h2":
                m10_7_h2_s.setValue("demander");
                m10_7_h2.setValue(input_msg.getText().toString());
                break;
            case "10_7_h3":
                m10_7_h3_s.setValue("demander");
                m10_7_h3.setValue(input_msg.getText().toString());
                break;
            case "10_7_h4":
                m10_7_h4_s.setValue("demander");
                m10_7_h4.setValue(input_msg.getText().toString());
                break;
            case "10_7_h5":
                m10_7_h5_s.setValue("demander");
                m10_7_h5.setValue(input_msg.getText().toString());
                break;
            case "10_7_h6":
                m10_7_h6_s.setValue("demander");
                m10_7_h6.setValue(input_msg.getText().toString());
                break;
            case "10_7_h7":
                m10_7_h7_s.setValue("demander");
                m10_7_h7.setValue(input_msg.getText().toString());
                break;
            case "10_7_h8":
                m10_7_h8_s.setValue("demander");
                m10_7_h8.setValue(input_msg.getText().toString());
                break;
            case "10_7_h9":
                m10_7_h9_s.setValue("demander");
                m10_7_h9.setValue(input_msg.getText().toString());
                break;
            ////////////////////////////////////////////////////
            case "11_7_h1":
                m11_7_h1_s.setValue("demander");
                m11_7_h1.setValue(input_msg.getText().toString());
                break;
            case "11_7_h2":
                m11_7_h2_s.setValue("demander");
                m11_7_h2.setValue(input_msg.getText().toString());
                break;
            case "11_7_h3":
                m11_7_h3_s.setValue("demander");
                m11_7_h3.setValue(input_msg.getText().toString());
                break;
            case "11_7_h4":
                m11_7_h4_s.setValue("demander");
                m11_7_h4.setValue(input_msg.getText().toString());
                break;
            case "11_7_h5":
                m11_7_h5_s.setValue("demander");
                m11_7_h5.setValue(input_msg.getText().toString());
                break;
            case "11_7_h6":
                m11_7_h6_s.setValue("demander");
                m11_7_h6.setValue(input_msg.getText().toString());
                break;
            case "11_7_h7":
                m11_7_h7_s.setValue("demander");
                m11_7_h7.setValue(input_msg.getText().toString());
                break;
            case "11_7_h8":
                m11_7_h8_s.setValue("demander");
                m11_7_h8.setValue(input_msg.getText().toString());
                break;
            case "11_7_h9":
                m11_7_h9_s.setValue("demander");
                m11_7_h9.setValue(input_msg.getText().toString());
                break;
            ////////////////////////////////////////////////////
            case "12_7_h1":
                m12_7_h1_s.setValue("demander");
                m12_7_h1.setValue(input_msg.getText().toString());
                break;
            case "12_7_h2":
                m12_7_h2_s.setValue("demander");
                m12_7_h2.setValue(input_msg.getText().toString());
                break;
            case "12_7_h3":
                m12_7_h3_s.setValue("demander");
                m12_7_h3.setValue(input_msg.getText().toString());
                break;
            case "12_7_h4":
                m12_7_h4_s.setValue("demander");
                m12_7_h4.setValue(input_msg.getText().toString());
                break;
            case "12_7_h5":
                m12_7_h5_s.setValue("demander");
                m12_7_h5.setValue(input_msg.getText().toString());
                break;
            case "12_7_h6":
                m12_7_h6_s.setValue("demander");
                m12_7_h6.setValue(input_msg.getText().toString());
                break;
            case "12_7_h7":
                m12_7_h7_s.setValue("demander");
                m12_7_h7.setValue(input_msg.getText().toString());
                break;
            case "12_7_h8":
                m12_7_h8_s.setValue("demander");
                m12_7_h8.setValue(input_msg.getText().toString());
                break;
            case "12_7_h9":
                m12_7_h9_s.setValue("demander");
                m12_7_h9.setValue(input_msg.getText().toString());
                break;
            ////////////////////////////////////////////////////
            case "13_7_h1":
                m13_7_h1_s.setValue("demander");
                m13_7_h1.setValue(input_msg.getText().toString());
                break;
            case "13_7_h2":
                m13_7_h2_s.setValue("demander");
                m13_7_h2.setValue(input_msg.getText().toString());
                break;
            case "13_7_h3":
                m13_7_h3_s.setValue("demander");
                m13_7_h3.setValue(input_msg.getText().toString());
                break;
            case "13_7_h4":
                m13_7_h4_s.setValue("demander");
                m13_7_h4.setValue(input_msg.getText().toString());
                break;
            case "13_7_h5":
                m13_7_h5_s.setValue("demander");
                m13_7_h5.setValue(input_msg.getText().toString());
                break;
            case "13_7_h6":
                m13_7_h6_s.setValue("demander");
                m13_7_h6.setValue(input_msg.getText().toString());
                break;
            case "14_7_h7":
                m14_7_h7_s.setValue("demander");
                m14_7_h7.setValue(input_msg.getText().toString());
                break;
            case "14_7_h8":
                m14_7_h8_s.setValue("demander");
                m14_7_h8.setValue(input_msg.getText().toString());
                break;
            case "14_7_h9":
                m14_7_h9_s.setValue("demander");
                m14_7_h9.setValue(input_msg.getText().toString());
                break;
            ////////////////////////////////////////////////////
            case "15_7_h1":
                m15_7_h1_s.setValue("demander");
                m15_7_h1.setValue(input_msg.getText().toString());
                break;
            case "15_7_h2":
                m15_7_h2_s.setValue("demander");
                m15_7_h2.setValue(input_msg.getText().toString());
                break;
            case "15_7_h3":
                m15_7_h3_s.setValue("demander");
                m15_7_h3.setValue(input_msg.getText().toString());
                break;
            case "15_7_h4":
                m15_7_h4_s.setValue("demander");
                m15_7_h4.setValue(input_msg.getText().toString());
                break;
            case "15_7_h5":
                m15_7_h5_s.setValue("demander");
                m15_7_h5.setValue(input_msg.getText().toString());
                break;
            case "15_7_h6":
                m15_7_h6_s.setValue("demander");
                m15_7_h6.setValue(input_msg.getText().toString());
                break;
            case "15_7_h7":
                m15_7_h7_s.setValue("demander");
                m15_7_h7.setValue(input_msg.getText().toString());
                break;
            case "15_7_h8":
                m15_7_h8_s.setValue("demander");
                m15_7_h8.setValue(input_msg.getText().toString());
                break;
            case "15_7_h9":
                m15_7_h9_s.setValue("demander");
                m15_7_h9.setValue(input_msg.getText().toString());
                break;
            ////////////////////////////////////////////////////
            case "16_7_h1":
                m16_7_h1_s.setValue("demander");
                m16_7_h1.setValue(input_msg.getText().toString());
                break;
            case "16_7_h2":
                m16_7_h2_s.setValue("demander");
                m16_7_h2.setValue(input_msg.getText().toString());
                break;
            case "16_7_h3":
                m16_7_h3_s.setValue("demander");
                m16_7_h3.setValue(input_msg.getText().toString());
                break;
            case "16_7_h4":
                m16_7_h4_s.setValue("demander");
                m16_7_h4.setValue(input_msg.getText().toString());
                break;
            case "16_7_h5":
                m16_7_h5_s.setValue("demander");
                m16_7_h5.setValue(input_msg.getText().toString());
                break;
            case "16_7_h6":
                m16_7_h6_s.setValue("demander");
                m16_7_h6.setValue(input_msg.getText().toString());
                break;
            case "16_7_h7":
                m16_7_h7_s.setValue("demander");
                m16_7_h7.setValue(input_msg.getText().toString());
                break;
            case "16_7_h8":
                m16_7_h8_s.setValue("demander");
                m16_7_h8.setValue(input_msg.getText().toString());
                break;
            case "16_7_h9":
                m16_7_h9_s.setValue("demander");
                m16_7_h9.setValue(input_msg.getText().toString());
                break;
            ////////////////////////////////////////////////////
            case "17_7_h1":
                m17_7_h1_s.setValue("demander");
                m17_7_h1.setValue(input_msg.getText().toString());
                break;
            case "17_7_h2":
                m17_7_h2_s.setValue("demander");
                m17_7_h2.setValue(input_msg.getText().toString());
                break;
            case "17_7_h3":
                m17_7_h3_s.setValue("demander");
                m17_7_h3.setValue(input_msg.getText().toString());
                break;
            case "17_7_h4":
                m17_7_h4_s.setValue("demander");
                m17_7_h4.setValue(input_msg.getText().toString());
                break;
            case "17_7_h5":
                m17_7_h5_s.setValue("demander");
                m17_7_h5.setValue(input_msg.getText().toString());
                break;
            case "17_7_h6":
                m17_7_h6_s.setValue("demander");
                m17_7_h6.setValue(input_msg.getText().toString());
                break;
            case "17_7_h7":
                m17_7_h7_s.setValue("demander");
                m17_7_h7.setValue(input_msg.getText().toString());
                break;
            case "17_7_h8":
                m17_7_h8_s.setValue("demander");
                m17_7_h8.setValue(input_msg.getText().toString());
                break;
            case "17_7_h9":
                m17_7_h9_s.setValue("demander");
                m17_7_h9.setValue(input_msg.getText().toString());
                break;
            ////////////////////////////////////////////////////
            case "18_7_h1":
                m18_7_h1_s.setValue("demander");
                m18_7_h1.setValue(input_msg.getText().toString());
                break;
            case "18_7_h2":
                m18_7_h2_s.setValue("demander");
                m18_7_h2.setValue(input_msg.getText().toString());
                break;
            case "18_7_h3":
                m18_7_h3_s.setValue("demander");
                m18_7_h3.setValue(input_msg.getText().toString());
                break;
            case "18_7_h4":
                m18_7_h4_s.setValue("demander");
                m18_7_h4.setValue(input_msg.getText().toString());
                break;
            case "18_7_h5":
                m18_7_h5_s.setValue("demander");
                m18_7_h5.setValue(input_msg.getText().toString());
                break;
            case "18_7_h6":
                m18_7_h6_s.setValue("demander");
                m18_7_h6.setValue(input_msg.getText().toString());
                break;
            case "18_7_h7":
                m18_7_h7_s.setValue("demander");
                m18_7_h7.setValue(input_msg.getText().toString());
                break;
            case "18_7_h8":
                m18_7_h8_s.setValue("demander");
                m18_7_h8.setValue(input_msg.getText().toString());
                break;
            case "18_7_h9":
                m18_7_h9_s.setValue("demander");
                m18_7_h9.setValue(input_msg.getText().toString());
                break;
            ////////////////////////////////////////////////////
            case "19_7_h1":
                m19_7_h1_s.setValue("demander");
                m19_7_h1.setValue(input_msg.getText().toString());
                break;
            case "19_7_h2":
                m19_7_h2_s.setValue("demander");
                m19_7_h2.setValue(input_msg.getText().toString());
                break;
            case "19_7_h3":
                m19_7_h3_s.setValue("demander");
                m19_7_h3.setValue(input_msg.getText().toString());
                break;
            case "19_7_h4":
                m19_7_h4_s.setValue("demander");
                m19_7_h4.setValue(input_msg.getText().toString());
                break;
            case "19_7_h5":
                m19_7_h5_s.setValue("demander");
                m19_7_h5.setValue(input_msg.getText().toString());
                break;
            case "19_7_h6":
                m19_7_h6_s.setValue("demander");
                m19_7_h6.setValue(input_msg.getText().toString());
                break;
            case "19_7_h7":
                m19_7_h7_s.setValue("demander");
                m19_7_h7.setValue(input_msg.getText().toString());
                break;
            case "19_7_h8":
                m19_7_h8_s.setValue("demander");
                m19_7_h8.setValue(input_msg.getText().toString());
                break;
            case "19_7_h9":
                m19_7_h9_s.setValue("demander");
                m19_7_h9.setValue(input_msg.getText().toString());
                break;
            ////////////////////////////////////////////////////
            case "20_7_h1":
                m20_7_h1_s.setValue("demander");
                m20_7_h1.setValue(input_msg.getText().toString());
                break;
            case "20_7_h2":
                m20_7_h2_s.setValue("demander");
                m20_7_h2.setValue(input_msg.getText().toString());
                break;
            case "20_7_h3":
                m20_7_h3_s.setValue("demander");
                m20_7_h3.setValue(input_msg.getText().toString());
                break;
            case "20_7_h4":
                m20_7_h4_s.setValue("demander");
                m20_7_h4.setValue(input_msg.getText().toString());
                break;
            case "20_7_h5":
                m20_7_h5_s.setValue("demander");
                m20_7_h5.setValue(input_msg.getText().toString());
                break;
            case "20_7_h6":
                m20_7_h6_s.setValue("demander");
                m20_7_h6.setValue(input_msg.getText().toString());
                break;
            case "20_7_h7":
                m20_7_h7_s.setValue("demander");
                m20_7_h7.setValue(input_msg.getText().toString());
                break;
            case "20_7_h8":
                m20_7_h8_s.setValue("demander");
                m20_7_h8.setValue(input_msg.getText().toString());
                break;
            case "20_7_h9":
                m29_7_h9_s.setValue("demander");
                m29_7_h9.setValue(input_msg.getText().toString());
                break;
            //////2/////////////////////////////////////////////
            case "21_7_h1":
                m21_7_h1_s.setValue("demander");
                m21_7_h1.setValue(input_msg.getText().toString());
                break;
            case "21_7_h2":
                m21_7_h2_s.setValue("demander");
                m21_7_h2.setValue(input_msg.getText().toString());
                break;
            case "21_7_h3":
                m21_7_h3_s.setValue("demander");
                m21_7_h3.setValue(input_msg.getText().toString());
                break;
            case "21_7_h4":
                m21_7_h4_s.setValue("demander");
                m21_7_h4.setValue(input_msg.getText().toString());
                break;
            case "21_7_h5":
                m21_7_h5_s.setValue("demander");
                m21_7_h5.setValue(input_msg.getText().toString());
                break;
            case "21_7_h6":
                m21_7_h6_s.setValue("demander");
                m21_7_h6.setValue(input_msg.getText().toString());
                break;
            case "21_7_h7":
                m21_7_h7_s.setValue("demander");
                m21_7_h7.setValue(input_msg.getText().toString());
                break;
            case "21_7_h8":
                m21_7_h8_s.setValue("demander");
                m21_7_h8.setValue(input_msg.getText().toString());
                break;
            case "21_7_h9":
                m21_7_h9_s.setValue("demander");
                m21_7_h9.setValue(input_msg.getText().toString());
                break;
            ////////////////////////////////////////////////////
            case "22_7_h1":
                m22_7_h1_s.setValue("demander");
                m22_7_h1.setValue(input_msg.getText().toString());
                break;
            case "22_7_h2":
                m22_7_h2_s.setValue("demander");
                m22_7_h2.setValue(input_msg.getText().toString());
                break;
            case "22_7_h3":
                m22_7_h3_s.setValue("demander");
                m22_7_h3.setValue(input_msg.getText().toString());
                break;
            case "22_7_h4":
                m22_7_h4_s.setValue("demander");
                m22_7_h4.setValue(input_msg.getText().toString());
                break;
            case "22_7_h5":
                m22_7_h5_s.setValue("demander");
                m22_7_h5.setValue(input_msg.getText().toString());
                break;
            case "22_7_h6":
                m22_7_h6_s.setValue("demander");
                m22_7_h6.setValue(input_msg.getText().toString());
                break;
            case "22_7_h7":
                m22_7_h7_s.setValue("demander");
                m22_7_h7.setValue(input_msg.getText().toString());
                break;
            case "22_7_h8":
                m22_7_h8_s.setValue("demander");
                m22_7_h8.setValue(input_msg.getText().toString());
                break;
            case "22_7_h9":
                m22_7_h9_s.setValue("demander");
                m22_7_h9.setValue(input_msg.getText().toString());
                break;
            ////////////////////////////////////////////////////

            case "23_7_h1":
                m23_7_h1_s.setValue("demander");
                m23_7_h1.setValue(input_msg.getText().toString());
                break;
            case "23_7_h2":
                m23_7_h2_s.setValue("demander");
                m23_7_h2.setValue(input_msg.getText().toString());
                break;
            case "23_7_h3":
                m23_7_h3_s.setValue("demander");
                m23_7_h3.setValue(input_msg.getText().toString());
                break;
            case "23_7_h4":
                m23_7_h4_s.setValue("demander");
                m23_7_h4.setValue(input_msg.getText().toString());
                break;
            case "23_7_h5":
                m23_7_h5_s.setValue("demander");
                m23_7_h5.setValue(input_msg.getText().toString());
                break;
            case "23_7_h6":
                m23_7_h6_s.setValue("demander");
                m23_7_h6.setValue(input_msg.getText().toString());
                break;
            case "23_7_h7":
                m23_7_h7_s.setValue("demander");
                m23_7_h7.setValue(input_msg.getText().toString());
                break;
            case "23_7_h8":
                m23_7_h8_s.setValue("demander");
                m23_7_h8.setValue(input_msg.getText().toString());
                break;
            case "23_7_h9":
                m23_7_h9_s.setValue("demander");
                m23_7_h9.setValue(input_msg.getText().toString());
                break;
            ////////////////////////////////////////////////////
            case "2947_h1":
                m24_7_h1_s.setValue("demander");
                m24_7_h1.setValue(input_msg.getText().toString());
                break;
            case "24_7_h2":
                m24_7_h2_s.setValue("demander");
                m24_7_h2.setValue(input_msg.getText().toString());
                break;
            case "24_7_h3":
                m24_7_h3_s.setValue("demander");
                m24_7_h3.setValue(input_msg.getText().toString());
                break;
            case "24_7_h4":
                m24_7_h4_s.setValue("demander");
                m24_7_h4.setValue(input_msg.getText().toString());
                break;
            case "24_7_h5":
                m24_7_h5_s.setValue("demander");
                m24_7_h5.setValue(input_msg.getText().toString());
                break;
            case "24_7_h6":
                m24_7_h6_s.setValue("demander");
                m24_7_h6.setValue(input_msg.getText().toString());
                break;
            case "24_7_h7":
                m24_7_h7_s.setValue("demander");
                m24_7_h7.setValue(input_msg.getText().toString());
                break;
            case "24_7_h8":
                m24_7_h8_s.setValue("demander");
                m24_7_h8.setValue(input_msg.getText().toString());
                break;
            case "24_7_h9":
                m24_7_h9_s.setValue("demander");
                m24_7_h9.setValue(input_msg.getText().toString());
                break;
            ////////////////////////////////////////////////////
            case "25_7_h1":
                m25_7_h1_s.setValue("demander");
                m25_7_h1.setValue(input_msg.getText().toString());
                break;
            case "25_7_h2":
                m25_7_h2_s.setValue("demander");
                m25_7_h2.setValue(input_msg.getText().toString());
                break;
            case "25_7_h3":
                m25_7_h3_s.setValue("demander");
                m25_7_h3.setValue(input_msg.getText().toString());
                break;
            case "25_7_h4":
                m25_7_h4_s.setValue("demander");
                m25_7_h4.setValue(input_msg.getText().toString());
                break;
            case "25_7_h5":
                m25_7_h5_s.setValue("demander");
                m25_7_h5.setValue(input_msg.getText().toString());
                break;
            case "25_7_h6":
                m25_7_h6_s.setValue("demander");
                m25_7_h6.setValue(input_msg.getText().toString());
                break;
            case "25_7_h7":
                m25_7_h7_s.setValue("demander");
                m25_7_h7.setValue(input_msg.getText().toString());
                break;
            case "25_7_h8":
                m25_7_h8_s.setValue("demander");
                m25_7_h8.setValue(input_msg.getText().toString());
                break;
            case "25_7_h9":
                m25_7_h9_s.setValue("demander");
                m25_7_h9.setValue(input_msg.getText().toString());
                break;
            ////////////////////////////////////////////////////
            case "26_7_h1":
                m26_7_h1_s.setValue("demander");
                m26_7_h1.setValue(input_msg.getText().toString());
                break;
            case "26_7_h2":
                m26_7_h2_s.setValue("demander");
                m26_7_h2.setValue(input_msg.getText().toString());
                break;
            case "26_7_h3":
                m26_7_h3_s.setValue("demander");
                m26_7_h3.setValue(input_msg.getText().toString());
                break;
            case "26_7_h4":
                m26_7_h4_s.setValue("demander");
                m26_7_h4.setValue(input_msg.getText().toString());
                break;
            case "26_7_h5":
                m26_7_h5_s.setValue("demander");
                m26_7_h5.setValue(input_msg.getText().toString());
                break;
            case "26_7_h6":
                m26_7_h6_s.setValue("demander");
                m26_7_h6.setValue(input_msg.getText().toString());
                break;
            case "26_7_h7":
                m26_7_h7_s.setValue("demander");
                m26_7_h7.setValue(input_msg.getText().toString());
                break;
            case "26_7_h8":
                m26_7_h8_s.setValue("demander");
                m26_7_h8.setValue(input_msg.getText().toString());
                break;
            case "26_7_h9":
                m26_7_h9_s.setValue("demander");
                m26_7_h9.setValue(input_msg.getText().toString());
                break;
            ////////////////////////////////////////////////////
            case "27_7_h1":
                m27_7_h1_s.setValue("demander");
                m27_7_h1.setValue(input_msg.getText().toString());
                break;
            case "27_7_h2":
                m27_7_h2_s.setValue("demander");
                m27_7_h2.setValue(input_msg.getText().toString());
                break;
            case "27_7_h3":
                m27_7_h3_s.setValue("demander");
                m27_7_h3.setValue(input_msg.getText().toString());
                break;
            case "27_7_h4":
                m27_7_h4_s.setValue("demander");
                m27_7_h4.setValue(input_msg.getText().toString());
                break;
            case "27_7_h5":
                m27_7_h5_s.setValue("demander");
                m27_7_h5.setValue(input_msg.getText().toString());
                break;
            case "27_7_h6":
                m27_7_h6_s.setValue("demander");
                m27_7_h6.setValue(input_msg.getText().toString());
                break;
            case "27_7_h7":
                m27_7_h7_s.setValue("demander");
                m27_7_h7.setValue(input_msg.getText().toString());
                break;
            case "27_7_h8":
                m27_7_h8_s.setValue("demander");
                m27_7_h8.setValue(input_msg.getText().toString());
                break;
            case "27_7_h9":
                m27_7_h9_s.setValue("demander");
                m27_7_h9.setValue(input_msg.getText().toString());
                break;
            ////////////////////////////////////////////////////
            case "28_7_h1":
                m28_7_h1_s.setValue("demander");
                m28_7_h1.setValue(input_msg.getText().toString());
                break;
            case "28_7_h2":
                m28_7_h2_s.setValue("demander");
                m28_7_h2.setValue(input_msg.getText().toString());
                break;
            case "28_7_h3":
                m28_7_h3_s.setValue("demander");
                m28_7_h3.setValue(input_msg.getText().toString());
                break;
            case "28_7_h4":
                m28_7_h4_s.setValue("demander");
                m28_7_h4.setValue(input_msg.getText().toString());
                break;
            case "28_7_h5":
                m28_7_h5_s.setValue("demander");
                m28_7_h5.setValue(input_msg.getText().toString());
                break;
            case "28_7_h6":
                m28_7_h6_s.setValue("demander");
                m28_7_h6.setValue(input_msg.getText().toString());
                break;
            case "28_7_h7":
                m28_7_h7_s.setValue("demander");
                m28_7_h7.setValue(input_msg.getText().toString());
                break;
            case "28_7_h8":
                m28_7_h8_s.setValue("demander");
                m28_7_h8.setValue(input_msg.getText().toString());
                break;
            case "28_7_h9":
                m28_7_h9_s.setValue("demander");
                m28_7_h9.setValue(input_msg.getText().toString());
                break;
            ////////////////////////////////////////////////////
            case "29_7_h1":
                m29_7_h1_s.setValue("demander");
                m29_7_h1.setValue(input_msg.getText().toString());
                break;
            case "29_7_h2":
                m29_7_h2_s.setValue("demander");
                m29_7_h2.setValue(input_msg.getText().toString());
                break;
            case "29_7_h3":
                m29_7_h3_s.setValue("demander");
                m29_7_h3.setValue(input_msg.getText().toString());
                break;
            case "29_7_h4":
                m29_7_h4_s.setValue("demander");
                m29_7_h4.setValue(input_msg.getText().toString());
                break;
            case "29_7_h5":
                m29_7_h5_s.setValue("demander");
                m29_7_h5.setValue(input_msg.getText().toString());
                break;
            case "29_7_h6":
                m29_7_h6_s.setValue("demander");
                m29_7_h6.setValue(input_msg.getText().toString());
                break;
            case "29_7_h7":
                m29_7_h7_s.setValue("demander");
                m29_7_h7.setValue(input_msg.getText().toString());
                break;
            case "29_7_h8":
                m29_7_h8_s.setValue("demander");
                m29_7_h8.setValue(input_msg.getText().toString());
                break;
            case "29_7_h9":
                m29_7_h9_s.setValue("demander");
                m29_7_h9.setValue(input_msg.getText().toString());
                break;
            ////////////////////////////////////////////////////
            case "30_7_h1":
                m30_7_h1_s.setValue("demander");
                m30_7_h1.setValue(input_msg.getText().toString());
                break;
            case "30_7_h2":
                m30_7_h2_s.setValue("demander");
                m30_7_h2.setValue(input_msg.getText().toString());
                break;
            case "30_7_h3":
                m30_7_h3_s.setValue("demander");
                m30_7_h3.setValue(input_msg.getText().toString());
                break;
            case "30_7_h4":
                m30_7_h4_s.setValue("demander");
                m30_7_h4.setValue(input_msg.getText().toString());
                break;
            case "30_7_h5":
                m30_7_h5_s.setValue("demander");
                m30_7_h5.setValue(input_msg.getText().toString());
                break;
            case "30_7_h6":
                m30_7_h6_s.setValue("demander");
                m30_7_h6.setValue(input_msg.getText().toString());
                break;
            case "30_7_h7":
                m30_7_h7_s.setValue("demander");
                m30_7_h7.setValue(input_msg.getText().toString());
                break;
            case "30_7_h8":
                m30_7_h8_s.setValue("demander");
                m30_7_h8.setValue(input_msg.getText().toString());
                break;
            case "30_7_h9":
                m30_7_h9_s.setValue("demander");
                m30_7_h9.setValue(input_msg.getText().toString());
                break;
            ////////////////////////////////////////////////////
            case "31_7_h1":
                m31_7_h1_s.setValue("demander");
                m31_7_h1.setValue(input_msg.getText().toString());
                break;
            case "31_7_h2":
                m31_7_h2_s.setValue("demander");
                m31_7_h2.setValue(input_msg.getText().toString());
                break;
            case "31_7_h3":
                m31_7_h3_s.setValue("demander");
                m31_7_h3.setValue(input_msg.getText().toString());
                break;
            case "31_7_h4":
                m31_7_h4_s.setValue("demander");
                m31_7_h4.setValue(input_msg.getText().toString());
                break;
            case "31_7_h5":
                m31_7_h5_s.setValue("demander");
                m31_7_h5.setValue(input_msg.getText().toString());
                break;
            case "31_7_h6":
                m31_7_h6_s.setValue("demander");
                m31_7_h6.setValue(input_msg.getText().toString());
                break;
            case "31_7_h7":
                m31_7_h7_s.setValue("demander");
                m31_7_h7.setValue(input_msg.getText().toString());
                break;
            case "31_7_h8":
                m31_7_h8_s.setValue("demander");
                m31_7_h8.setValue(input_msg.getText().toString());
                break;
            case "31_7_h9":
                m31_7_h9_s.setValue("demander");
                m31_7_h9.setValue(input_msg.getText().toString());
                break;

            default:break;
        }
    }

    public void selectItem(View view){
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()){
            case R.id.bx_ser_1_a1:
                if (checked){
                    selection.add("Soin basique");
                }else {
                    selection.remove("Soin basique");
                }
                break;
            case R.id.bx_ser_1_a2:
                if (checked){
                    selection.add("Soin spécifique");
                }else {
                    selection.remove("Soin spécifique");
                }
                break;
            case R.id.bx_ser_1_a3:
                if (checked){
                    selection.add("Soin jeunesse du regard");
                }else {
                    selection.remove("Soin jeunesse du regard");
                }
                break;
            case R.id.bx_ser_1_a4:
                if (checked){
                    selection.add("Soin Osmoclean");
                }else {
                    selection.remove("Soin Osmoclean");
                }
                break;
            case R.id.bx_ser_1_a5:
                if (checked){
                    selection.add("Soin cocoon automne");
                }else {
                    selection.remove("Soin cocoon automne");
                }
                break;
            case R.id.bx_ser_1_a6:
                if (checked){
                    selection.add("Soin détoxication printemps");
                }else {
                    selection.remove("Soin détoxication printemps");
                }
                break;
            case R.id.bx_ser_1_a7:
                if (checked){
                    selection.add("Soin Hydra Absolu");
                }else {
                    selection.remove("Soin Hydra Absolu");
                }
                break;
            case R.id.bx_ser_1_a8:
                if (checked){
                    selection.add("Soin pure absolu");
                }else {
                    selection.remove("Soin pure absolu");
                }
                break;
            case R.id.bx_ser_1_a9:
                if (checked){
                    selection.add("Soin Sensi Absolu");
                }else {
                    selection.remove("Soin Sensi Absolu");
                }
                break;
            case R.id.bx_ser_1_a10:
                if (checked){
                    selection.add("Soin hyaluronique");
                }else {
                    selection.remove("Soin hyaluronique");
                }
                break;
            case R.id.bx_ser_1_a11:
                if (checked){
                    selection.add("Soin Intensive peeling");
                }else {
                    selection.remove("Soin Intensive peeling");
                }
                break;
            case R.id.bx_ser_1_a12:
                if (checked){
                    selection.add("Soin Jeunesse globale");
                }else {
                    selection.remove("Soin Esthe.White");
                }
                break;

        }
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    @Override
    protected void onStart() {
        super.onStart();
        mDate_1_7.addValueEventListener(this);
        m1_7_h1.addValueEventListener(this);
        m1_7_h1_s.addValueEventListener(this);
        m1_7_h2.addValueEventListener(this);
        m1_7_h2_s.addValueEventListener(this);
        m1_7_h3.addValueEventListener(this);
        m1_7_h3_s.addValueEventListener(this);
        m1_7_h4.addValueEventListener(this);
        m1_7_h4_s.addValueEventListener(this);
        m1_7_h5.addValueEventListener(this);
        m1_7_h5_s.addValueEventListener(this);
        m1_7_h6.addValueEventListener(this);
        m1_7_h6_s.addValueEventListener(this);
        m1_7_h7.addValueEventListener(this);
        m1_7_h7_s.addValueEventListener(this);
        m1_7_h8.addValueEventListener(this);
        m1_7_h8_s.addValueEventListener(this);
        m1_7_h9.addValueEventListener(this);
        m1_7_h9_s.addValueEventListener(this);
        /////////////////////////////////////
        mDate_2_7.addValueEventListener(this);
        m2_7_h1.addValueEventListener(this);
        m2_7_h1_s.addValueEventListener(this);
        m2_7_h2.addValueEventListener(this);
        m2_7_h2_s.addValueEventListener(this);
        m2_7_h3.addValueEventListener(this);
        m2_7_h3_s.addValueEventListener(this);
        m2_7_h4.addValueEventListener(this);
        m2_7_h4_s.addValueEventListener(this);
        m2_7_h5.addValueEventListener(this);
        m2_7_h5_s.addValueEventListener(this);
        m2_7_h6.addValueEventListener(this);
        m2_7_h6_s.addValueEventListener(this);
        m2_7_h7.addValueEventListener(this);
        m2_7_h7_s.addValueEventListener(this);
        m2_7_h8.addValueEventListener(this);
        m2_7_h8_s.addValueEventListener(this);
        m2_7_h9.addValueEventListener(this);
        m2_7_h9_s.addValueEventListener(this);
        /////////////////////////////////////
        mDate_3_7.addValueEventListener(this);
        m3_7_h1.addValueEventListener(this);
        m3_7_h1_s.addValueEventListener(this);
        m3_7_h2.addValueEventListener(this);
        m3_7_h2_s.addValueEventListener(this);
        m3_7_h3.addValueEventListener(this);
        m3_7_h3_s.addValueEventListener(this);
        m3_7_h4.addValueEventListener(this);
        m3_7_h4_s.addValueEventListener(this);
        m3_7_h5.addValueEventListener(this);
        m3_7_h5_s.addValueEventListener(this);
        m3_7_h6.addValueEventListener(this);
        m3_7_h6_s.addValueEventListener(this);
        m3_7_h7.addValueEventListener(this);
        m3_7_h7_s.addValueEventListener(this);
        m3_7_h8.addValueEventListener(this);
        m3_7_h8_s.addValueEventListener(this);
        m3_7_h9.addValueEventListener(this);
        m3_7_h9_s.addValueEventListener(this);
        /////////////////////////////////////
        mDate_4_7.addValueEventListener(this);
        m4_7_h1.addValueEventListener(this);
        m4_7_h1_s.addValueEventListener(this);
        m4_7_h2.addValueEventListener(this);
        m4_7_h2_s.addValueEventListener(this);
        m4_7_h3.addValueEventListener(this);
        m4_7_h3_s.addValueEventListener(this);
        m4_7_h4.addValueEventListener(this);
        m4_7_h4_s.addValueEventListener(this);
        m4_7_h5.addValueEventListener(this);
        m4_7_h5_s.addValueEventListener(this);
        m4_7_h6.addValueEventListener(this);
        m4_7_h6_s.addValueEventListener(this);
        m4_7_h7.addValueEventListener(this);
        m4_7_h7_s.addValueEventListener(this);
        m4_7_h8.addValueEventListener(this);
        m4_7_h8_s.addValueEventListener(this);
        m4_7_h9.addValueEventListener(this);
        m4_7_h9_s.addValueEventListener(this);
        /////////////////////////////////////
        mDate_5_7.addValueEventListener(this);
        m5_7_h1.addValueEventListener(this);
        m5_7_h1_s.addValueEventListener(this);
        m5_7_h2.addValueEventListener(this);
        m5_7_h2_s.addValueEventListener(this);
        m5_7_h3.addValueEventListener(this);
        m5_7_h3_s.addValueEventListener(this);
        m5_7_h4.addValueEventListener(this);
        m5_7_h4_s.addValueEventListener(this);
        m5_7_h5.addValueEventListener(this);
        m5_7_h5_s.addValueEventListener(this);
        m5_7_h6.addValueEventListener(this);
        m5_7_h6_s.addValueEventListener(this);
        m5_7_h7.addValueEventListener(this);
        m5_7_h7_s.addValueEventListener(this);
        m5_7_h8.addValueEventListener(this);
        m5_7_h8_s.addValueEventListener(this);
        m5_7_h9.addValueEventListener(this);
        m5_7_h9_s.addValueEventListener(this);
        /////////////////////////////////////
        mDate_6_7.addValueEventListener(this);
        m6_7_h1.addValueEventListener(this);
        m6_7_h1_s.addValueEventListener(this);
        m6_7_h2.addValueEventListener(this);
        m6_7_h2_s.addValueEventListener(this);
        m6_7_h3.addValueEventListener(this);
        m6_7_h3_s.addValueEventListener(this);
        m6_7_h4.addValueEventListener(this);
        m6_7_h4_s.addValueEventListener(this);
        m6_7_h5.addValueEventListener(this);
        m6_7_h5_s.addValueEventListener(this);
        m6_7_h6.addValueEventListener(this);
        m6_7_h6_s.addValueEventListener(this);
        m6_7_h7.addValueEventListener(this);
        m6_7_h7_s.addValueEventListener(this);
        m6_7_h8.addValueEventListener(this);
        m6_7_h8_s.addValueEventListener(this);
        m6_7_h9.addValueEventListener(this);
        m6_7_h9_s.addValueEventListener(this);
        /////////////////////////////////////
        mDate_7_7.addValueEventListener(this);
        m7_7_h1.addValueEventListener(this);
        m7_7_h1_s.addValueEventListener(this);
        m7_7_h2.addValueEventListener(this);
        m7_7_h2_s.addValueEventListener(this);
        m7_7_h3.addValueEventListener(this);
        m7_7_h3_s.addValueEventListener(this);
        m7_7_h4.addValueEventListener(this);
        m7_7_h4_s.addValueEventListener(this);
        m7_7_h5.addValueEventListener(this);
        m7_7_h5_s.addValueEventListener(this);
        m7_7_h6.addValueEventListener(this);
        m7_7_h6_s.addValueEventListener(this);
        m7_7_h7.addValueEventListener(this);
        m7_7_h7_s.addValueEventListener(this);
        m7_7_h8.addValueEventListener(this);
        m7_7_h8_s.addValueEventListener(this);
        m7_7_h9.addValueEventListener(this);
        m7_7_h9_s.addValueEventListener(this);
        /////////////////////////////////////
        mDate_8_7.addValueEventListener(this);
        m8_7_h1.addValueEventListener(this);
        m8_7_h1_s.addValueEventListener(this);
        m8_7_h2.addValueEventListener(this);
        m8_7_h2_s.addValueEventListener(this);
        m8_7_h3.addValueEventListener(this);
        m8_7_h3_s.addValueEventListener(this);
        m8_7_h4.addValueEventListener(this);
        m8_7_h4_s.addValueEventListener(this);
        m8_7_h4_s.addValueEventListener(this);
        m8_7_h5_s.addValueEventListener(this);
        m8_7_h6.addValueEventListener(this);
        m8_7_h6_s.addValueEventListener(this);
        m8_7_h7.addValueEventListener(this);
        m8_7_h7_s.addValueEventListener(this);
        m8_7_h8.addValueEventListener(this);
        m8_7_h8_s.addValueEventListener(this);
        m8_7_h9.addValueEventListener(this);
        m8_7_h9_s.addValueEventListener(this);
        /////////////////////////////////////
        mDate_9_7.addValueEventListener(this);
        m9_7_h1.addValueEventListener(this);
        m9_7_h1_s.addValueEventListener(this);
        m9_7_h2.addValueEventListener(this);
        m9_7_h2_s.addValueEventListener(this);
        m9_7_h3.addValueEventListener(this);
        m9_7_h3_s.addValueEventListener(this);
        m9_7_h4.addValueEventListener(this);
        m9_7_h4_s.addValueEventListener(this);
        m9_7_h5.addValueEventListener(this);
        m9_7_h5_s.addValueEventListener(this);
        m9_7_h6.addValueEventListener(this);
        m9_7_h6_s.addValueEventListener(this);
        m9_7_h7.addValueEventListener(this);
        m9_7_h7_s.addValueEventListener(this);
        m9_7_h8.addValueEventListener(this);
        m9_7_h8_s.addValueEventListener(this);
        m9_7_h9.addValueEventListener(this);
        m9_7_h9_s.addValueEventListener(this);
        /////////////////////////////////////
        mDate_10_7.addValueEventListener(this);
        m10_7_h1.addValueEventListener(this);
        m10_7_h1_s.addValueEventListener(this);
        m10_7_h2.addValueEventListener(this);
        m10_7_h2_s.addValueEventListener(this);
        m10_7_h3.addValueEventListener(this);
        m10_7_h3_s.addValueEventListener(this);
        m10_7_h4.addValueEventListener(this);
        m10_7_h4_s.addValueEventListener(this);
        m10_7_h5.addValueEventListener(this);
        m10_7_h5_s.addValueEventListener(this);
        m10_7_h6.addValueEventListener(this);
        m10_7_h6_s.addValueEventListener(this);
        m10_7_h7.addValueEventListener(this);
        m10_7_h7_s.addValueEventListener(this);
        m10_7_h8.addValueEventListener(this);
        m10_7_h8_s.addValueEventListener(this);
        m10_7_h9.addValueEventListener(this);
        m10_7_h9_s.addValueEventListener(this);
        /////////////////////////////////////
        mDate_11_7.addValueEventListener(this);
        m11_7_h1.addValueEventListener(this);
        m11_7_h1_s.addValueEventListener(this);
        m11_7_h2.addValueEventListener(this);
        m11_7_h2_s.addValueEventListener(this);
        m11_7_h3.addValueEventListener(this);
        m11_7_h3_s.addValueEventListener(this);
        m11_7_h4.addValueEventListener(this);
        m11_7_h4_s.addValueEventListener(this);
        m11_7_h5.addValueEventListener(this);
        m11_7_h5_s.addValueEventListener(this);
        m11_7_h6.addValueEventListener(this);
        m11_7_h6_s.addValueEventListener(this);
        m11_7_h7.addValueEventListener(this);
        m11_7_h7_s.addValueEventListener(this);
        m11_7_h8.addValueEventListener(this);
        m11_7_h8_s.addValueEventListener(this);
        m11_7_h9.addValueEventListener(this);
        m11_7_h9_s.addValueEventListener(this);
        /////////////////////////////////////
        mDate_1_7.addValueEventListener(this);
        m12_7_h1.addValueEventListener(this);
        m12_7_h1_s.addValueEventListener(this);
        m12_7_h2.addValueEventListener(this);
        m12_7_h2_s.addValueEventListener(this);
        m12_7_h3.addValueEventListener(this);
        m12_7_h3_s.addValueEventListener(this);
        m12_7_h4.addValueEventListener(this);
        m12_7_h4_s.addValueEventListener(this);
        m12_7_h5.addValueEventListener(this);
        m12_7_h5_s.addValueEventListener(this);
        m12_7_h6.addValueEventListener(this);
        m12_7_h6_s.addValueEventListener(this);
        m12_7_h7.addValueEventListener(this);
        m12_7_h7_s.addValueEventListener(this);
        m12_7_h8.addValueEventListener(this);
        m12_7_h8_s.addValueEventListener(this);
        m12_7_h9.addValueEventListener(this);
        m12_7_h9_s.addValueEventListener(this);
        /////////////////////////////////////
        mDate_1_7.addValueEventListener(this);
        m13_7_h1.addValueEventListener(this);
        m13_7_h1_s.addValueEventListener(this);
        m13_7_h2.addValueEventListener(this);
        m13_7_h2_s.addValueEventListener(this);
        m13_7_h3.addValueEventListener(this);
        m13_7_h3_s.addValueEventListener(this);
        m13_7_h4.addValueEventListener(this);
        m13_7_h4_s.addValueEventListener(this);
        m13_7_h5.addValueEventListener(this);
        m13_7_h5_s.addValueEventListener(this);
        m13_7_h6.addValueEventListener(this);
        m13_7_h6_s.addValueEventListener(this);
        m13_7_h7.addValueEventListener(this);
        m13_7_h7_s.addValueEventListener(this);
        m13_7_h8.addValueEventListener(this);
        m13_7_h8_s.addValueEventListener(this);
        m13_7_h9.addValueEventListener(this);
        m13_7_h9_s.addValueEventListener(this);
        /////////////////////////////////////
        mDate_1_7.addValueEventListener(this);
        m14_7_h1.addValueEventListener(this);
        m14_7_h1_s.addValueEventListener(this);
        m14_7_h2.addValueEventListener(this);
        m14_7_h2_s.addValueEventListener(this);
        m14_7_h3.addValueEventListener(this);
        m14_7_h3_s.addValueEventListener(this);
        m14_7_h4.addValueEventListener(this);
        m14_7_h4_s.addValueEventListener(this);
        m14_7_h5.addValueEventListener(this);
        m14_7_h5_s.addValueEventListener(this);
        m14_7_h6.addValueEventListener(this);
        m14_7_h6_s.addValueEventListener(this);
        m14_7_h7.addValueEventListener(this);
        m14_7_h7_s.addValueEventListener(this);
        m14_7_h8.addValueEventListener(this);
        m14_7_h8_s.addValueEventListener(this);
        m14_7_h9.addValueEventListener(this);
        m14_7_h9_s.addValueEventListener(this);
        /////////////////////////////////////
        mDate_1_7.addValueEventListener(this);
        m15_7_h1.addValueEventListener(this);
        m15_7_h1_s.addValueEventListener(this);
        m15_7_h2.addValueEventListener(this);
        m15_7_h2_s.addValueEventListener(this);
        m15_7_h3.addValueEventListener(this);
        m15_7_h3_s.addValueEventListener(this);
        m15_7_h4.addValueEventListener(this);
        m15_7_h4_s.addValueEventListener(this);
        m15_7_h5.addValueEventListener(this);
        m15_7_h5_s.addValueEventListener(this);
        m15_7_h6.addValueEventListener(this);
        m15_7_h6_s.addValueEventListener(this);
        m15_7_h7.addValueEventListener(this);
        m15_7_h7_s.addValueEventListener(this);
        m15_7_h8.addValueEventListener(this);
        m15_7_h8_s.addValueEventListener(this);
        m15_7_h9.addValueEventListener(this);
        m15_7_h9_s.addValueEventListener(this);
        /////////////////////////////////////
        mDate_1_7.addValueEventListener(this);
        m16_7_h1.addValueEventListener(this);
        m16_7_h1_s.addValueEventListener(this);
        m16_7_h2.addValueEventListener(this);
        m16_7_h2_s.addValueEventListener(this);
        m16_7_h3.addValueEventListener(this);
        m16_7_h3_s.addValueEventListener(this);
        m16_7_h4.addValueEventListener(this);
        m16_7_h4_s.addValueEventListener(this);
        m16_7_h5.addValueEventListener(this);
        m16_7_h5_s.addValueEventListener(this);
        m16_7_h6.addValueEventListener(this);
        m16_7_h6_s.addValueEventListener(this);
        m16_7_h7.addValueEventListener(this);
        m16_7_h7_s.addValueEventListener(this);
        m16_7_h8.addValueEventListener(this);
        m16_7_h8_s.addValueEventListener(this);
        m16_7_h9.addValueEventListener(this);
        m16_7_h9_s.addValueEventListener(this);
        /////////////////////////////////////
        mDate_1_7.addValueEventListener(this);
        m17_7_h1.addValueEventListener(this);
        m17_7_h1_s.addValueEventListener(this);
        m17_7_h2.addValueEventListener(this);
        m17_7_h2_s.addValueEventListener(this);
        m17_7_h3.addValueEventListener(this);
        m17_7_h3_s.addValueEventListener(this);
        m17_7_h4.addValueEventListener(this);
        m17_7_h4_s.addValueEventListener(this);
        m17_7_h5.addValueEventListener(this);
        m17_7_h5_s.addValueEventListener(this);
        m17_7_h6.addValueEventListener(this);
        m17_7_h6_s.addValueEventListener(this);
        m17_7_h7.addValueEventListener(this);
        m17_7_h7_s.addValueEventListener(this);
        m17_7_h8.addValueEventListener(this);
        m17_7_h8_s.addValueEventListener(this);
        m17_7_h9.addValueEventListener(this);
        m17_7_h9_s.addValueEventListener(this);
        /////////////////////////////////////
        mDate_1_7.addValueEventListener(this);
        m18_7_h1.addValueEventListener(this);
        m18_7_h1_s.addValueEventListener(this);
        m18_7_h2.addValueEventListener(this);
        m18_7_h2_s.addValueEventListener(this);
        m18_7_h3.addValueEventListener(this);
        m18_7_h3_s.addValueEventListener(this);
        m18_7_h4.addValueEventListener(this);
        m18_7_h4_s.addValueEventListener(this);
        m18_7_h5.addValueEventListener(this);
        m18_7_h5_s.addValueEventListener(this);
        m18_7_h6.addValueEventListener(this);
        m18_7_h6_s.addValueEventListener(this);
        m18_7_h7.addValueEventListener(this);
        m18_7_h7_s.addValueEventListener(this);
        m18_7_h8.addValueEventListener(this);
        m18_7_h8_s.addValueEventListener(this);
        m18_7_h9.addValueEventListener(this);
        m18_7_h9_s.addValueEventListener(this);
        /////////////////////////////////////
        mDate_1_7.addValueEventListener(this);
        m19_7_h1.addValueEventListener(this);
        m19_7_h1_s.addValueEventListener(this);
        m19_7_h2.addValueEventListener(this);
        m19_7_h2_s.addValueEventListener(this);
        m19_7_h3.addValueEventListener(this);
        m19_7_h3_s.addValueEventListener(this);
        m19_7_h4.addValueEventListener(this);
        m19_7_h4_s.addValueEventListener(this);
        m19_7_h5.addValueEventListener(this);
        m19_7_h5_s.addValueEventListener(this);
        m19_7_h6.addValueEventListener(this);
        m19_7_h6_s.addValueEventListener(this);
        m19_7_h7.addValueEventListener(this);
        m19_7_h7_s.addValueEventListener(this);
        m19_7_h8.addValueEventListener(this);
        m19_7_h8_s.addValueEventListener(this);
        m19_7_h9.addValueEventListener(this);
        m19_7_h9_s.addValueEventListener(this);
        /////////////////////////////////////
        mDate_1_7.addValueEventListener(this);
        m20_7_h1.addValueEventListener(this);
        m20_7_h1_s.addValueEventListener(this);
        m20_7_h2.addValueEventListener(this);
        m20_7_h2_s.addValueEventListener(this);
        m20_7_h3.addValueEventListener(this);
        m20_7_h3_s.addValueEventListener(this);
        m20_7_h4.addValueEventListener(this);
        m20_7_h4_s.addValueEventListener(this);
        m20_7_h5.addValueEventListener(this);
        m20_7_h5_s.addValueEventListener(this);
        m20_7_h6.addValueEventListener(this);
        m20_7_h6_s.addValueEventListener(this);
        m20_7_h7.addValueEventListener(this);
        m20_7_h7_s.addValueEventListener(this);
        m20_7_h8.addValueEventListener(this);
        m20_7_h8_s.addValueEventListener(this);
        m20_7_h9.addValueEventListener(this);
        m20_7_h9_s.addValueEventListener(this);
        /////////////////////////////////////
        mDate_1_7.addValueEventListener(this);
        m21_7_h1.addValueEventListener(this);
        m21_7_h1_s.addValueEventListener(this);
        m21_7_h2.addValueEventListener(this);
        m21_7_h2_s.addValueEventListener(this);
        m21_7_h3.addValueEventListener(this);
        m21_7_h3_s.addValueEventListener(this);
        m21_7_h4.addValueEventListener(this);
        m21_7_h4_s.addValueEventListener(this);
        m21_7_h5.addValueEventListener(this);
        m21_7_h5_s.addValueEventListener(this);
        m21_7_h6.addValueEventListener(this);
        m21_7_h6_s.addValueEventListener(this);
        m21_7_h7.addValueEventListener(this);
        m21_7_h7_s.addValueEventListener(this);
        m21_7_h8.addValueEventListener(this);
        m21_7_h8_s.addValueEventListener(this);
        m21_7_h9.addValueEventListener(this);
        m21_7_h9_s.addValueEventListener(this);
        /////////////////////////////////////
        mDate_1_7.addValueEventListener(this);
        m22_7_h1.addValueEventListener(this);
        m22_7_h1_s.addValueEventListener(this);
        m22_7_h2.addValueEventListener(this);
        m22_7_h2_s.addValueEventListener(this);
        m22_7_h3.addValueEventListener(this);
        m22_7_h3_s.addValueEventListener(this);
        m22_7_h4.addValueEventListener(this);
        m22_7_h4_s.addValueEventListener(this);
        m22_7_h5.addValueEventListener(this);
        m22_7_h5_s.addValueEventListener(this);
        m22_7_h6.addValueEventListener(this);
        m22_7_h6_s.addValueEventListener(this);
        m22_7_h7.addValueEventListener(this);
        m22_7_h7_s.addValueEventListener(this);
        m22_7_h8.addValueEventListener(this);
        m22_7_h8_s.addValueEventListener(this);
        m22_7_h9.addValueEventListener(this);
        m22_7_h9_s.addValueEventListener(this);
        /////////////////////////////////////
        mDate_1_7.addValueEventListener(this);
        m23_7_h1.addValueEventListener(this);
        m23_7_h1_s.addValueEventListener(this);
        m23_7_h2.addValueEventListener(this);
        m23_7_h2_s.addValueEventListener(this);
        m23_7_h3.addValueEventListener(this);
        m23_7_h3_s.addValueEventListener(this);
        m23_7_h4.addValueEventListener(this);
        m23_7_h4_s.addValueEventListener(this);
        m23_7_h5.addValueEventListener(this);
        m23_7_h5_s.addValueEventListener(this);
        m23_7_h6.addValueEventListener(this);
        m23_7_h6_s.addValueEventListener(this);
        m23_7_h7.addValueEventListener(this);
        m23_7_h7_s.addValueEventListener(this);
        m23_7_h8.addValueEventListener(this);
        m23_7_h8_s.addValueEventListener(this);
        m23_7_h9.addValueEventListener(this);
        m23_7_h9_s.addValueEventListener(this);
        /////////////////////////////////////
        mDate_1_7.addValueEventListener(this);
        m2_7_h1.addValueEventListener(this);
        m24_7_h1_s.addValueEventListener(this);
        m24_7_h2.addValueEventListener(this);
        m24_7_h2_s.addValueEventListener(this);
        m24_7_h3.addValueEventListener(this);
        m24_7_h3_s.addValueEventListener(this);
        m24_7_h4.addValueEventListener(this);
        m24_7_h4_s.addValueEventListener(this);
        m24_7_h5.addValueEventListener(this);
        m24_7_h5_s.addValueEventListener(this);
        m24_7_h6.addValueEventListener(this);
        m24_7_h6_s.addValueEventListener(this);
        m24_7_h7.addValueEventListener(this);
        m24_7_h7_s.addValueEventListener(this);
        m24_7_h8.addValueEventListener(this);
        m24_7_h8_s.addValueEventListener(this);
        m24_7_h9.addValueEventListener(this);
        m24_7_h9_s.addValueEventListener(this);
        //4///////////////////////////////////
        mDate_1_7.addValueEventListener(this);
        m25_7_h1.addValueEventListener(this);
        m25_7_h1_s.addValueEventListener(this);
        m25_7_h2.addValueEventListener(this);
        m25_7_h2_s.addValueEventListener(this);
        m25_7_h3.addValueEventListener(this);
        m25_7_h3_s.addValueEventListener(this);
        m25_7_h4.addValueEventListener(this);
        m25_7_h4_s.addValueEventListener(this);
        m25_7_h5.addValueEventListener(this);
        m25_7_h5_s.addValueEventListener(this);
        m25_7_h6.addValueEventListener(this);
        m25_7_h6_s.addValueEventListener(this);
        m25_7_h7.addValueEventListener(this);
        m25_7_h7_s.addValueEventListener(this);
        m25_7_h8.addValueEventListener(this);
        m25_7_h8_s.addValueEventListener(this);
        m25_7_h9.addValueEventListener(this);
        m25_7_h9_s.addValueEventListener(this);
        /////////////////////////////////////
        mDate_1_7.addValueEventListener(this);
        m26_7_h1.addValueEventListener(this);
        m26_7_h1_s.addValueEventListener(this);
        m26_7_h2.addValueEventListener(this);
        m26_7_h2_s.addValueEventListener(this);
        m26_7_h3.addValueEventListener(this);
        m26_7_h3_s.addValueEventListener(this);
        m26_7_h4.addValueEventListener(this);
        m26_7_h4_s.addValueEventListener(this);
        m26_7_h5.addValueEventListener(this);
        m26_7_h5_s.addValueEventListener(this);
        m26_7_h6.addValueEventListener(this);
        m26_7_h6_s.addValueEventListener(this);
        m26_7_h7.addValueEventListener(this);
        m26_7_h7_s.addValueEventListener(this);
        m26_7_h8.addValueEventListener(this);
        m26_7_h8_s.addValueEventListener(this);
        m26_7_h9.addValueEventListener(this);
        m26_7_h9_s.addValueEventListener(this);
        /////////////////////////////////////
        mDate_1_7.addValueEventListener(this);
        m27_7_h1.addValueEventListener(this);
        m27_7_h1_s.addValueEventListener(this);
        m27_7_h2.addValueEventListener(this);
        m27_7_h2_s.addValueEventListener(this);
        m27_7_h3.addValueEventListener(this);
        m27_7_h3_s.addValueEventListener(this);
        m27_7_h4.addValueEventListener(this);
        m27_7_h4_s.addValueEventListener(this);
        m27_7_h5.addValueEventListener(this);
        m27_7_h5_s.addValueEventListener(this);
        m27_7_h6.addValueEventListener(this);
        m27_7_h6_s.addValueEventListener(this);
        m27_7_h7.addValueEventListener(this);
        m27_7_h7_s.addValueEventListener(this);
        m27_7_h8.addValueEventListener(this);
        m27_7_h8_s.addValueEventListener(this);
        m27_7_h9.addValueEventListener(this);
        m27_7_h9_s.addValueEventListener(this);
        /////////////////////////////////////
        mDate_1_7.addValueEventListener(this);
        m28_7_h1.addValueEventListener(this);
        m28_7_h1_s.addValueEventListener(this);
        m28_7_h2.addValueEventListener(this);
        m28_7_h2_s.addValueEventListener(this);
        m28_7_h3.addValueEventListener(this);
        m28_7_h3_s.addValueEventListener(this);
        m28_7_h4.addValueEventListener(this);
        m28_7_h4_s.addValueEventListener(this);
        m28_7_h5.addValueEventListener(this);
        m28_7_h5_s.addValueEventListener(this);
        m28_7_h6.addValueEventListener(this);
        m28_7_h6_s.addValueEventListener(this);
        m28_7_h7.addValueEventListener(this);
        m28_7_h7_s.addValueEventListener(this);
        m28_7_h8.addValueEventListener(this);
        m28_7_h8_s.addValueEventListener(this);
        m28_7_h9.addValueEventListener(this);
        m28_7_h9_s.addValueEventListener(this);
        /////////////////////////////////////
        mDate_1_7.addValueEventListener(this);
        m29_7_h1.addValueEventListener(this);
        m29_7_h1_s.addValueEventListener(this);
        m29_7_h2.addValueEventListener(this);
        m29_7_h2_s.addValueEventListener(this);
        m29_7_h3.addValueEventListener(this);
        m29_7_h3_s.addValueEventListener(this);
        m29_7_h4.addValueEventListener(this);
        m29_7_h4_s.addValueEventListener(this);
        m29_7_h5.addValueEventListener(this);
        m29_7_h5_s.addValueEventListener(this);
        m29_7_h6.addValueEventListener(this);
        m29_7_h6_s.addValueEventListener(this);
        m29_7_h7.addValueEventListener(this);
        m29_7_h7_s.addValueEventListener(this);
        m29_7_h8.addValueEventListener(this);
        m29_7_h8_s.addValueEventListener(this);
        m29_7_h9.addValueEventListener(this);
        m29_7_h9_s.addValueEventListener(this);
        /////////////////////////////////////
        mDate_1_7.addValueEventListener(this);
        m30_7_h1.addValueEventListener(this);
        m30_7_h1_s.addValueEventListener(this);
        m30_7_h2.addValueEventListener(this);
        m30_7_h2_s.addValueEventListener(this);
        m30_7_h3.addValueEventListener(this);
        m30_7_h3_s.addValueEventListener(this);
        m30_7_h4.addValueEventListener(this);
        m30_7_h4_s.addValueEventListener(this);
        m30_7_h5.addValueEventListener(this);
        m30_7_h5_s.addValueEventListener(this);
        m30_7_h6.addValueEventListener(this);
        m30_7_h6_s.addValueEventListener(this);
        m30_7_h7.addValueEventListener(this);
        m30_7_h7_s.addValueEventListener(this);
        m30_7_h8.addValueEventListener(this);
        m30_7_h8_s.addValueEventListener(this);
        m30_7_h9.addValueEventListener(this);
        m30_7_h9_s.addValueEventListener(this);
        /////////////////////////////////////
        mDate_1_7.addValueEventListener(this);
        m31_7_h1.addValueEventListener(this);
        m31_7_h1_s.addValueEventListener(this);
        m31_7_h2.addValueEventListener(this);
        m31_7_h2_s.addValueEventListener(this);
        m31_7_h3.addValueEventListener(this);
        m31_7_h3_s.addValueEventListener(this);
        m31_7_h4.addValueEventListener(this);
        m31_7_h4_s.addValueEventListener(this);
        m31_7_h5.addValueEventListener(this);
        m31_7_h5_s.addValueEventListener(this);
        m31_7_h6.addValueEventListener(this);
        m31_7_h6_s.addValueEventListener(this);
        m31_7_h7.addValueEventListener(this);
        m31_7_h7_s.addValueEventListener(this);
        m31_7_h8.addValueEventListener(this);
        m31_7_h8_s.addValueEventListener(this);
        m31_7_h9.addValueEventListener(this);
        m31_7_h9_s.addValueEventListener(this);
        /////////////////////////////////////


    }

    @Override
    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

    }

    @Override
    public void onCancelled(@NonNull DatabaseError databaseError) {

    }
}
