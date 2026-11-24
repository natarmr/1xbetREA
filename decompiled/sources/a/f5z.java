package a;

/* JADX INFO: loaded from: classes4.dex */
public final class f5z extends zje {
    public long i;
    public long j;
    public long k;
    public boolean l;
    public boolean m;
    public boolean n;
    public byte o;
    public /* synthetic */ Object p;
    public final /* synthetic */ a6u q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5z(a6u a6uVar, zje zjeVar) {
        super(zjeVar);
        this.q = a6uVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.B(0L, false, 0L, 0L, false, false, 0, this);
    }
}
