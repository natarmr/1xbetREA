package a;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes2.dex */
public final class utb extends qtb {
    public final xdr e;

    public utb(xdr xdrVar, gmq gmqVar, CoroutineContext coroutineContext, int i, i99 i99Var) {
        super(gmqVar, coroutineContext, i, i99Var);
        this.e = xdrVar;
    }

    @Override // a.ktb
    public final ktb j(CoroutineContext coroutineContext, int i, i99 i99Var) {
        return new utb(this.e, this.d, coroutineContext, i, i99Var);
    }

    @Override // a.qtb
    public final Object m(kmq kmqVar, yje yjeVar) {
        Object objJ = d5c.J(yjeVar, new stb(this, kmqVar, null));
        return objJ == wne.f39444a ? objJ : Unit.f46060a;
    }
}
