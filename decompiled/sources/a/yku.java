package a;

/* JADX INFO: loaded from: classes3.dex */
public final class yku {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pmi f42808a;
    public final gst0 b;

    public yku(pmi pmiVar, gst0 gst0Var) {
        this.f42808a = pmiVar;
        this.b = gst0Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(long j, zje zjeVar, Long l) throws Throwable {
        xku xkuVar;
        double d;
        if (zjeVar instanceof xku) {
            xkuVar = (xku) zjeVar;
            int i = xkuVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                xkuVar.k = i - Integer.MIN_VALUE;
            } else {
                xkuVar = new xku(this, zjeVar);
            }
        } else {
            xkuVar = new xku(this, zjeVar);
        }
        xku xkuVar2 = xkuVar;
        Object objS = xkuVar2.i;
        wne wneVar = wne.f39444a;
        int i2 = xkuVar2.k;
        if (i2 == 0) {
            z1x.P(objS);
            pmi pmiVar = this.f42808a;
            if (l != null) {
                long jLongValue = l.longValue();
                long j2 = this.b.f11847a.a().f18785a;
                xkuVar2.k = 1;
                objS = pmiVar.s(jLongValue, j, j2, xkuVar2);
                if (objS == wneVar) {
                    return wneVar;
                }
            } else {
                d = ((j5t) pmiVar.e).k.b;
            }
            return new Double(d);
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(objS);
        d = ((dqr) objS).b;
        return new Double(d);
    }
}
