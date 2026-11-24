package a;

/* JADX INFO: loaded from: classes.dex */
public final class drs0 extends zje {
    public krs0 i;
    public jva0 j;
    public String k;
    public String[] l;
    public int m;
    public int n;
    public int o;
    public /* synthetic */ Object p;
    public final /* synthetic */ krs0 q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drs0(krs0 krs0Var, zje zjeVar) {
        super(zjeVar);
        this.q = krs0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.g(null, 0, this);
    }
}
