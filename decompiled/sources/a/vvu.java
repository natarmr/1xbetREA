package a;

/* JADX INFO: loaded from: classes5.dex */
public final class vvu extends zje {
    public int i;
    public bvc j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public /* synthetic */ Object o;
    public final /* synthetic */ pwi p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vvu(pwi pwiVar, zje zjeVar) {
        super(zjeVar);
        this.p = pwiVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.n(0, null, false, false, false, this);
    }
}
