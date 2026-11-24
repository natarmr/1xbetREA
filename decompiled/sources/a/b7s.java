package a;

/* JADX INFO: loaded from: classes4.dex */
public final class b7s extends zje {
    public v7s i;
    public int j;
    public int k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ yj2 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b7s(yj2 yj2Var, yje yjeVar) {
        super(yjeVar);
        this.n = yj2Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.b(null, this);
    }
}
