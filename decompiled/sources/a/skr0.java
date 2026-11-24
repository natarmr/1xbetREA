package a;

/* JADX INFO: loaded from: classes6.dex */
public final class skr0 extends zje {
    public long i;
    public long j;
    public int k;
    public int l;
    public int m;
    public Throwable n;
    public /* synthetic */ Object o;
    public final /* synthetic */ vkr0 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public skr0(vkr0 vkr0Var, zje zjeVar) {
        super(zjeVar);
        this.p = vkr0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.d(this);
    }
}
