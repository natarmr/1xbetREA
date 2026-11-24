package a;

/* JADX INFO: loaded from: classes4.dex */
public final class ks extends zje {
    public long i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ls k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ks(ls lsVar, yje yjeVar) {
        super(yjeVar);
        this.k = lsVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.b(0L, this);
    }
}
