package a;

/* JADX INFO: loaded from: classes3.dex */
public final class rkc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yox f30641a;
    public final dnc0 b;
    public final btt0 c;
    public final knf0 d;
    public final duj e;
    public final sje f;
    public bby g;

    public rkc0(yox yoxVar, dnc0 dnc0Var, btt0 btt0Var, knf0 knf0Var, duj dujVar) {
        dnc0Var.getClass();
        btt0Var.getClass();
        knf0Var.getClass();
        this.f30641a = yoxVar;
        this.b = dnc0Var;
        this.c = btt0Var;
        this.d = knf0Var;
        this.e = dujVar;
        this.f = d5c.a(qem0.e());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object a(long j, long j2, zje zjeVar) {
        okc0 okc0Var;
        long j3;
        if (zjeVar instanceof okc0) {
            okc0Var = (okc0) zjeVar;
            int i = okc0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                okc0Var.l = i - Integer.MIN_VALUE;
            } else {
                okc0Var = new okc0(this, zjeVar);
            }
        } else {
            okc0Var = new okc0(this, zjeVar);
        }
        Object objA = okc0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = okc0Var.l;
        if (i2 == 0) {
            z1x.P(objA);
            String strA = this.c.a();
            poc0 poc0Var = new poc0(j, j2, this.d.c());
            okc0Var.i = j2;
            okc0Var.l = 1;
            objA = ((w4c0) ((rta0) this.f30641a.f43005a).invoke()).a(strA, poc0Var, okc0Var);
            if (objA == wneVar) {
                return wneVar;
            }
            j3 = j2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j3 = okc0Var.i;
            z1x.P(objA);
        }
        trt trtVar = (trt) ((u2t) objA).a();
        Long l = trtVar.f;
        if (l != null && l.longValue() == j3) {
            return obb.l0(trtVar);
        }
        jf4.k(null);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object b(int i, long j, long j2, zje zjeVar, boolean z) {
        pkc0 pkc0Var;
        if (zjeVar instanceof pkc0) {
            pkc0Var = (pkc0) zjeVar;
            int i2 = pkc0Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pkc0Var.k = i2 - Integer.MIN_VALUE;
            } else {
                pkc0Var = new pkc0(this, zjeVar);
            }
        } else {
            pkc0Var = new pkc0(this, zjeVar);
        }
        Object objB = pkc0Var.i;
        wne wneVar = wne.f39444a;
        int i3 = pkc0Var.k;
        if (i3 == 0) {
            z1x.P(objB);
            String strA = this.c.a();
            n390 n390Var = new n390(i, j, j2, this.d.c(), z);
            pkc0Var.k = 1;
            objB = ((w4c0) ((rta0) this.f30641a.f43005a).invoke()).b(strA, n390Var, pkc0Var);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objB);
        }
        q390 q390Var = (q390) ((u2t) objB).a();
        Long l = q390Var.f28041a;
        long jLongValue = l != null ? l.longValue() : 0L;
        Long l2 = q390Var.d;
        if (l2 == null) {
            jf4.k(null);
            return null;
        }
        long jLongValue2 = l2.longValue();
        Double d = q390Var.e;
        double dDoubleValue = d != null ? d.doubleValue() : 0.0d;
        Integer num = q390Var.b;
        int iIntValue = num != null ? num.intValue() : 0;
        Integer num2 = q390Var.c;
        return new k390(jLongValue, jLongValue2, dDoubleValue, iIntValue, num2 != null ? num2.intValue() : 0);
    }
}
