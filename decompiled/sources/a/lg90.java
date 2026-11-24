package a;

/* JADX INFO: loaded from: classes6.dex */
public final class lg90 implements qkq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mg90 f19997a;
    public final /* synthetic */ qkq b;

    public lg90(mg90 mg90Var, iuj iujVar) {
        this.f19997a = mg90Var;
        this.b = iujVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // a.qkq
    public final Object a(qah0 qah0Var, float f, zje zjeVar) {
        kg90 kg90Var;
        if (zjeVar instanceof kg90) {
            kg90Var = (kg90) zjeVar;
            int i = kg90Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                kg90Var.k = i - Integer.MIN_VALUE;
            } else {
                kg90Var = new kg90(this, zjeVar);
            }
        } else {
            kg90Var = new kg90(this, zjeVar);
        }
        Object objA = kg90Var.i;
        wne wneVar = wne.f39444a;
        int i2 = kg90Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            if (!this.f19997a.f21731a) {
                kg90Var.k = 1;
                objA = this.b.a(qah0Var, f, kg90Var);
                if (objA == wneVar) {
                    return wneVar;
                }
            }
            return new Float(f);
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(objA);
        f = ((Number) objA).floatValue();
        return new Float(f);
    }
}
