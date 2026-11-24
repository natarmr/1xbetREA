package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public final class x6l implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w6l f40368a;
    public final ImageView b;
    public final View c;
    public final ImageView d;
    public final TextView e;

    public x6l(w6l w6lVar, ImageView imageView, View view, ImageView imageView2, TextView textView) {
        this.f40368a = w6lVar;
        this.b = imageView;
        this.c = view;
        this.d = imageView2;
        this.e = textView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f40368a;
    }
}
