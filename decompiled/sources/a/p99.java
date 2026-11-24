package a;

/* JADX INFO: loaded from: classes2.dex */
public final class p99 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ q99 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p99(q99 q99Var, zje zjeVar) {
        super(zjeVar);
        this.j = q99Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        Object objH = this.j.H(null, 0, 0L, this);
        return objH == wne.f39444a ? objH : new ztb(objH);
    }
}
