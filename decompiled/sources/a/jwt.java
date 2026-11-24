package a;

/* JADX INFO: loaded from: classes3.dex */
public final class jwt extends zje {
    public String i;
    public /* synthetic */ Object j;
    public final /* synthetic */ es k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jwt(es esVar, zje zjeVar) {
        super(zjeVar);
        this.k = esVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.o(null, this);
    }
}
