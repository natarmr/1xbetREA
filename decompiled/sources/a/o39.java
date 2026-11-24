package a;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class o39 implements qq40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final age0 f24571a;
    public final gr00 b = new gr00();

    public o39(age0 age0Var) {
        this.f24571a = age0Var;
    }

    @Override // a.qq40
    public final Object e(Function1 function1, yje yjeVar) {
        n5a n5aVar = new n5a(1, pnx.b(yjeVar));
        n5aVar.r();
        n39 n39Var = new n39();
        n39Var.f22839a = n5aVar;
        n39Var.b = function1;
        n5aVar.t(new w0(this.b.f(n39Var, this.f24571a), (byte) 9));
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
