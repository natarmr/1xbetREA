package a;

/* JADX INFO: loaded from: classes4.dex */
public final class h7r0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ pmi0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h7r0(pmi0 pmi0Var, zje zjeVar) {
        super(zjeVar);
        this.j = pmi0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.d(null, null, null, this);
    }
}
