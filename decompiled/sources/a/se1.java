package a;

/* JADX INFO: loaded from: classes3.dex */
public final class se1 extends zje {
    public km80 i;
    public te1 j;
    public int k;
    public int l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ te1 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public se1(te1 te1Var, zje zjeVar) {
        super(zjeVar);
        this.o = te1Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.f(null, this);
    }
}
