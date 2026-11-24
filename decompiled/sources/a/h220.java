package a;

/* JADX INFO: loaded from: classes3.dex */
public final class h220 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ cw10 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h220(cw10 cw10Var, yje yjeVar) {
        super(yjeVar);
        this.j = cw10Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.b(null, this);
    }
}
