package a;

/* JADX INFO: loaded from: classes5.dex */
public final class mpl0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ xpl0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mpl0(xpl0 xpl0Var, zje zjeVar) {
        super(zjeVar);
        this.j = xpl0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.M(this);
    }
}
