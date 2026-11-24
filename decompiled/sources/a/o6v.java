package a;

/* JADX INFO: loaded from: classes5.dex */
public final class o6v extends zje {
    public String i;
    public /* synthetic */ Object j;
    public final /* synthetic */ reu k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6v(reu reuVar, zje zjeVar) {
        super(zjeVar);
        this.k = reuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.g(null, this);
    }
}
