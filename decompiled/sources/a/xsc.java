package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class xsc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final btr f41409a;

    public xsc(btr btrVar, byte b) {
        btrVar.getClass();
        switch (b) {
            case 1:
                this.f41409a = btrVar;
                break;
            default:
                this.f41409a = btrVar;
                break;
        }
    }

    public Object a(qsr qsrVar, bnn0 bnn0Var) {
        Object objA = this.f41409a.f.f31045a.a(qsrVar, bnn0Var);
        wne wneVar = wne.f39444a;
        if (objA != wneVar) {
            objA = Unit.f46060a;
        }
        if (objA != wneVar) {
            objA = Unit.f46060a;
        }
        return objA == wneVar ? objA : Unit.f46060a;
    }

    public void b() {
        this.f41409a.c.f23554a.n(null);
    }
}
