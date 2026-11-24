package a;

/* JADX INFO: loaded from: classes3.dex */
public final class bbt extends zje {
    public long i;
    public long j;
    public t470 k;
    public /* synthetic */ Object l;
    public final /* synthetic */ pbt m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bbt(pbt pbtVar, zje zjeVar) {
        super(zjeVar);
        this.m = pbtVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.i(0L, this, null, false);
    }
}
