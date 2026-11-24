package a;

/* JADX INFO: loaded from: classes3.dex */
public final class mp70 extends zje {
    public csr i;
    public oct j;
    public long k;
    public /* synthetic */ Object l;
    public final /* synthetic */ sp70 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mp70(sp70 sp70Var, zje zjeVar) {
        super(zjeVar);
        this.m = sp70Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.C(0L, this, null);
    }
}
