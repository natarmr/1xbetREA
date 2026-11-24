package a;

/* JADX INFO: loaded from: classes6.dex */
public final class nd70 extends zje {
    public ql5 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ xd70 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nd70(xd70 xd70Var, zje zjeVar) {
        super(zjeVar);
        this.k = xd70Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.d0(null, this);
    }
}
