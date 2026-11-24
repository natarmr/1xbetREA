package a;

/* JADX INFO: loaded from: classes6.dex */
public final class zjf0 extends zje {
    public dch0 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ekf0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zjf0(ekf0 ekf0Var, zje zjeVar) {
        super(zjeVar);
        this.k = ekf0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.e(null, this);
    }
}
