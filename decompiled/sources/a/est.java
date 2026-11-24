package a;

/* JADX INFO: loaded from: classes3.dex */
public final class est extends zje {
    public ynt i;
    public /* synthetic */ Object j;
    public final /* synthetic */ fst k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public est(fst fstVar, zje zjeVar) {
        super(zjeVar);
        this.k = fstVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(this);
    }
}
