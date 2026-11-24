package a;

/* JADX INFO: loaded from: classes4.dex */
public final class nap extends zje {
    public long i;
    public long j;
    public long k;
    public boolean l;
    public tnp0 m;
    public p7m0 n;
    public k050 o;
    public /* synthetic */ Object p;
    public final /* synthetic */ abp q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nap(abp abpVar, zje zjeVar) {
        super(zjeVar);
        this.q = abpVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.c(0L, false, null, this);
    }
}
