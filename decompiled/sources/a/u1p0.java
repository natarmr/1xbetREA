package a;

/* JADX INFO: loaded from: classes.dex */
public final class u1p0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ eyg0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1p0(eyg0 eyg0Var, zje zjeVar) {
        super(zjeVar);
        this.j = eyg0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.i(null, this);
    }
}
