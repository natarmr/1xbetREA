package a;

/* JADX INFO: loaded from: classes.dex */
public final class eva0 extends zje {
    public hva0 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ hva0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eva0(hva0 hva0Var, zje zjeVar) {
        super(zjeVar);
        this.k = hva0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(this);
    }
}
