package a;

/* JADX INFO: loaded from: classes3.dex */
public final class ksu extends zje {
    public boolean i;
    public String j;
    public c3c0 k;
    public long l;
    public /* synthetic */ Object m;
    public final /* synthetic */ lhf0 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ksu(lhf0 lhf0Var, zje zjeVar) {
        super(zjeVar);
        this.n = lhf0Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.z(false, null, null, 0L, this);
    }
}
