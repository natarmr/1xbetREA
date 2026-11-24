package a;

/* JADX INFO: loaded from: classes5.dex */
public final class v1c0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ b2c0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1c0(b2c0 b2c0Var, zje zjeVar) {
        super(zjeVar);
        this.j = b2c0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.N(this);
    }
}
