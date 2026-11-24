package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class vsg0 implements gmq, p5a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function2 f37949a;

    public vsg0(Function2 function2) {
        this.f37949a = function2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) throws Throwable {
        d2 d2Var;
        qsg0 qsg0Var;
        if (yjeVar instanceof d2) {
            d2Var = (d2) yjeVar;
            int i = d2Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                d2Var.l = i - Integer.MIN_VALUE;
            } else {
                d2Var = new d2(this, yjeVar);
            }
        } else {
            d2Var = new d2(this, yjeVar);
        }
        Object obj = d2Var.j;
        wne wneVar = wne.f39444a;
        int i2 = d2Var.l;
        if (i2 != 0) {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qsg0Var = d2Var.i;
            try {
                z1x.P(obj);
                qsg0Var.releaseIntercepted();
                return Unit.f46060a;
            } catch (Throwable th) {
                th = th;
                qsg0Var.releaseIntercepted();
                throw th;
            }
        }
        z1x.P(obj);
        qsg0 qsg0Var2 = new qsg0(kmqVar, d2Var.getContext());
        try {
            d2Var.i = qsg0Var2;
            d2Var.l = 1;
            try {
                Object objInvoke = this.f37949a.invoke(qsg0Var2, d2Var);
                if (objInvoke != wneVar) {
                    objInvoke = Unit.f46060a;
                }
                if (objInvoke == wneVar) {
                    return wneVar;
                }
                qsg0Var = qsg0Var2;
                qsg0Var.releaseIntercepted();
                return Unit.f46060a;
            } catch (Throwable th2) {
                th = th2;
                qsg0Var = qsg0Var2;
                qsg0Var.releaseIntercepted();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
