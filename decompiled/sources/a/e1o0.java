package a;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public final class e1o0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f7045a;
    public final TextView b;
    public final TextView c;
    public final TextView d;

    public e1o0(LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3) {
        this.f7045a = linearLayout;
        this.b = textView;
        this.c = textView2;
        this.d = textView3;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f7045a;
    }
}
