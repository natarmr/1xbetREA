package a;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes2.dex */
public final class n2q0 extends xvw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zsm0 f22815a;
    public final /* synthetic */ p2q0 b;

    public n2q0(p2q0 p2q0Var, zsm0 zsm0Var) {
        this.b = p2q0Var;
        this.f22815a = zsm0Var;
    }

    @Override // a.xvw
    public final void T(int i) {
        this.b.n = true;
        this.f22815a.t(i);
    }

    @Override // a.xvw
    public final void U(Typeface typeface) {
        p2q0 p2q0Var = this.b;
        Typeface typefaceCreate = Typeface.create(typeface, p2q0Var.d);
        p2q0Var.p = typefaceCreate;
        p2q0Var.n = true;
        this.f22815a.u(typefaceCreate, false);
    }
}
