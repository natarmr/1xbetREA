package a;

/* JADX INFO: loaded from: classes3.dex */
public final class j41 extends zje {
    public long i;
    public String j;
    public k41 k;
    public int l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ k41 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j41(k41 k41Var, zje zjeVar) {
        super(zjeVar);
        this.o = k41Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.c(0L, this, null);
    }
}
