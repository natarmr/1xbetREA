package a;

/* JADX INFO: loaded from: classes3.dex */
public final class t0u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wsf0 f33138a;
    public final pbt b;

    public t0u(pbt pbtVar, wsf0 wsf0Var) {
        this.f33138a = wsf0Var;
        this.b = pbtVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(yje yjeVar) throws Exception {
        s0u s0uVar;
        String str;
        if (yjeVar instanceof s0u) {
            s0uVar = (s0u) yjeVar;
            int i = s0uVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                s0uVar.k = i - Integer.MIN_VALUE;
            } else {
                s0uVar = new s0u(this, yjeVar);
            }
        } else {
            s0uVar = new s0u(this, yjeVar);
        }
        Object objA = s0uVar.i;
        Object obj = wne.f39444a;
        int i2 = s0uVar.k;
        wsf0 wsf0Var = this.f33138a;
        if (i2 == 0) {
            z1x.P(objA);
            ql5 ql5Var = this.b.f26724a.q;
            if (ql5Var == null || (str = ql5Var.f) == null) {
                str = "";
            }
            if (str.length() != 0) {
                return str;
            }
            khf0 khf0VarG = ((g45) wsf0Var.b).G();
            bm5 bm5Var = bm5.d;
            s0uVar.k = 1;
            objA = khf0VarG.A(bm5Var, tl5.c, s0uVar);
            if (objA == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        ql5 ql5Var2 = (ql5) objA;
        wsf0Var.s().l(bm5.d, ql5Var2);
        return ql5Var2.f;
    }
}
