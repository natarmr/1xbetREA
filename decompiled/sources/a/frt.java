package a;

/* JADX INFO: loaded from: classes3.dex */
public final class frt extends zje {
    public int i;
    public int j;
    public int k;
    public boolean l;
    public ocl m;
    public /* synthetic */ Object n;
    public final /* synthetic */ cu o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public frt(cu cuVar, zje zjeVar) {
        super(zjeVar);
        this.o = cuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.j(0, this);
    }
}
