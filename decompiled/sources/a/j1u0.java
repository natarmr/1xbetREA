package a;

/* JADX INFO: loaded from: classes4.dex */
public final class j1u0 extends zje {
    public String i;
    public String j;
    public String k;
    public Throwable l;
    public long m;
    public long n;
    public int o;
    public int p;
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ k1u0 s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1u0(k1u0 k1u0Var, zje zjeVar) {
        super(zjeVar);
        this.s = k1u0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.a(null, null, null, this);
    }
}
