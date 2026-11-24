package a;

/* JADX INFO: loaded from: classes2.dex */
public final class dhf0 extends zje {
    public n7p i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ehf0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dhf0(ehf0 ehf0Var, zje zjeVar) {
        super(zjeVar);
        this.k = ehf0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.l(this);
    }
}
