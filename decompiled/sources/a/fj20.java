package a;

/* JADX INFO: loaded from: classes5.dex */
public final class fj20 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ nn20 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fj20(nn20 nn20Var, zje zjeVar) {
        super(zjeVar);
        this.j = nn20Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.T(this);
    }
}
