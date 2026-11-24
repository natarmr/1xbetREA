package a;

/* JADX INFO: loaded from: classes3.dex */
public final class hzu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lbu f13921a;
    public final pmi b;
    public final epc c;
    public final kqc d;
    public final pru e;

    public hzu(lbu lbuVar, pmi pmiVar, epc epcVar, kqc kqcVar, pru pruVar) {
        this.f13921a = lbuVar;
        this.b = pmiVar;
        this.c = epcVar;
        this.d = kqcVar;
        this.e = pruVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(zje zjeVar) {
        gzu gzuVar;
        lbu lbuVar;
        if (zjeVar instanceof gzu) {
            gzuVar = (gzu) zjeVar;
            int i = gzuVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                gzuVar.l = i - Integer.MIN_VALUE;
            } else {
                gzuVar = new gzu(this, zjeVar);
            }
        } else {
            gzuVar = new gzu(this, zjeVar);
        }
        gzu gzuVar2 = gzuVar;
        Object objX = gzuVar2.j;
        Object obj = wne.f39444a;
        int i2 = gzuVar2.l;
        if (i2 == 0) {
            z1x.P(objX);
            lbuVar = this.f13921a;
            gzuVar2.i = lbuVar;
            gzuVar2.l = 1;
            objX = this.b.x(gzuVar2);
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
        lbuVar = gzuVar2.i;
        z1x.P(objX);
        int iIntValue = ((Number) objX).intValue();
        boolean z = this.c.a().f13512a;
        nh70 nh70Var = sub0.b;
        sub0 sub0VarA = this.d.a();
        nh70Var.getClass();
        boolean zJ = nh70.j(sub0VarA);
        boolean z2 = this.e.a().d.b;
        gzuVar2.i = null;
        gzuVar2.l = 2;
        Object objR = ((cu5) lbuVar.b).r(iIntValue, gzuVar2, ujn.h, z, ((j1q0) lbuVar.c).f15748a.i(), zJ, z2);
        return objR == obj ? obj : objR;
    }
}
