package a;

/* JADX INFO: loaded from: classes3.dex */
public final class imu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jmu f15043a;
    public final pmi b;
    public final epc c;
    public final kqc d;
    public final n0o0 e;

    public imu(jmu jmuVar, pmi pmiVar, pru pruVar, epc epcVar, kqc kqcVar) {
        this.f15043a = jmuVar;
        this.b = pmiVar;
        this.c = epcVar;
        this.d = kqcVar;
        this.e = maz.b(new b6u(pruVar, (byte) 6));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(zje zjeVar) {
        hmu hmuVar;
        jmu jmuVar;
        if (zjeVar instanceof hmu) {
            hmuVar = (hmu) zjeVar;
            int i = hmuVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                hmuVar.l = i - Integer.MIN_VALUE;
            } else {
                hmuVar = new hmu(this, zjeVar);
            }
        } else {
            hmuVar = new hmu(this, zjeVar);
        }
        hmu hmuVar2 = hmuVar;
        Object objX = hmuVar2.j;
        Object obj = wne.f39444a;
        int i2 = hmuVar2.l;
        if (i2 == 0) {
            z1x.P(objX);
            jmuVar = this.f15043a;
            hmuVar2.i = jmuVar;
            hmuVar2.l = 1;
            objX = this.b.x(hmuVar2);
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
        jmuVar = hmuVar2.i;
        z1x.P(objX);
        int iIntValue = ((Number) objX).intValue();
        boolean z = this.c.a().f13512a;
        boolean z2 = ((sff0) this.e.getValue()).d.b;
        nh70 nh70Var = sub0.b;
        sub0 sub0VarA = this.d.a();
        nh70Var.getClass();
        boolean zJ = nh70.j(sub0VarA);
        hmuVar2.i = null;
        hmuVar2.l = 2;
        jmu jmuVar2 = jmuVar;
        Object objO = jmuVar2.f16782a.o(iIntValue, hmuVar2, ujn.h, z, jmuVar2.b.f15748a.i(), z2, zJ);
        return objO == obj ? obj : objO;
    }
}
