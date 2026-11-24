package a;

/* JADX INFO: loaded from: classes4.dex */
public final class ojb0 extends zje {
    public long i;
    public long j;
    public long k;
    public boolean l;
    public /* synthetic */ Object m;
    public final /* synthetic */ tjb0 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ojb0(tjb0 tjb0Var, zje zjeVar) {
        super(zjeVar);
        this.n = tjb0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.k(0L, 0L, 0L, this, false);
    }
}
