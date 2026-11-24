package a;

/* JADX INFO: loaded from: classes.dex */
public final class ers0 extends zje {
    public iva0 i;
    public String j;
    public String[] k;
    public int l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ jrs0 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ers0(jrs0 jrs0Var, zje zjeVar) {
        super(zjeVar);
        this.o = jrs0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.k(null, 0, this);
    }
}
