package com.umutcan.faceitstats.ui.tools;

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

public class ToolsFragment extends Fragment {

    private ToolsViewModel toolsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        toolsViewModel =
                ViewModelProviders.of(this).get(ToolsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_tools, container, false);

        WebView webview = (WebView) root.findViewById(R.id.toolsweb);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl("http://bolfps.com/korona/faceit/top5hs.php");
        return root;
    }
}