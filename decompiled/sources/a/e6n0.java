package a;

/* JADX INFO: loaded from: classes2.dex */
public final class e6n0 extends zje {
    public long i;
    public /* synthetic */ Object j;
    public final /* synthetic */ n660 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6n0(n660 n660Var, zje zjeVar) {
        super(zjeVar);
        this.k = n660Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.x(0L, null, this);
    }
}
