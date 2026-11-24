package a;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class zmt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ant f44643a;
    public final pmi b;
    public final kqc c;
    public final epc d;
    public final pru e;

    public zmt(epc epcVar, kqc kqcVar, pmi pmiVar, ant antVar, pru pruVar) {
        this.f44643a = antVar;
        this.b = pmiVar;
        this.c = kqcVar;
        this.d = epcVar;
        this.e = pruVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(ec0 ec0Var, zje zjeVar) {
        ymt ymtVar;
        ec0 ec0Var2;
        ant antVar;
        if (zjeVar instanceof ymt) {
            ymtVar = (ymt) zjeVar;
            int i = ymtVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                ymtVar.m = i - Integer.MIN_VALUE;
            } else {
                ymtVar = new ymt(this, zjeVar);
            }
        } else {
            ymtVar = new ymt(this, zjeVar);
        }
        ymt ymtVar2 = ymtVar;
        Object obj = ymtVar2.k;
        wne wneVar = wne.f39444a;
        int i2 = ymtVar2.m;
        if (i2 == 0) {
            z1x.P(obj);
            ymtVar2.i = ec0Var;
            ant antVar2 = this.f44643a;
            ymtVar2.j = antVar2;
            ymtVar2.m = 1;
            Serializable serializableX = this.b.x(ymtVar2);
            if (serializableX != wneVar) {
                ec0Var2 = ec0Var;
                antVar = antVar2;
                obj = serializableX;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                z1x.P(obj);
                return obj;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        antVar = ymtVar2.j;
        ec0 ec0Var3 = ymtVar2.i;
        z1x.P(obj);
        ec0Var2 = ec0Var3;
        int iIntValue = ((Number) obj).intValue();
        boolean z = this.d.a().f13512a;
        nh70 nh70Var = sub0.b;
        sub0 sub0VarA = this.c.a();
        nh70Var.getClass();
        boolean zJ = nh70.j(sub0VarA);
        boolean z2 = this.e.a().d.b;
        ymtVar2.i = null;
        ymtVar2.j = null;
        ymtVar2.m = 2;
        Object objE = antVar.f1170a.e(iIntValue, z, antVar.b.f15748a.i(), ec0Var2, ujn.h, zJ, z2, ymtVar2);
        return objE == wneVar ? wneVar : objE;
    }
}
