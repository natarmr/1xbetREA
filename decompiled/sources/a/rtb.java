package a;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes2.dex */
public final class rtb extends qtb {
    public rtb(gmq gmqVar, CoroutineContext coroutineContext, int i, i99 i99Var, int i2) {
        super(gmqVar, (i2 & 2) != 0 ? kotlin.coroutines.g.f46065a : coroutineContext, (i2 & 4) != 0 ? -3 : i, (i2 & 8) != 0 ? i99.f14377a : i99Var);
    }

    @Override // a.ktb
    public final ktb j(CoroutineContext coroutineContext, int i, i99 i99Var) {
        return new rtb(this.d, coroutineContext, i, i99Var);
    }

    @Override // a.ktb
    public final gmq k() {
        return this.d;
    }
}
