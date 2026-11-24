package a;

/* JADX INFO: loaded from: classes5.dex */
public final class gxj0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ xxj0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gxj0(xxj0 xxj0Var, zje zjeVar) {
        super(zjeVar);
        this.j = xxj0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.F(null, this);
    }
}
