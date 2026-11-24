package a;

/* JADX INFO: loaded from: classes5.dex */
public final class qc4 extends zje {
    public pc4 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ rc4 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qc4(rc4 rc4Var, zje zjeVar) {
        super(zjeVar);
        this.k = rc4Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
