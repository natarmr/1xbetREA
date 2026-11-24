package a;

/* JADX INFO: loaded from: classes4.dex */
public final class kn60 extends zje {
    public z470 i;
    public String j;
    public long k;
    public boolean l;
    public /* synthetic */ Object m;
    public final /* synthetic */ nn60 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kn60(nn60 nn60Var, zje zjeVar) {
        super(zjeVar);
        this.n = nn60Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.n(null, null, this);
    }
}
