package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class ntb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oh9 f24090a;

    public ntb0(oh9 oh9Var) {
        oh9Var.getClass();
        this.f24090a = oh9Var;
    }

    public final Object a(int i, bnn0 bnn0Var) {
        Object objD0;
        oh9 oh9Var = this.f24090a;
        nh9 nh9Var = oh9Var.f25256a;
        p7m0 p7m0Var = nh9Var.f23522a;
        if (p7m0Var.getValue() == null || (p7m0Var.getValue() instanceof bqk0)) {
            nh9Var.f23522a.n(null);
            objD0 = qjj.d0(oh9Var.d.b, new u52((Object) oh9Var, i, (yje) null, (byte) 2), bnn0Var);
            if (objD0 != wne.f39444a) {
                objD0 = Unit.f46060a;
            }
        } else {
            objD0 = Unit.f46060a;
        }
        return objD0 == wne.f39444a ? objD0 : Unit.f46060a;
    }
}
