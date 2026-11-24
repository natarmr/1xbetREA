package a;

/* JADX INFO: loaded from: classes3.dex */
public final class brj extends zje {
    public String i;
    public String j;
    public pdd0 k;
    public /* synthetic */ Object l;
    public final /* synthetic */ erj m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public brj(erj erjVar, zje zjeVar) {
        super(zjeVar);
        this.m = erjVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.F0(this, null, null);
    }
}
