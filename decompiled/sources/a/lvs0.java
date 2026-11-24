package a;

/* JADX INFO: loaded from: classes5.dex */
public final class lvs0 extends zje {
    public long i;
    public /* synthetic */ Object j;
    public final /* synthetic */ nvu k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lvs0(nvu nvuVar, zje zjeVar) {
        super(zjeVar);
        this.k = nvuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.R(0L, null, this);
    }
}
