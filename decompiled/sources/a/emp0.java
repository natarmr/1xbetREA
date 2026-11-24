package a;

/* JADX INFO: loaded from: classes6.dex */
public final class emp0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ fmp0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emp0(fmp0 fmp0Var, zje zjeVar) {
        super(zjeVar);
        this.j = fmp0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(null, this);
    }
}
