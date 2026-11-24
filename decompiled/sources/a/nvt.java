package a;

/* JADX INFO: loaded from: classes3.dex */
public final class nvt extends zje {
    public bm5 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ iqi k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nvt(iqi iqiVar, zje zjeVar) {
        super(zjeVar);
        this.k = iqiVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.m(null, this);
    }
}
