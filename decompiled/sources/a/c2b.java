package a;

/* JADX INFO: loaded from: classes4.dex */
public final class c2b extends zje {
    public long i;
    public boolean j;
    public String k;
    public /* synthetic */ Object l;
    public final /* synthetic */ h2b m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2b(h2b h2bVar, zje zjeVar) {
        super(zjeVar);
        this.m = h2bVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.z(0L, this, null, false);
    }
}
