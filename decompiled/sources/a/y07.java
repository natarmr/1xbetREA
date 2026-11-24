package a;

/* JADX INFO: loaded from: classes5.dex */
public final class y07 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ a17 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y07(a17 a17Var, zje zjeVar) {
        super(zjeVar);
        this.j = a17Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(0L, false, null, null, this);
    }
}
