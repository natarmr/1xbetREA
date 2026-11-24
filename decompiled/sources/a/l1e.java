package a;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class l1e implements CoroutineContext.Element {
    public static final nwd b = new nwd();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yva0 f19248a;

    public l1e(yva0 yva0Var) {
        yva0Var.getClass();
        this.f19248a = yva0Var;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(kotlin.coroutines.f fVar) {
        return kotlin.coroutines.e.a(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final kotlin.coroutines.f getKey() {
        return b;
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
