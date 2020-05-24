package com.umutcan.faceitstats.ui.share;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.umutcan.faceitstats.R;

public class ShareFragment extends Fragment {

    private ShareViewModel shareViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        shareViewModel =
                ViewModelProviders.of(this).get(ShareViewModel.class);
        View root = inflater.inflate(R.layout.fragment_share, container, false);

        WebView webview = (WebView) root.findViewById(R.id.shareweb);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl("http://bolfps.com/korona/faceit/top5kd.php");
        return root;
    }
}