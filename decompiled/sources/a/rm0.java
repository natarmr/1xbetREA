package a;

/* JADX INFO: loaded from: classes3.dex */
public final class rm0 extends zje {
    public Integer i;
    public Long j;
    public String k;
    public String l;
    public dn0 m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public boolean r;
    public boolean s;
    public /* synthetic */ Object t;
    public final /* synthetic */ dn0 u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rm0(dn0 dn0Var, zje zjeVar) {
        super(zjeVar);
        this.u = dn0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.i(null, null, null, 0, null, false, false, false, this);
    }
}
