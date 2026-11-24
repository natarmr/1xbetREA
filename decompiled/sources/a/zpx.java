package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class zpx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b6t f44782a;

    public zpx(b6t b6tVar, byte b) {
        b6tVar.getClass();
        switch (b) {
            case 1:
                this.f44782a = b6tVar;
                break;
            default:
                this.f44782a = b6tVar;
                break;
        }
    }

    public Object a(dqk0 dqk0Var, n0w n0wVar, bnn0 bnn0Var) {
        int iOrdinal = n0wVar.ordinal();
        b6t b6tVar = this.f44782a;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                b6tVar.d(dqk0Var);
                return Unit.f46060a;
            }
            t9f.b();
            return null;
        }
        Object objO = b6tVar.b.f36841a.O(dqk0Var, bnn0Var);
        wne wneVar = wne.f39444a;
        if (objO != wneVar) {
            objO = Unit.f46060a;
        }
        if (objO != wneVar) {
            objO = Unit.f46060a;
        }
        return objO == wneVar ? objO : Unit.f46060a;
    }
}
