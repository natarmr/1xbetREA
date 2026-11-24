package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes5.dex */
public final class fux implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f10187a;
    public final ImageView b;
    public final TextView c;
    public final View d;

    public fux(LinearLayout linearLayout, ImageView imageView, TextView textView, View view) {
        this.f10187a = linearLayout;
        this.b = imageView;
        this.c = textView;
        this.d = view;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f10187a;
    }
}
