package a;

/* JADX INFO: loaded from: classes6.dex */
public final class zox extends zje {
    public ts4 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ gxu k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zox(gxu gxuVar, yje yjeVar) {
        super(yjeVar);
        this.k = gxuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.n(this);
    }
}
