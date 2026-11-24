package a;

/* JADX INFO: loaded from: classes.dex */
public final class hbh0 implements vj50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sch0 f12770a;
    public boolean b;

    public hbh0(sch0 sch0Var, boolean z) {
        this.f12770a = sch0Var;
        this.b = z;
    }

    @Override // a.vj50
    public final long S(int i, long j, long j2) {
        if (!this.b) {
            return 0L;
        }
        sch0 sch0Var = this.f12770a;
        if (sch0Var.f31986a.a()) {
            return 0L;
        }
        return sch0Var.i(sch0Var.e(sch0Var.f31986a.e(sch0Var.e(sch0Var.h(j2)))));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // a.vj50
    public final Object g(long j, long j2, zje zjeVar) throws Throwable {
        gbh0 gbh0Var;
        long jD;
        if (zjeVar instanceof gbh0) {
            gbh0Var = (gbh0) zjeVar;
            int i = gbh0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                gbh0Var.l = i - Integer.MIN_VALUE;
            } else {
                gbh0Var = new gbh0(this, zjeVar);
            }
        } else {
            gbh0Var = new gbh0(this, zjeVar);
        }
        Object objA = gbh0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = gbh0Var.l;
        if (i2 == 0) {
            z1x.P(objA);
            jD = 0;
            if (this.b) {
                sch0 sch0Var = this.f12770a;
                if (!sch0Var.i) {
                    gbh0Var.i = j2;
                    gbh0Var.l = 1;
                    objA = sch0Var.a(j2, gbh0Var);
                    if (objA == wneVar) {
                        return wneVar;
                    }
                }
                jD = g6u0.d(j2, jD);
            }
            return new g6u0(jD);
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j2 = gbh0Var.i;
        z1x.P(objA);
        jD = ((g6u0) objA).f10786a;
        jD = g6u0.d(j2, jD);
        return new g6u0(jD);
    }
}
