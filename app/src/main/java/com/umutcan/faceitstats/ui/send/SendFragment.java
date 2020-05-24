package com.umutcan.faceitstats.ui.send;

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

public class SendFragment extends Fragment {

    private SendViewModel sendViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        sendViewModel =
                ViewModelProviders.of(this).get(SendViewModel.class);
        View root = inflater.inflate(R.layout.fragment_send, container, false);

        WebView webview = (WebView) root.findViewById(R.id.sendweb);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl("http://bolfps.com/korona/faceit/top5winrate.php");
        return root;
    }
}