package a;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes5.dex */
public final class o7o0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f24796a;
    public final TextView b;
    public final TextView c;

    public o7o0(LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.f24796a = linearLayout;
        this.b = textView;
        this.c = textView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f24796a;
    }
}
