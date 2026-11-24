package a;

import java.util.List;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes2.dex */
public final class vae0 implements noj0, p5a, afr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ noj0 f37082a;
    private final bby job;

    public vae0(mz40 mz40Var, bby bbyVar) {
        this.f37082a = mz40Var;
        this.job = bbyVar;
    }

    @Override // a.afr
    public final gmq b(CoroutineContext coroutineContext, int i, i99 i99Var) {
        return roj0.c(this, coroutineContext, i, i99Var);
    }

    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        return this.f37082a.c(kmqVar, yjeVar);
    }

    @Override // a.noj0
    public final List d() {
        return this.f37082a.d();
    }
}
