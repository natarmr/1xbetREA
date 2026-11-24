package a;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public final class jik implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f16579a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final View e;

    public jik(LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, View view) {
        this.f16579a = linearLayout;
        this.b = textView;
        this.c = textView2;
        this.d = textView3;
        this.e = view;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f16579a;
    }
}
