package a;

/* JADX INFO: loaded from: classes.dex */
public final class cl80 implements qkq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final afk0 f4544a;
    public final xk80 b;

    public cl80(afk0 afk0Var, xk80 xk80Var) {
        this.f4544a = afk0Var;
        this.b = xk80Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // a.qkq
    public final Object a(qah0 qah0Var, float f, zje zjeVar) {
        bl80 bl80Var;
        if (zjeVar instanceof bl80) {
            bl80Var = (bl80) zjeVar;
            int i = bl80Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                bl80Var.k = i - Integer.MIN_VALUE;
            } else {
                bl80Var = new bl80(this, zjeVar);
            }
        } else {
            bl80Var = new bl80(this, zjeVar);
        }
        Object objC = bl80Var.i;
        wne wneVar = wne.f39444a;
        int i2 = bl80Var.k;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(objC);
            cd60 cd60Var = new cd60(this, qah0Var);
            bl80Var.k = 1;
            objC = this.f4544a.c(qah0Var, f, cd60Var, bl80Var);
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
        float fFloatValue = ((Number) objC).floatValue();
        xk80 xk80Var = this.b;
        if (xk80Var.l() != 0.0f && Math.abs(xk80Var.l()) < 0.001d) {
            int iK = xk80Var.k();
            if (xk80Var.k.a()) {
                qjj.W(((pk80) ((hgk0) xk80Var.m).getValue()).s, null, null, new si60(xk80Var, yjeVar, (byte) 4), 3);
            }
            xk80Var.w(0.0f, iK, false);
        } else {
            new Float(xk80Var.l());
        }
        return new Float(fFloatValue);
    }
}
