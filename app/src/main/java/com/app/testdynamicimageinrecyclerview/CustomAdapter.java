package com.app.testdynamicimageinrecyclerview;

import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {
    private List<ChildDataModel> data;

    public CustomAdapter(List<ChildDataModel> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.child_view_layout, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ChildDataModel model = data.get(position);


        holder.webView.getSettings().setLoadsImagesAutomatically(true);
        holder.webView.getSettings().setUseWideViewPort(true);

        holder.webView.addJavascriptInterface(new MyJavaScriptInterface(),"Android");
        holder.webView.getSettings().getBuiltInZoomControls();
        holder.webView.getSettings().setJavaScriptEnabled(true);
        Log.e("TagHtml",model.getHtmlContent());

        holder.webView.loadData(model.getHtmlContent(), "text/html", "utf-8");

//        if (model.getCanvasData() != null || !model.getCanvasData().equals("")) {
//            holder.canvasView.setCanvasData(model.getCanvasData());
//        }
    }

    final class MyJavaScriptInterface
    {
        public void ProcessJavaScript(final String scriptname, final String args)
        {

            Handler mHandler = new Handler();
            mHandler.post(new Runnable()
            {
                public void run()
                {
                    //Do your activities
                }
            });
        }
    }
    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        WebView webView;
        CustomCanvasView canvasView;

        public ViewHolder(View itemView) {
            super(itemView);
            webView = itemView.findViewById(R.id.webView);
            canvasView = itemView.findViewById(R.id.canvasView);
        }
    }
}
