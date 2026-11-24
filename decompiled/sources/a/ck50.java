package a;

/* JADX INFO: loaded from: classes.dex */
public final class ck50 extends zje {
    public long i;
    public long j;
    public /* synthetic */ Object k;
    public final /* synthetic */ ek50 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ck50(ek50 ek50Var, zje zjeVar) {
        super(zjeVar);
        this.l = ek50Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.g(0L, 0L, this);
    }
}
