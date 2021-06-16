package com.santosoftvw.frmattendance;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class FileIOActivity extends AppCompatActivity {
    static Integer idx = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_file_ioactivity);

        ImageView myImage = (ImageView) findViewById(R.id.imageView2);
        Button nxtBtn = (Button) findViewById(R.id.button5);
        Button prvBtn = (Button) findViewById(R.id.button6);
        File dcimPath = new File(Environment.getExternalStoragePublicDirectory(
                Environment.DIRECTORY_DCIM) + "/Camera");

        HashMap<Integer,File> images = new HashMap<>();
        if (dcimPath.exists()) {
            Log.i("DCIM PATH", dcimPath.toString());
            File[] files = dcimPath.listFiles();
            Integer j=1;
            for (int i = 0; i < files.length; i++) {
                if(!files[i].isDirectory() && files[i].exists()){
                    images.put(j++,files[i]);
                }
            }
        }

        Bitmap myBitmap = BitmapFactory.decodeFile(images.get(idx).getAbsolutePath());
        myImage.setImageBitmap(myBitmap);
        if(idx==1){
            prvBtn.setEnabled(false);
        }
        else{
            prvBtn.setEnabled(true);
            prvBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    idx-=1;
                    Bitmap myBitmap = BitmapFactory.decodeFile(images.get(idx).getAbsolutePath());
                    myImage.setImageBitmap(myBitmap);
                }
            });
        }
        nxtBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idx+=1;
                Bitmap myBitmap = BitmapFactory.decodeFile(images.get(idx).getAbsolutePath());
                myImage.setImageBitmap(myBitmap);
            }
        });
    }


}