package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class l2u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ant f19331a;
    public final pmi b;
    public final epc c;
    public final kqc d;
    public final pru e;

    public l2u(epc epcVar, kqc kqcVar, pmi pmiVar, ant antVar, pru pruVar) {
        this.f19331a = antVar;
        this.b = pmiVar;
        this.c = epcVar;
        this.d = kqcVar;
        this.e = pruVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(List list, zje zjeVar) throws Throwable {
        k2u k2uVar;
        ant antVar;
        if (zjeVar instanceof k2u) {
            k2uVar = (k2u) zjeVar;
            int i = k2uVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                k2uVar.m = i - Integer.MIN_VALUE;
            } else {
                k2uVar = new k2u(this, zjeVar);
            }
        } else {
            k2uVar = new k2u(this, zjeVar);
        }
        k2u k2uVar2 = k2uVar;
        Object objX = k2uVar2.k;
        Object obj = wne.f39444a;
        int i2 = k2uVar2.m;
        if (i2 == 0) {
            z1x.P(objX);
            antVar = this.f19331a;
            k2uVar2.i = antVar;
            k2uVar2.j = list;
            k2uVar2.m = 1;
            objX = this.b.x(k2uVar2);
            if (objX != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                z1x.P(objX);
                return objX;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        list = k2uVar2.j;
        antVar = k2uVar2.i;
        z1x.P(objX);
        int iIntValue = ((Number) objX).intValue();
        boolean z = this.c.a().f13512a;
        nh70 nh70Var = sub0.b;
        sub0 sub0VarA = this.d.a();
        nh70Var.getClass();
        boolean zJ = nh70.j(sub0VarA);
        boolean z2 = this.e.a().d.b;
        k2uVar2.i = null;
        k2uVar2.j = null;
        k2uVar2.m = 2;
        ant antVar2 = antVar;
        Object objL = antVar2.f1170a.l(list, iIntValue, z, antVar2.b.f15748a.i(), ujn.h, zJ, z2, k2uVar2);
        return objL == obj ? obj : objL;
    }
}
