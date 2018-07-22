package com.faresimtiez.algotech.anaros;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
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

public class CommandeActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener, ValueEventListener {

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
    DatabaseReference mDate_1_9 = mRootReference.child("1_9");
    DatabaseReference
            m1_9_h1 = mDate_1_9.child("1_9_h1_info");DatabaseReference
            m1_9_h1_s = mDate_1_9.child("1_9_h1_s");
    DatabaseReference
            m1_9_h2 = mDate_1_9.child("1_9_h2_info");DatabaseReference
            m1_9_h2_s = mDate_1_9.child("1_9_h2_s");
    DatabaseReference
            m1_9_h3 = mDate_1_9.child("1_9_h3_info");DatabaseReference
            m1_9_h3_s = mDate_1_9.child("1_9_h3_s");
    DatabaseReference
            m1_9_h4 = mDate_1_9.child("1_9_h4_info");DatabaseReference
            m1_9_h4_s = mDate_1_9.child("1_9_h4_s");
    DatabaseReference
            m1_9_h5 = mDate_1_9.child("1_9_h5_info");DatabaseReference
            m1_9_h5_s = mDate_1_9.child("1_9_h5_s");
    DatabaseReference
            m1_9_h6 = mDate_1_9.child("1_9_h6_info");DatabaseReference
            m1_9_h6_s = mDate_1_9.child("1_9_h6_s");
    DatabaseReference
            m1_9_h7 = mDate_1_9.child("1_9_h7_info");DatabaseReference
            m1_9_h7_s = mDate_1_9.child("1_9_h7_s");
    DatabaseReference
            m1_9_h8 = mDate_1_9.child("1_9_h8_info");DatabaseReference
            m1_9_h8_s = mDate_1_9.child("1_9_h8_s");
    DatabaseReference
            m1_9_h9 = mDate_1_9.child("1_9_h9_info");DatabaseReference
            m1_9_h9_s = mDate_1_9.child("1_9_h9_s");

    //2-7
    DatabaseReference mDate_2_9 = mRootReference.child("2_9");
    DatabaseReference
            m2_9_h1 = mDate_2_9.child("2_9_h1_info");DatabaseReference
            m2_9_h1_s = mDate_2_9.child("2_9_h1_s");
    DatabaseReference
            m2_9_h2 = mDate_2_9.child("2_9_h2_info");DatabaseReference
            m2_9_h2_s = mDate_2_9.child("2_9_h2_s");
    DatabaseReference
            m2_9_h3 = mDate_2_9.child("2_9_h3_info");DatabaseReference
            m2_9_h3_s = mDate_2_9.child("2_9_h3_s");
    DatabaseReference
            m2_9_h4 = mDate_2_9.child("2_9_h4_info");DatabaseReference
            m2_9_h4_s = mDate_2_9.child("2_9_h4_s");
    DatabaseReference
            m2_9_h5 = mDate_2_9.child("2_9_h5_info");DatabaseReference
            m2_9_h5_s = mDate_2_9.child("2_9_h5_s");
    DatabaseReference
            m2_9_h6 = mDate_2_9.child("2_9_h6_info");DatabaseReference
            m2_9_h6_s = mDate_2_9.child("2_9_h6_s");
    DatabaseReference
            m2_9_h7 = mDate_2_9.child("2_9_h7_info");DatabaseReference
            m2_9_h7_s = mDate_2_9.child("2_9_h7_s");
    DatabaseReference
            m2_9_h8 = mDate_2_9.child("2_9_h8_info");DatabaseReference
            m2_9_h8_s = mDate_2_9.child("2_9_h8_s");
    DatabaseReference
            m2_9_h9 = mDate_2_9.child("2_9_h9_info");DatabaseReference
            m2_9_h9_s = mDate_2_9.child("2_9_h9_s");
    //3-7
    DatabaseReference mDate_3_9 = mRootReference.child("3_9");
    DatabaseReference
            m3_9_h1 = mDate_3_9.child("3_9_h1_info");DatabaseReference
            m3_9_h1_s = mDate_3_9.child("3_9_h1_s");
    DatabaseReference
            m3_9_h2 = mDate_3_9.child("3_9_h2_info");DatabaseReference
            m3_9_h2_s = mDate_3_9.child("3_9_h2_s");
    DatabaseReference
            m3_9_h3 = mDate_3_9.child("3_9_h3_info");DatabaseReference
            m3_9_h3_s = mDate_3_9.child("3_9_h3_s");
    DatabaseReference
            m3_9_h4 = mDate_3_9.child("3_9_h4_info");DatabaseReference
            m3_9_h4_s = mDate_3_9.child("3_9_h4_s");
    DatabaseReference
            m3_9_h5 = mDate_3_9.child("3_9_h5_info");DatabaseReference
            m3_9_h5_s = mDate_3_9.child("3_9_h5_s");
    DatabaseReference
            m3_9_h6 = mDate_3_9.child("3_9_h6_info");DatabaseReference
            m3_9_h6_s = mDate_3_9.child("3_9_h6_s");
    DatabaseReference
            m3_9_h7 = mDate_3_9.child("3_9_h7_info");DatabaseReference
            m3_9_h7_s = mDate_3_9.child("3_9_h7_s");
    DatabaseReference
            m3_9_h8 = mDate_3_9.child("3_9_h8_info");DatabaseReference
            m3_9_h8_s = mDate_3_9.child("3_9_h8_s");
    DatabaseReference
            m3_9_h9 = mDate_3_9.child("3_9_h9_info");DatabaseReference
            m3_9_h9_s = mDate_1_9.child("3_9_h9_s");

