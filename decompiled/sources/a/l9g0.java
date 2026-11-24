package a;

/* JADX INFO: loaded from: classes5.dex */
public final class l9g0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ o9g0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l9g0(o9g0 o9g0Var, zje zjeVar) {
        super(zjeVar);
        this.j = o9g0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.M(this);
    }
}
