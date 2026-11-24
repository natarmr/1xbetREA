package a;

/* JADX INFO: loaded from: classes5.dex */
public final class jpu extends zje {
    public boolean i;
    public boolean j;
    public lc00 k;
    public lc00 l;
    public toc0 m;
    public /* synthetic */ Object n;
    public final /* synthetic */ kpu o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jpu(kpu kpuVar, zje zjeVar) {
        super(zjeVar);
        this.o = kpuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.b(false, false, false, this);
    }
}
