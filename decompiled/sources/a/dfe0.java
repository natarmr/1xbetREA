package a;

/* JADX INFO: loaded from: classes3.dex */
public final class dfe0 extends zje {
    public km80 i;
    public Object j;
    public dfe0 k;
    public int l;
    public int m;
    public int n;
    public long o;
    public long p;
    public /* synthetic */ Object q;
    public final /* synthetic */ efe0 r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dfe0(efe0 efe0Var, zje zjeVar) {
        super(zjeVar);
        this.r = efe0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.f(null, this);
    }
}
