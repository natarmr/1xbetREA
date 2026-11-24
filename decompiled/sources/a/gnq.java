package a;

/* JADX INFO: loaded from: classes2.dex */
public final class gnq extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ dnq k;
    public kmq l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gnq(dnq dnqVar, yje yjeVar) {
        super(yjeVar);
        this.k = dnqVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.c(null, this);
    }
}
