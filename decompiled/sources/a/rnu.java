package a;

/* JADX INFO: loaded from: classes3.dex */
public final class rnu extends zje {
    public z7b[] i;
    public /* synthetic */ Object j;
    public final /* synthetic */ swt k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rnu(swt swtVar, zje zjeVar) {
        super(zjeVar);
        this.k = swtVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
