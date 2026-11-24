package a;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class c3w implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f3698a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;

    public c3w(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f3698a = constraintLayout;
        this.b = textView;
        this.c = textView2;
        this.d = textView3;
        this.e = textView4;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f3698a;
    }
}
