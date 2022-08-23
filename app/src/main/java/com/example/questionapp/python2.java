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

public class python2 extends AppCompatActivity {
    PDFView paython2;

    Button down31;
    FirebaseStorage firebaseStorage;
    StorageReference storageReference;
    StorageReference ref;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python2);

        paython2=(PDFView)findViewById(R.id.python2book);

        paython2.fromAsset("python2.pdf").load();




        down31=findViewById(R.id.down32);
        down31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                download();
            }
        });


    }

    public void download()
    {
        storageReference=firebaseStorage.getInstance().getReference();
        ref=storageReference.child("python 2.pdf");

        ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                String url=uri.toString();
                dawnloadFile(python2.this,"python 2","pdf",DIRECTORY_DOWNLOADS,url);

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
