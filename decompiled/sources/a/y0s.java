package a;

/* JADX INFO: loaded from: classes4.dex */
public final class y0s extends zje {
    public hdb i;
    public /* synthetic */ Object j;
    public final /* synthetic */ z0s k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0s(z0s z0sVar, zje zjeVar) {
        super(zjeVar);
        this.k = z0sVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
