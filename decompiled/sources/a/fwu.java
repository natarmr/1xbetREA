package a;

/* JADX INFO: loaded from: classes3.dex */
public final class fwu extends zje {
    public boolean i;
    public long j;
    public long k;
    public jvn l;
    public y3v m;
    public /* synthetic */ Object n;
    public final /* synthetic */ edu o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fwu(edu eduVar, zje zjeVar) {
        super(zjeVar);
        this.o = eduVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.p(false, 0L, 0L, null, this);
    }
}
