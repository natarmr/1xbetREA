package a;

/* JADX INFO: loaded from: classes3.dex */
public final class vwg0 extends zje {
    public double i;
    public double j;
    public double k;
    public long l;
    public /* synthetic */ Object m;
    public final /* synthetic */ cxg0 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vwg0(cxg0 cxg0Var, zje zjeVar) {
        super(zjeVar);
        this.n = cxg0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.E(null, 0.0d, 0.0d, 0.0d, 0L, this);
    }
}
