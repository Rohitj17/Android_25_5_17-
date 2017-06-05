package com.example.dailogs;


import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

public class App_dailog extends DialogFragment {
    public static final String No_Internet="No internet";
   public static final String TAG_DATE="date";
    public static final String TAG_TIME="time";
    public static final String TAG_PROGRESS="Progress";
    public static final String TAG_CUSTOM="userdef";
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog d=null;
        if(getTag().equals(No_Internet)) {
            d = noInternet();
        }
        else if (getTag().equals(TAG_DATE)) {
            d = calendar();
        } else if (getTag().equals(TAG_TIME)) {
            d = time();
        } else if (getTag().equals(TAG_PROGRESS)) {
            d = progress();
        } else {
            d = custom();
        }

        return d;
    }

    private Dialog progress() {
        ProgressDialog dialog = new ProgressDialog(getActivity());
        dialog.setIcon(R.mipmap.ic_launcher);
        dialog.setTitle("Title");
        dialog.setMessage("Message");
        dialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        dialog.setMax(100);
        dialog.setProgress(100);

        return dialog;
    }

    private Dialog custom() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        AlertDialog dialog = builder.create();

        LayoutInflater inflater = LayoutInflater.from(getActivity());
        View view = inflater.inflate(R.layout.dailog_view, null, false);
        //((TextView)view.findViewById(R.id.textInfo)).setText("");
        dialog.setView(view);

        return dialog;
    }

    private Dialog time() {
        TimePickerDialog d = new TimePickerDialog(getActivity(), new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                mt("" + hourOfDay + " : " + minute);
            }
        }, 11, 42, false);

        return d;
    }

    private Dialog calendar() {
        DatePickerDialog d = new DatePickerDialog(getActivity(), new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                mt("" + dayOfMonth + " - " + (month + 1) + " - " + year);
            }
        }, 2017, 5, 6);

        return d;
    }

    public Dialog noInternet()
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setIcon(R.mipmap.ic_launcher);
        builder.setTitle("Title");
        builder.setMessage("Message");
        builder.setPositiveButton("Positive", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                mt("Positive");
            }
        });
        builder.setNegativeButton("Negative", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                mt("Negative");
            }
        });

        AlertDialog dialog = builder.create();

        return dialog;
    }
    private void mt(String msg) {
        Toast.makeText(getActivity(), msg, Toast.LENGTH_SHORT).show();
    }
}
