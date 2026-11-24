package a;

/* JADX INFO: loaded from: classes4.dex */
public final class fmd0 extends zje {
    public amd0 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ gmd0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fmd0(gmd0 gmd0Var, zje zjeVar) {
        super(zjeVar);
        this.k = gmd0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
