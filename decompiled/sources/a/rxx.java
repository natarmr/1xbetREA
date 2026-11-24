package a;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class rxx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f31285a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final View e;
    public final View f;

    public rxx(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, View view, View view2) {
        this.f31285a = constraintLayout;
        this.b = textView;
        this.c = textView2;
        this.d = textView3;
        this.e = view;
        this.f = view2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f31285a;
    }
}
