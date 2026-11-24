package a;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class gnk implements ks40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gnk f11592a = new gnk();

    @Override // a.ks40
    public final float d() {
        return 0.0f;
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
