package a;

/* JADX INFO: loaded from: classes4.dex */
public final class g4v extends zje {
    public bm5 i;
    public ql5 j;
    public bsu k;
    public bm5 l;
    public /* synthetic */ Object m;
    public final /* synthetic */ a6u n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4v(a6u a6uVar, zje zjeVar) {
        super(zjeVar);
        this.n = a6uVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.o(null, this);
    }
}
