package a;

/* JADX INFO: loaded from: classes6.dex */
public final class h6v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h3v0 f12547a;
    public final scu b;
    public final ntu c;

    public h6v(h3v0 h3v0Var, scu scuVar, ntu ntuVar) {
        h3v0Var.getClass();
        this.f12547a = h3v0Var;
        this.b = scuVar;
        this.c = ntuVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(zje zjeVar) {
        g6v g6vVar;
        if (zjeVar instanceof g6v) {
            g6vVar = (g6v) zjeVar;
            int i = g6vVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                g6vVar.k = i - Integer.MIN_VALUE;
            } else {
                g6vVar = new g6v(this, zjeVar);
            }
        } else {
            g6vVar = new g6v(this, zjeVar);
        }
        Object objA = g6vVar.i;
        wne wneVar = wne.f39444a;
        int i2 = g6vVar.k;
        if (i2 == 0) {
            z1x.P(objA);
            String strA = this.c.a();
            long j = this.f12547a.b.f31523a;
            g6vVar.k = 1;
            objA = this.b.a(j, g6vVar, strA);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        return Boolean.valueOf(((pbv) objA).i);
    }
}
