package a;

/* JADX INFO: loaded from: classes5.dex */
public final class uj20 extends zje {
    public m97 i;
    public String j;
    public String k;
    public jye l;
    public boolean m;
    public boolean n;
    public int o;
    public /* synthetic */ Object p;
    public final /* synthetic */ nn20 q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uj20(nn20 nn20Var, zje zjeVar) {
        super(zjeVar);
        this.q = nn20Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.d0(null, this);
    }
}
