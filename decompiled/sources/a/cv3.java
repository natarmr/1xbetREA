package a;

/* JADX INFO: loaded from: classes2.dex */
public final class cv3 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ ehf0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv3(ehf0 ehf0Var, zje zjeVar) {
        super(zjeVar);
        this.j = ehf0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.k(0L, this);
    }
}
