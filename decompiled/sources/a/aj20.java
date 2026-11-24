package a;

/* JADX INFO: loaded from: classes.dex */
public final class aj20 extends zje {
    public double i;
    public double j;
    public double k;
    public cl5 l;
    public boolean m;
    public /* synthetic */ Object n;
    public final /* synthetic */ on20 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj20(on20 on20Var, zje zjeVar) {
        super(zjeVar);
        this.o = on20Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.Q(0.0d, 0.0d, this);
    }
}
