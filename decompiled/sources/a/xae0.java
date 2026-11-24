package a;

import java.util.List;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes2.dex */
public final class xae0 implements n7m0, p5a, afr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n7m0 f40549a;
    private final bby job;

    public xae0(qz40 qz40Var, bby bbyVar) {
        this.f40549a = qz40Var;
        this.job = bbyVar;
    }

    @Override // a.afr
    public final gmq b(CoroutineContext coroutineContext, int i, i99 i99Var) {
        return (((i < 0 || i >= 2) && i != -2) || i99Var != i99.b) ? roj0.c(this, coroutineContext, i, i99Var) : this;
    }

    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        return this.f40549a.c(kmqVar, yjeVar);
    }

    @Override // a.noj0
    public final List d() {
        return this.f40549a.d();
    }

    @Override // a.n7m0
    public final Object getValue() {
        return this.f40549a.getValue();
    }
}
