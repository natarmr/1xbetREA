package a;

/* JADX INFO: loaded from: classes.dex */
public final class oj20 extends zje {
    public long i;
    public double j;
    public boolean k;
    public boolean l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ on20 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oj20(on20 on20Var, zje zjeVar) {
        super(zjeVar);
        this.o = on20Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.X(0.0d, 0L, null, this, null, null, false, false);
    }
}
