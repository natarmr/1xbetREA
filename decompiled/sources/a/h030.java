package a;

/* JADX INFO: loaded from: classes6.dex */
public final class h030 extends zje {
    public boolean i;
    public boolean j;
    public hao k;
    public Object l;
    public m97 m;
    public cit0 n;
    public m97 o;
    public zh7 p;
    public double q;
    public /* synthetic */ Object r;
    public final /* synthetic */ o030 s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h030(o030 o030Var, zje zjeVar) {
        super(zjeVar);
        this.s = o030Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.o(false, this);
    }
}
