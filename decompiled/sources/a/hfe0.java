package a;

/* JADX INFO: loaded from: classes3.dex */
public final class hfe0 extends zje {
    public km80 i;
    public Object j;
    public hfe0 k;
    public int l;
    public int m;
    public int n;
    public long o;
    public long p;
    public long q;
    public /* synthetic */ Object r;
    public final /* synthetic */ ife0 s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hfe0(ife0 ife0Var, zje zjeVar) {
        super(zjeVar);
        this.s = ife0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.f(null, this);
    }
}
