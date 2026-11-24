package a;

/* JADX INFO: loaded from: classes.dex */
public final class gk9 extends zje {
    public double i;
    public /* synthetic */ Object j;
    public final /* synthetic */ gs k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gk9(gs gsVar, zje zjeVar) {
        super(zjeVar);
        this.k = gsVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(0.0d, this);
    }
}
