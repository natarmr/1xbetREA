package a;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class fs10 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoordinatorLayout f10044a;
    public final nq8 b;
    public final dc3 c;

    public fs10(CoordinatorLayout coordinatorLayout, nq8 nq8Var, dc3 dc3Var) {
        this.f10044a = coordinatorLayout;
        this.b = nq8Var;
        this.c = dc3Var;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f10044a;
    }
}
