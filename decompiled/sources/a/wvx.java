package a;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes4.dex */
public final class wvx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f39860a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;

    public wvx(LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f39860a = linearLayout;
        this.b = textView;
        this.c = textView2;
        this.d = textView3;
        this.e = textView4;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f39860a;
    }
}
