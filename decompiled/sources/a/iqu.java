package a;

/* JADX INFO: loaded from: classes3.dex */
public final class iqu extends zje {
    public long i;
    public String j;
    public moc k;
    public byte l;
    public int m;
    public int n;
    public boolean o;
    public /* synthetic */ Object p;
    public final /* synthetic */ moc q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iqu(moc mocVar, zje zjeVar) {
        super(zjeVar);
        this.q = mocVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(0, 0L, this, null, false);
    }
}
