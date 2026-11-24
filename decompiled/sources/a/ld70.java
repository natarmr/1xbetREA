package a;

/* JADX INFO: loaded from: classes6.dex */
public final class ld70 extends zje {
    public csr i;
    public ql5 j;
    public int k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ xd70 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld70(xd70 xd70Var, zje zjeVar) {
        super(zjeVar);
        this.n = xd70Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.b0(null, null, this);
    }
}
