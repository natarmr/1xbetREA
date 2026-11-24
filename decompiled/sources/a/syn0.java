package a;

/* JADX INFO: loaded from: classes6.dex */
public final class syn0 extends zje {
    public nw20 i;
    public long j;
    public long k;
    public /* synthetic */ Object l;
    public final /* synthetic */ zyn0 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public syn0(zyn0 zyn0Var, zje zjeVar) {
        super(zjeVar);
        this.m = zyn0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.W(null, this);
    }
}
