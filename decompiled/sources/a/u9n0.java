package a;

/* JADX INFO: loaded from: classes4.dex */
public final class u9n0 extends zje {
    public boolean i;
    public long j;
    public long k;
    public long l;
    public p7m0 m;
    public k050 n;
    public /* synthetic */ Object o;
    public final /* synthetic */ y9n0 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u9n0(y9n0 y9n0Var, zje zjeVar) {
        super(zjeVar);
        this.p = y9n0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.a(0L, this, false);
    }
}
