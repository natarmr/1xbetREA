package a;

/* JADX INFO: loaded from: classes3.dex */
public final class xn10 extends zje {
    public long i;
    public csr j;
    public a570 k;
    public String l;
    public lz60 m;
    public boolean n;
    public /* synthetic */ Object o;
    public final /* synthetic */ bo10 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xn10(bo10 bo10Var, zje zjeVar) {
        super(zjeVar);
        this.p = bo10Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.F(0L, null, false, this);
    }
}
