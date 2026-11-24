package a;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes6.dex */
public final class xul0 implements yje, xne {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mtb f41517a;
    public final CoroutineContext b;

    public xul0(mtb mtbVar, CoroutineContext coroutineContext) {
        this.f41517a = mtbVar;
        this.b = coroutineContext;
    }

    @Override // a.xne
    public final xne getCallerFrame() {
        return this.f41517a;
    }

    @Override // a.yje
    public final CoroutineContext getContext() {
        return this.b;
    }

    @Override // a.yje
    public final void resumeWith(Object obj) {
        this.f41517a.resumeWith(obj);
    }
}
