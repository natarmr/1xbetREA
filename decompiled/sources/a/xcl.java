package a;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class xcl implements CoroutineContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CoroutineContext f40650a;
    public final Throwable b;

    public xcl(Throwable th, CoroutineContext coroutineContext) {
        this.f40650a = coroutineContext;
        this.b = th;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return this.f40650a.fold(obj, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(kotlin.coroutines.f fVar) {
        return this.f40650a.get(fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(kotlin.coroutines.f fVar) {
        return this.f40650a.minusKey(fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return this.f40650a.plus(coroutineContext);
    }
}
