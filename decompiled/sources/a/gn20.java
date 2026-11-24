package a;

/* JADX INFO: loaded from: classes.dex */
public final class gn20 extends zje {
    public double i;
    public double j;
    public double k;
    public double l;
    public double m;
    public double n;
    public boolean o;
    public boolean p;
    public boolean q;
    public long r;
    public int s;
    public /* synthetic */ Object t;
    public final /* synthetic */ on20 u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gn20(on20 on20Var, zje zjeVar) {
        super(zjeVar);
        this.u = on20Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.P0(0.0d, 0.0d, false, false, 0L, this);
    }
}
