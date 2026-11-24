package a;

/* JADX INFO: loaded from: classes3.dex */
public final class a3c0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ b3c0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3c0(b3c0 b3c0Var, zje zjeVar) {
        super(zjeVar);
        this.j = b3c0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.d(false, false, null, null, null, this);
    }
}
