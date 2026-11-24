package a;

/* JADX INFO: loaded from: classes3.dex */
public final class y2v extends zje {
    public long i;
    public Long j;
    public edu k;
    public /* synthetic */ Object l;
    public final /* synthetic */ u8u m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2v(u8u u8uVar, zje zjeVar) {
        super(zjeVar);
        this.m = u8uVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.u(0L, this, null);
    }
}
