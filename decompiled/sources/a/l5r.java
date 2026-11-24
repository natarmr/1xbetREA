package a;

import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class l5r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f19473a;
    public final vd7 b;
    public final uk5 c;

    public l5r(FrameLayout frameLayout, vd7 vd7Var, uk5 uk5Var) {
        this.f19473a = frameLayout;
        this.b = vd7Var;
        this.c = uk5Var;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f19473a;
    }
}
