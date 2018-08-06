package com.journeyapps.barcodescanner;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.zxing.client.android.R;


public class CustomDialogue extends Dialog implements
        View.OnClickListener {

    public Activity c;
    public Dialog d;
    public static TextView no;
    public ImageView yes;
    public static TextView tvStepOne;
    Context context;


    public CustomDialogue(Activity a) {
        super(a);
        // TODO Auto-generated constructor stub
        this.c = a;
    }

//    public ApplyLoanPopUpActivity(Activity a, Context c) {
//        super(a);
//        // TODO Auto-generated constructor stub
//        this.c = a;
//        this.c = (Activity) context;
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature( Window.FEATURE_NO_TITLE);
        setContentView( R.layout.zxing_aadhar_popup);
        yes = (ImageView) findViewById(R.id.closeButton);
        no = (TextView) findViewById(R.id.dialogButtonOK);
        yes.setOnClickListener(this);
        no.setOnClickListener(this);
        tvStepOne =(TextView) findViewById(R.id.documents);

    }

    @Override
    public void onClick(View v) {
        int i1 = v.getId();
        if (i1 == R.id.closeButton) {
            dismiss();

        } else if (i1 == R.id.dialogButtonOK) {
            if (no.getText().toString().equals("OK GOT IT")) {
                dismiss();
            }
            else {
                dismiss();
            }

        } else {
            dismiss();
        }
    }

    public  static void setTextStepOne(String s){
        tvStepOne.setText(s);
    }

    public  static void setTextOk(String s){
        no.setText(s);
    }
}