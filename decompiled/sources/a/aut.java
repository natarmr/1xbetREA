package a;

/* JADX INFO: loaded from: classes3.dex */
public final class aut extends zje {
    public long i;
    public ql5 j;
    public boolean k;
    public int l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ but o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aut(but butVar, zje zjeVar) {
        super(zjeVar);
        this.o = butVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.a(0L, this);
    }
}
