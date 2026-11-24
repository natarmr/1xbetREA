package a;

/* JADX INFO: loaded from: classes4.dex */
public final class xou extends zje {
    public boolean i;
    public lbu j;
    public int k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ lbu n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xou(lbu lbuVar, zje zjeVar) {
        super(zjeVar);
        this.n = lbuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.g(false, this);
    }
}
