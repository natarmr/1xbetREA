package a;

/* JADX INFO: loaded from: classes4.dex */
public final class zea0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ nw20 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zea0(nw20 nw20Var, zje zjeVar) {
        super(zjeVar);
        this.j = nw20Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.e(null, this);
    }
}
