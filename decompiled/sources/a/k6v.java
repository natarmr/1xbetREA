package a;

/* JADX INFO: loaded from: classes6.dex */
public final class k6v extends zje {
    public ql5 i;
    public csr j;
    public boolean k;
    public boolean l;
    public /* synthetic */ Object m;
    public final /* synthetic */ l6v n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6v(l6v l6vVar, zje zjeVar) {
        super(zjeVar);
        this.n = l6vVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.a(null, null, false, false, this);
    }
}
