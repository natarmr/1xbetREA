package a;

/* JADX INFO: loaded from: classes5.dex */
public final class e7h0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ f7h0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7h0(f7h0 f7h0Var, zje zjeVar) {
        super(zjeVar);
        this.j = f7h0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(0.0d, 0L, this, null);
    }
}
