package a;

/* JADX INFO: loaded from: classes5.dex */
public final class ttu extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ rf9 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ttu(rf9 rf9Var, zje zjeVar) {
        super(zjeVar);
        this.j = rf9Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(0, 0, 0L, this, null, false);
    }
}
