package a;

/* JADX INFO: loaded from: classes3.dex */
public final class a5u extends zje {
    public long i;
    public /* synthetic */ Object j;
    public final /* synthetic */ wti k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5u(wti wtiVar, yje yjeVar) {
        super(yjeVar);
        this.k = wtiVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.n(0L, null, this);
    }
}
