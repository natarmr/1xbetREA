package a;

/* JADX INFO: loaded from: classes3.dex */
public final class sm60 extends zje {
    public z470 i;
    public String j;
    public long k;
    public boolean l;
    public /* synthetic */ Object m;
    public final /* synthetic */ f47 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sm60(f47 f47Var, zje zjeVar) {
        super(zjeVar);
        this.n = f47Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.k(null, null, this);
    }
}
