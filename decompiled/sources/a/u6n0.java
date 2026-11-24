package a;

import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class u6n0 implements n7m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n7m0 f35145a;
    public final Function2 b;

    public u6n0(p7m0 p7m0Var, Function2 function2) {
        this.f35145a = p7m0Var;
        this.b = function2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        t6n0 t6n0Var;
        if (yjeVar instanceof t6n0) {
            t6n0Var = (t6n0) yjeVar;
            int i = t6n0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                t6n0Var.k = i - Integer.MIN_VALUE;
            } else {
                t6n0Var = new t6n0(this, yjeVar);
            }
        } else {
            t6n0Var = new t6n0(this, yjeVar);
        }
        Object obj = t6n0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = t6n0Var.k;
        if (i2 == 0) {
            z1x.P(obj);
            q6n0 q6n0Var = new q6n0(kmqVar, this.b);
            t6n0Var.k = 1;
            if (this.f35145a.c(q6n0Var, t6n0Var) == wneVar) {
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
        return this.f35145a.d();
    }

    @Override // a.n7m0
    public final Object getValue() {
        return this.f35145a.getValue();
    }
}
