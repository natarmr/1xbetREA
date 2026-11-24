package a;

/* JADX INFO: loaded from: classes3.dex */
public final class m850 extends zje {
    public myr0 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ p850 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m850(p850 p850Var, zje zjeVar) {
        super(zjeVar);
        this.k = p850Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.Z(null, this);
    }
}
