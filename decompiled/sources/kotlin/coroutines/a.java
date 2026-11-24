package kotlin.coroutines;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements CoroutineContext.Element {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f46062a;

    public a(f fVar) {
        fVar.getClass();
        this.f46062a = fVar;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public /* bridge */ CoroutineContext.Element get(f fVar) {
        return e.a(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final f getKey() {
        return this.f46062a;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public /* bridge */ CoroutineContext minusKey(f fVar) {
        return e.b(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final /* bridge */ CoroutineContext plus(CoroutineContext coroutineContext) {
        return e.c(this, coroutineContext);
    }
}