    //4-7
    DatabaseReference mDate_4_9 = mRootReference.child("4_9");
    DatabaseReference
            m4_9_h1 = mDate_4_9.child("4_9_h1_info");DatabaseReference
            m4_9_h1_s = mDate_4_9.child("4_9_h1_s");
    DatabaseReference
            m4_9_h2 = mDate_4_9.child("4_9_h2_info");DatabaseReference
            m4_9_h2_s = mDate_4_9.child("4_9_h2_s");
    DatabaseReference
            m4_9_h3 = mDate_1_9.child("4_9_h3_info");DatabaseReference
            m4_9_h3_s = mDate_4_9.child("4_9_h3_s");
    DatabaseReference
            m4_9_h4 = mDate_4_9.child("4_9_h4_info");DatabaseReference
            m4_9_h4_s = mDate_4_9.child("4_9_h4_s");
    DatabaseReference
            m4_9_h5 = mDate_4_9.child("4_9_h5_info");DatabaseReference
            m4_9_h5_s = mDate_4_9.child("4_9_h5_s");
    DatabaseReference
            m4_9_h6 = mDate_4_9.child("4_9_h6_info");DatabaseReference
            m4_9_h6_s = mDate_4_9.child("4_9_h6_s");
    DatabaseReference
            m4_9_h7 = mDate_4_9.child("4_9_h7_info");DatabaseReference
            m4_9_h7_s = mDate_4_9.child("4_9_h7_s");
    DatabaseReference
            m4_9_h8 = mDate_4_9.child("4_9_h8_info");DatabaseReference
            m4_9_h8_s = mDate_4_9.child("4_9_h8_s");
    DatabaseReference
            m4_9_h9 = mDate_4_9.child("4_9_h9_info");DatabaseReference
            m4_9_h9_s = mDate_4_9.child("4_9_h9_s");
    //5_9
    DatabaseReference mDate_5_9 = mRootReference.child("5_9");
    DatabaseReference
            m5_9_h1 = mDate_5_9.child("5_9_h1_info");DatabaseReference
            m5_9_h1_s = mDate_5_9.child("5_9_h1_s");
    DatabaseReference
            m5_9_h2 = mDate_5_9.child("5_9_h2_info");DatabaseReference
            m5_9_h2_s = mDate_5_9.child("5_9_h2_s");
    DatabaseReference
            m5_9_h3 = mDate_5_9.child("5_9_h3_info");DatabaseReference
            m5_9_h3_s = mDate_5_9.child("5_9_h3_s");
    DatabaseReference
            m5_9_h4 = mDate_5_9.child("5_9_h4_info");DatabaseReference
            m5_9_h4_s = mDate_5_9.child("5_9_h4_s");
    DatabaseReference
            m5_9_h5 = mDate_5_9.child("5_9_h5_info");DatabaseReference
            m5_9_h5_s = mDate_5_9.child("5_9_h5_s");
    DatabaseReference
            m5_9_h6 = mDate_5_9.child("5_9_h6_info");DatabaseReference
            m5_9_h6_s = mDate_5_9.child("5_9_h6_s");
    DatabaseReference
            m5_9_h7 = mDate_5_9.child("5_9_h7_info");DatabaseReference
            m5_9_h7_s = mDate_5_9.child("5_9_h7_s");
    DatabaseReference
            m5_9_h8 = mDate_5_9.child("5_9_h8_info");DatabaseReference
            m5_9_h8_s = mDate_5_9.child("5_9_h8_s");
    DatabaseReference
            m5_9_h9 = mDate_5_9.child("5_9_h9_info");DatabaseReference
            m5_9_h9_s = mDate_5_9.child("5_9_h9_s");
    //6-7
    DatabaseReference mDate_6_9 = mRootReference.child("6_9");
    DatabaseReference
            m6_9_h1 = mDate_6_9.child("6_9_h1_info");DatabaseReference
            m6_9_h1_s = mDate_6_9.child("6_9_h1_s");
    DatabaseReference
            m6_9_h2 = mDate_6_9.child("6_9_h2_info");DatabaseReference
            m6_9_h2_s = mDate_6_9.child("6_9_h2_s");
    DatabaseReference
            m6_9_h3 = mDate_6_9.child("6_9_h3_info");DatabaseReference
            m6_9_h3_s = mDate_6_9.child("6_9_h3_s");
    DatabaseReference
            m6_9_h4 = mDate_6_9.child("6_9_h4_info");DatabaseReference
            m6_9_h4_s = mDate_6_9.child("6_9_h4_s");
    DatabaseReference
            m6_9_h5 = mDate_6_9.child("6_9_h5_info");DatabaseReference
            m6_9_h5_s = mDate_6_9.child("6_9_h5_s");
    DatabaseReference
            m6_9_h6 = mDate_6_9.child("6_9_h6_info");DatabaseReference
            m6_9_h6_s = mDate_6_9.child("6_9_h6_s");
    DatabaseReference
            m6_9_h7 = mDate_6_9.child("6_9_h7_info");DatabaseReference
            m6_9_h7_s = mDate_6_9.child("6_9_h7_s");
    DatabaseReference
            m6_9_h8 = mDate_6_9.child("6_9_h8_info");DatabaseReference
            m6_9_h8_s = mDate_6_9.child("6_9_h8_s");
    DatabaseReference
            m6_9_h9 = mDate_6_9.child("6_9_h9_info");DatabaseReference
            m6_9_h9_s = mDate_6_9.child("6_9_h9_s");
    //7-7
    DatabaseReference mDate_7_9 = mRootReference.child("7_9");
    DatabaseReference
            m7_9_h1 = mDate_7_9.child("7_9_h1_info");DatabaseReference
            m7_9_h1_s = mDate_7_9.child("7_9_h1_s");
    DatabaseReference
            m7_9_h2 = mDate_7_9.child("7_9_h2_info");DatabaseReference
            m7_9_h2_s = mDate_7_9.child("7_9_h2_s");
    DatabaseReference
            m7_9_h3 = mDate_7_9.child("7_9_h3_info");DatabaseReference
            m7_9_h3_s = mDate_7_9.child("7_9_h3_s");
    DatabaseReference
            m7_9_h4 = mDate_7_9.child("7_9_h4_info");DatabaseReference
            m7_9_h4_s = mDate_7_9.child("7_9_h4_s");
    DatabaseReference
            m7_9_h5 = mDate_7_9.child("7_9_h5_info");DatabaseReference
            m7_9_h5_s = mDate_7_9.child("7_9_h5_s");
    DatabaseReference
            m7_9_h6 = mDate_7_9.child("7_9_h6_info");DatabaseReference
            m7_9_h6_s = mDate_7_9.child("7_9_h6_s");
    DatabaseReference
            m7_9_h7 = mDate_7_9.child("7_9_h7_info");DatabaseReference
            m7_9_h7_s = mDate_7_9.child("7_9_h7_s");
    DatabaseReference
            m7_9_h8 = mDate_7_9.child("7_9_h8_info");DatabaseReference
            m7_9_h8_s = mDate_7_9.child("7_9_h8_s");
    DatabaseReference
            m7_9_h9 = mDate_7_9.child("7_9_h9_info");DatabaseReference
            m7_9_h9_s = mDate_7_9.child("7_9_h9_s");
    //8-7
    DatabaseReference mDate_8_9 = mRootReference.child("8_9");
    DatabaseReference
            m8_9_h1 = mDate_8_9.child("8_9_h1_info");DatabaseReference
            m8_9_h1_s = mDate_8_9.child("8_9_h1_s");
    DatabaseReference
            m8_9_h2 = mDate_8_9.child("8_9_h2_info");DatabaseReference
            m8_9_h2_s = mDate_8_9.child("8_9_h2_s");
    DatabaseReference
            m8_9_h3 = mDate_8_9.child("8_9_h3_info");DatabaseReference
            m8_9_h3_s = mDate_8_9.child("8_9_h3_s");
    DatabaseReference
            m8_9_h4 = mDate_8_9.child("8_9_h4_info");DatabaseReference
            m8_9_h4_s = mDate_8_9.child("8_9_h4_s");
    DatabaseReference
            m8_9_h5 = mDate_8_9.child("8_9_h5_info");DatabaseReference
            m8_9_h5_s = mDate_8_9.child("8_9_h5_s");
    DatabaseReference
            m8_9_h6 = mDate_8_9.child("8_9_h6_info");DatabaseReference
            m8_9_h6_s = mDate_8_9.child("8_9_h6_s");
    DatabaseReference
            m8_9_h7 = mDate_8_9.child("8_9_h7_info");DatabaseReference
            m8_9_h7_s = mDate_8_9.child("8_9_h7_s");
    DatabaseReference
            m8_9_h8 = mDate_8_9.child("8_9_h8_info");DatabaseReference
            m8_9_h8_s = mDate_8_9.child("8_9_h8_s");
    DatabaseReference
            m8_9_h9 = mDate_8_9.child("8_9_h9_info");DatabaseReference
            m8_9_h9_s = mDate_8_9.child("8_9_h9_s");
    //9-7
    DatabaseReference mDate_9_9 = mRootReference.child("9_9");
    DatabaseReference
            m9_9_h1 = mDate_9_9.child("9_9_h1_info");DatabaseReference
            m9_9_h1_s = mDate_9_9.child("9_9_h1_s");
    DatabaseReference
            m9_9_h2 = mDate_9_9.child("9_9_h2_info");DatabaseReference
            m9_9_h2_s = mDate_9_9.child("9_9_h2_s");
    DatabaseReference
            m9_9_h3 = mDate_9_9.child("9_9_h3_info");DatabaseReference
            m9_9_h3_s = mDate_9_9.child("9_9_h3_s");
    DatabaseReference
            m9_9_h4 = mDate_9_9.child("9_9_h4_info");DatabaseReference
            m9_9_h4_s = mDate_9_9.child("9_9_h4_s");
    DatabaseReference
            m9_9_h5 = mDate_9_9.child("9_9_h5_info");DatabaseReference
            m9_9_h5_s = mDate_9_9.child("9_9_h5_s");
    DatabaseReference
            m9_9_h6 = mDate_9_9.child("9_9_h6_info");DatabaseReference
            m9_9_h6_s = mDate_9_9.child("9_9_h6_s");
    DatabaseReference
            m9_9_h7 = mDate_9_9.child("9_9_h7_info");DatabaseReference
            m9_9_h7_s = mDate_9_9.child("9_9_h7_s");
    DatabaseReference
            m9_9_h8 = mDate_9_9.child("9_9_h8_info");DatabaseReference
            m9_9_h8_s = mDate_9_9.child("9_9_h8_s");
    DatabaseReference
            m9_9_h9 = mDate_9_9.child("9_9_h9_info");DatabaseReference
            m9_9_h9_s = mDate_9_9.child("9_9_h9_s");
    //10-7
    DatabaseReference mDate_10_9 = mRootReference.child("10_9");
    DatabaseReference
            m10_9_h1 = mDate_10_9.child("10_9_h1_info");DatabaseReference
            m10_9_h1_s = mDate_10_9.child("10_9_h1_s");
    DatabaseReference
            m10_9_h2 = mDate_10_9.child("10_9_h2_info");DatabaseReference
            m10_9_h2_s = mDate_10_9.child("10_9_h2_s");
    DatabaseReference
            m10_9_h3 = mDate_10_9.child("10_9_h3_info");DatabaseReference
            m10_9_h3_s = mDate_10_9.child("10_9_h3_s");
    DatabaseReference
            m10_9_h4 = mDate_10_9.child("10_9_h4_info");DatabaseReference
            m10_9_h4_s = mDate_10_9.child("10_9_h4_s");
    DatabaseReference
            m10_9_h5 = mDate_10_9.child("10_9_h5_info");DatabaseReference
            m10_9_h5_s = mDate_10_9.child("10_9_h5_s");
    DatabaseReference
            m10_9_h6 = mDate_10_9.child("10_9_h6_info");DatabaseReference
            m10_9_h6_s = mDate_10_9.child("10_9_h6_s");
    DatabaseReference
            m10_9_h7 = mDate_10_9.child("10_9_h7_info");DatabaseReference
            m10_9_h7_s = mDate_10_9.child("10_9_h7_s");
    DatabaseReference
            m10_9_h8 = mDate_10_9.child("10_9_h8_info");DatabaseReference
            m10_9_h8_s = mDate_10_9.child("10_9_h8_s");
    DatabaseReference
            m10_9_h9 = mDate_10_9.child("10_9_h9_info");DatabaseReference
            m10_9_h9_s = mDate_10_9.child("10_9_h9_s");
    //11-7
    DatabaseReference mDate_11_9 = mRootReference.child("2_9");
    DatabaseReference
            m11_9_h1 = mDate_11_9.child("11_9_h1_info");DatabaseReference
            m11_9_h1_s = mDate_11_9.child("11_9_h1_s");
    DatabaseReference
            m11_9_h2 = mDate_11_9.child("11_9_h2_info");DatabaseReference
            m11_9_h2_s = mDate_11_9.child("11_9_h2_s");
    DatabaseReference
            m11_9_h3 = mDate_11_9.child("11_9_h3_info");DatabaseReference
            m11_9_h3_s = mDate_11_9.child("11_9_h3_s");
    DatabaseReference
            m11_9_h4 = mDate_11_9.child("11_9_h4_info");DatabaseReference
            m11_9_h4_s = mDate_11_9.child("11_9_h4_s");
    DatabaseReference
            m11_9_h5 = mDate_11_9.child("11_9_h5_info");DatabaseReference
            m11_9_h5_s = mDate_11_9.child("11_9_h5_s");
    DatabaseReference
            m11_9_h6 = mDate_11_9.child("11_9_h6_info");DatabaseReference
            m11_9_h6_s = mDate_11_9.child("11_9_h6_s");
    DatabaseReference
            m11_9_h7 = mDate_11_9.child("11_9_h7_info");DatabaseReference
            m11_9_h7_s = mDate_11_9.child("11_9_h7_s");
    DatabaseReference
            m11_9_h8 = mDate_11_9.child("11_9_h8_info");DatabaseReference
            m11_9_h8_s = mDate_11_9.child("11_9_h8_s");
    DatabaseReference
            m11_9_h9 = mDate_11_9.child("11_9_h9_info");DatabaseReference
            m11_9_h9_s = mDate_11_9.child("11_9_h9_s");
    //12-7
    DatabaseReference mDate_12_9 = mRootReference.child("122_9");
    DatabaseReference
            m12_9_h1 = mDate_12_9.child("12_9_h1_info");DatabaseReference
            m12_9_h1_s = mDate_12_9.child("12_9_h1_s");
    DatabaseReference
            m12_9_h2 = mDate_12_9.child("12_9_h2_info");DatabaseReference
            m12_9_h2_s = mDate_12_9.child("12_9_h2_s");
    DatabaseReference
            m12_9_h3 = mDate_12_9.child("12_9_h3_info");DatabaseReference
            m12_9_h3_s = mDate_12_9.child("12_9_h3_s");
    DatabaseReference
            m12_9_h4 = mDate_12_9.child("12_9_h4_info");DatabaseReference
            m12_9_h4_s = mDate_12_9.child("12_9_h4_s");
    DatabaseReference
            m12_9_h5 = mDate_12_9.child("12_9_h5_info");DatabaseReference
            m12_9_h5_s = mDate_12_9.child("12_9_h5_s");
    DatabaseReference
            m12_9_h6 = mDate_12_9.child("12_9_h6_info");DatabaseReference
            m12_9_h6_s = mDate_12_9.child("12_9_h6_s");
    DatabaseReference
            m12_9_h7 = mDate_12_9.child("12_9_h7_info");DatabaseReference
            m12_9_h7_s = mDate_12_9.child("12_9_h7_s");
    DatabaseReference
            m12_9_h8 = mDate_12_9.child("12_9_h8_info");DatabaseReference
            m12_9_h8_s = mDate_12_9.child("12_9_h8_s");
    DatabaseReference
            m12_9_h9 = mDate_12_9.child("12_9_h9_info");DatabaseReference
            m12_9_h9_s = mDate_12_9.child("12_9_h9_s");
    //13-7
    DatabaseReference mDate_13_9 = mRootReference.child("13_9");
    DatabaseReference
            m13_9_h1 = mDate_13_9.child("13_9_h1_info");DatabaseReference
            m13_9_h1_s = mDate_13_9.child("13_9_h1_s");
    DatabaseReference
            m13_9_h2 = mDate_13_9.child("13_9_h2_info");DatabaseReference
            m13_9_h2_s = mDate_13_9.child("13_9_h2_s");
    DatabaseReference
            m13_9_h3 = mDate_13_9.child("13_9_h3_info");DatabaseReference
            m13_9_h3_s = mDate_13_9.child("13_9_h3_s");
    DatabaseReference
            m13_9_h4 = mDate_13_9.child("13_9_h4_info");DatabaseReference
            m13_9_h4_s = mDate_13_9.child("13_9_h4_s");
    DatabaseReference
            m13_9_h5 = mDate_13_9.child("13_9_h5_info");DatabaseReference
            m13_9_h5_s = mDate_13_9.child("13_9_h5_s");
    DatabaseReference
            m13_9_h6 = mDate_13_9.child("13_9_h6_info");DatabaseReference
            m13_9_h6_s = mDate_13_9.child("13_9_h6_s");
    DatabaseReference
            m13_9_h7 = mDate_13_9.child("13_9_h7_info");DatabaseReference
            m13_9_h7_s = mDate_13_9.child("13_9_h7_s");
    DatabaseReference
            m13_9_h8 = mDate_13_9.child("13_9_h8_info");DatabaseReference
            m13_9_h8_s = mDate_13_9.child("13_9_h8_s");
    DatabaseReference
            m13_9_h9 = mDate_13_9.child("13_9_h9_info");DatabaseReference
            m13_9_h9_s = mDate_13_9.child("13_9_h9_s");
    //14-7
    DatabaseReference mDate_14_9 = mRootReference.child("2_9");
    DatabaseReference
            m14_9_h1 = mDate_14_9.child("14_9_h1_info");DatabaseReference
            m14_9_h1_s = mDate_14_9.child("14_9_h1_s");
    DatabaseReference
            m14_9_h2 = mDate_14_9.child("14_9_h2_info");DatabaseReference
            m14_9_h2_s = mDate_14_9.child("14_9_h2_s");
    DatabaseReference
            m14_9_h3 = mDate_14_9.child("14_9_h3_info");DatabaseReference
            m14_9_h3_s = mDate_14_9.child("14_9_h3_s");
    DatabaseReference
            m14_9_h4 = mDate_14_9.child("14_9_h4_info");DatabaseReference
            m14_9_h4_s = mDate_14_9.child("14_9_h4_s");
    DatabaseReference
            m14_9_h5 = mDate_14_9.child("14_9_h5_info");DatabaseReference
            m14_9_h5_s = mDate_14_9.child("14_9_h5_s");
    DatabaseReference
            m14_9_h6 = mDate_14_9.child("14_9_h6_info");DatabaseReference
            m14_9_h6_s = mDate_14_9.child("14_9_h6_s");
    DatabaseReference
            m14_9_h7 = mDate_14_9.child("14_9_h7_info");DatabaseReference
            m14_9_h7_s = mDate_14_9.child("14_9_h7_s");
    DatabaseReference
            m14_9_h8 = mDate_14_9.child("14_9_h8_info");DatabaseReference
            m14_9_h8_s = mDate_14_9.child("14_9_h8_s");
    DatabaseReference
            m14_9_h9 = mDate_14_9.child("14_9_h9_info");DatabaseReference
            m14_9_h9_s = mDate_14_9.child("14_9_h9_s");
    //15-7
    DatabaseReference mDate_15_9 = mRootReference.child("15_9");
    DatabaseReference
            m15_9_h1 = mDate_15_9.child("15_9_h1_info");DatabaseReference
            m15_9_h1_s = mDate_15_9.child("15_9_h1_s");
    DatabaseReference
            m15_9_h2 = mDate_15_9.child("15_9_h2_info");DatabaseReference
            m15_9_h2_s = mDate_15_9.child("15_9_h2_s");
    DatabaseReference
            m15_9_h3 = mDate_15_9.child("15_9_h3_info");DatabaseReference
            m15_9_h3_s = mDate_15_9.child("15_9_h3_s");
    DatabaseReference
            m15_9_h4 = mDate_15_9.child("15_9_h4_info");DatabaseReference
            m15_9_h4_s = mDate_15_9.child("15_9_h4_s");
    DatabaseReference
            m15_9_h5 = mDate_15_9.child("15_9_h5_info");DatabaseReference
            m15_9_h5_s = mDate_15_9.child("15_9_h5_s");
    DatabaseReference
            m15_9_h6 = mDate_15_9.child("15_9_h6_info");DatabaseReference
            m15_9_h6_s = mDate_15_9.child("15_9_h6_s");
    DatabaseReference
            m15_9_h7 = mDate_15_9.child("15_9_h7_info");DatabaseReference
            m15_9_h7_s = mDate_15_9.child("15_9_h7_s");
    DatabaseReference
            m15_9_h8 = mDate_15_9.child("15_9_h8_info");DatabaseReference
            m15_9_h8_s = mDate_15_9.child("15_9_h8_s");
    DatabaseReference
            m15_9_h9 = mDate_15_9.child("15_9_h9_info");DatabaseReference
            m15_9_h9_s = mDate_15_9.child("15_9_h9_s");
    //16-7
    DatabaseReference mDate_16_9 = mRootReference.child("2_9");
    DatabaseReference
            m16_9_h1 = mDate_16_9.child("16_9_h1_info");DatabaseReference
            m16_9_h1_s = mDate_16_9.child("16_9_h1_s");
    DatabaseReference
            m16_9_h2 = mDate_16_9.child("16_9_h2_info");DatabaseReference
            m16_9_h2_s = mDate_16_9.child("16_9_h2_s");
    DatabaseReference
            m16_9_h3 = mDate_16_9.child("16_9_h3_info");DatabaseReference
            m16_9_h3_s = mDate_16_9.child("16_9_h3_s");
    DatabaseReference
            m16_9_h4 = mDate_16_9.child("16_9_h4_info");DatabaseReference
            m16_9_h4_s = mDate_16_9.child("16_9_h4_s");
    DatabaseReference
            m16_9_h5 = mDate_16_9.child("16_9_h5_info");DatabaseReference
            m16_9_h5_s = mDate_16_9.child("16_9_h5_s");
    DatabaseReference
            m16_9_h6 = mDate_16_9.child("16_9_h6_info");DatabaseReference
            m16_9_h6_s = mDate_16_9.child("16_9_h6_s");
    DatabaseReference
            m16_9_h7 = mDate_16_9.child("16_9_h7_info");DatabaseReference
            m16_9_h7_s = mDate_16_9.child("16_9_h7_s");
    DatabaseReference
            m16_9_h8 = mDate_16_9.child("16_9_h8_info");DatabaseReference
            m16_9_h8_s = mDate_16_9.child("16_9_h8_s");
    DatabaseReference
            m16_9_h9 = mDate_16_9.child("16_9_h9_info");DatabaseReference
            m16_9_h9_s = mDate_16_9.child("16_9_h9_s");
    //17-7
    DatabaseReference mDate_17_9 = mRootReference.child("17_9");
    DatabaseReference
            m17_9_h1 = mDate_17_9.child("17_9_h1_info");DatabaseReference
            m17_9_h1_s = mDate_17_9.child("17_9_h1_s");
    DatabaseReference
            m17_9_h2 = mDate_17_9.child("17_9_h2_info");DatabaseReference
            m17_9_h2_s = mDate_17_9.child("17_9_h2_s");
    DatabaseReference
            m17_9_h3 = mDate_17_9.child("17_9_h3_info");DatabaseReference
            m17_9_h3_s = mDate_17_9.child("17_9_h3_s");
    DatabaseReference
            m17_9_h4 = mDate_17_9.child("17_9_h4_info");DatabaseReference
            m17_9_h4_s = mDate_17_9.child("17_9_h4_s");
    DatabaseReference
            m17_9_h5 = mDate_17_9.child("17_9_h5_info");DatabaseReference
            m17_9_h5_s = mDate_17_9.child("17_9_h5_s");
    DatabaseReference
            m17_9_h6 = mDate_17_9.child("17_9_h6_info");DatabaseReference
            m17_9_h6_s = mDate_17_9.child("17_9_h6_s");
    DatabaseReference
            m17_9_h7 = mDate_17_9.child("17_9_h7_info");DatabaseReference
            m17_9_h7_s = mDate_17_9.child("17_9_h7_s");
    DatabaseReference
            m17_9_h8 = mDate_17_9.child("17_9_h8_info");DatabaseReference
            m17_9_h8_s = mDate_17_9.child("17_9_h8_s");
    DatabaseReference
            m17_9_h9 = mDate_17_9.child("17_9_h9_info");DatabaseReference
            m17_9_h9_s = mDate_17_9.child("17_9_h9_s");
    //18-7
    DatabaseReference mDate_18_9 = mRootReference.child("18_9");
    DatabaseReference
            m18_9_h1 = mDate_18_9.child("18_9_h1_info");DatabaseReference
            m18_9_h1_s = mDate_18_9.child("18_9_h1_s");
    DatabaseReference
            m18_9_h2 = mDate_18_9.child("18_9_h2_info");DatabaseReference
            m18_9_h2_s = mDate_18_9.child("18_9_h2_s");
    DatabaseReference
            m18_9_h3 = mDate_18_9.child("18_9_h3_info");DatabaseReference
            m18_9_h3_s = mDate_18_9.child("18_9_h3_s");
    DatabaseReference
            m18_9_h4 = mDate_18_9.child("18_9_h4_info");DatabaseReference
            m18_9_h4_s = mDate_18_9.child("18_9_h4_s");
    DatabaseReference
            m18_9_h5 = mDate_18_9.child("18_9_h5_info");DatabaseReference
            m18_9_h5_s = mDate_18_9.child("18_9_h5_s");
    DatabaseReference
            m18_9_h6 = mDate_18_9.child("18_9_h6_info");DatabaseReference
            m18_9_h6_s = mDate_18_9.child("18_9_h6_s");
    DatabaseReference
            m18_9_h7 = mDate_18_9.child("18_9_h7_info");DatabaseReference
            m18_9_h7_s = mDate_18_9.child("18_9_h7_s");
    DatabaseReference
            m18_9_h8 = mDate_18_9.child("18_9_h8_info");DatabaseReference
            m18_9_h8_s = mDate_18_9.child("18_9_h8_s");
    DatabaseReference
            m18_9_h9 = mDate_18_9.child("18_9_h9_info");DatabaseReference
            m18_9_h9_s = mDate_18_9.child("18_9_h9_s");
    //19-7
    DatabaseReference mDate_19_9 = mRootReference.child("19_9");DatabaseReference
            m19_9_h1 = mDate_19_9.child("19_9_h3_info");DatabaseReference
            m19_9_h1_s = mDate_19_9.child("19_9_h3_s");
    DatabaseReference
            m19_9_h2 = mDate_19_9.child("19_9_h2_info");DatabaseReference
            m19_9_h2_s = mDate_19_9.child("19_9_h2_s");
    DatabaseReference
            m19_9_h3 = mDate_19_9.child("19_9_h3_info");DatabaseReference
            m19_9_h3_s = mDate_19_9.child("19_9_h3_s");
    DatabaseReference
            m19_9_h4 = mDate_19_9.child("19_9_h4_info");DatabaseReference
            m19_9_h4_s = mDate_19_9.child("19_9_h4_s");
    DatabaseReference
            m19_9_h5 = mDate_19_9.child("19_9_h5_info");DatabaseReference
            m19_9_h5_s = mDate_19_9.child("19_9_h5_s");
    DatabaseReference
            m19_9_h6 = mDate_19_9.child("19_9_h6_info");DatabaseReference
            m19_9_h6_s = mDate_19_9.child("19_9_h6_s");
    DatabaseReference
            m19_9_h7 = mDate_19_9.child("19_9_h7_info");DatabaseReference
            m19_9_h7_s = mDate_19_9.child("19_9_h7_s");
    DatabaseReference
            m19_9_h8 = mDate_19_9.child("19_9_h8_info");DatabaseReference
            m19_9_h8_s = mDate_19_9.child("19_9_h8_s");
    DatabaseReference
            m19_9_h9 = mDate_19_9.child("19_9_h9_info");DatabaseReference
            m19_9_h9_s = mDate_19_9.child("19_9_h9_s");

