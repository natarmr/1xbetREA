package a;

/* JADX INFO: loaded from: classes3.dex */
public final class pnu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ant f27304a;
    public final pmi b;
    public final epc c;
    public final kqc d;
    public final pru e;

    public pnu(epc epcVar, kqc kqcVar, pmi pmiVar, ant antVar, pru pruVar) {
        this.f27304a = antVar;
        this.b = pmiVar;
        this.c = epcVar;
        this.d = kqcVar;
        this.e = pruVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(zje zjeVar) {
        onu onuVar;
        ant antVar;
        if (zjeVar instanceof onu) {
            onuVar = (onu) zjeVar;
            int i = onuVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                onuVar.l = i - Integer.MIN_VALUE;
            } else {
                onuVar = new onu(this, zjeVar);
            }
        } else {
            onuVar = new onu(this, zjeVar);
        }
        onu onuVar2 = onuVar;
        Object objX = onuVar2.j;
        Object obj = wne.f39444a;
        int i2 = onuVar2.l;
        if (i2 == 0) {
            z1x.P(objX);
            antVar = this.f27304a;
            onuVar2.i = antVar;
            onuVar2.l = 1;
            objX = this.b.x(onuVar2);
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
        antVar = onuVar2.i;
        z1x.P(objX);
        int iIntValue = ((Number) objX).intValue();
        boolean z = this.c.a().f13512a;
        nh70 nh70Var = sub0.b;
        sub0 sub0VarA = this.d.a();
        nh70Var.getClass();
        boolean zJ = nh70.j(sub0VarA);
        boolean z2 = this.e.a().d.b;
        onuVar2.i = null;
        onuVar2.l = 2;
        ant antVar2 = antVar;
        Object objP = antVar2.f1170a.p(iIntValue, onuVar2, ujn.h, z, antVar2.b.f15748a.i(), zJ, z2);
        return objP == obj ? obj : objP;
    }
}
