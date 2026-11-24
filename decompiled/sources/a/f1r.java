package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class f1r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f8779a;
    public final vd7 b;

    public f1r(ConstraintLayout constraintLayout, vd7 vd7Var) {
        this.f8779a = constraintLayout;
        this.b = vd7Var;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f8779a;
    }
}
