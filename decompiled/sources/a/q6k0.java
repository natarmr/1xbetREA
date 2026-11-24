package a;

/* JADX INFO: loaded from: classes.dex */
public final class q6k0 extends zje {
    public k050 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ r6k0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q6k0(r6k0 r6k0Var, zje zjeVar) {
        super(zjeVar);
        this.k = r6k0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.g(this);
    }
}
