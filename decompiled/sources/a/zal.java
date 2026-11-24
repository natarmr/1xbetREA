package a;

/* JADX INFO: loaded from: classes3.dex */
public final class zal extends zje {
    public m9s i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ebl k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zal(ebl eblVar, zje zjeVar) {
        super(zjeVar);
        this.k = eblVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.N(null, this);
    }
}
