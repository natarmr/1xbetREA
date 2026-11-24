package a;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes.dex */
public final class ptx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f27585a;
    public final TextView b;
    public final TextView c;
    public final AppCompatTextView d;
    public final TextView e;

    public ptx(ConstraintLayout constraintLayout, TextView textView, TextView textView2, AppCompatTextView appCompatTextView, TextView textView3) {
        this.f27585a = constraintLayout;
        this.b = textView;
        this.c = textView2;
        this.d = appCompatTextView;
        this.e = textView3;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f27585a;
    }
}
