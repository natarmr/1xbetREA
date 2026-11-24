package a;

/* JADX INFO: loaded from: classes3.dex */
public final class h41 extends zje {
    public String i;
    public k41 j;
    public int k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ k41 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h41(k41 k41Var, zje zjeVar) {
        super(zjeVar);
        this.n = k41Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.a(null, this);
    }
}
