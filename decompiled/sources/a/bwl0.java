package a;

/* JADX INFO: loaded from: classes5.dex */
public final class bwl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pmi0 f3331a;
    public final knf0 b;
    public final mne c;

    public bwl0(pmi0 pmi0Var, knf0 knf0Var, mne mneVar) {
        knf0Var.getClass();
        this.f3331a = pmi0Var;
        this.b = knf0Var;
        this.c = mneVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object a(long j, long j2, zje zjeVar) {
        awl0 awl0Var;
        Object g0g0Var;
        if (zjeVar instanceof awl0) {
            awl0Var = (awl0) zjeVar;
            int i = awl0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                awl0Var.k = i - Integer.MIN_VALUE;
            } else {
                awl0Var = new awl0(this, zjeVar);
            }
        } else {
            awl0Var = new awl0(this, zjeVar);
        }
        awl0 awl0Var2 = awl0Var;
        Object objD0 = awl0Var2.i;
        wne wneVar = wne.f39444a;
        int i2 = awl0Var2.k;
        try {
            if (i2 == 0) {
                z1x.P(objD0);
                e0g0 e0g0Var = j0g0.b;
                dvj dvjVar = this.c.b;
                tr trVar = new tr(this, j, j2, null, (byte) 14);
                awl0Var2.k = 1;
                objD0 = qjj.d0(dvjVar, trVar, awl0Var2);
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
            g0g0Var = (zvl0) objD0;
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        if (g0g0Var instanceof g0g0) {
            return null;
        }
        return g0g0Var;
    }
}
