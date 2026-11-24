package a;

import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class x7o0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f40422a;
    public final LinearLayout b;
    public final View c;

    public x7o0(ConstraintLayout constraintLayout, LinearLayout linearLayout, View view) {
        this.f40422a = constraintLayout;
        this.b = linearLayout;
        this.c = view;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f40422a;
    }
}
