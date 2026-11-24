package a;

/* JADX INFO: loaded from: classes.dex */
public final class cn20 extends zje {
    public vf7 i;
    public ql5 j;
    public boolean k;
    public double l;
    public double m;
    public double n;
    public int o;
    public /* synthetic */ Object p;
    public final /* synthetic */ on20 q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cn20(on20 on20Var, zje zjeVar) {
        super(zjeVar);
        this.q = on20Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.M0(null, false, this);
    }
}
