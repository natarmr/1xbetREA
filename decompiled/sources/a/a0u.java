package a;

/* JADX INFO: loaded from: classes4.dex */
public final class a0u extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ nr j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0u(nr nrVar, zje zjeVar) {
        super(zjeVar);
        this.j = nrVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.y(this);
    }
}
