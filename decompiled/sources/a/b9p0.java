package a;

/* JADX INFO: loaded from: classes4.dex */
public final class b9p0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ dpi0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b9p0(dpi0 dpi0Var, zje zjeVar) {
        super(zjeVar);
        this.j = dpi0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.f(null, null, this);
    }
}
