package a;

/* JADX INFO: loaded from: classes6.dex */
public final class r0v0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ u0v0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0v0(u0v0 u0v0Var, zje zjeVar) {
        super(zjeVar);
        this.j = u0v0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.O(null, 0L, this);
    }
}
