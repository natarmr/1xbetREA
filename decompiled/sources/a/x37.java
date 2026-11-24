package a;

/* JADX INFO: loaded from: classes4.dex */
public final class x37 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ nr j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x37(nr nrVar, zje zjeVar) {
        super(zjeVar);
        this.j = nrVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.b(0L, 0L, this, null);
    }
}
