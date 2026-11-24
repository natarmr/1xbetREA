package a;

/* JADX INFO: loaded from: classes4.dex */
public final class vnp extends zje {
    public String i;
    public /* synthetic */ Object j;
    public final /* synthetic */ eop k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vnp(eop eopVar, zje zjeVar) {
        super(zjeVar);
        this.k = eopVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.N(null, this);
    }
}
