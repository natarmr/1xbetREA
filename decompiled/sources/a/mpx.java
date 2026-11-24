package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class mpx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final btr f22198a;

    public mpx(btr btrVar, byte b) {
        btrVar.getClass();
        switch (b) {
            case 1:
                this.f22198a = btrVar;
                break;
            case 2:
                this.f22198a = btrVar;
                break;
            default:
                this.f22198a = btrVar;
                break;
        }
    }

    public Object a(xsr xsrVar, bnn0 bnn0Var) {
        Object objA = this.f22198a.b.f43184a.a(xsrVar, bnn0Var);
        wne wneVar = wne.f39444a;
        if (objA != wneVar) {
            objA = Unit.f46060a;
        }
        if (objA != wneVar) {
            objA = Unit.f46060a;
        }
        return objA == wneVar ? objA : Unit.f46060a;
    }

    public void b(boolean z) {
        this.f22198a.f3196a.f21156a.o(null, Boolean.valueOf(z));
    }

    public boolean c() {
        nhv0 nhv0Var = this.f22198a.c;
        return nhv0Var.f23554a.getValue() == null && nhv0Var.b.getValue() != null;
    }
}
