package a;

/* JADX INFO: loaded from: classes2.dex */
public final class jl1 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ xzp j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jl1(xzp xzpVar, zje zjeVar) {
        super(zjeVar);
        this.j = xzpVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.d(null, 0L, 0, null, this);
    }
}
