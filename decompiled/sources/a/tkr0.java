package a;

/* JADX INFO: loaded from: classes6.dex */
public final class tkr0 extends zje {
    public String i;
    public String j;
    public Throwable k;
    public int l;
    public int m;
    public int n;
    public int o;
    public long p;
    public long q;
    public /* synthetic */ Object r;
    public final /* synthetic */ vkr0 s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tkr0(vkr0 vkr0Var, zje zjeVar) {
        super(zjeVar);
        this.s = vkr0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.k(null, null, 0, this);
    }
}
