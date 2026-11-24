package a;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class nik implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f23592a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final View e;

    public nik(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, View view) {
        this.f23592a = constraintLayout;
        this.b = textView;
        this.c = textView2;
        this.d = textView3;
        this.e = view;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f23592a;
    }
}
