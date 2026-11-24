package a;

/* JADX INFO: loaded from: classes4.dex */
public final class j4u extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ zj2 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4u(zj2 zj2Var, yje yjeVar) {
        super(yjeVar);
        this.k = zj2Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.c(null, this);
    }
}
