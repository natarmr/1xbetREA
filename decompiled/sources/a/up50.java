package a;

/* JADX INFO: loaded from: classes5.dex */
public final class up50 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ xp50 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public up50(xp50 xp50Var, zje zjeVar) {
        super(zjeVar);
        this.j = xp50Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.P(this);
    }
}
