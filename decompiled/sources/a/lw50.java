package a;

/* JADX INFO: loaded from: classes2.dex */
public final class lw50 extends zje {
    public String i;
    public Throwable j;
    public boolean k;
    public boolean l;
    public long m;
    public long n;
    public int o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ j910 r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lw50(j910 j910Var, zje zjeVar) {
        super(zjeVar);
        this.r = j910Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.l(this, null, false);
    }
}
