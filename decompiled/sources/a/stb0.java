package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class stb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f310 f32766a;

    public stb0(f310 f310Var) {
        f310Var.getClass();
        this.f32766a = f310Var;
    }

    public final Object a(int i, bnn0 bnn0Var) {
        Object objD0;
        f310 f310Var = this.f32766a;
        x010 x010Var = f310Var.f8839a;
        p7m0 p7m0Var = x010Var.f40047a;
        if (p7m0Var.getValue() == null || (p7m0Var.getValue() instanceof bqk0)) {
            x010Var.f40047a.n(null);
            objD0 = qjj.d0(f310Var.d.b, new u52((Object) f310Var, i, (yje) null, (byte) 14), bnn0Var);
            if (objD0 != wne.f39444a) {
                objD0 = Unit.f46060a;
            }
        } else {
            objD0 = Unit.f46060a;
        }
        return objD0 == wne.f39444a ? objD0 : Unit.f46060a;
    }
}
