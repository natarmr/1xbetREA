package a;

/* JADX INFO: loaded from: classes4.dex */
public final class sjb0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ tjb0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sjb0(tjb0 tjb0Var, zje zjeVar) {
        super(zjeVar);
        this.j = tjb0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.p(null, this);
    }
}
