package a;

/* JADX INFO: loaded from: classes3.dex */
public final class qs6 extends zje {
    public double i;
    public double j;
    public String k;
    public un6 l;
    public /* synthetic */ Object m;
    public final /* synthetic */ dt6 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qs6(dt6 dt6Var, zje zjeVar) {
        super(zjeVar);
        this.n = dt6Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.N(0.0d, 0.0d, null, null, this);
    }
}
