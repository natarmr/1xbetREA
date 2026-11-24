package a;

/* JADX INFO: loaded from: classes6.dex */
public final class b8w0 extends zje {
    public String i;
    public Object[] j;
    public String k;
    public Object[] l;
    public Object[] m;
    public Object[] n;
    public /* synthetic */ Object o;
    public final /* synthetic */ h0q0 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b8w0(h0q0 h0q0Var, zje zjeVar) {
        super(zjeVar);
        this.p = h0q0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.e(this);
    }
}
