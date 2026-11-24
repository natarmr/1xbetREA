package a;

/* JADX INFO: loaded from: classes3.dex */
public final class wk0 extends zje {
    public km0 i;
    public i050 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ xk0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wk0(xk0 xk0Var, zje zjeVar) {
        super(zjeVar);
        this.l = xk0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.b(null, this);
    }
}
