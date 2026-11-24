package a;

import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class k3j0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f17622a;
    public final dc3 b;
    public final dc3 c;
    public final dc3 d;

    public k3j0(LinearLayout linearLayout, dc3 dc3Var, dc3 dc3Var2, dc3 dc3Var3) {
        this.f17622a = linearLayout;
        this.b = dc3Var;
        this.c = dc3Var2;
        this.d = dc3Var3;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f17622a;
    }
}
