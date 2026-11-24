package a;

/* JADX INFO: loaded from: classes4.dex */
public final class g69 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ k69 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g69(k69 k69Var, zje zjeVar) {
        super(zjeVar);
        this.j = k69Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.N(this);
    }
}
