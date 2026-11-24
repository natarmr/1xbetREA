package a;

/* JADX INFO: loaded from: classes.dex */
public final class y8o0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ trm0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y8o0(trm0 trm0Var, zje zjeVar) {
        super(zjeVar);
        this.j = trm0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.m(null, null, this);
    }
}
