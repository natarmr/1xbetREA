package a;

/* JADX INFO: loaded from: classes3.dex */
public final class xh3 extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ yh3 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xh3(yh3 yh3Var, yje yjeVar) {
        super(yjeVar);
        this.k = yh3Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
