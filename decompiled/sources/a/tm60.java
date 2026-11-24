package a;

/* JADX INFO: loaded from: classes3.dex */
public final class tm60 extends zje {
    public mz60 i;
    public String j;
    public int k;
    public int l;
    public long m;
    public /* synthetic */ Object n;
    public final /* synthetic */ f47 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tm60(f47 f47Var, zje zjeVar) {
        super(zjeVar);
        this.o = f47Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.l(null, 0, 0, null, this);
    }
}
