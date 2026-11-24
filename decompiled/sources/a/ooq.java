package a;

/* JADX INFO: loaded from: classes2.dex */
public final class ooq extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ dnq k;
    public kmq l;
    public mie0 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ooq(dnq dnqVar, yje yjeVar) {
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
