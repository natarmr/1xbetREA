package a;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class jkc0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f16662a;
    public final TextView b;
    public final View c;
    public final TextView d;

    public jkc0(ConstraintLayout constraintLayout, TextView textView, View view, TextView textView2) {
        this.f16662a = constraintLayout;
        this.b = textView;
        this.c = view;
        this.d = textView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f16662a;
    }
}
