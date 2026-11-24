package a;

/* JADX INFO: loaded from: classes3.dex */
public final class qnu extends zje {
    public z7b[] i;
    public /* synthetic */ Object j;
    public final /* synthetic */ abu k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qnu(abu abuVar, zje zjeVar) {
        super(zjeVar);
        this.k = abuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.s(null, this);
    }
}
