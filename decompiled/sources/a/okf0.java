package a;

/* JADX INFO: loaded from: classes5.dex */
public final class okf0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ rkf0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public okf0(rkf0 rkf0Var, zje zjeVar) {
        super(zjeVar);
        this.j = rkf0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.d(this);
    }
}
