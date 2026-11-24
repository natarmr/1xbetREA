package a;

/* JADX INFO: loaded from: classes5.dex */
public final class ins0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final epi0 f15089a;
    public final mne b;

    public ins0(epi0 epi0Var, mne mneVar) {
        this.f15089a = epi0Var;
        this.b = mneVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j, zje zjeVar) {
        hns0 hns0Var;
        if (zjeVar instanceof hns0) {
            hns0Var = (hns0) zjeVar;
            int i = hns0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                hns0Var.k = i - Integer.MIN_VALUE;
            } else {
                hns0Var = new hns0(this, zjeVar);
            }
        } else {
            hns0Var = new hns0(this, zjeVar);
        }
        Object objD0 = hns0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = hns0Var.k;
        try {
            if (i2 == 0) {
                z1x.P(objD0);
                e0g0 e0g0Var = j0g0.b;
                dvj dvjVar = this.b.b;
                wn10 wn10Var = new wn10(this, j, null, (byte) 20);
                hns0Var.k = 1;
                objD0 = qjj.d0(dvjVar, wn10Var, hns0Var);
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
            fns0 fns0Var = (fns0) objD0;
            e0g0 e0g0Var2 = j0g0.b;
            return fns0Var;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            return new g0g0(th);
        }
    }
}
