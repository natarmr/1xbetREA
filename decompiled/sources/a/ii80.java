package a;

/* JADX INFO: loaded from: classes.dex */
public final class ii80 extends zje {
    public gp00 i;
    public rjt j;
    public Object k;
    public Object l;
    public Object m;
    public Object n;
    public Object o;
    public Object p;
    public Object q;
    public k050 r;
    public /* synthetic */ Object s;
    public final /* synthetic */ qi80 t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ii80(qi80 qi80Var, yje yjeVar) {
        super(yjeVar);
        this.t = qi80Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.d(null, null, this);
    }
}
