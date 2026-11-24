package a;

/* JADX INFO: loaded from: classes6.dex */
public final class pd70 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ xd70 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pd70(xd70 xd70Var, zje zjeVar) {
        super(zjeVar);
        this.j = xd70Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.f0(this);
    }
}
