package a;

/* JADX INFO: loaded from: classes2.dex */
public final class h6a extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ x860 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6a(x860 x860Var, zje zjeVar) {
        super(zjeVar);
        this.j = x860Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.b(this);
    }
}
