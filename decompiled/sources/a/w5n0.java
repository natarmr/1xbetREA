package a;

/* JADX INFO: loaded from: classes4.dex */
public final class w5n0 extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ x5n0 k;
    public kmq l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w5n0(x5n0 x5n0Var, yje yjeVar) {
        super(yjeVar);
        this.k = x5n0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
