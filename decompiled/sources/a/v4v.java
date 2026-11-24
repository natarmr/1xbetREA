package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class v4v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ali f36800a;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(zje zjeVar) {
        rp00 rp00Var;
        if (zjeVar instanceof rp00) {
            rp00Var = (rp00) zjeVar;
            int i = rp00Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                rp00Var.k = i - Integer.MIN_VALUE;
            } else {
                rp00Var = new rp00(this, zjeVar);
            }
        } else {
            rp00Var = new rp00(this, zjeVar);
        }
        Object objU = rp00Var.i;
        wne wneVar = wne.f39444a;
        int i2 = rp00Var.k;
        ali aliVar = this.f36800a;
        if (i2 == 0) {
            z1x.P(objU);
            rp00Var.k = 1;
            objU = aliVar.u(rp00Var);
            if (objU == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objU);
        }
        y6j y6jVar = (y6j) objU;
        y6jVar.getClass();
        yzi yziVar = (yzi) aliVar.b;
        yziVar.getClass();
        yziVar.b.g(y6jVar);
        return Unit.f46060a;
    }
}
