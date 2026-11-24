package a;

import android.view.View;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.appbar.MaterialToolbar;

/* JADX INFO: loaded from: classes5.dex */
public final class y5r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f42062a;
    public final Button b;
    public final cxx c;
    public final cxx d;
    public final nq8 e;
    public final MaterialToolbar f;
    public final cxx g;

    public y5r(ConstraintLayout constraintLayout, Button button, cxx cxxVar, cxx cxxVar2, nq8 nq8Var, MaterialToolbar materialToolbar, cxx cxxVar3) {
        this.f42062a = constraintLayout;
        this.b = button;
        this.c = cxxVar;
        this.d = cxxVar2;
        this.e = nq8Var;
        this.f = materialToolbar;
        this.g = cxxVar3;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f42062a;
    }
}
