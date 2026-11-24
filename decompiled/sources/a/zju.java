package a;

/* JADX INFO: loaded from: classes3.dex */
public final class zju {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0u f44497a;
    public final pbt b;

    public zju(m0u m0uVar, pbt pbtVar) {
        m0uVar.getClass();
        this.f44497a = m0uVar;
        this.b = pbtVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(zje zjeVar) {
        yju yjuVar;
        if (zjeVar instanceof yju) {
            yjuVar = (yju) zjeVar;
            int i = yjuVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                yjuVar.k = i - Integer.MIN_VALUE;
            } else {
                yjuVar = new yju(this, zjeVar);
            }
        } else {
            yjuVar = new yju(this, zjeVar);
        }
        Object objC = yjuVar.i;
        wne wneVar = wne.f39444a;
        int i2 = yjuVar.k;
        if (i2 == 0) {
            z1x.P(objC);
            ql5 ql5Var = this.b.f26724a.q;
            long j = ql5Var != null ? ql5Var.e : 0L;
            yjuVar.k = 1;
            objC = this.f44497a.f20973a.c(j, yjuVar);
            if (objC == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objC);
        }
        return new Integer(((xuf) objC).j == 2 ? 3 : 2);
    }
}
