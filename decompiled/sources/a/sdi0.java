package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class sdi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final btr f32036a;

    public sdi0(btr btrVar, byte b) {
        btrVar.getClass();
        switch (b) {
            case 1:
                this.f32036a = btrVar;
                break;
            default:
                this.f32036a = btrVar;
                break;
        }
    }

    public Object a(psr psrVar, bnn0 bnn0Var) {
        Object objA = this.f32036a.e.f1445a.a(psrVar, bnn0Var);
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
        this.f32036a.f3196a.b.o(null, Boolean.valueOf(z));
    }
}
