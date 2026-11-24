package a;

/* JADX INFO: loaded from: classes3.dex */
public final class tdu extends zje {
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public String m;
    public wdu n;
    public int o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ wdu r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tdu(wdu wduVar, zje zjeVar) {
        super(zjeVar);
        this.r = wduVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws zhi0 {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        Object objF = this.r.F(false, false, null, false, false, this);
        return objF == wne.f39444a ? objF : new j0g0(objF);
    }
}
