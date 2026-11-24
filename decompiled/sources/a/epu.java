package a;

/* JADX INFO: loaded from: classes5.dex */
public final class epu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pru f8203a;
    public final rou b;

    public epu(pru pruVar, rou rouVar) {
        this.f8203a = pruVar;
        this.b = rouVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(zje zjeVar) {
        dpu dpuVar;
        if (zjeVar instanceof dpu) {
            dpuVar = (dpu) zjeVar;
            int i = dpuVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                dpuVar.k = i - Integer.MIN_VALUE;
            } else {
                dpuVar = new dpu(this, zjeVar);
            }
        } else {
            dpuVar = new dpu(this, zjeVar);
        }
        Object objA = dpuVar.i;
        wne wneVar = wne.f39444a;
        int i2 = dpuVar.k;
        boolean z = false;
        if (i2 == 0) {
            z1x.P(objA);
            dpuVar.k = 1;
            objA = this.b.a(false, dpuVar);
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
        m2c0 m2c0Var = (m2c0) objA;
        sff0 sff0VarA = this.f8203a.a();
        f61 f61Var = sff0VarA.b.f13233a;
        if ((f61Var.b || f61Var.f8987a) && sff0VarA.l.n && m2c0Var.o0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
