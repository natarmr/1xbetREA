package a;

import android.view.Choreographer;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class t23 implements qq40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Choreographer f33197a;
    public final r23 b;

    public t23(Choreographer choreographer, r23 r23Var) {
        this.f33197a = choreographer;
        this.b = r23Var;
    }

    @Override // a.qq40
    public final Object e(Function1 function1, yje yjeVar) {
        r23 r23Var = this.b;
        n5a n5aVar = new n5a(1, pnx.b(yjeVar));
        n5aVar.r();
        s23 s23Var = new s23(n5aVar, this, function1);
        if (Intrinsics.d(r23Var.c, this.f33197a)) {
            synchronized (r23Var.e) {
                r23Var.g.add(s23Var);
                if (!r23Var.j) {
                    r23Var.j = true;
                    r23Var.c.postFrameCallback(r23Var.k);
                }
            }
            n5aVar.t(new ci2(r23Var, s23Var, (byte) 12));
        } else {
            this.f33197a.postFrameCallback(s23Var);
            n5aVar.t(new ci2(this, s23Var, (byte) 13));
        }
        Object objP = n5aVar.p();
        wne wneVar = wne.f39444a;
        return objP;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(kotlin.coroutines.f fVar) {
        return kotlin.coroutines.e.a(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(kotlin.coroutines.f fVar) {
        return kotlin.coroutines.e.b(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return kotlin.coroutines.e.c(this, coroutineContext);
    }
}
