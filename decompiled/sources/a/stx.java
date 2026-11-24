package a;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes.dex */
public final class stx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f32795a;
    public final TextView b;
    public final TextView c;

    public stx(ConstraintLayout constraintLayout, TextView textView, TextView textView2) {
        this.f32795a = constraintLayout;
        this.b = textView;
        this.c = textView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f32795a;
    }
}
