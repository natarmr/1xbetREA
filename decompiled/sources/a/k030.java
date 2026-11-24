package a;

/* JADX INFO: loaded from: classes6.dex */
public final class k030 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ o030 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k030(o030 o030Var, zje zjeVar) {
        super(zjeVar);
        this.j = o030Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.u(0L, this);
    }
}
