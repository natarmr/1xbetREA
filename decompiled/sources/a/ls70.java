package a;

/* JADX INFO: loaded from: classes4.dex */
public final class ls70 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ nv20 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ls70(nv20 nv20Var, zje zjeVar) {
        super(zjeVar);
        this.j = nv20Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.g(null, null, null, this);
    }
}
