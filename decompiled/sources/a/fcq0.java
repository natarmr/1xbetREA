package a;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class fcq0 implements dcq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f9323a;
    public final ThreadLocal b;
    public final hcq0 c;

    public fcq0(Object obj, ThreadLocal threadLocal) {
        this.f9323a = obj;
        this.b = threadLocal;
        this.c = new hcq0(threadLocal);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(kotlin.coroutines.f fVar) {
        if (this.c.equals(fVar)) {
            return this;
        }
        return null;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final kotlin.coroutines.f getKey() {
        return this.c;
    }

    @Override // a.dcq0
    public final void k(Object obj) {
        this.b.set(obj);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(kotlin.coroutines.f fVar) {
        return this.c.equals(fVar) ? kotlin.coroutines.g.f46065a : this;
    }

    @Override // a.dcq0
    public final Object n() {
        ThreadLocal threadLocal = this.b;
        Object obj = threadLocal.get();
        threadLocal.set(this.f9323a);
        return obj;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return kotlin.coroutines.e.c(this, coroutineContext);
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.f9323a + ", threadLocal = " + this.b + ')';
    }
}
