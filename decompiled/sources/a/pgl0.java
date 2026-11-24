package a;

/* JADX INFO: loaded from: classes4.dex */
public final class pgl0 extends zje {
    public boolean i;
    public long j;
    public long k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ ls n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pgl0(ls lsVar, zje zjeVar) {
        super(zjeVar);
        this.n = lsVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.a(0L, this, false);
    }
}
