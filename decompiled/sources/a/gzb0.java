package a;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes.dex */
public final class gzb0 implements pz40, vne {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pz40 f12174a;
    public final CoroutineContext b;

    public gzb0(pz40 pz40Var, CoroutineContext coroutineContext) {
        this.f12174a = pz40Var;
        this.b = coroutineContext;
    }

    @Override // a.vne
    public final CoroutineContext getCoroutineContext() {
        return this.b;
    }

    @Override // a.l7m0
    public final Object getValue() {
        return this.f12174a.getValue();
    }

    @Override // a.pz40
    public final void setValue(Object obj) {
        this.f12174a.setValue(obj);
    }
}
