package a;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public class dby extends pby {
    public final boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dby(bby bbyVar) {
        super(true);
        boolean z = true;
        K(bbyVar);
        Unsafe unsafe = defpackage.a.f0a;
        long j = pby.f26732a;
        fac facVar = (fac) unsafe.getObjectVolatile(this, j);
        gac gacVar = facVar instanceof gac ? (gac) facVar : null;
        if (gacVar == null) {
            z = false;
            break;
        }
        pby pbyVarK = gacVar.k();
        while (!pbyVarK.D()) {
            fac facVar2 = (fac) defpackage.a.f0a.getObjectVolatile(pbyVarK, j);
            gac gacVar2 = facVar2 instanceof gac ? (gac) facVar2 : null;
            if (gacVar2 == null) {
                z = false;
                break;
            }
            pbyVarK = gacVar2.k();
        }
        this.d = z;
    }

    @Override // a.pby
    public final boolean D() {
        return this.d;
    }

    @Override // a.pby
    public final boolean F() {
        return true;
    }
}
