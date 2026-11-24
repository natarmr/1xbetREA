package a;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class w8o0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f38733a;
    public final TextView b;
    public final TextView c;
    public final TextView d;

    public w8o0(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3) {
        this.f38733a = constraintLayout;
        this.b = textView;
        this.c = textView2;
        this.d = textView3;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f38733a;
    }
}
