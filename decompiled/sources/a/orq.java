package a;

/* JADX INFO: loaded from: classes.dex */
public final class orq implements mrq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hz2 f25747a;
    public final iz2 b;
    public final trm0 c;
    public final srq d;
    public final pv00 e;
    public final g7p f;

    public orq(hz2 hz2Var, iz2 iz2Var) {
        trm0 trm0Var = prq.f27477a;
        srq srqVar = new srq(prq.b);
        pv00 pv00Var = new pv00((byte) 12);
        this.f25747a = hz2Var;
        this.b = iz2Var;
        this.c = trm0Var;
        this.d = srqVar;
        this.e = pv00Var;
        this.f = new g7p((Object) this, (byte) 10);
    }

    public final b1t0 a(y0t0 y0t0Var) {
        trm0 trm0Var = this.c;
        f5p f5pVar = new f5p(this, y0t0Var, (byte) 13);
        synchronized (((j6m0) trm0Var.b)) {
            b1t0 b1t0Var = (b1t0) ((dj10) trm0Var.c).c(y0t0Var);
            if (b1t0Var != null) {
                if (b1t0Var.a()) {
                    return b1t0Var;
                }
            }
            try {
                b1t0 b1t0Var2 = (b1t0) f5pVar.invoke(new xis0((Object) trm0Var, (Object) y0t0Var, (byte) 7));
                synchronized (((j6m0) trm0Var.b)) {
                    if (((dj10) trm0Var.c).c(y0t0Var) == null && b1t0Var2.a()) {
                        ((dj10) trm0Var.c).d(y0t0Var, b1t0Var2);
                    }
                }
                return b1t0Var2;
            } catch (Exception e) {
                hny.q("Could not load font", e);
                return null;
            }
        }
    }

    public final b1t0 b(nrq nrqVar, psq psqVar, int i, int i2) {
        int i3 = this.b.f15615a;
        return a(new y0t0(nrqVar, (i3 == 0 || i3 == Integer.MAX_VALUE) ? psqVar : new psq(l1e0.d(psqVar.f27526a + i3, 1, 1000)), i, i2, null));
    }
}
