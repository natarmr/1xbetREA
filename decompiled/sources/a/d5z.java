package a;

/* JADX INFO: loaded from: classes4.dex */
public final class d5z extends zje {
    public long i;
    public long j;
    public long k;
    public boolean l;
    public boolean m;
    public h4z n;
    public /* synthetic */ Object o;
    public final /* synthetic */ a6u p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d5z(a6u a6uVar, zje zjeVar) {
        super(zjeVar);
        this.p = a6uVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.s(0L, 0L, this, false);
    }
}
