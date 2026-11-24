package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class r3c0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f29780a;
    public final ConstraintLayout b;
    public final View c;
    public final View d;

    public r3c0(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, View view, View view2) {
        this.f29780a = constraintLayout;
        this.b = constraintLayout2;
        this.c = view;
        this.d = view2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f29780a;
    }
}
