package a;

/* JADX INFO: loaded from: classes6.dex */
public final class kg90 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ lg90 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kg90(lg90 lg90Var, zje zjeVar) {
        super(zjeVar);
        this.j = lg90Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(null, 0.0f, this);
    }
}
