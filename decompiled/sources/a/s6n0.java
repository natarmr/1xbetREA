package a;

import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class s6n0 implements noj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final noj0 f31713a;
    public final Function2 b;

    public s6n0(noj0 noj0Var, Function2 function2) {
        this.f31713a = noj0Var;
        this.b = function2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        r6n0 r6n0Var;
        if (yjeVar instanceof r6n0) {
            r6n0Var = (r6n0) yjeVar;
            int i = r6n0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                r6n0Var.k = i - Integer.MIN_VALUE;
            } else {
                r6n0Var = new r6n0(this, yjeVar);
            }
        } else {
            r6n0Var = new r6n0(this, yjeVar);
        }
        Object obj = r6n0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = r6n0Var.k;
        if (i2 == 0) {
            z1x.P(obj);
            q6n0 q6n0Var = new q6n0(kmqVar, this.b);
            r6n0Var.k = 1;
            if (this.f31713a.c(q6n0Var, r6n0Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        csj.b();
        return null;
    }

    @Override // a.noj0
    public final List d() {
        return this.f31713a.d();
    }
}
