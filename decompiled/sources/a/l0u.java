package a;

/* JADX INFO: loaded from: classes3.dex */
public final class l0u extends zje {
    public boolean i;
    public /* synthetic */ Object j;
    public final /* synthetic */ lsn k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0u(lsn lsnVar, zje zjeVar) {
        super(zjeVar);
        this.k = lsnVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.d(false, this);
    }
}
