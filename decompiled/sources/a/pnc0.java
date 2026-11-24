package a;

/* JADX INFO: loaded from: classes6.dex */
public final class pnc0 extends zje {
    public p7m0 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ qnc0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pnc0(qnc0 qnc0Var, zje zjeVar) {
        super(zjeVar);
        this.k = qnc0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.w(this);
    }
}
