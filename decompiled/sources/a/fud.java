package a;

/* JADX INFO: loaded from: classes.dex */
public final class fud extends zje {
    public lvj0 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ gud k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fud(gud gudVar, zje zjeVar) {
        super(zjeVar);
        this.k = gudVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.g(null, this);
    }
}
