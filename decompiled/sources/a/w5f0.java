package a;

/* JADX INFO: loaded from: classes5.dex */
public final class w5f0 extends zje {
    public x5f0 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ x5f0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w5f0(x5f0 x5f0Var, zje zjeVar) {
        super(zjeVar);
        this.k = x5f0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.g0(null, null, 0, false, false, this);
    }
}
