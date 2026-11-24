package a;

/* JADX INFO: loaded from: classes4.dex */
public final class mxs0 extends zje {
    public String i;
    public String j;
    public /* synthetic */ Object k;
    public final /* synthetic */ pxs0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mxs0(pxs0 pxs0Var, zje zjeVar) {
        super(zjeVar);
        this.l = pxs0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.b(null, null, null, this);
    }
}
