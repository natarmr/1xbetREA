package a;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class ex20 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f8556a;
    public final TextView b;
    public final TextView c;
    public final ConstraintLayout d;

    public ex20(ConstraintLayout constraintLayout, TextView textView, TextView textView2, ConstraintLayout constraintLayout2) {
        this.f8556a = constraintLayout;
        this.b = textView;
        this.c = textView2;
        this.d = constraintLayout2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f8556a;
    }
}
