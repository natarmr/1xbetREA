package a;

/* JADX INFO: loaded from: classes3.dex */
public final class wqj extends zje {
    public long i;
    public boolean j;
    public boolean k;
    public d270 l;
    public String m;
    public /* synthetic */ Object n;
    public final /* synthetic */ erj o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wqj(erj erjVar, zje zjeVar) {
        super(zjeVar);
        this.o = erjVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.m0(0L, false, false, null, this);
    }
}
