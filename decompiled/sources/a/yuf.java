package a;

/* JADX INFO: loaded from: classes3.dex */
public final class yuf extends zje {
    public long i;
    public long j;
    public zuf k;
    public /* synthetic */ Object l;
    public final /* synthetic */ zuf m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yuf(zuf zufVar, zje zjeVar) {
        super(zjeVar);
        this.m = zufVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.a(0L, 0L, this);
    }
}
