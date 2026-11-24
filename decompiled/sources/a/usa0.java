package a;

/* JADX INFO: loaded from: classes5.dex */
public final class usa0 extends zje {
    public ctc i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ata0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public usa0(ata0 ata0Var, zje zjeVar) {
        super(zjeVar);
        this.k = ata0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.M(null, null, null, this);
    }
}
