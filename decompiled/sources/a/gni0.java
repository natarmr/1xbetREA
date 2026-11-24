package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class gni0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fq f11589a;
    public final pbt b;

    public gni0(fq fqVar, pbt pbtVar) {
        fqVar.getClass();
        this.f11589a = fqVar;
        this.b = pbtVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(w05 w05Var, zje zjeVar) {
        fni0 fni0Var;
        if (zjeVar instanceof fni0) {
            fni0Var = (fni0) zjeVar;
            int i = fni0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                fni0Var.k = i - Integer.MIN_VALUE;
            } else {
                fni0Var = new fni0(this, zjeVar);
            }
        } else {
            fni0Var = new fni0(this, zjeVar);
        }
        Object obj = fni0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = fni0Var.k;
        if (i2 == 0) {
            z1x.P(obj);
            this.b.v(w05Var);
            ele eleVar = new ele(w05Var);
            fni0Var.k = 1;
            if (this.f11589a.f(eleVar, fni0Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }
}
