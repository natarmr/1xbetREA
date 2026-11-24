package a;

/* JADX INFO: loaded from: classes2.dex */
public final class ff extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ ehf0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ff(ehf0 ehf0Var, zje zjeVar) {
        super(zjeVar);
        this.j = ehf0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.f(this);
    }
}
