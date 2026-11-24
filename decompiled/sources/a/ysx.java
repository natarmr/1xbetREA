package a;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes5.dex */
public final class ysx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f43191a;
    public final TextView b;
    public final TextView c;
    public final TextView d;

    public ysx(LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3) {
        this.f43191a = linearLayout;
        this.b = textView;
        this.c = textView2;
        this.d = textView3;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f43191a;
    }
}
