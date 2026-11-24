package a;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class zrt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fhj f44874a;
    public final pmi b;
    public final kqc c;
    public final epc d;
    public final pru e;

    public zrt(fhj fhjVar, pmi pmiVar, kqc kqcVar, epc epcVar, pru pruVar) {
        this.f44874a = fhjVar;
        this.b = pmiVar;
        this.c = kqcVar;
        this.d = epcVar;
        this.e = pruVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(int i, zje zjeVar) {
        yrt yrtVar;
        fhj fhjVar;
        boolean z;
        if (zjeVar instanceof yrt) {
            yrtVar = (yrt) zjeVar;
            int i2 = yrtVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yrtVar.n = i2 - Integer.MIN_VALUE;
            } else {
                yrtVar = new yrt(this, zjeVar);
            }
        } else {
            yrtVar = new yrt(this, zjeVar);
        }
        yrt yrtVar2 = yrtVar;
        Object obj = yrtVar2.l;
        wne wneVar = wne.f39444a;
        int i3 = yrtVar2.n;
        if (i3 == 0) {
            z1x.P(obj);
            boolean z2 = this.d.a().f13512a;
            fhjVar = this.f44874a;
            yrtVar2.j = fhjVar;
            yrtVar2.i = i;
            yrtVar2.k = z2;
            yrtVar2.n = 1;
            Serializable serializableX = this.b.x(yrtVar2);
            if (serializableX != wneVar) {
                z = z2;
                obj = serializableX;
            }
        }
        if (i3 != 1) {
            if (i3 == 2) {
                z1x.P(obj);
                return obj;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        boolean z3 = yrtVar2.k;
        int i4 = yrtVar2.i;
        fhj fhjVar2 = yrtVar2.j;
        z1x.P(obj);
        z = z3;
        i = i4;
        fhjVar = fhjVar2;
        int iIntValue = ((Number) obj).intValue();
        nh70 nh70Var = sub0.b;
        sub0 sub0VarA = this.c.a();
        nh70Var.getClass();
        boolean zJ = nh70.j(sub0VarA);
        boolean z4 = this.e.a().d.b;
        yrtVar2.j = null;
        yrtVar2.i = i;
        yrtVar2.n = 2;
        Object objV = fhjVar.v(i, iIntValue, z, zJ, z4, yrtVar2);
        return objV == wneVar ? wneVar : objV;
    }
}
