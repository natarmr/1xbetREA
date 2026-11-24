package a;

/* JADX INFO: loaded from: classes4.dex */
public final class ns70 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ ps70 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ns70(ps70 ps70Var, zje zjeVar) {
        super(zjeVar);
        this.j = ps70Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(null, null, null, this);
    }
}
