package a;

/* JADX INFO: loaded from: classes.dex */
public final class dk50 extends zje {
    public long i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ek50 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dk50(ek50 ek50Var, zje zjeVar) {
        super(zjeVar);
        this.k = ek50Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.I0(0L, this);
    }
}
