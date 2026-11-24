package a;

/* JADX INFO: loaded from: classes4.dex */
public final class z0e0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ d1e0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0e0(d1e0 d1e0Var, zje zjeVar) {
        super(zjeVar);
        this.j = d1e0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.M(null, this);
    }
}
