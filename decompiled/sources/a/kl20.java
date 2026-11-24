package a;

/* JADX INFO: loaded from: classes5.dex */
public final class kl20 extends zje {
    public boolean i;
    public long j;
    public long k;
    public int l;
    public String m;
    public /* synthetic */ Object n;
    public final /* synthetic */ nn20 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kl20(nn20 nn20Var, zje zjeVar) {
        super(zjeVar);
        this.o = nn20Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.u0(0, 0L, 0L, this, false);
    }
}
