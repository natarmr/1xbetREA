package a;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class yyj0 implements vne, jbi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vne f43470a;
    public final q99 b;

    public yyj0(vne vneVar, q99 q99Var) {
        vneVar.getClass();
        this.f43470a = vneVar;
        this.b = q99Var;
    }

    @Override // a.jbi0
    public final void c(Function1 function1) {
        this.b.c(function1);
    }

    @Override // a.jbi0
    public final Object f(Object obj) {
        return this.b.f(obj);
    }

    @Override // a.vne
    public final CoroutineContext getCoroutineContext() {
        return this.f43470a.getCoroutineContext();
    }

    @Override // a.jbi0
    public final Object m(yje yjeVar, Object obj) {
        return this.b.m(yjeVar, obj);
    }
}
