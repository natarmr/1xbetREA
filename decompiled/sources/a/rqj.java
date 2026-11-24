package a;

/* JADX INFO: loaded from: classes3.dex */
public final class rqj extends zje {
    public long i;
    public long j;
    public String k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ erj n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rqj(erj erjVar, zje zjeVar) {
        super(zjeVar);
        this.n = erjVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.V(0L, this, null);
    }
}