    //20-7
    DatabaseReference mDate_20_9 = mRootReference.child("20_9");
    DatabaseReference
            m20_9_h1 = mDate_20_9.child("20_9_h1_info");DatabaseReference
            m20_9_h1_s = mDate_20_9.child("20_9_h1_s");
    DatabaseReference
            m20_9_h2 = mDate_20_9.child("20_9_h2_info");DatabaseReference
            m20_9_h2_s = mDate_20_9.child("20_9_h2_s");
    DatabaseReference
            m20_9_h3 = mDate_20_9.child("20_9_h3_info");DatabaseReference
            m20_9_h3_s = mDate_20_9.child("20_9_h3_s");
    DatabaseReference
            m20_9_h4 = mDate_20_9.child("20_9_h4_info");DatabaseReference
            m20_9_h4_s = mDate_20_9.child("20_9_h4_s");
    DatabaseReference
            m20_9_h5 = mDate_20_9.child("20_9_h5_info");DatabaseReference
            m20_9_h5_s = mDate_20_9.child("20_9_h5_s");
    DatabaseReference
            m20_9_h6 = mDate_20_9.child("20_9_h6_info");DatabaseReference
            m20_9_h6_s = mDate_20_9.child("20_9_h6_s");
    DatabaseReference
            m20_9_h7 = mDate_20_9.child("20_9_h7_info");DatabaseReference
            m20_9_h7_s = mDate_20_9.child("20_9_h7_s");
    DatabaseReference
            m20_9_h8 = mDate_20_9.child("20_9_h8_info");DatabaseReference
            m20_9_h8_s = mDate_20_9.child("20_9_h8_s");
    DatabaseReference
            m20_9_h9 = mDate_20_9.child("20_9_h9_info");DatabaseReference
            m20_9_h9_s = mDate_20_9.child("20_9_h9_s");
    //21-7
    DatabaseReference mDate_21_9 = mRootReference.child("21_9");
    DatabaseReference
            m21_9_h1 = mDate_21_9.child("21_9_h1_info");DatabaseReference
            m21_9_h1_s = mDate_21_9.child("21_9_h1_s");
    DatabaseReference
            m21_9_h2 = mDate_21_9.child("21_9_h2_info");DatabaseReference
            m21_9_h2_s = mDate_21_9.child("21_9_h2_s");
    DatabaseReference
            m21_9_h3 = mDate_21_9.child("21_9_h3_info");DatabaseReference
            m21_9_h3_s = mDate_21_9.child("21_9_h3_s");
    DatabaseReference
            m21_9_h4 = mDate_21_9.child("21_9_h4_info");DatabaseReference
            m21_9_h4_s = mDate_21_9.child("21_9_h4_s");
    DatabaseReference
            m21_9_h5 = mDate_21_9.child("21_9_h5_info");DatabaseReference
            m21_9_h5_s = mDate_21_9.child("21_9_h5_s");
    DatabaseReference
            m21_9_h6 = mDate_21_9.child("21_9_h6_info");DatabaseReference
            m21_9_h6_s = mDate_21_9.child("21_9_h6_s");
    DatabaseReference
            m21_9_h7 = mDate_21_9.child("21_9_h7_info");DatabaseReference
            m21_9_h7_s = mDate_21_9.child("21_9_h7_s");
    DatabaseReference
            m21_9_h8 = mDate_21_9.child("21_9_h8_info");DatabaseReference
            m21_9_h8_s = mDate_21_9.child("21_9_h8_s");
    DatabaseReference
            m21_9_h9 = mDate_21_9.child("21_9_h9_info");DatabaseReference
            m21_9_h9_s = mDate_21_9.child("21_9_h9_s");
    //22-7
    DatabaseReference mDate_22_9 = mRootReference.child("22_9");
    DatabaseReference
            m22_9_h1 = mDate_22_9.child("22_9_h1_info");DatabaseReference
            m22_9_h1_s = mDate_22_9.child("22_9_h1_s");
    DatabaseReference
            m22_9_h2 = mDate_22_9.child("22_9_h2_info");DatabaseReference
            m22_9_h2_s = mDate_22_9.child("22_9_h2_s");
    DatabaseReference
            m22_9_h3 = mDate_22_9.child("22_9_h3_info");DatabaseReference
            m22_9_h3_s = mDate_22_9.child("22_9_h3_s");
    DatabaseReference
            m22_9_h4 = mDate_22_9.child("22_9_h4_info");DatabaseReference
            m22_9_h4_s = mDate_22_9.child("22_9_h4_s");
    DatabaseReference
            m22_9_h5 = mDate_22_9.child("22_9_h5_info");DatabaseReference
            m22_9_h5_s = mDate_22_9.child("22_9_h5_s");
    DatabaseReference
            m22_9_h6 = mDate_22_9.child("22_9_h6_info");DatabaseReference
            m22_9_h6_s = mDate_22_9.child("22_9_h6_s");
    DatabaseReference
            m22_9_h7 = mDate_22_9.child("22_9_h7_info");DatabaseReference
            m22_9_h7_s = mDate_22_9.child("22_9_h7_s");
    DatabaseReference
            m22_9_h8 = mDate_22_9.child("22_9_h8_info");DatabaseReference
            m22_9_h8_s = mDate_22_9.child("22_9_h8_s");
    DatabaseReference
            m22_9_h9 = mDate_22_9.child("22_9_h9_info");DatabaseReference
            m22_9_h9_s = mDate_22_9.child("22_9_h9_s");
    //23-7
    DatabaseReference mDate_23_9 = mRootReference.child("23_9");
    DatabaseReference
            m23_9_h1 = mDate_23_9.child("23_9_h1_info");DatabaseReference
            m23_9_h1_s = mDate_23_9.child("23_9_h1_s");
    DatabaseReference
            m23_9_h2 = mDate_23_9.child("23_9_h2_info");DatabaseReference
            m23_9_h2_s = mDate_23_9.child("23_9_h2_s");
    DatabaseReference
            m23_9_h3 = mDate_23_9.child("23_9_h3_info");DatabaseReference
            m23_9_h3_s = mDate_23_9.child("23_9_h3_s");
    DatabaseReference
            m23_9_h4 = mDate_23_9.child("23_9_h4_info");DatabaseReference
            m23_9_h4_s = mDate_23_9.child("23_9_h4_s");
    DatabaseReference
            m23_9_h5 = mDate_23_9.child("23_9_h5_info");DatabaseReference
            m23_9_h5_s = mDate_23_9.child("23_9_h5_s");
    DatabaseReference
            m23_9_h6 = mDate_23_9.child("23_9_h6_info");DatabaseReference
            m23_9_h6_s = mDate_23_9.child("23_9_h6_s");
    DatabaseReference
            m23_9_h7 = mDate_23_9.child("23_9_h7_info");DatabaseReference
            m23_9_h7_s = mDate_23_9.child("23_9_h7_s");
    DatabaseReference
            m23_9_h8 = mDate_23_9.child("23_9_h8_info");DatabaseReference
            m23_9_h8_s = mDate_23_9.child("23_9_h8_s");
    DatabaseReference
            m23_9_h9 = mDate_23_9.child("23_9_h9_info");DatabaseReference
            m23_9_h9_s = mDate_23_9.child("23_9_h9_s");
    //24-7
    DatabaseReference mDate_24_9 = mRootReference.child("24_9");
    DatabaseReference
            m24_9_h1 = mDate_24_9.child("24_9_h1_info");DatabaseReference
            m24_9_h1_s = mDate_24_9.child("24_9_h1_s");
    DatabaseReference
            m24_9_h2 = mDate_24_9.child("24_9_h2_info");DatabaseReference
            m24_9_h2_s = mDate_24_9.child("24_9_h2_s");
    DatabaseReference
            m24_9_h3 = mDate_24_9.child("24_9_h3_info");DatabaseReference
            m24_9_h3_s = mDate_24_9.child("24_9_h3_s");
    DatabaseReference
            m24_9_h4 = mDate_24_9.child("24_9_h4_info");DatabaseReference
            m24_9_h4_s = mDate_24_9.child("24_9_h4_s");
    DatabaseReference
            m24_9_h5 = mDate_24_9.child("24_9_h5_info");DatabaseReference
            m24_9_h5_s = mDate_24_9.child("24_9_h5_s");
    DatabaseReference
            m24_9_h6 = mDate_24_9.child("24_9_h6_info");DatabaseReference
            m24_9_h6_s = mDate_24_9.child("24_9_h6_s");
    DatabaseReference
            m24_9_h7 = mDate_24_9.child("24_9_h7_info");DatabaseReference
            m24_9_h7_s = mDate_24_9.child("24_9_h7_s");
    DatabaseReference
            m24_9_h8 = mDate_24_9.child("24_9_h8_info");DatabaseReference
            m24_9_h8_s = mDate_24_9.child("24_9_h8_s");
    DatabaseReference
            m24_9_h9 = mDate_24_9.child("24_9_h9_info");DatabaseReference
            m24_9_h9_s = mDate_24_9.child("24_9_h9_s");
    //25-7
    DatabaseReference mDate_25_9 = mRootReference.child("25_9");
    DatabaseReference
            m25_9_h1 = mDate_25_9.child("25_9_h1_info");DatabaseReference
            m25_9_h1_s = mDate_25_9.child("25_9_h1_s");
    DatabaseReference
            m25_9_h2 = mDate_25_9.child("25_9_h2_info");DatabaseReference
            m25_9_h2_s = mDate_25_9.child("25_9_h2_s");
    DatabaseReference
            m25_9_h3 = mDate_25_9.child("25_9_h3_info");DatabaseReference
            m25_9_h3_s = mDate_25_9.child("25_9_h3_s");
    DatabaseReference
            m25_9_h4 = mDate_25_9.child("25_9_h4_info");DatabaseReference
            m25_9_h4_s = mDate_25_9.child("25_9_h4_s");
    DatabaseReference
            m25_9_h5 = mDate_25_9.child("25_9_h5_info");DatabaseReference
            m25_9_h5_s = mDate_25_9.child("25_9_h5_s");
    DatabaseReference
            m25_9_h6 = mDate_25_9.child("25_9_h6_info");DatabaseReference
            m25_9_h6_s = mDate_25_9.child("25_9_h6_s");
    DatabaseReference
            m25_9_h7 = mDate_25_9.child("25_9_h7_info");DatabaseReference
            m25_9_h7_s = mDate_25_9.child("25_9_h7_s");
    DatabaseReference
            m25_9_h8 = mDate_25_9.child("25_9_h8_info");DatabaseReference
            m25_9_h8_s = mDate_25_9.child("25_9_h8_s");
    DatabaseReference
            m25_9_h9 = mDate_25_9.child("25_9_h9_info");DatabaseReference
            m25_9_h9_s = mDate_25_9.child("25_9_h9_s");
    //26-7
    DatabaseReference mDate_26_9 = mRootReference.child("26_9");
    DatabaseReference
            m26_9_h1 = mDate_26_9.child("26_9_h1_info");DatabaseReference
            m26_9_h1_s = mDate_26_9.child("26_9_h1_s");
    DatabaseReference
            m26_9_h2 = mDate_26_9.child("26_9_h2_info");DatabaseReference
            m26_9_h2_s = mDate_26_9.child("26_9_h2_s");
    DatabaseReference
            m26_9_h3 = mDate_26_9.child("26_9_h3_info");DatabaseReference
            m26_9_h3_s = mDate_26_9.child("26_9_h3_s");
    DatabaseReference
            m26_9_h4 = mDate_26_9.child("26_9_h4_info");DatabaseReference
            m26_9_h4_s = mDate_26_9.child("26_9_h4_s");
    DatabaseReference
            m26_9_h5 = mDate_26_9.child("26_9_h5_info");DatabaseReference
            m26_9_h5_s = mDate_26_9.child("26_9_h5_s");
    DatabaseReference
            m26_9_h6 = mDate_26_9.child("26_9_h6_info");DatabaseReference
            m26_9_h6_s = mDate_26_9.child("26_9_h6_s");
    DatabaseReference
            m26_9_h7 = mDate_26_9.child("26_9_h7_info");DatabaseReference
            m26_9_h7_s = mDate_26_9.child("26_9_h7_s");
    DatabaseReference
            m26_9_h8 = mDate_26_9.child("26_9_h8_info");DatabaseReference
            m26_9_h8_s = mDate_26_9.child("26_9_h8_s");
    DatabaseReference
            m26_9_h9 = mDate_26_9.child("26_9_h9_info");DatabaseReference
            m26_9_h9_s = mDate_26_9.child("26_9_h9_s");
    //27-7
    DatabaseReference mDate_27_9 = mRootReference.child("27_9");
    DatabaseReference
            m27_9_h1 = mDate_27_9.child("27_9_h1_info");DatabaseReference
            m27_9_h1_s = mDate_27_9.child("27_9_h1_s");
    DatabaseReference
            m27_9_h2 = mDate_27_9.child("27_9_h2_info");DatabaseReference
            m27_9_h2_s = mDate_27_9.child("27_9_h2_s");
    DatabaseReference
            m27_9_h3 = mDate_27_9.child("27_9_h3_info");DatabaseReference
            m27_9_h3_s = mDate_27_9.child("27_9_h3_s");
    DatabaseReference
            m27_9_h4   = mDate_27_9.child("27_9_h4_info");DatabaseReference
            m27_9_h4_s = mDate_27_9.child("27_9_h4_s");
    DatabaseReference
            m27_9_h5 = mDate_27_9.child("27_9_h5_info");DatabaseReference
            m27_9_h5_s = mDate_27_9.child("27_9_h5_s");
    DatabaseReference
            m27_9_h6 = mDate_27_9.child("27_9_h6_info");DatabaseReference
            m27_9_h6_s = mDate_27_9.child("27_9_h6_s");
    DatabaseReference
            m27_9_h7 = mDate_27_9.child("27_9_h7_info");DatabaseReference
            m27_9_h7_s = mDate_27_9.child("27_9_h7_s");
    DatabaseReference
            m27_9_h8 = mDate_27_9.child("27_9_h8_info");DatabaseReference
            m27_9_h8_s = mDate_27_9.child("27_9_h8_s");
    DatabaseReference
            m27_9_h9 = mDate_27_9.child("27_9_h9_info");DatabaseReference
            m27_9_h9_s = mDate_27_9.child("27_9_h9_s");
    //28-7
    DatabaseReference mDate_28_9 = mRootReference.child("28_9");
    DatabaseReference
            m28_9_h1 = mDate_28_9.child("28_9_h1_info");DatabaseReference
            m28_9_h1_s = mDate_28_9.child("28_9_h1_s");
    DatabaseReference
            m28_9_h2 = mDate_28_9.child("28_9_h2_info");DatabaseReference
            m28_9_h2_s = mDate_28_9.child("28_9_h2_s");
    DatabaseReference
            m28_9_h3 = mDate_28_9.child("28_9_h3_info");DatabaseReference
            m28_9_h3_s = mDate_28_9.child("28_9_h3_s");
    DatabaseReference
            m28_9_h4 = mDate_28_9.child("28_9_h4_info");DatabaseReference
            m28_9_h4_s = mDate_28_9.child("28_9_h4_s");
    DatabaseReference
            m28_9_h5 = mDate_28_9.child("28_9_h5_info");DatabaseReference
            m28_9_h5_s = mDate_28_9.child("28_9_h5_s");
    DatabaseReference
            m28_9_h6 = mDate_28_9.child("28_9_h6_info");DatabaseReference
            m28_9_h6_s = mDate_28_9.child("28_9_h6_s");
    DatabaseReference
            m28_9_h7 = mDate_28_9.child("28_9_h7_info");DatabaseReference
            m28_9_h7_s = mDate_28_9.child("28_9_h7_s");
    DatabaseReference
            m28_9_h8 = mDate_28_9.child("28_9_h8_info");DatabaseReference
            m28_9_h8_s = mDate_28_9.child("28_9_h8_s");
    DatabaseReference
            m28_9_h9 = mDate_28_9.child("28_9_h9_info");DatabaseReference
            m28_9_h9_s = mDate_28_9.child("28_9_h9_s");
    //29-7
    DatabaseReference mDate_29_9 = mRootReference.child("29_9");
    DatabaseReference
            m29_9_h1 = mDate_29_9.child("29_9_h1_info");DatabaseReference
            m29_9_h1_s = mDate_29_9.child("29_9_h1_s");
    DatabaseReference
            m29_9_h2 = mDate_29_9.child("29_9_h2_info");DatabaseReference
            m29_9_h2_s = mDate_29_9.child("29_9_h2_s");
    DatabaseReference
            m29_9_h3 = mDate_29_9.child("29_9_h3_info");DatabaseReference
            m29_9_h3_s = mDate_29_9.child("29_9_h3_s");
    DatabaseReference
            m29_9_h4 = mDate_29_9.child("29_9_h4_info");DatabaseReference
            m29_9_h4_s = mDate_29_9.child("29_9_h4_s");
    DatabaseReference
            m29_9_h5 = mDate_29_9.child("29_9_h5_info");DatabaseReference
            m29_9_h5_s = mDate_29_9.child("29_9_h5_s");
    DatabaseReference
            m29_9_h6 = mDate_29_9.child("29_9_h6_info");DatabaseReference
            m29_9_h6_s = mDate_29_9.child("29_9_h6_s");
    DatabaseReference
            m29_9_h7 = mDate_29_9.child("2_9_h7_info");DatabaseReference
            m29_9_h7_s = mDate_29_9.child("2_9_h7_s");
    DatabaseReference
            m29_9_h8 = mDate_29_9.child("29_9_h8_info");DatabaseReference
            m29_9_h8_s = mDate_29_9.child("29_9_h8_s");
    DatabaseReference
            m29_9_h9 = mDate_29_9.child("29_9_h9_info");DatabaseReference
            m29_9_h9_s = mDate_29_9.child("29_9_h9_s");
    //30-7
    DatabaseReference mDate_30_9 = mRootReference.child("30_9");
    DatabaseReference
            m30_9_h1 = mDate_30_9.child("30_9_h1_info");DatabaseReference
            m30_9_h1_s = mDate_30_9.child("30_9_h1_s");
    DatabaseReference
            m30_9_h2 = mDate_30_9.child("30_9_h2_info");DatabaseReference
            m30_9_h2_s = mDate_30_9.child("30_9_h2_s");
    DatabaseReference
            m30_9_h3 = mDate_30_9.child("30_9_h3_info");DatabaseReference
            m30_9_h3_s = mDate_30_9.child("30_9_h3_s");
    DatabaseReference
            m30_9_h4 = mDate_30_9.child("30_9_h4_info");DatabaseReference
            m30_9_h4_s = mDate_30_9.child("30_9_h4_s");
    DatabaseReference
            m30_9_h5 = mDate_30_9.child("30_9_h5_info");DatabaseReference
            m30_9_h5_s = mDate_30_9.child("30_9_h5_s");
    DatabaseReference
            m30_9_h6 = mDate_30_9.child("30_9_h6_info");DatabaseReference
            m30_9_h6_s = mDate_30_9.child("30_9_h6_s");
    DatabaseReference
            m30_9_h7 = mDate_30_9.child("30_9_h7_info");DatabaseReference
            m30_9_h7_s = mDate_30_9.child("30_9_h7_s");
    DatabaseReference
            m30_9_h8 = mDate_30_9.child("30_9_h8_info");DatabaseReference
            m30_9_h8_s = mDate_30_9.child("30_9_h8_s");
    DatabaseReference
            m30_9_h9 = mDate_30_9.child("30_9_h9_info");DatabaseReference
            m30_9_h9_s = mDate_30_9.child("30_9_h9_s");
    //31-7
    DatabaseReference mDate_31_9 = mRootReference.child("31_9");
    DatabaseReference
            m31_9_h1 = mDate_31_9.child("31_9_h1_info");DatabaseReference
            m31_9_h1_s = mDate_31_9.child("31_9_h1_s");
    DatabaseReference
            m31_9_h2 = mDate_31_9.child("31_9_h2_info");DatabaseReference
            m31_9_h2_s = mDate_31_9.child("31_9_h2_s");
    DatabaseReference
            m31_9_h3 = mDate_31_9.child("31_9_h3_info");DatabaseReference
            m31_9_h3_s = mDate_31_9.child("31_9_h3_s");
    DatabaseReference
            m31_9_h4 = mDate_31_9.child("31_9_h4_info");DatabaseReference
            m31_9_h4_s = mDate_31_9.child("31_9_h4_s");
    DatabaseReference
            m31_9_h5 = mDate_31_9.child("31_9_h5_info");DatabaseReference
            m31_9_h5_s = mDate_31_9.child("31_9_h5_s");
    DatabaseReference
            m31_9_h6 = mDate_31_9.child("31_9_h6_info");DatabaseReference
            m31_9_h6_s = mDate_31_9.child("31_9_h6_s");
    DatabaseReference
            m31_9_h7 = mDate_31_9.child("31_9_h7_info");DatabaseReference
            m31_9_h7_s = mDate_31_9.child("31_9_h7_s");
    DatabaseReference
            m31_9_h8 = mDate_31_9.child("31_9_h8_info");DatabaseReference
            m31_9_h8_s = mDate_31_9.child("31_9_h8_s");
    DatabaseReference
            m31_9_h9 = mDate_31_9.child("31_9_h9_info");DatabaseReference
            m31_9_h9_s = mDate_31_9.child("31_9_h9_s");




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commande);

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
            case "1_9_h1":
                m1_9_h1_s.setValue("demander");
                m1_9_h1.setValue(input_msg.getText().toString());
                break;
            case "1_9_h2":
                m1_9_h2_s.setValue("demander");
                m1_9_h2.setValue(input_msg.getText().toString());
                break;
            case "1_9_h3":
                m1_9_h3_s.setValue("demander");
                m1_9_h3.setValue(input_msg.getText().toString());
                break;
            case "1_9_h4":
                m1_9_h4_s.setValue("demander");
                m1_9_h4.setValue(input_msg.getText().toString());
                break;
            case "1_9_h5":
                m1_9_h5_s.setValue("demander");
                m1_9_h5.setValue(input_msg.getText().toString());
                break;
            case "1_9_h6":
                m1_9_h6_s.setValue("demander");
                m1_9_h6.setValue(input_msg.getText().toString());
                break;
            case "1_9_h7":
                m1_9_h7_s.setValue("demander");
                m1_9_h7.setValue(input_msg.getText().toString());
                break;
            case "1_9_h8":
                m1_9_h8_s.setValue("demander");
                m1_9_h8.setValue(input_msg.getText().toString());
                break;
            case "1_9_h9":
                m1_9_h9_s.setValue("demander");
                m1_9_h9.setValue(input_msg.getText().toString());
                break;
            ////////////////////////////////////////////////////
            case "2_9_h1":
                m2_9_h1_s.setValue("demander");
                m2_9_h1.setValue(input_msg.getText().toString());
                break;
            case "2_9_h2":
                m2_9_h2_s.setValue("demander");
                m2_9_h2.setValue(input_msg.getText().toString());
                break;
            case "2_9_h3":
                m2_9_h3_s.setValue("demander");
                m2_9_h3.setValue(input_msg.getText().toString());
                break;
            case "2_9_h4":
                m2_9_h4_s.setValue("demander");
                m2_9_h4.setValue(input_msg.getText().toString());
                break;
            case "2_9_h5":
                m2_9_h5_s.setValue("demander");
                m2_9_h5.setValue(input_msg.getText().toString());
                break;
            case "2_9_h6":
                m2_9_h6_s.setValue("demander");
                m2_9_h6.setValue(input_msg.getText().toString());
                break;
            case "2_9_h7":
                m2_9_h7_s.setValue("demander");
                m2_9_h7.setValue(input_msg.getText().toString());
                break;
            case "2_9_h8":
                m2_9_h8_s.setValue("demander");
                m2_9_h8.setValue(input_msg.getText().toString());
                break;
            case "2_9_h9":
                m2_9_h9_s.setValue("demander");
                m2_9_h9.setValue(input_msg.getText().toString());
                break;
            ////////////////////////////////////////////////////
            case "3_9_h1":
                m3_9_h1_s.setValue("demander");
                m3_9_h1.setValue(input_msg.getText().toString());
                break;
            case "3_9_h2":
                m3_9_h2_s.setValue("demander");
                m3_9_h2.setValue(input_msg.getText().toString());
                break;
            case "3_9_h3":
                m3_9_h3_s.setValue("demander");
                m3_9_h3.setValue(input_msg.getText().toString());
                break;
            case "3_9_h4":
                m3_9_h4_s.setValue("demander");
                m3_9_h4.setValue(input_msg.getText().toString());
                break;
            case "3_9_h5":
                m3_9_h5_s.setValue("demander");
                m3_9_h5.setValue(input_msg.getText().toString());
                break;
            case "3_9_h6":
                m3_9_h6_s.setValue("demander");
                m3_9_h6.setValue(input_msg.getText().toString());
                break;
            case "3_9_h7":
                m3_9_h7_s.setValue("demander");
                m3_9_h7.setValue(input_msg.getText().toString());
                break;
            case "3_9_h8":
                m3_9_h8_s.setValue("demander");
                m3_9_h8.setValue(input_msg.getText().toString());
                break;
            case "3_9_h9":
                m3_9_h9_s.setValue("demander");
                m3_9_h9.setValue(input_msg.getText().toString());
                break;
            ////////////////////////////////////////////////////
            case "4_9_h1":
                m4_9_h1_s.setValue("demander");
                m4_9_h1.setValue(input_msg.getText().toString());
                break;
            case "4_9_h2":
                m4_9_h2_s.setValue("demander");
                m4_9_h2.setValue(input_msg.getText().toString());
                break;
            case "4_9_h3":
                m4_9_h3_s.setValue("demander");
                m4_9_h3.setValue(input_msg.getText().toString());
                break;
            case "4_9_h4":
                m4_9_h4_s.setValue("demander");
                m4_9_h4.setValue(input_msg.getText().toString());
                break;
            case "4_9_h5":
                m4_9_h5_s.setValue("demander");
                m4_9_h5.setValue(input_msg.getText().toString());
                break;
            case "4_9_h6":
                m4_9_h6_s.setValue("demander");
                m4_9_h6.setValue(input_msg.getText().toString());
                break;
            case "4_9_h7":
                m4_9_h7_s.setValue("demander");
                m4_9_h7.setValue(input_msg.getText().toString());
                break;
            case "4_9_h8":
                m4_9_h8_s.setValue("demander");
                m4_9_h8.setValue(input_msg.getText().toString());
                break;
            case "4_9_h9":
                m4_9_h9_s.setValue("demander");
                m4_9_h9.setValue(input_msg.getText().toString());
                break;
            ////////////////////////////////////////////////////
            case "5_9_h1":
                m5_9_h1_s.setValue("demander");
                m5_9_h1.setValue(input_msg.getText().toString());
                break;
            case "5_9_h2":
                m5_9_h2_s.setValue("demander");
                m5_9_h2.setValue(input_msg.getText().toString());
                break;
            case "5_9_h3":
                m5_9_h3_s.setValue("demander");
                m5_9_h3.setValue(input_msg.getText().toString());
                break;
            case "5_9_h4":
                m5_9_h4_s.setValue("demander");
                m5_9_h4.setValue(input_msg.getText().toString());
                break;
            case "5_9_h5":
                m5_9_h5_s.setValue("demander");
                m5_9_h5.setValue(input_msg.getText().toString());
                break;
            case "5_9_h6":
                m5_9_h6_s.setValue("demander");
                m5_9_h6.setValue(input_msg.getText().toString());
                break;
            case "5_9_h7":
                m5_9_h7_s.setValue("demander");
                m5_9_h7.setValue(input_msg.getText().toString());
                break;
            case "5_9_h8":
                m5_9_h8_s.setValue("demander");
                m5_9_h8.setValue(input_msg.getText().toString());
                break;
            case "5_9_h9":
                m5_9_h9_s.setValue("demander");
                m5_9_h9.setValue(input_msg.getText().toString());
                break;
            ////////////////////////////////////////////////////
            case "6_9_h1":
                m6_9_h1_s.setValue("demander");
                m6_9_h1.setValue(input_msg.getText().toString());
                break;
            case "6_9_h2":
                m6_9_h2_s.setValue("demander");
                m6_9_h2.setValue(input_msg.getText().toString());
                break;
            case "6_9_h3":
                m6_9_h3_s.setValue("demander");
                m6_9_h3.setValue(input_msg.getText().toString());
                break;
            case "6_9_h4":
                m6_9_h4_s.setValue("demander");
                m6_9_h4.setValue(input_msg.getText().toString());
                break;
            case "6_9_h5":
                m6_9_h5_s.setValue("demander");
                m6_9_h5.setValue(input_msg.getText().toString());
                break;
            case "6_9_h6":
                m6_9_h6_s.setValue("demander");
                m6_9_h6.setValue(input_msg.getText().toString());
                break;
            case "6_9_h7":
                m6_9_h7_s.setValue("demander");
                m6_9_h7.setValue(input_msg.getText().toString());
                break;
            case "6_9_h8":
                m6_9_h8_s.setValue("demander");
                m6_9_h8.setValue(input_msg.getText().toString());
                break;
            case "6_9_h9":
                m6_9_h9_s.setValue("demander");
                m6_9_h9.setValue(input_msg.getText().toString());
                break;
            ////////////////////////////////////////////////////
            case "7_9_h1":
                m7_9_h1_s.setValue("demander");
                m7_9_h1.setValue(input_msg.getText().toString());
                break;
            case "7_9_h2":
                m7_9_h2_s.setValue("demander");
                m7_9_h2.setValue(input_msg.getText().toString());
                break;
            case "7_9_h3":
                m7_9_h3_s.setValue("demander");
                m7_9_h3.setValue(input_msg.getText().toString());
                break;
            case "7_9_h4":
                m7_9_h4_s.setValue("demander");
                m7_9_h4.setValue(input_msg.getText().toString());
                break;
            case "7_9_h5":
                m7_9_h5_s.setValue("demander");
                m7_9_h5.setValue(input_msg.getText().toString());
                break;
            case "7_9_h6":
                m7_9_h6_s.setValue("demander");
                m7_9_h6.setValue(input_msg.getText().toString());
                break;
            case "7_9_h7":
                m7_9_h7_s.setValue("demander");
                m7_9_h7.setValue(input_msg.getText().toString());
                break;
            case "7_9_h8":
                m7_9_h8_s.setValue("demander");
                m7_9_h8.setValue(input_msg.getText().toString());
                break;
            case "7_9_h9":
                m7_9_h9_s.setValue("demander");
                m7_9_h9.setValue(input_msg.getText().toString());
                break;
            ////////////////////////////////////////////////////
            case "8_9_h1":
                m8_9_h1_s.setValue("demander");
                m8_9_h1.setValue(input_msg.getText().toString());
                break;
            case "8_9_h2":
                m8_9_h2_s.setValue("demander");
                m8_9_h2.setValue(input_msg.getText().toString());
                break;
            case "8_9_h3":
                m8_9_h3_s.setValue("demander");
                m8_9_h3.setValue(input_msg.getText().toString());
                break;
            case "8_9_h4":
                m8_9_h4_s.setValue("demander");
                m8_9_h4.setValue(input_msg.getText().toString());
                break;
            case "8_9_h5":
                m8_9_h5_s.setValue("demander");
                m8_9_h5.setValue(input_msg.getText().toString());
                break;
            case "8_9_h6":
                m8_9_h6_s.setValue("demander");
                m8_9_h6.setValue(input_msg.getText().toString());
                break;
            case "8_9_h7":
                m8_9_h7_s.setValue("demander");
                m8_9_h7.setValue(input_msg.getText().toString());
                break;
            case "8_9_h8":
                m8_9_h8_s.setValue("demander");
                m8_9_h8.setValue(input_msg.getText().toString());
                break;
            case "8_9_h9":
                m8_9_h9_s.setValue("demander");
                m8_9_h9.setValue(input_msg.getText().toString());
                break;
            ////////////////////////////////////////////////////
            case "9_9_h1":
                m9_9_h1_s.setValue("demander");
                m9_9_h1.setValue(input_msg.getText().toString());
                break;
            case "9_9_h2":
                m9_9_h2_s.setValue("demander");
                m9_9_h2.setValue(input_msg.getText().toString());
                break;
            case "9_9_h3":
                m9_9_h3_s.setValue("demander");
                m9_9_h3.setValue(input_msg.getText().toString());
                break;
            case "9_9_h4":
                m9_9_h4_s.setValue("demander");
                m9_9_h4.setValue(input_msg.getText().toString());
                break;
            case "9_9_h5":
                m9_9_h5_s.setValue("demander");
                m9_9_h5.setValue(input_msg.getText().toString());
                break;
            case "9_9_h6":
                m9_9_h6_s.setValue("demander");
                m9_9_h6.setValue(input_msg.getText().toString());
                break;
            case "9_9_h7":
                m9_9_h7_s.setValue("demander");
                m9_9_h7.setValue(input_msg.getText().toString());
                break;
            case "9_9_h8":
                m9_9_h8_s.setValue("demander");
                m9_9_h8.setValue(input_msg.getText().toString());
                break;
            case "9_9_h9":
                m9_9_h9_s.setValue("demander");
                m9_9_h9.setValue(input_msg.getText().toString());
                break;
            ////////////////////////////////////////////////////
            case "10_9_h1":
                m10_9_h1_s.setValue("demander");
                m10_9_h1.setValue(input_msg.getText().toString());
                break;
            case "10_9_h2":
                m10_9_h2_s.setValue("demander");
                m10_9_h2.setValue(input_msg.getText().toString());
                break;
            case "10_9_h3":
                m10_9_h3_s.setValue("demander");
                m10_9_h3.setValue(input_msg.getText().toString());
                break;
            case "10_9_h4":
                m10_9_h4_s.setValue("demander");
                m10_9_h4.setValue(input_msg.getText().toString());
                break;
            case "10_9_h5":
                m10_9_h5_s.setValue("demander");
                m10_9_h5.setValue(input_msg.getText().toString());
                break;
            case "10_9_h6":
                m10_9_h6_s.setValue("demander");
                m10_9_h6.setValue(input_msg.getText().toString());
                break;
            case "10_9_h7":
                m10_9_h7_s.setValue("demander");
                m10_9_h7.setValue(input_msg.getText().toString());
                break;
            case "10_9_h8":
                m10_9_h8_s.setValue("demander");
                m10_9_h8.setValue(input_msg.getText().toString());
                break;
            case "10_9_h9":
                m10_9_h9_s.setValue("demander");
                m10_9_h9.setValue(input_msg.getText().toString());
                break;
            ////////////////////////////////////////////////////
            case "11_9_h1":
                m11_9_h1_s.setValue("demander");
                m11_9_h1.setValue(input_msg.getText().toString());
                break;
            case "11_9_h2":
                m11_9_h2_s.setValue("demander");
                m11_9_h2.setValue(input_msg.getText().toString());
                break;
            case "11_9_h3":
                m11_9_h3_s.setValue("demander");
                m11_9_h3.setValue(input_msg.getText().toString());
                break;
            case "11_9_h4":
                m11_9_h4_s.setValue("demander");
                m11_9_h4.setValue(input_msg.getText().toString());
                break;
            case "11_9_h5":
                m11_9_h5_s.setValue("demander");
                m11_9_h5.setValue(input_msg.getText().toString());
                break;
            case "11_9_h6":
                m11_9_h6_s.setValue("demander");
                m11_9_h6.setValue(input_msg.getText().toString());
                break;
            case "11_9_h7":
                m11_9_h7_s.setValue("demander");
                m11_9_h7.setValue(input_msg.getText().toString());
                break;
            case "11_9_h8":
                m11_9_h8_s.setValue("demander");
                m11_9_h8.setValue(input_msg.getText().toString());
                break;
            case "11_9_h9":
                m11_9_h9_s.setValue("demander");
                m11_9_h9.setValue(input_msg.getText().toString());
                break;
            ////////////////////////////////////////////////////
            case "12_9_h1":
                m12_9_h1_s.setValue("demander");
                m12_9_h1.setValue(input_msg.getText().toString());
                break;
            case "12_9_h2":
                m12_9_h2_s.setValue("demander");
                m12_9_h2.setValue(input_msg.getText().toString());
                break;
            case "12_9_h3":
                m12_9_h3_s.setValue("demander");
                m12_9_h3.setValue(input_msg.getText().toString());
                break;
            case "12_9_h4":
                m12_9_h4_s.setValue("demander");
                m12_9_h4.setValue(input_msg.getText().toString());
                break;
            case "12_9_h5":
                m12_9_h5_s.setValue("demander");
                m12_9_h5.setValue(input_msg.getText().toString());
                break;
            case "12_9_h6":
                m12_9_h6_s.setValue("demander");
                m12_9_h6.setValue(input_msg.getText().toString());
                break;
            case "12_9_h7":
                m12_9_h7_s.setValue("demander");
                m12_9_h7.setValue(input_msg.getText().toString());
                break;
            case "12_9_h8":
                m12_9_h8_s.setValue("demander");
                m12_9_h8.setValue(input_msg.getText().toString());
                break;
            case "12_9_h9":
                m12_9_h9_s.setValue("demander");
                m12_9_h9.setValue(input_msg.getText().toString());
                break;
            ////////////////////////////////////////////////////
            case "13_9_h1":
                m13_9_h1_s.setValue("demander");
                m13_9_h1.setValue(input_msg.getText().toString());
                break;
            case "13_9_h2":
                m13_9_h2_s.setValue("demander");
                m13_9_h2.setValue(input_msg.getText().toString());
                break;
            case "13_9_h3":
                m13_9_h3_s.setValue("demander");
                m13_9_h3.setValue(input_msg.getText().toString());
                break;
            case "13_9_h4":
                m13_9_h4_s.setValue("demander");
                m13_9_h4.setValue(input_msg.getText().toString());
                break;
            case "13_9_h5":
                m13_9_h5_s.setValue("demander");
                m13_9_h5.setValue(input_msg.getText().toString());
                break;
            case "13_9_h6":
                m13_9_h6_s.setValue("demander");
                m13_9_h6.setValue(input_msg.getText().toString());
                break;
            case "14_9_h7":
                m14_9_h7_s.setValue("demander");
                m14_9_h7.setValue(input_msg.getText().toString());
                break;
            case "14_9_h8":
                m14_9_h8_s.setValue("demander");
                m14_9_h8.setValue(input_msg.getText().toString());
                break;
            case "14_9_h9":
                m14_9_h9_s.setValue("demander");
                m14_9_h9.setValue(input_msg.getText().toString());
                break;
            ////////////////////////////////////////////////////
            case "15_9_h1":
                m15_9_h1_s.setValue("demander");
                m15_9_h1.setValue(input_msg.getText().toString());
                break;
            case "15_9_h2":
                m15_9_h2_s.setValue("demander");
                m15_9_h2.setValue(input_msg.getText().toString());
                break;
            case "15_9_h3":
                m15_9_h3_s.setValue("demander");
                m15_9_h3.setValue(input_msg.getText().toString());
                break;
            case "15_9_h4":
                m15_9_h4_s.setValue("demander");
                m15_9_h4.setValue(input_msg.getText().toString());
                break;
            case "15_9_h5":
                m15_9_h5_s.setValue("demander");
                m15_9_h5.setValue(input_msg.getText().toString());
                break;
            case "15_9_h6":
                m15_9_h6_s.setValue("demander");
                m15_9_h6.setValue(input_msg.getText().toString());
                break;
            case "15_9_h7":
                m15_9_h7_s.setValue("demander");
                m15_9_h7.setValue(input_msg.getText().toString());
                break;
            case "15_9_h8":
                m15_9_h8_s.setValue("demander");
                m15_9_h8.setValue(input_msg.getText().toString());
                break;
            case "15_9_h9":
                m15_9_h9_s.setValue("demander");
                m15_9_h9.setValue(input_msg.getText().toString());
                break;
            ////////////////////////////////////////////////////
            case "16_9_h1":
                m16_9_h1_s.setValue("demander");
                m16_9_h1.setValue(input_msg.getText().toString());
                break;
            case "16_9_h2":
                m16_9_h2_s.setValue("demander");
                m16_9_h2.setValue(input_msg.getText().toString());
                break;
            case "16_9_h3":
                m16_9_h3_s.setValue("demander");
                m16_9_h3.setValue(input_msg.getText().toString());
                break;
            case "16_9_h4":
                m16_9_h4_s.setValue("demander");
                m16_9_h4.setValue(input_msg.getText().toString());
                break;
            case "16_9_h5":
                m16_9_h5_s.setValue("demander");
                m16_9_h5.setValue(input_msg.getText().toString());
                break;
            case "16_9_h6":
                m16_9_h6_s.setValue("demander");
                m16_9_h6.setValue(input_msg.getText().toString());
                break;
            case "16_9_h7":
                m16_9_h7_s.setValue("demander");
                m16_9_h7.setValue(input_msg.getText().toString());
                break;
            case "16_9_h8":
                m16_9_h8_s.setValue("demander");
                m16_9_h8.setValue(input_msg.getText().toString());
                break;
            case "16_9_h9":
                m16_9_h9_s.setValue("demander");
                m16_9_h9.setValue(input_msg.getText().toString());
                break;
            ////////////////////////////////////////////////////
            case "17_9_h1":
                m17_9_h1_s.setValue("demander");
                m17_9_h1.setValue(input_msg.getText().toString());
                break;
            case "17_9_h2":
                m17_9_h2_s.setValue("demander");
                m17_9_h2.setValue(input_msg.getText().toString());
                break;
            case "17_9_h3":
                m17_9_h3_s.setValue("demander");
                m17_9_h3.setValue(input_msg.getText().toString());
                break;
            case "17_9_h4":
                m17_9_h4_s.setValue("demander");
                m17_9_h4.setValue(input_msg.getText().toString());
                break;
            case "17_9_h5":
                m17_9_h5_s.setValue("demander");
                m17_9_h5.setValue(input_msg.getText().toString());
                break;
            case "17_9_h6":
                m17_9_h6_s.setValue("demander");
                m17_9_h6.setValue(input_msg.getText().toString());
                break;
            case "17_9_h7":
                m17_9_h7_s.setValue("demander");
                m17_9_h7.setValue(input_msg.getText().toString());
                break;
            case "17_9_h8":
                m17_9_h8_s.setValue("demander");
                m17_9_h8.setValue(input_msg.getText().toString());
                break;
            case "17_9_h9":
                m17_9_h9_s.setValue("demander");
                m17_9_h9.setValue(input_msg.getText().toString());
                break;
            ////////////////////////////////////////////////////
            case "18_9_h1":
                m18_9_h1_s.setValue("demander");
                m18_9_h1.setValue(input_msg.getText().toString());
                break;
            case "18_9_h2":
                m18_9_h2_s.setValue("demander");
                m18_9_h2.setValue(input_msg.getText().toString());
                break;
            case "18_9_h3":
                m18_9_h3_s.setValue("demander");
                m18_9_h3.setValue(input_msg.getText().toString());
                break;
            case "18_9_h4":
                m18_9_h4_s.setValue("demander");
                m18_9_h4.setValue(input_msg.getText().toString());
                break;
            case "18_9_h5":
                m18_9_h5_s.setValue("demander");
                m18_9_h5.setValue(input_msg.getText().toString());
                break;
            case "18_9_h6":
                m18_9_h6_s.setValue("demander");
                m18_9_h6.setValue(input_msg.getText().toString());
                break;
            case "18_9_h7":
                m18_9_h7_s.setValue("demander");
                m18_9_h7.setValue(input_msg.getText().toString());
                break;
            case "18_9_h8":
                m18_9_h8_s.setValue("demander");
                m18_9_h8.setValue(input_msg.getText().toString());
                break;
            case "18_9_h9":
                m18_9_h9_s.setValue("demander");
                m18_9_h9.setValue(input_msg.getText().toString());
                break;
            ////////////////////////////////////////////////////
            case "19_9_h1":
                m19_9_h1_s.setValue("demander");
                m19_9_h1.setValue(input_msg.getText().toString());
                break;
            case "19_9_h2":
                m19_9_h2_s.setValue("demander");
                m19_9_h2.setValue(input_msg.getText().toString());
                break;
            case "19_9_h3":
                m19_9_h3_s.setValue("demander");
                m19_9_h3.setValue(input_msg.getText().toString());
                break;
            case "19_9_h4":
                m19_9_h4_s.setValue("demander");
                m19_9_h4.setValue(input_msg.getText().toString());
                break;
            case "19_9_h5":
                m19_9_h5_s.setValue("demander");
                m19_9_h5.setValue(input_msg.getText().toString());
                break;
            case "19_9_h6":
                m19_9_h6_s.setValue("demander");
                m19_9_h6.setValue(input_msg.getText().toString());
                break;
            case "19_9_h7":
                m19_9_h7_s.setValue("demander");
                m19_9_h7.setValue(input_msg.getText().toString());
                break;
            case "19_9_h8":
                m19_9_h8_s.setValue("demander");
                m19_9_h8.setValue(input_msg.getText().toString());
                break;
            case "19_9_h9":
                m19_9_h9_s.setValue("demander");
                m19_9_h9.setValue(input_msg.getText().toString());
                break;
            ////////////////////////////////////////////////////
            case "20_9_h1":
                m20_9_h1_s.setValue("demander");
                m20_9_h1.setValue(input_msg.getText().toString());
                break;
            case "20_9_h2":
                m20_9_h2_s.setValue("demander");
                m20_9_h2.setValue(input_msg.getText().toString());
                break;
            case "20_9_h3":
                m20_9_h3_s.setValue("demander");
                m20_9_h3.setValue(input_msg.getText().toString());
                break;
            case "20_9_h4":
                m20_9_h4_s.setValue("demander");
                m20_9_h4.setValue(input_msg.getText().toString());
                break;
            case "20_9_h5":
                m20_9_h5_s.setValue("demander");
                m20_9_h5.setValue(input_msg.getText().toString());
                break;
            case "20_9_h6":
                m20_9_h6_s.setValue("demander");
                m20_9_h6.setValue(input_msg.getText().toString());
                break;
            case "20_9_h7":
                m20_9_h7_s.setValue("demander");
                m20_9_h7.setValue(input_msg.getText().toString());
                break;
            case "20_9_h8":
                m20_9_h8_s.setValue("demander");
                m20_9_h8.setValue(input_msg.getText().toString());
                break;
            case "20_9_h9":
                m29_9_h9_s.setValue("demander");
                m29_9_h9.setValue(input_msg.getText().toString());
                break;
            //////2/////////////////////////////////////////////
            case "21_9_h1":
                m21_9_h1_s.setValue("demander");
                m21_9_h1.setValue(input_msg.getText().toString());
                break;
            case "21_9_h2":
                m21_9_h2_s.setValue("demander");
                m21_9_h2.setValue(input_msg.getText().toString());
                break;
            case "21_9_h3":
                m21_9_h3_s.setValue("demander");
                m21_9_h3.setValue(input_msg.getText().toString());
                break;
            case "21_9_h4":
                m21_9_h4_s.setValue("demander");
                m21_9_h4.setValue(input_msg.getText().toString());
                break;
            case "21_9_h5":
                m21_9_h5_s.setValue("demander");
                m21_9_h5.setValue(input_msg.getText().toString());
                break;
            case "21_9_h6":
                m21_9_h6_s.setValue("demander");
                m21_9_h6.setValue(input_msg.getText().toString());
                break;
            case "21_9_h7":
                m21_9_h7_s.setValue("demander");
                m21_9_h7.setValue(input_msg.getText().toString());
                break;
            case "21_9_h8":
                m21_9_h8_s.setValue("demander");
                m21_9_h8.setValue(input_msg.getText().toString());
                break;
            case "21_9_h9":
                m21_9_h9_s.setValue("demander");
                m21_9_h9.setValue(input_msg.getText().toString());
                break;
            ////////////////////////////////////////////////////
            case "22_9_h1":
                m22_9_h1_s.setValue("demander");
                m22_9_h1.setValue(input_msg.getText().toString());
                break;
            case "22_9_h2":
                m22_9_h2_s.setValue("demander");
                m22_9_h2.setValue(input_msg.getText().toString());
                break;
            case "22_9_h3":
                m22_9_h3_s.setValue("demander");
                m22_9_h3.setValue(input_msg.getText().toString());
                break;
            case "22_9_h4":
                m22_9_h4_s.setValue("demander");
                m22_9_h4.setValue(input_msg.getText().toString());
                break;
            case "22_9_h5":
                m22_9_h5_s.setValue("demander");
                m22_9_h5.setValue(input_msg.getText().toString());
                break;
            case "22_9_h6":
                m22_9_h6_s.setValue("demander");
                m22_9_h6.setValue(input_msg.getText().toString());
                break;
            case "22_9_h7":
                m22_9_h7_s.setValue("demander");
                m22_9_h7.setValue(input_msg.getText().toString());
                break;
            case "22_9_h8":
                m22_9_h8_s.setValue("demander");
                m22_9_h8.setValue(input_msg.getText().toString());
                break;
            case "22_9_h9":
                m22_9_h9_s.setValue("demander");
                m22_9_h9.setValue(input_msg.getText().toString());
                break;
            ////////////////////////////////////////////////////

            case "23_9_h1":
                m23_9_h1_s.setValue("demander");
                m23_9_h1.setValue(input_msg.getText().toString());
                break;
            case "23_9_h2":
                m23_9_h2_s.setValue("demander");
                m23_9_h2.setValue(input_msg.getText().toString());
                break;
            case "23_9_h3":
                m23_9_h3_s.setValue("demander");
                m23_9_h3.setValue(input_msg.getText().toString());
                break;
            case "23_9_h4":
                m23_9_h4_s.setValue("demander");
                m23_9_h4.setValue(input_msg.getText().toString());
                break;
            case "23_9_h5":
                m23_9_h5_s.setValue("demander");
                m23_9_h5.setValue(input_msg.getText().toString());
                break;
            case "23_9_h6":
                m23_9_h6_s.setValue("demander");
                m23_9_h6.setValue(input_msg.getText().toString());
                break;
            case "23_9_h7":
                m23_9_h7_s.setValue("demander");
                m23_9_h7.setValue(input_msg.getText().toString());
                break;
            case "23_9_h8":
                m23_9_h8_s.setValue("demander");
                m23_9_h8.setValue(input_msg.getText().toString());
                break;
            case "23_9_h9":
                m23_9_h9_s.setValue("demander");
                m23_9_h9.setValue(input_msg.getText().toString());
                break;
            ////////////////////////////////////////////////////
            case "2947_h1":
                m24_9_h1_s.setValue("demander");
                m24_9_h1.setValue(input_msg.getText().toString());
                break;
            case "24_9_h2":
                m24_9_h2_s.setValue("demander");
                m24_9_h2.setValue(input_msg.getText().toString());
                break;
            case "24_9_h3":
                m24_9_h3_s.setValue("demander");
                m24_9_h3.setValue(input_msg.getText().toString());
                break;
            case "24_9_h4":
                m24_9_h4_s.setValue("demander");
                m24_9_h4.setValue(input_msg.getText().toString());
                break;
            case "24_9_h5":
                m24_9_h5_s.setValue("demander");
                m24_9_h5.setValue(input_msg.getText().toString());
                break;
            case "24_9_h6":
                m24_9_h6_s.setValue("demander");
                m24_9_h6.setValue(input_msg.getText().toString());
                break;
            case "24_9_h7":
                m24_9_h7_s.setValue("demander");
                m24_9_h7.setValue(input_msg.getText().toString());
                break;
            case "24_9_h8":
                m24_9_h8_s.setValue("demander");
                m24_9_h8.setValue(input_msg.getText().toString());
                break;
            case "24_9_h9":
                m24_9_h9_s.setValue("demander");
                m24_9_h9.setValue(input_msg.getText().toString());
                break;
            ////////////////////////////////////////////////////
            case "25_9_h1":
                m25_9_h1_s.setValue("demander");
                m25_9_h1.setValue(input_msg.getText().toString());
                break;
            case "25_9_h2":
                m25_9_h2_s.setValue("demander");
                m25_9_h2.setValue(input_msg.getText().toString());
                break;
            case "25_9_h3":
                m25_9_h3_s.setValue("demander");
                m25_9_h3.setValue(input_msg.getText().toString());
                break;
            case "25_9_h4":
                m25_9_h4_s.setValue("demander");
                m25_9_h4.setValue(input_msg.getText().toString());
                break;
            case "25_9_h5":
                m25_9_h5_s.setValue("demander");
                m25_9_h5.setValue(input_msg.getText().toString());
                break;
            case "25_9_h6":
                m25_9_h6_s.setValue("demander");
                m25_9_h6.setValue(input_msg.getText().toString());
                break;
            case "25_9_h7":
                m25_9_h7_s.setValue("demander");
                m25_9_h7.setValue(input_msg.getText().toString());
                break;
            case "25_9_h8":
                m25_9_h8_s.setValue("demander");
                m25_9_h8.setValue(input_msg.getText().toString());
                break;
            case "25_9_h9":
                m25_9_h9_s.setValue("demander");
                m25_9_h9.setValue(input_msg.getText().toString());
                break;
            ////////////////////////////////////////////////////
            case "26_9_h1":
                m26_9_h1_s.setValue("demander");
                m26_9_h1.setValue(input_msg.getText().toString());
                break;
            case "26_9_h2":
                m26_9_h2_s.setValue("demander");
                m26_9_h2.setValue(input_msg.getText().toString());
                break;
            case "26_9_h3":
                m26_9_h3_s.setValue("demander");
                m26_9_h3.setValue(input_msg.getText().toString());
                break;
            case "26_9_h4":
                m26_9_h4_s.setValue("demander");
                m26_9_h4.setValue(input_msg.getText().toString());
                break;
            case "26_9_h5":
                m26_9_h5_s.setValue("demander");
                m26_9_h5.setValue(input_msg.getText().toString());
                break;
            case "26_9_h6":
                m26_9_h6_s.setValue("demander");
                m26_9_h6.setValue(input_msg.getText().toString());
                break;
            case "26_9_h7":
                m26_9_h7_s.setValue("demander");
                m26_9_h7.setValue(input_msg.getText().toString());
                break;
            case "26_9_h8":
                m26_9_h8_s.setValue("demander");
                m26_9_h8.setValue(input_msg.getText().toString());
                break;
            case "26_9_h9":
                m26_9_h9_s.setValue("demander");
                m26_9_h9.setValue(input_msg.getText().toString());
                break;
            ////////////////////////////////////////////////////
            case "27_9_h1":
                m27_9_h1_s.setValue("demander");
                m27_9_h1.setValue(input_msg.getText().toString());
                break;
            case "27_9_h2":
                m27_9_h2_s.setValue("demander");
                m27_9_h2.setValue(input_msg.getText().toString());
                break;
            case "27_9_h3":
                m27_9_h3_s.setValue("demander");
                m27_9_h3.setValue(input_msg.getText().toString());
                break;
            case "27_9_h4":
                m27_9_h4_s.setValue("demander");
                m27_9_h4.setValue(input_msg.getText().toString());
                break;
            case "27_9_h5":
                m27_9_h5_s.setValue("demander");
                m27_9_h5.setValue(input_msg.getText().toString());
                break;
            case "27_9_h6":
                m27_9_h6_s.setValue("demander");
                m27_9_h6.setValue(input_msg.getText().toString());
                break;
            case "27_9_h7":
                m27_9_h7_s.setValue("demander");
                m27_9_h7.setValue(input_msg.getText().toString());
                break;
            case "27_9_h8":
                m27_9_h8_s.setValue("demander");
                m27_9_h8.setValue(input_msg.getText().toString());
                break;
            case "27_9_h9":
                m27_9_h9_s.setValue("demander");
                m27_9_h9.setValue(input_msg.getText().toString());
                break;
            ////////////////////////////////////////////////////
            case "28_9_h1":
                m28_9_h1_s.setValue("demander");
                m28_9_h1.setValue(input_msg.getText().toString());
                break;
            case "28_9_h2":
                m28_9_h2_s.setValue("demander");
                m28_9_h2.setValue(input_msg.getText().toString());
                break;
            case "28_9_h3":
                m28_9_h3_s.setValue("demander");
                m28_9_h3.setValue(input_msg.getText().toString());
                break;
            case "28_9_h4":
                m28_9_h4_s.setValue("demander");
                m28_9_h4.setValue(input_msg.getText().toString());
                break;
            case "28_9_h5":
                m28_9_h5_s.setValue("demander");
                m28_9_h5.setValue(input_msg.getText().toString());
                break;
            case "28_9_h6":
                m28_9_h6_s.setValue("demander");
                m28_9_h6.setValue(input_msg.getText().toString());
                break;
            case "28_9_h7":
                m28_9_h7_s.setValue("demander");
                m28_9_h7.setValue(input_msg.getText().toString());
                break;
            case "28_9_h8":
                m28_9_h8_s.setValue("demander");
                m28_9_h8.setValue(input_msg.getText().toString());
                break;
            case "28_9_h9":
                m28_9_h9_s.setValue("demander");
                m28_9_h9.setValue(input_msg.getText().toString());
                break;
            ////////////////////////////////////////////////////
            case "29_9_h1":
                m29_9_h1_s.setValue("demander");
                m29_9_h1.setValue(input_msg.getText().toString());
                break;
            case "29_9_h2":
                m29_9_h2_s.setValue("demander");
                m29_9_h2.setValue(input_msg.getText().toString());
                break;
            case "29_9_h3":
                m29_9_h3_s.setValue("demander");
                m29_9_h3.setValue(input_msg.getText().toString());
                break;
            case "29_9_h4":
                m29_9_h4_s.setValue("demander");
                m29_9_h4.setValue(input_msg.getText().toString());
                break;
            case "29_9_h5":
                m29_9_h5_s.setValue("demander");
                m29_9_h5.setValue(input_msg.getText().toString());
                break;
            case "29_9_h6":
                m29_9_h6_s.setValue("demander");
                m29_9_h6.setValue(input_msg.getText().toString());
                break;
            case "29_9_h7":
                m29_9_h7_s.setValue("demander");
                m29_9_h7.setValue(input_msg.getText().toString());
                break;
            case "29_9_h8":
                m29_9_h8_s.setValue("demander");
                m29_9_h8.setValue(input_msg.getText().toString());
                break;
            case "29_9_h9":
                m29_9_h9_s.setValue("demander");
                m29_9_h9.setValue(input_msg.getText().toString());
                break;
            ////////////////////////////////////////////////////
            case "30_9_h1":
                m30_9_h1_s.setValue("demander");
                m30_9_h1.setValue(input_msg.getText().toString());
                break;
            case "30_9_h2":
                m30_9_h2_s.setValue("demander");
                m30_9_h2.setValue(input_msg.getText().toString());
                break;
            case "30_9_h3":
                m30_9_h3_s.setValue("demander");
                m30_9_h3.setValue(input_msg.getText().toString());
                break;
            case "30_9_h4":
                m30_9_h4_s.setValue("demander");
                m30_9_h4.setValue(input_msg.getText().toString());
                break;
            case "30_9_h5":
                m30_9_h5_s.setValue("demander");
                m30_9_h5.setValue(input_msg.getText().toString());
                break;
            case "30_9_h6":
                m30_9_h6_s.setValue("demander");
                m30_9_h6.setValue(input_msg.getText().toString());
                break;
            case "30_9_h7":
                m30_9_h7_s.setValue("demander");
                m30_9_h7.setValue(input_msg.getText().toString());
                break;
            case "30_9_h8":
                m30_9_h8_s.setValue("demander");
                m30_9_h8.setValue(input_msg.getText().toString());
                break;
            case "30_9_h9":
                m30_9_h9_s.setValue("demander");
                m30_9_h9.setValue(input_msg.getText().toString());
                break;
            ////////////////////////////////////////////////////
            case "31_9_h1":
                m31_9_h1_s.setValue("demander");
                m31_9_h1.setValue(input_msg.getText().toString());
                break;
            case "31_9_h2":
                m31_9_h2_s.setValue("demander");
                m31_9_h2.setValue(input_msg.getText().toString());
                break;
            case "31_9_h3":
                m31_9_h3_s.setValue("demander");
                m31_9_h3.setValue(input_msg.getText().toString());
                break;
            case "31_9_h4":
                m31_9_h4_s.setValue("demander");
                m31_9_h4.setValue(input_msg.getText().toString());
                break;
            case "31_9_h5":
                m31_9_h5_s.setValue("demander");
                m31_9_h5.setValue(input_msg.getText().toString());
                break;
            case "31_9_h6":
                m31_9_h6_s.setValue("demander");
                m31_9_h6.setValue(input_msg.getText().toString());
                break;
            case "31_9_h7":
                m31_9_h7_s.setValue("demander");
                m31_9_h7.setValue(input_msg.getText().toString());
                break;
            case "31_9_h8":
                m31_9_h8_s.setValue("demander");
                m31_9_h8.setValue(input_msg.getText().toString());
                break;
            case "31_9_h9":
                m31_9_h9_s.setValue("demander");
                m31_9_h9.setValue(input_msg.getText().toString());
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
        mDate_1_9.addValueEventListener(this);
        m1_9_h1.addValueEventListener(this);
        m1_9_h1_s.addValueEventListener(this);
        m1_9_h2.addValueEventListener(this);
        m1_9_h2_s.addValueEventListener(this);
        m1_9_h3.addValueEventListener(this);
        m1_9_h3_s.addValueEventListener(this);
        m1_9_h4.addValueEventListener(this);
        m1_9_h4_s.addValueEventListener(this);
        m1_9_h5.addValueEventListener(this);
        m1_9_h5_s.addValueEventListener(this);
        m1_9_h6.addValueEventListener(this);
        m1_9_h6_s.addValueEventListener(this);
        m1_9_h7.addValueEventListener(this);
        m1_9_h7_s.addValueEventListener(this);
        m1_9_h8.addValueEventListener(this);
        m1_9_h8_s.addValueEventListener(this);
        m1_9_h9.addValueEventListener(this);
        m1_9_h9_s.addValueEventListener(this);
        /////////////////////////////////////
        mDate_2_9.addValueEventListener(this);
        m2_9_h1.addValueEventListener(this);
        m2_9_h1_s.addValueEventListener(this);
        m2_9_h2.addValueEventListener(this);
        m2_9_h2_s.addValueEventListener(this);
        m2_9_h3.addValueEventListener(this);
        m2_9_h3_s.addValueEventListener(this);
        m2_9_h4.addValueEventListener(this);
        m2_9_h4_s.addValueEventListener(this);
        m2_9_h5.addValueEventListener(this);
        m2_9_h5_s.addValueEventListener(this);
        m2_9_h6.addValueEventListener(this);
        m2_9_h6_s.addValueEventListener(this);
        m2_9_h7.addValueEventListener(this);
        m2_9_h7_s.addValueEventListener(this);
        m2_9_h8.addValueEventListener(this);
        m2_9_h8_s.addValueEventListener(this);
        m2_9_h9.addValueEventListener(this);
        m2_9_h9_s.addValueEventListener(this);
        /////////////////////////////////////
        mDate_3_9.addValueEventListener(this);
        m3_9_h1.addValueEventListener(this);
        m3_9_h1_s.addValueEventListener(this);
        m3_9_h2.addValueEventListener(this);
        m3_9_h2_s.addValueEventListener(this);
        m3_9_h3.addValueEventListener(this);
        m3_9_h3_s.addValueEventListener(this);
        m3_9_h4.addValueEventListener(this);
        m3_9_h4_s.addValueEventListener(this);
        m3_9_h5.addValueEventListener(this);
        m3_9_h5_s.addValueEventListener(this);
        m3_9_h6.addValueEventListener(this);
        m3_9_h6_s.addValueEventListener(this);
        m3_9_h7.addValueEventListener(this);
        m3_9_h7_s.addValueEventListener(this);
        m3_9_h8.addValueEventListener(this);
        m3_9_h8_s.addValueEventListener(this);
        m3_9_h9.addValueEventListener(this);
        m3_9_h9_s.addValueEventListener(this);
        /////////////////////////////////////
        mDate_4_9.addValueEventListener(this);
        m4_9_h1.addValueEventListener(this);
        m4_9_h1_s.addValueEventListener(this);
        m4_9_h2.addValueEventListener(this);
        m4_9_h2_s.addValueEventListener(this);
        m4_9_h3.addValueEventListener(this);
        m4_9_h3_s.addValueEventListener(this);
        m4_9_h4.addValueEventListener(this);
        m4_9_h4_s.addValueEventListener(this);
        m4_9_h5.addValueEventListener(this);
        m4_9_h5_s.addValueEventListener(this);
        m4_9_h6.addValueEventListener(this);
        m4_9_h6_s.addValueEventListener(this);
        m4_9_h7.addValueEventListener(this);
        m4_9_h7_s.addValueEventListener(this);
        m4_9_h8.addValueEventListener(this);
        m4_9_h8_s.addValueEventListener(this);
        m4_9_h9.addValueEventListener(this);
        m4_9_h9_s.addValueEventListener(this);
        /////////////////////////////////////
        mDate_5_9.addValueEventListener(this);
        m5_9_h1.addValueEventListener(this);
        m5_9_h1_s.addValueEventListener(this);
        m5_9_h2.addValueEventListener(this);
        m5_9_h2_s.addValueEventListener(this);
        m5_9_h3.addValueEventListener(this);
        m5_9_h3_s.addValueEventListener(this);
        m5_9_h4.addValueEventListener(this);
        m5_9_h4_s.addValueEventListener(this);
        m5_9_h5.addValueEventListener(this);
        m5_9_h5_s.addValueEventListener(this);
        m5_9_h6.addValueEventListener(this);
        m5_9_h6_s.addValueEventListener(this);
        m5_9_h7.addValueEventListener(this);
        m5_9_h7_s.addValueEventListener(this);
        m5_9_h8.addValueEventListener(this);
        m5_9_h8_s.addValueEventListener(this);
        m5_9_h9.addValueEventListener(this);
        m5_9_h9_s.addValueEventListener(this);
        /////////////////////////////////////
        mDate_6_9.addValueEventListener(this);
        m6_9_h1.addValueEventListener(this);
        m6_9_h1_s.addValueEventListener(this);
        m6_9_h2.addValueEventListener(this);
        m6_9_h2_s.addValueEventListener(this);
        m6_9_h3.addValueEventListener(this);
        m6_9_h3_s.addValueEventListener(this);
        m6_9_h4.addValueEventListener(this);
        m6_9_h4_s.addValueEventListener(this);
        m6_9_h5.addValueEventListener(this);
        m6_9_h5_s.addValueEventListener(this);
        m6_9_h6.addValueEventListener(this);
        m6_9_h6_s.addValueEventListener(this);
        m6_9_h7.addValueEventListener(this);
        m6_9_h7_s.addValueEventListener(this);
        m6_9_h8.addValueEventListener(this);
        m6_9_h8_s.addValueEventListener(this);
        m6_9_h9.addValueEventListener(this);
        m6_9_h9_s.addValueEventListener(this);
        /////////////////////////////////////
        mDate_9_9.addValueEventListener(this);
        m7_9_h1.addValueEventListener(this);
        m7_9_h1_s.addValueEventListener(this);
        m7_9_h2.addValueEventListener(this);
        m7_9_h2_s.addValueEventListener(this);
        m7_9_h3.addValueEventListener(this);
        m7_9_h3_s.addValueEventListener(this);
        m7_9_h4.addValueEventListener(this);
        m7_9_h4_s.addValueEventListener(this);
        m7_9_h5.addValueEventListener(this);
        m7_9_h5_s.addValueEventListener(this);
        m7_9_h6.addValueEventListener(this);
        m7_9_h6_s.addValueEventListener(this);
        m7_9_h7.addValueEventListener(this);
        m7_9_h7_s.addValueEventListener(this);
        m7_9_h8.addValueEventListener(this);
        m7_9_h8_s.addValueEventListener(this);
        m7_9_h9.addValueEventListener(this);
        m7_9_h9_s.addValueEventListener(this);
        /////////////////////////////////////
        mDate_8_9.addValueEventListener(this);
        m8_9_h1.addValueEventListener(this);
        m8_9_h1_s.addValueEventListener(this);
        m8_9_h2.addValueEventListener(this);
        m8_9_h2_s.addValueEventListener(this);
        m8_9_h3.addValueEventListener(this);
        m8_9_h3_s.addValueEventListener(this);
        m8_9_h4.addValueEventListener(this);
        m8_9_h4_s.addValueEventListener(this);
        m8_9_h4_s.addValueEventListener(this);
        m8_9_h5_s.addValueEventListener(this);
        m8_9_h6.addValueEventListener(this);
        m8_9_h6_s.addValueEventListener(this);
        m8_9_h7.addValueEventListener(this);
        m8_9_h7_s.addValueEventListener(this);
        m8_9_h8.addValueEventListener(this);
        m8_9_h8_s.addValueEventListener(this);
        m8_9_h9.addValueEventListener(this);
        m8_9_h9_s.addValueEventListener(this);
        /////////////////////////////////////
        mDate_9_9.addValueEventListener(this);
        m9_9_h1.addValueEventListener(this);
        m9_9_h1_s.addValueEventListener(this);
        m9_9_h2.addValueEventListener(this);
        m9_9_h2_s.addValueEventListener(this);
        m9_9_h3.addValueEventListener(this);
        m9_9_h3_s.addValueEventListener(this);
        m9_9_h4.addValueEventListener(this);
        m9_9_h4_s.addValueEventListener(this);
        m9_9_h5.addValueEventListener(this);
        m9_9_h5_s.addValueEventListener(this);
        m9_9_h6.addValueEventListener(this);
        m9_9_h6_s.addValueEventListener(this);
        m9_9_h7.addValueEventListener(this);
        m9_9_h7_s.addValueEventListener(this);
        m9_9_h8.addValueEventListener(this);
        m9_9_h8_s.addValueEventListener(this);
        m9_9_h9.addValueEventListener(this);
        m9_9_h9_s.addValueEventListener(this);
        /////////////////////////////////////
        mDate_10_9.addValueEventListener(this);
        m10_9_h1.addValueEventListener(this);
        m10_9_h1_s.addValueEventListener(this);
        m10_9_h2.addValueEventListener(this);
        m10_9_h2_s.addValueEventListener(this);
        m10_9_h3.addValueEventListener(this);
        m10_9_h3_s.addValueEventListener(this);
        m10_9_h4.addValueEventListener(this);
        m10_9_h4_s.addValueEventListener(this);
        m10_9_h5.addValueEventListener(this);
        m10_9_h5_s.addValueEventListener(this);
        m10_9_h6.addValueEventListener(this);
        m10_9_h6_s.addValueEventListener(this);
        m10_9_h7.addValueEventListener(this);
        m10_9_h7_s.addValueEventListener(this);
        m10_9_h8.addValueEventListener(this);
        m10_9_h8_s.addValueEventListener(this);
        m10_9_h9.addValueEventListener(this);
        m10_9_h9_s.addValueEventListener(this);
        /////////////////////////////////////
        mDate_11_9.addValueEventListener(this);
        m11_9_h1.addValueEventListener(this);
        m11_9_h1_s.addValueEventListener(this);
        m11_9_h2.addValueEventListener(this);
        m11_9_h2_s.addValueEventListener(this);
        m11_9_h3.addValueEventListener(this);
        m11_9_h3_s.addValueEventListener(this);
        m11_9_h4.addValueEventListener(this);
        m11_9_h4_s.addValueEventListener(this);
        m11_9_h5.addValueEventListener(this);
        m11_9_h5_s.addValueEventListener(this);
        m11_9_h6.addValueEventListener(this);
        m11_9_h6_s.addValueEventListener(this);
        m11_9_h7.addValueEventListener(this);
        m11_9_h7_s.addValueEventListener(this);
        m11_9_h8.addValueEventListener(this);
        m11_9_h8_s.addValueEventListener(this);
        m11_9_h9.addValueEventListener(this);
        m11_9_h9_s.addValueEventListener(this);
        /////////////////////////////////////
        mDate_1_9.addValueEventListener(this);
        m12_9_h1.addValueEventListener(this);
        m12_9_h1_s.addValueEventListener(this);
        m12_9_h2.addValueEventListener(this);
        m12_9_h2_s.addValueEventListener(this);
        m12_9_h3.addValueEventListener(this);
        m12_9_h3_s.addValueEventListener(this);
        m12_9_h4.addValueEventListener(this);
        m12_9_h4_s.addValueEventListener(this);
        m12_9_h5.addValueEventListener(this);
        m12_9_h5_s.addValueEventListener(this);
        m12_9_h6.addValueEventListener(this);
        m12_9_h6_s.addValueEventListener(this);
        m12_9_h7.addValueEventListener(this);
        m12_9_h7_s.addValueEventListener(this);
        m12_9_h8.addValueEventListener(this);
        m12_9_h8_s.addValueEventListener(this);
        m12_9_h9.addValueEventListener(this);
        m12_9_h9_s.addValueEventListener(this);
        /////////////////////////////////////
        mDate_1_9.addValueEventListener(this);
        m13_9_h1.addValueEventListener(this);
        m13_9_h1_s.addValueEventListener(this);
        m13_9_h2.addValueEventListener(this);
        m13_9_h2_s.addValueEventListener(this);
        m13_9_h3.addValueEventListener(this);
        m13_9_h3_s.addValueEventListener(this);
        m13_9_h4.addValueEventListener(this);
        m13_9_h4_s.addValueEventListener(this);
        m13_9_h5.addValueEventListener(this);
        m13_9_h5_s.addValueEventListener(this);
        m13_9_h6.addValueEventListener(this);
        m13_9_h6_s.addValueEventListener(this);
        m13_9_h7.addValueEventListener(this);
        m13_9_h7_s.addValueEventListener(this);
        m13_9_h8.addValueEventListener(this);
        m13_9_h8_s.addValueEventListener(this);
        m13_9_h9.addValueEventListener(this);
        m13_9_h9_s.addValueEventListener(this);
        /////////////////////////////////////
        mDate_1_9.addValueEventListener(this);
        m14_9_h1.addValueEventListener(this);
        m14_9_h1_s.addValueEventListener(this);
        m14_9_h2.addValueEventListener(this);
        m14_9_h2_s.addValueEventListener(this);
        m14_9_h3.addValueEventListener(this);
        m14_9_h3_s.addValueEventListener(this);
        m14_9_h4.addValueEventListener(this);
        m14_9_h4_s.addValueEventListener(this);
        m14_9_h5.addValueEventListener(this);
        m14_9_h5_s.addValueEventListener(this);
        m14_9_h6.addValueEventListener(this);
        m14_9_h6_s.addValueEventListener(this);
        m14_9_h7.addValueEventListener(this);
        m14_9_h7_s.addValueEventListener(this);
        m14_9_h8.addValueEventListener(this);
        m14_9_h8_s.addValueEventListener(this);
        m14_9_h9.addValueEventListener(this);
        m14_9_h9_s.addValueEventListener(this);
        /////////////////////////////////////
        mDate_1_9.addValueEventListener(this);
        m15_9_h1.addValueEventListener(this);
        m15_9_h1_s.addValueEventListener(this);
        m15_9_h2.addValueEventListener(this);
        m15_9_h2_s.addValueEventListener(this);
        m15_9_h3.addValueEventListener(this);
        m15_9_h3_s.addValueEventListener(this);
        m15_9_h4.addValueEventListener(this);
        m15_9_h4_s.addValueEventListener(this);
        m15_9_h5.addValueEventListener(this);
        m15_9_h5_s.addValueEventListener(this);
        m15_9_h6.addValueEventListener(this);
        m15_9_h6_s.addValueEventListener(this);
        m15_9_h7.addValueEventListener(this);
        m15_9_h7_s.addValueEventListener(this);
        m15_9_h8.addValueEventListener(this);
        m15_9_h8_s.addValueEventListener(this);
        m15_9_h9.addValueEventListener(this);
        m15_9_h9_s.addValueEventListener(this);
        /////////////////////////////////////
        mDate_1_9.addValueEventListener(this);
        m16_9_h1.addValueEventListener(this);
        m16_9_h1_s.addValueEventListener(this);
        m16_9_h2.addValueEventListener(this);
        m16_9_h2_s.addValueEventListener(this);
        m16_9_h3.addValueEventListener(this);
        m16_9_h3_s.addValueEventListener(this);
        m16_9_h4.addValueEventListener(this);
        m16_9_h4_s.addValueEventListener(this);
        m16_9_h5.addValueEventListener(this);
        m16_9_h5_s.addValueEventListener(this);
        m16_9_h6.addValueEventListener(this);
        m16_9_h6_s.addValueEventListener(this);
        m16_9_h7.addValueEventListener(this);
        m16_9_h7_s.addValueEventListener(this);
        m16_9_h8.addValueEventListener(this);
        m16_9_h8_s.addValueEventListener(this);
        m16_9_h9.addValueEventListener(this);
        m16_9_h9_s.addValueEventListener(this);
        /////////////////////////////////////
        mDate_1_9.addValueEventListener(this);
        m17_9_h1.addValueEventListener(this);
        m17_9_h1_s.addValueEventListener(this);
        m17_9_h2.addValueEventListener(this);
        m17_9_h2_s.addValueEventListener(this);
        m17_9_h3.addValueEventListener(this);
        m17_9_h3_s.addValueEventListener(this);
        m17_9_h4.addValueEventListener(this);
        m17_9_h4_s.addValueEventListener(this);
        m17_9_h5.addValueEventListener(this);
        m17_9_h5_s.addValueEventListener(this);
        m17_9_h6.addValueEventListener(this);
        m17_9_h6_s.addValueEventListener(this);
        m17_9_h7.addValueEventListener(this);
        m17_9_h7_s.addValueEventListener(this);
        m17_9_h8.addValueEventListener(this);
        m17_9_h8_s.addValueEventListener(this);
        m17_9_h9.addValueEventListener(this);
        m17_9_h9_s.addValueEventListener(this);
        /////////////////////////////////////
        mDate_1_9.addValueEventListener(this);
        m18_9_h1.addValueEventListener(this);
        m18_9_h1_s.addValueEventListener(this);
        m18_9_h2.addValueEventListener(this);
        m18_9_h2_s.addValueEventListener(this);
        m18_9_h3.addValueEventListener(this);
        m18_9_h3_s.addValueEventListener(this);
        m18_9_h4.addValueEventListener(this);
        m18_9_h4_s.addValueEventListener(this);
        m18_9_h5.addValueEventListener(this);
        m18_9_h5_s.addValueEventListener(this);
        m18_9_h6.addValueEventListener(this);
        m18_9_h6_s.addValueEventListener(this);
        m18_9_h7.addValueEventListener(this);
        m18_9_h7_s.addValueEventListener(this);
        m18_9_h8.addValueEventListener(this);
        m18_9_h8_s.addValueEventListener(this);
        m18_9_h9.addValueEventListener(this);
        m18_9_h9_s.addValueEventListener(this);
        /////////////////////////////////////
        mDate_1_9.addValueEventListener(this);
        m19_9_h1.addValueEventListener(this);
        m19_9_h1_s.addValueEventListener(this);
        m19_9_h2.addValueEventListener(this);
        m19_9_h2_s.addValueEventListener(this);
        m19_9_h3.addValueEventListener(this);
        m19_9_h3_s.addValueEventListener(this);
        m19_9_h4.addValueEventListener(this);
        m19_9_h4_s.addValueEventListener(this);
        m19_9_h5.addValueEventListener(this);
        m19_9_h5_s.addValueEventListener(this);
        m19_9_h6.addValueEventListener(this);
        m19_9_h6_s.addValueEventListener(this);
        m19_9_h7.addValueEventListener(this);
        m19_9_h7_s.addValueEventListener(this);
        m19_9_h8.addValueEventListener(this);
        m19_9_h8_s.addValueEventListener(this);
        m19_9_h9.addValueEventListener(this);
        m19_9_h9_s.addValueEventListener(this);
        /////////////////////////////////////
        mDate_1_9.addValueEventListener(this);
        m20_9_h1.addValueEventListener(this);
        m20_9_h1_s.addValueEventListener(this);
        m20_9_h2.addValueEventListener(this);
        m20_9_h2_s.addValueEventListener(this);
        m20_9_h3.addValueEventListener(this);
        m20_9_h3_s.addValueEventListener(this);
        m20_9_h4.addValueEventListener(this);
        m20_9_h4_s.addValueEventListener(this);
        m20_9_h5.addValueEventListener(this);
        m20_9_h5_s.addValueEventListener(this);
        m20_9_h6.addValueEventListener(this);
        m20_9_h6_s.addValueEventListener(this);
        m20_9_h7.addValueEventListener(this);
        m20_9_h7_s.addValueEventListener(this);
        m20_9_h8.addValueEventListener(this);
        m20_9_h8_s.addValueEventListener(this);
        m20_9_h9.addValueEventListener(this);
        m20_9_h9_s.addValueEventListener(this);
        /////////////////////////////////////
        mDate_1_9.addValueEventListener(this);
        m21_9_h1.addValueEventListener(this);
        m21_9_h1_s.addValueEventListener(this);
        m21_9_h2.addValueEventListener(this);
        m21_9_h2_s.addValueEventListener(this);
        m21_9_h3.addValueEventListener(this);
        m21_9_h3_s.addValueEventListener(this);
        m21_9_h4.addValueEventListener(this);
        m21_9_h4_s.addValueEventListener(this);
        m21_9_h5.addValueEventListener(this);
        m21_9_h5_s.addValueEventListener(this);
        m21_9_h6.addValueEventListener(this);
        m21_9_h6_s.addValueEventListener(this);
        m21_9_h7.addValueEventListener(this);
        m21_9_h7_s.addValueEventListener(this);
        m21_9_h8.addValueEventListener(this);
        m21_9_h8_s.addValueEventListener(this);
        m21_9_h9.addValueEventListener(this);
        m21_9_h9_s.addValueEventListener(this);
        /////////////////////////////////////
        mDate_1_9.addValueEventListener(this);
        m22_9_h1.addValueEventListener(this);
        m22_9_h1_s.addValueEventListener(this);
        m22_9_h2.addValueEventListener(this);
        m22_9_h2_s.addValueEventListener(this);
        m22_9_h3.addValueEventListener(this);
        m22_9_h3_s.addValueEventListener(this);
        m22_9_h4.addValueEventListener(this);
        m22_9_h4_s.addValueEventListener(this);
        m22_9_h5.addValueEventListener(this);
        m22_9_h5_s.addValueEventListener(this);
        m22_9_h6.addValueEventListener(this);
        m22_9_h6_s.addValueEventListener(this);
        m22_9_h7.addValueEventListener(this);
        m22_9_h7_s.addValueEventListener(this);
        m22_9_h8.addValueEventListener(this);
        m22_9_h8_s.addValueEventListener(this);
        m22_9_h9.addValueEventListener(this);
        m22_9_h9_s.addValueEventListener(this);
        /////////////////////////////////////
        mDate_1_9.addValueEventListener(this);
        m23_9_h1.addValueEventListener(this);
        m23_9_h1_s.addValueEventListener(this);
        m23_9_h2.addValueEventListener(this);
        m23_9_h2_s.addValueEventListener(this);
        m23_9_h3.addValueEventListener(this);
        m23_9_h3_s.addValueEventListener(this);
        m23_9_h4.addValueEventListener(this);
        m23_9_h4_s.addValueEventListener(this);
        m23_9_h5.addValueEventListener(this);
        m23_9_h5_s.addValueEventListener(this);
        m23_9_h6.addValueEventListener(this);
        m23_9_h6_s.addValueEventListener(this);
        m23_9_h7.addValueEventListener(this);
        m23_9_h7_s.addValueEventListener(this);
        m23_9_h8.addValueEventListener(this);
        m23_9_h8_s.addValueEventListener(this);
        m23_9_h9.addValueEventListener(this);
        m23_9_h9_s.addValueEventListener(this);
        /////////////////////////////////////
        mDate_1_9.addValueEventListener(this);
        m2_9_h1.addValueEventListener(this);
        m24_9_h1_s.addValueEventListener(this);
        m24_9_h2.addValueEventListener(this);
        m24_9_h2_s.addValueEventListener(this);
        m24_9_h3.addValueEventListener(this);
        m24_9_h3_s.addValueEventListener(this);
        m24_9_h4.addValueEventListener(this);
        m24_9_h4_s.addValueEventListener(this);
        m24_9_h5.addValueEventListener(this);
        m24_9_h5_s.addValueEventListener(this);
        m24_9_h6.addValueEventListener(this);
        m24_9_h6_s.addValueEventListener(this);
        m24_9_h7.addValueEventListener(this);
        m24_9_h7_s.addValueEventListener(this);
        m24_9_h8.addValueEventListener(this);
        m24_9_h8_s.addValueEventListener(this);
        m24_9_h9.addValueEventListener(this);
        m24_9_h9_s.addValueEventListener(this);
        //4///////////////////////////////////
        mDate_1_9.addValueEventListener(this);
        m25_9_h1.addValueEventListener(this);
        m25_9_h1_s.addValueEventListener(this);
        m25_9_h2.addValueEventListener(this);
        m25_9_h2_s.addValueEventListener(this);
        m25_9_h3.addValueEventListener(this);
        m25_9_h3_s.addValueEventListener(this);
        m25_9_h4.addValueEventListener(this);
        m25_9_h4_s.addValueEventListener(this);
        m25_9_h5.addValueEventListener(this);
        m25_9_h5_s.addValueEventListener(this);
        m25_9_h6.addValueEventListener(this);
        m25_9_h6_s.addValueEventListener(this);
        m25_9_h7.addValueEventListener(this);
        m25_9_h7_s.addValueEventListener(this);
        m25_9_h8.addValueEventListener(this);
        m25_9_h8_s.addValueEventListener(this);
        m25_9_h9.addValueEventListener(this);
        m25_9_h9_s.addValueEventListener(this);
        /////////////////////////////////////
        mDate_1_9.addValueEventListener(this);
        m26_9_h1.addValueEventListener(this);
        m26_9_h1_s.addValueEventListener(this);
        m26_9_h2.addValueEventListener(this);
        m26_9_h2_s.addValueEventListener(this);
        m26_9_h3.addValueEventListener(this);
        m26_9_h3_s.addValueEventListener(this);
        m26_9_h4.addValueEventListener(this);
        m26_9_h4_s.addValueEventListener(this);
        m26_9_h5.addValueEventListener(this);
        m26_9_h5_s.addValueEventListener(this);
        m26_9_h6.addValueEventListener(this);
        m26_9_h6_s.addValueEventListener(this);
        m26_9_h7.addValueEventListener(this);
        m26_9_h7_s.addValueEventListener(this);
        m26_9_h8.addValueEventListener(this);
        m26_9_h8_s.addValueEventListener(this);
        m26_9_h9.addValueEventListener(this);
        m26_9_h9_s.addValueEventListener(this);
        /////////////////////////////////////
        mDate_1_9.addValueEventListener(this);
        m27_9_h1.addValueEventListener(this);
        m27_9_h1_s.addValueEventListener(this);
        m27_9_h2.addValueEventListener(this);
        m27_9_h2_s.addValueEventListener(this);
        m27_9_h3.addValueEventListener(this);
        m27_9_h3_s.addValueEventListener(this);
        m27_9_h4.addValueEventListener(this);
        m27_9_h4_s.addValueEventListener(this);
        m27_9_h5.addValueEventListener(this);
        m27_9_h5_s.addValueEventListener(this);
        m27_9_h6.addValueEventListener(this);
        m27_9_h6_s.addValueEventListener(this);
        m27_9_h7.addValueEventListener(this);
        m27_9_h7_s.addValueEventListener(this);
        m27_9_h8.addValueEventListener(this);
        m27_9_h8_s.addValueEventListener(this);
        m27_9_h9.addValueEventListener(this);
        m27_9_h9_s.addValueEventListener(this);
        /////////////////////////////////////
        mDate_1_9.addValueEventListener(this);
        m28_9_h1.addValueEventListener(this);
        m28_9_h1_s.addValueEventListener(this);
        m28_9_h2.addValueEventListener(this);
        m28_9_h2_s.addValueEventListener(this);
        m28_9_h3.addValueEventListener(this);
        m28_9_h3_s.addValueEventListener(this);
        m28_9_h4.addValueEventListener(this);
        m28_9_h4_s.addValueEventListener(this);
        m28_9_h5.addValueEventListener(this);
        m28_9_h5_s.addValueEventListener(this);
        m28_9_h6.addValueEventListener(this);
        m28_9_h6_s.addValueEventListener(this);
        m28_9_h7.addValueEventListener(this);
        m28_9_h7_s.addValueEventListener(this);
        m28_9_h8.addValueEventListener(this);
        m28_9_h8_s.addValueEventListener(this);
        m28_9_h9.addValueEventListener(this);
        m28_9_h9_s.addValueEventListener(this);
        /////////////////////////////////////
        mDate_1_9.addValueEventListener(this);
        m29_9_h1.addValueEventListener(this);
        m29_9_h1_s.addValueEventListener(this);
        m29_9_h2.addValueEventListener(this);
        m29_9_h2_s.addValueEventListener(this);
        m29_9_h3.addValueEventListener(this);
        m29_9_h3_s.addValueEventListener(this);
        m29_9_h4.addValueEventListener(this);
        m29_9_h4_s.addValueEventListener(this);
        m29_9_h5.addValueEventListener(this);
        m29_9_h5_s.addValueEventListener(this);
        m29_9_h6.addValueEventListener(this);
        m29_9_h6_s.addValueEventListener(this);
        m29_9_h7.addValueEventListener(this);
        m29_9_h7_s.addValueEventListener(this);
        m29_9_h8.addValueEventListener(this);
        m29_9_h8_s.addValueEventListener(this);
        m29_9_h9.addValueEventListener(this);
        m29_9_h9_s.addValueEventListener(this);
        /////////////////////////////////////
        mDate_1_9.addValueEventListener(this);
        m30_9_h1.addValueEventListener(this);
        m30_9_h1_s.addValueEventListener(this);
        m30_9_h2.addValueEventListener(this);
        m30_9_h2_s.addValueEventListener(this);
        m30_9_h3.addValueEventListener(this);
        m30_9_h3_s.addValueEventListener(this);
        m30_9_h4.addValueEventListener(this);
        m30_9_h4_s.addValueEventListener(this);
        m30_9_h5.addValueEventListener(this);
        m30_9_h5_s.addValueEventListener(this);
        m30_9_h6.addValueEventListener(this);
        m30_9_h6_s.addValueEventListener(this);
        m30_9_h7.addValueEventListener(this);
        m30_9_h7_s.addValueEventListener(this);
        m30_9_h8.addValueEventListener(this);
        m30_9_h8_s.addValueEventListener(this);
        m30_9_h9.addValueEventListener(this);
        m30_9_h9_s.addValueEventListener(this);
        /////////////////////////////////////
        mDate_1_9.addValueEventListener(this);
        m31_9_h1.addValueEventListener(this);
        m31_9_h1_s.addValueEventListener(this);
        m31_9_h2.addValueEventListener(this);
        m31_9_h2_s.addValueEventListener(this);
        m31_9_h3.addValueEventListener(this);
        m31_9_h3_s.addValueEventListener(this);
        m31_9_h4.addValueEventListener(this);
        m31_9_h4_s.addValueEventListener(this);
        m31_9_h5.addValueEventListener(this);
        m31_9_h5_s.addValueEventListener(this);
        m31_9_h6.addValueEventListener(this);
        m31_9_h6_s.addValueEventListener(this);
        m31_9_h7.addValueEventListener(this);
        m31_9_h7_s.addValueEventListener(this);
        m31_9_h8.addValueEventListener(this);
        m31_9_h8_s.addValueEventListener(this);
        m31_9_h9.addValueEventListener(this);
        m31_9_h9_s.addValueEventListener(this);
        /////////////////////////////////////


    }

    @Override
    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

    }

    @Override
    public void onCancelled(@NonNull DatabaseError databaseError) {

    }
}
