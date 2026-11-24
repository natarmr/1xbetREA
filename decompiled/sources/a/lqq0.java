package a;

/* JADX INFO: loaded from: classes5.dex */
public final class lqq0 extends zje {
    public byte i;
    public int j;
    public int k;
    public int l;
    public int m;
    public long n;
    public long o;
    public Throwable p;
    public /* synthetic */ Object q;
    public final /* synthetic */ fck0 r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lqq0(fck0 fck0Var, zje zjeVar) {
        super(zjeVar);
        this.r = fck0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.e(0, 0, this);
    }
}
