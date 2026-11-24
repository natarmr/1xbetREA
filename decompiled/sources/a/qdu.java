package a;

/* JADX INFO: loaded from: classes3.dex */
public final class qdu extends zje {
    public boolean i;
    public boolean j;
    public boolean k;
    public String l;
    public String m;
    public wdu n;
    public int o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ wdu r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qdu(wdu wduVar, zje zjeVar) {
        super(zjeVar);
        this.r = wduVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws zhi0 {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        Object objC = this.r.C(false, null, null, false, false, this);
        return objC == wne.f39444a ? objC : new j0g0(objC);
    }
}
