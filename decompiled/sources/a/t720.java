package a;

/* JADX INFO: loaded from: classes3.dex */
public final class t720 extends zje {
    public ouj0 i;
    public long j;
    public byte k;
    public /* synthetic */ Object l;
    public final /* synthetic */ ieu m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t720(ieu ieuVar, zje zjeVar) {
        super(zjeVar);
        this.m = ieuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.p(null, 0L, 0, this);
    }
}
