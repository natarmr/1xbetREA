package a;

/* JADX INFO: loaded from: classes.dex */
public final class jnd0 extends zje {
    public long i;
    public double j;
    public double k;
    public boolean l;
    public /* synthetic */ Object m;
    public final /* synthetic */ pv00 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jnd0(pv00 pv00Var, zje zjeVar) {
        super(zjeVar);
        this.n = pv00Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.i(0L, 0.0d, 0.0d, false, this);
    }
}
