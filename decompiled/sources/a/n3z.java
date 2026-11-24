package a;

/* JADX INFO: loaded from: classes5.dex */
public final class n3z extends zje {
    public h4z i;
    public /* synthetic */ Object j;
    public final /* synthetic */ tzi k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3z(tzi tziVar, zje zjeVar) {
        super(zjeVar);
        this.k = tziVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.b(null, null, this);
    }
}
