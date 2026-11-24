package a;

/* JADX INFO: loaded from: classes3.dex */
public final class xf40 extends zje {
    public boolean i;
    public boolean j;
    public ynb0 k;
    public String l;
    public ts4 m;
    public /* synthetic */ Object n;
    public final /* synthetic */ fnk o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xf40(fnk fnkVar, zje zjeVar) {
        super(zjeVar);
        this.o = fnkVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.b(false, null, null, this);
    }
}
