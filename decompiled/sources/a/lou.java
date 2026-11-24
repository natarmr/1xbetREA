package a;

/* JADX INFO: loaded from: classes3.dex */
public final class lou extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ ieu j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lou(ieu ieuVar, zje zjeVar) {
        super(zjeVar);
        this.j = ieuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.k(this);
    }
}
