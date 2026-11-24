package a;

/* JADX INFO: loaded from: classes2.dex */
public final class k3c extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ fvt0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3c(fvt0 fvt0Var, zje zjeVar) {
        super(zjeVar);
        this.j = fvt0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.v(0L, this);
    }
}
