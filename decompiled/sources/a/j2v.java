package a;

/* JADX INFO: loaded from: classes3.dex */
public final class j2v extends zje {
    public long i;
    public int j;
    public int k;
    public int l;
    public Integer m;
    public u8u n;
    public /* synthetic */ Object o;
    public final /* synthetic */ u8u p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2v(u8u u8uVar, zje zjeVar) {
        super(zjeVar);
        this.p = u8uVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.t(0L, 0, null, this);
    }
}
