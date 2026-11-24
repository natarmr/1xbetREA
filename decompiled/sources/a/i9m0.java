package a;

/* JADX INFO: loaded from: classes6.dex */
public final class i9m0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ weu j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i9m0(weu weuVar, zje zjeVar) {
        super(zjeVar);
        this.j = weuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.b(0L, this);
    }
}
