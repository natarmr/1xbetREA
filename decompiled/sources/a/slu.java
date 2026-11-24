package a;

/* JADX INFO: loaded from: classes3.dex */
public final class slu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pmi f32416a;
    public final gst0 b;

    public slu(pmi pmiVar, gst0 gst0Var) {
        this.f32416a = pmiVar;
        this.b = gst0Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(long j, zje zjeVar, Long l) throws Throwable {
        rlu rluVar;
        double d;
        if (zjeVar instanceof rlu) {
            rluVar = (rlu) zjeVar;
            int i = rluVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                rluVar.k = i - Integer.MIN_VALUE;
            } else {
                rluVar = new rlu(this, zjeVar);
            }
        } else {
            rluVar = new rlu(this, zjeVar);
        }
        rlu rluVar2 = rluVar;
        Object objS = rluVar2.i;
        wne wneVar = wne.f39444a;
        int i2 = rluVar2.k;
        if (i2 == 0) {
            z1x.P(objS);
            pmi pmiVar = this.f32416a;
            if (l != null) {
                long jLongValue = l.longValue();
                long j2 = this.b.f11847a.a().f18785a;
                rluVar2.k = 1;
                objS = pmiVar.s(jLongValue, j, j2, rluVar2);
                if (objS == wneVar) {
                    return wneVar;
                }
            } else {
                d = ((j5t) pmiVar.e).k.f6530a;
            }
            return new Double(d);
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(objS);
        d = ((dqr) objS).f6530a;
        return new Double(d);
    }
}
