package a;

/* JADX INFO: loaded from: classes4.dex */
public final class nmu extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ nr j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nmu(nr nrVar, zje zjeVar) {
        super(zjeVar);
        this.j = nrVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.r(0, this);
    }
}
