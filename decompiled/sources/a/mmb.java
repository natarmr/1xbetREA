package a;

/* JADX INFO: loaded from: classes2.dex */
public final class mmb extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ bbw0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mmb(bbw0 bbw0Var, zje zjeVar) {
        super(zjeVar);
        this.j = bbw0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.i(null, null, null, this);
    }
}
