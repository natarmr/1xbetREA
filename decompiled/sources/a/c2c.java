package a;

/* JADX INFO: loaded from: classes2.dex */
public final class c2c extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ y38 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2c(y38 y38Var, yje yjeVar) {
        super(yjeVar);
        this.k = y38Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
