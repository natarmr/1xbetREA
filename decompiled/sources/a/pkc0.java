package a;

/* JADX INFO: loaded from: classes3.dex */
public final class pkc0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ rkc0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pkc0(rkc0 rkc0Var, zje zjeVar) {
        super(zjeVar);
        this.j = rkc0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.b(0, 0L, 0L, this, false);
    }
}
