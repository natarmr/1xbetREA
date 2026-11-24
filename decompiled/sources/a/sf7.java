package a;

/* JADX INFO: loaded from: classes5.dex */
public final class sf7 extends zje {
    public int i;
    public m0u j;
    public /* synthetic */ Object k;
    public final /* synthetic */ uf7 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sf7(uf7 uf7Var, zje zjeVar) {
        super(zjeVar);
        this.l = uf7Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.w(0, this);
    }
}
