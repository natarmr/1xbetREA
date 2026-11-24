package a;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes4.dex */
public final class bxx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f3397a;
    public final TextView b;
    public final TextView c;

    public bxx(LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.f3397a = linearLayout;
        this.b = textView;
        this.c = textView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f3397a;
    }
}
