package a;

/* JADX INFO: loaded from: classes3.dex */
public final class cn0 extends zje {
    public long i;
    public String j;
    public String k;
    public dn0 l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public boolean q;
    public boolean r;
    public /* synthetic */ Object s;
    public final /* synthetic */ dn0 t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cn0(dn0 dn0Var, zje zjeVar) {
        super(zjeVar);
        this.t = dn0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.r(0L, null, 0, null, false, false, false, this);
    }
}
