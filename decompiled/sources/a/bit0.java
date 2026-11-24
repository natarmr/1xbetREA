package a;

/* JADX INFO: loaded from: classes.dex */
public final class bit0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ qv2 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bit0(qv2 qv2Var, zje zjeVar) {
        super(zjeVar);
        this.j = qv2Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.s(0L, this);
    }
}
