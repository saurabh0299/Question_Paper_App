package com.example.questionapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.github.barteksc.pdfviewer.PDFView;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import static android.os.Environment.DIRECTORY_DOWNLOADS;

public class computernetwork extends AppCompatActivity {
PDFView cn;

    Button down6;
    FirebaseStorage firebaseStorage;
    StorageReference storageReference;
    StorageReference ref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computernetwork);

        cn=(PDFView)findViewById(R.id.cnbook);

        cn.fromAsset("computernetworking.pdf").load();




        down6=findViewById(R.id.down7);
        down6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                download();
            }
        });


    }

    public void download()
    {
        storageReference=firebaseStorage.getInstance().getReference();
        ref=storageReference.child("advjava.pdf");

        ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                String url=uri.toString();
                dawnloadFile(computernetwork.this,"computernetworking","pdf",DIRECTORY_DOWNLOADS,url);

            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {

            }
        });

    }


    public  void dawnloadFile(Context context, String fileName, String fileExtension, String destinationDirectory, String url)

    {
        DownloadManager downloadManager=(DownloadManager ) context.getSystemService(Context.DOWNLOAD_SERVICE);

        Uri uri=Uri.parse(url);
        DownloadManager.Request request=new DownloadManager.Request(uri);

        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        request.setDestinationInExternalFilesDir(context,destinationDirectory,fileName + fileExtension);

        downloadManager.enqueue(request);


    }

}