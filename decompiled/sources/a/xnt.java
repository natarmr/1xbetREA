package a;

/* JADX INFO: loaded from: classes3.dex */
public final class xnt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ynt f41185a;
    public final pmi b;
    public final kqc c;
    public final epc d;
    public final pru e;

    public xnt(epc epcVar, kqc kqcVar, pmi pmiVar, ynt yntVar, pru pruVar) {
        this.f41185a = yntVar;
        this.b = pmiVar;
        this.c = kqcVar;
        this.d = epcVar;
        this.e = pruVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(zje zjeVar) {
        wnt wntVar;
        ynt yntVar;
        if (zjeVar instanceof wnt) {
            wntVar = (wnt) zjeVar;
            int i = wntVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                wntVar.l = i - Integer.MIN_VALUE;
            } else {
                wntVar = new wnt(this, zjeVar);
            }
        } else {
            wntVar = new wnt(this, zjeVar);
        }
        wnt wntVar2 = wntVar;
        Object objX = wntVar2.j;
        Object obj = wne.f39444a;
        int i2 = wntVar2.l;
        if (i2 == 0) {
            z1x.P(objX);
            yntVar = this.f41185a;
            wntVar2.i = yntVar;
            wntVar2.l = 1;
            objX = this.b.x(wntVar2);
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
        yntVar = wntVar2.i;
        z1x.P(objX);
        int iIntValue = ((Number) objX).intValue();
        boolean z = this.d.a().f13512a;
        nh70 nh70Var = sub0.b;
        sub0 sub0VarA = this.c.a();
        nh70Var.getClass();
        boolean zJ = nh70.j(sub0VarA);
        boolean z2 = this.e.a().d.b;
        wntVar2.i = null;
        wntVar2.l = 2;
        ynt yntVar2 = yntVar;
        Object objF = yntVar2.f42956a.f(iIntValue, wntVar2, ujn.h, z, yntVar2.b.f15748a.i(), zJ, z2);
        return objF == obj ? obj : objF;
    }
}
