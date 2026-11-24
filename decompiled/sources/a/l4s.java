package a;

/* JADX INFO: loaded from: classes3.dex */
public final class l4s extends zje {
    public otc i;
    public /* synthetic */ Object j;
    public final /* synthetic */ kki k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4s(kki kkiVar, yje yjeVar) {
        super(yjeVar);
        this.k = kkiVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.s(null, this);
    }
}
