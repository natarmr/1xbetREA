package a;

/* JADX INFO: loaded from: classes3.dex */
public final class e97 extends zje {
    public lsn i;
    public String j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ f97 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e97(f97 f97Var, zje zjeVar) {
        super(zjeVar);
        this.m = f97Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.l0(null, this);
    }
}
