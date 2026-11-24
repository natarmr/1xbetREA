package a;

/* JADX INFO: loaded from: classes3.dex */
public final class h4s0 extends zje {
    public long i;
    public z1s0 j;
    public String k;
    public /* synthetic */ Object l;
    public final /* synthetic */ k4s0 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4s0(k4s0 k4s0Var, zje zjeVar) {
        super(zjeVar);
        this.m = k4s0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.N(0L, null, null, this);
    }
}
