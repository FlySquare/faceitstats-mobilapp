package com.umutcan.faceitstats.ui.gallery;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.umutcan.faceitstats.R;

public class GalleryFragment extends Fragment {

    private GalleryViewModel galleryViewModel;
    SharedPreferences webinyoPref;
    SharedPreferences.Editor editor;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel =
                ViewModelProviders.of(this).get(GalleryViewModel.class);
        View root = inflater.inflate(R.layout.fragment_gallery, container, false);
        // DAHA ÖNCEDEN TANIMLAMIŞ OLDUĞUMUZ editPref İSİMLİ VERİYİ ÇAĞIRIP EKRANA YAZIDIRIYORUZ.
        webinyoPref = getContext().getSharedPreferences("VeriSakla", Context.MODE_PRIVATE);
        editor = webinyoPref.edit();
        String myString = webinyoPref.getString("editPref", "N/A");


        WebView webview = (WebView) root.findViewById(R.id.webview);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl("http://bolfps.com/korona/faceit/profile/?username="+myString);
        return root;
    }
}