package a;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class qjo implements nne {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pjo f28849a = pjo.b;

    public final boolean equals(Object obj) {
        return (obj instanceof qjo) || (obj instanceof pjo);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        pjo pjoVar = this.f28849a;
        pjoVar.getClass();
        return function2.invoke(obj, pjoVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(kotlin.coroutines.f fVar) {
        pjo pjoVar = this.f28849a;
        pjoVar.getClass();
        return kotlin.coroutines.e.a(pjoVar, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final kotlin.coroutines.f getKey() {
        return this.f28849a.f46062a;
    }

    public final int hashCode() {
        return pjo.b.hashCode();
    }

    @Override // a.nne
    public final void l(Throwable th, CoroutineContext coroutineContext) {
        this.f28849a.getClass();
        synchronized (pjo.c) {
        }
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(kotlin.coroutines.f fVar) {
        pjo pjoVar = this.f28849a;
        pjoVar.getClass();
        return kotlin.coroutines.e.b(pjoVar, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        pjo pjoVar = this.f28849a;
        pjoVar.getClass();
        return kotlin.coroutines.e.c(pjoVar, coroutineContext);
    }
}
