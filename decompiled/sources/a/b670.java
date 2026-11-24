package a;

/* JADX INFO: loaded from: classes4.dex */
public final class b670 extends zje {
    public Throwable i;
    public String j;
    public qz40 k;
    public Object l;
    public gz60 m;
    public /* synthetic */ Object n;
    public final /* synthetic */ g670 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b670(g670 g670Var, zje zjeVar) {
        super(zjeVar);
        this.o = g670Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.B(null, this);
    }
}
