package a;

/* JADX INFO: loaded from: classes6.dex */
public final class lfm0 extends zje {
    public ddm0 i;
    public String j;
    public /* synthetic */ Object k;
    public final /* synthetic */ nfm0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lfm0(nfm0 nfm0Var, zje zjeVar) {
        super(zjeVar);
        this.l = nfm0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(null, this);
    }
}
