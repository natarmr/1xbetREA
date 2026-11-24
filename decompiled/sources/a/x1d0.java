package a;

/* JADX INFO: loaded from: classes5.dex */
public final class x1d0 extends zje {
    public boolean i;
    public /* synthetic */ Object j;
    public final /* synthetic */ y1d0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1d0(y1d0 y1d0Var, zje zjeVar) {
        super(zjeVar);
        this.k = y1d0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.b(0L, this, false);
    }
}
