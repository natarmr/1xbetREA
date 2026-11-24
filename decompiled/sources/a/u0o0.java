package a;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class u0o0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f34864a;
    public final TextView b;
    public final TextView c;

    public u0o0(ConstraintLayout constraintLayout, TextView textView, TextView textView2) {
        this.f34864a = constraintLayout;
        this.b = textView;
        this.c = textView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f34864a;
    }
}
