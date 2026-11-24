package a;

/* JADX INFO: loaded from: classes.dex */
public final class woj0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ xoj0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public woj0(xoj0 xoj0Var, zje zjeVar) {
        super(zjeVar);
        this.j = xoj0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(null, this);
    }
}
