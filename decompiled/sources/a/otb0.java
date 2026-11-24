package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class otb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l6l f25821a;

    public otb0(l6l l6lVar) {
        l6lVar.getClass();
        this.f25821a = l6lVar;
    }

    public final Object a(int i, bnn0 bnn0Var) {
        Object objD0;
        l6l l6lVar = this.f25821a;
        n5l n5lVar = l6lVar.f19511a;
        p7m0 p7m0Var = n5lVar.f22948a;
        if (p7m0Var.getValue() == null || (p7m0Var.getValue() instanceof bqk0)) {
            n5lVar.f22948a.n(null);
            objD0 = qjj.d0(l6lVar.d.b, new u52((Object) l6lVar, i, (yje) null, (byte) 8), bnn0Var);
            if (objD0 != wne.f39444a) {
                objD0 = Unit.f46060a;
            }
        } else {
            objD0 = Unit.f46060a;
        }
        return objD0 == wne.f39444a ? objD0 : Unit.f46060a;
    }
}
