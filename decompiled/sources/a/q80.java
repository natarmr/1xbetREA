package a;

/* JADX INFO: loaded from: classes2.dex */
public final class q80 extends zje {
    public pek0 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ r80 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q80(r80 r80Var, zje zjeVar) {
        super(zjeVar);
        this.k = r80Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, 0L, null, this);
    }
}
