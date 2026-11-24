package a;

/* JADX INFO: loaded from: classes3.dex */
public final class pk0 extends zje {
    public mlr i;
    public String j;
    public boolean k;
    public boolean l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ kb0 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pk0(kb0 kb0Var, zje zjeVar) {
        super(zjeVar);
        this.o = kb0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.x(null, false, 0, null, false, null, this);
    }
}
