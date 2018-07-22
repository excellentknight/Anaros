package com.faresimtiez.algotech.anaros;

import android.support.annotation.NonNull;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

public class CommandeM2Activity extends AppCompatActivity implements AdapterView.OnItemSelectedListener, ValueEventListener {
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
        setContentView(R.layout.activity_commande_m2);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    @Override
    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

    }

    @Override
    public void onCancelled(@NonNull DatabaseError databaseError) {

    }
}
