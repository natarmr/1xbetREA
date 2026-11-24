package a;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class ysh implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f43167a;
    public final TextView b;
    public final TextView c;

    public ysh(ConstraintLayout constraintLayout, TextView textView, TextView textView2) {
        this.f43167a = constraintLayout;
        this.b = textView;
        this.c = textView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f43167a;
    }
}
