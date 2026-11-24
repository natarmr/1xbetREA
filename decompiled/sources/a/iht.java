package a;

/* JADX INFO: loaded from: classes4.dex */
public final class iht extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ nr j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iht(nr nrVar, zje zjeVar) {
        super(zjeVar);
        this.j = nrVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.e(0L, null, 0, 0L, 0, this);
    }
}
