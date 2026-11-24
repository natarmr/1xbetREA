package a;

/* JADX INFO: loaded from: classes3.dex */
public final class of0 extends zje {
    public boolean i;
    public lhf0 j;
    public int k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ lhf0 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public of0(lhf0 lhf0Var, zje zjeVar) {
        super(zjeVar);
        this.n = lhf0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.e(false, this);
    }
}
