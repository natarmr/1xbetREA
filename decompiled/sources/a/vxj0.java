package a;

/* JADX INFO: loaded from: classes5.dex */
public final class vxj0 extends zje {
    public oa20 i;
    public String j;
    public String k;
    public double l;
    public double m;
    public /* synthetic */ Object n;
    public final /* synthetic */ xxj0 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vxj0(xxj0 xxj0Var, zje zjeVar) {
        super(zjeVar);
        this.o = xxj0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.S(null, this);
    }
}
