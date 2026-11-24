package a;

/* JADX INFO: loaded from: classes3.dex */
public final class ajd extends zje {
    public d0t i;
    public String j;
    public l1g k;
    public j1g l;
    public long m;
    public /* synthetic */ Object n;
    public final /* synthetic */ hjd o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajd(hjd hjdVar, zje zjeVar) {
        super(zjeVar);
        this.o = hjdVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.l(null, null, this);
    }
}
