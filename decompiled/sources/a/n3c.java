package a;

/* JADX INFO: loaded from: classes3.dex */
public final class n3c extends zje {
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public String n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public /* synthetic */ Object t;
    public final /* synthetic */ o3c u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3c(o3c o3cVar, zje zjeVar) {
        super(zjeVar);
        this.u = o3cVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.o(false, false, this);
    }
}
