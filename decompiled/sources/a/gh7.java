package a;

/* JADX INFO: loaded from: classes3.dex */
public final class gh7 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ es j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gh7(es esVar, zje zjeVar) {
        super(zjeVar);
        this.j = esVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.e(this);
    }
}
