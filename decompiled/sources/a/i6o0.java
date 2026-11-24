package a;

import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class i6o0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f14252a;
    public final LinearLayout b;

    public i6o0(ConstraintLayout constraintLayout, LinearLayout linearLayout) {
        this.f14252a = constraintLayout;
        this.b = linearLayout;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f14252a;
    }
}
