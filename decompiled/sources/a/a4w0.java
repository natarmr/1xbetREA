package a;

/* JADX INFO: loaded from: classes5.dex */
public final class a4w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w4p0 f243a;
    public final mne b;
    public o3w0 c;

    public a4w0(w4p0 w4p0Var, mne mneVar) {
        this.f243a = w4p0Var;
        this.b = mneVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(zje zjeVar) {
        z3w0 z3w0Var;
        Object g0g0Var;
        if (zjeVar instanceof z3w0) {
            z3w0Var = (z3w0) zjeVar;
            int i = z3w0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                z3w0Var.k = i - Integer.MIN_VALUE;
            } else {
                z3w0Var = new z3w0(this, zjeVar);
            }
        } else {
            z3w0Var = new z3w0(this, zjeVar);
        }
        Object objD0 = z3w0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = z3w0Var.k;
        yje yjeVar = null;
        try {
            if (i2 == 0) {
                z1x.P(objD0);
                e0g0 e0g0Var = j0g0.b;
                dvj dvjVar = this.b.b;
                n7t0 n7t0Var = new n7t0(this, this, yjeVar, (byte) 25);
                z3w0Var.k = 1;
                objD0 = qjj.d0(dvjVar, n7t0Var, z3w0Var);
                if (objD0 == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(objD0);
            }
            g0g0Var = (o3w0) objD0;
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        return j0g0.a(g0g0Var) == null ? g0g0Var : new o3w0(iun.f15405a);
    }
}
