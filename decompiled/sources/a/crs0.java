package a;

/* JADX INFO: loaded from: classes.dex */
public final class crs0 extends zje {
    public iva0 i;
    public String j;
    public String[] k;
    public int l;
    public int m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ jrs0 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crs0(jrs0 jrs0Var, zje zjeVar) {
        super(zjeVar);
        this.p = jrs0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.j(null, 0, this);
    }
}
