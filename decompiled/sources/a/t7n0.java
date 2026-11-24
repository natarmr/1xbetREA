package a;

/* JADX INFO: loaded from: classes2.dex */
public final class t7n0 extends zje {
    public long i;
    public /* synthetic */ Object j;
    public final /* synthetic */ afm0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7n0(afm0 afm0Var, zje zjeVar) {
        super(zjeVar);
        this.k = afm0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.g(null, 0, 0, 0L, false, 0L, this);
    }
}
