package a;

/* JADX INFO: loaded from: classes6.dex */
public final class u4v extends zje {
    public boolean i;
    public String j;
    public yrt0 k;
    public String l;
    public /* synthetic */ Object m;
    public final /* synthetic */ gxu n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4v(gxu gxuVar, zje zjeVar) {
        super(zjeVar);
        this.n = gxuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.r(false, this);
    }
}
