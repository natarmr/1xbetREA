package a;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class iuu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ynt f15414a;
    public final pmi b;
    public final epc c;
    public final kqc d;
    public final pru e;

    public iuu(epc epcVar, kqc kqcVar, pmi pmiVar, ynt yntVar, pru pruVar) {
        this.f15414a = yntVar;
        this.b = pmiVar;
        this.c = epcVar;
        this.d = kqcVar;
        this.e = pruVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(int i, zje zjeVar) {
        huu huuVar;
        ynt yntVar;
        int i2;
        if (zjeVar instanceof huu) {
            huuVar = (huu) zjeVar;
            int i3 = huuVar.n;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                huuVar.n = i3 - Integer.MIN_VALUE;
            } else {
                huuVar = new huu(this, zjeVar);
            }
        } else {
            huuVar = new huu(this, zjeVar);
        }
        huu huuVar2 = huuVar;
        Object obj = huuVar2.l;
        wne wneVar = wne.f39444a;
        int i4 = huuVar2.n;
        if (i4 == 0) {
            z1x.P(obj);
            ynt yntVar2 = this.f15414a;
            huuVar2.k = yntVar2;
            huuVar2.i = i;
            huuVar2.j = i;
            huuVar2.n = 1;
            Serializable serializableX = this.b.x(huuVar2);
            if (serializableX != wneVar) {
                yntVar = yntVar2;
                obj = serializableX;
                i2 = i;
            }
        }
        if (i4 != 1) {
            if (i4 == 2) {
                z1x.P(obj);
                return obj;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i = huuVar2.j;
        i2 = huuVar2.i;
        yntVar = huuVar2.k;
        z1x.P(obj);
        int iIntValue = ((Number) obj).intValue();
        boolean z = this.c.a().f13512a;
        nh70 nh70Var = sub0.b;
        sub0 sub0VarA = this.d.a();
        nh70Var.getClass();
        boolean zJ = nh70.j(sub0VarA);
        boolean z2 = this.e.a().d.b;
        huuVar2.k = null;
        huuVar2.i = i2;
        huuVar2.n = 2;
        Object objQ = yntVar.f42956a.q(i, iIntValue, z, yntVar.b.f15748a.i(), ujn.h, zJ, z2, huuVar2);
        return objQ == wneVar ? wneVar : objQ;
    }
}
