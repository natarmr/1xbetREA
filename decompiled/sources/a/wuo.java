package a;

/* JADX INFO: loaded from: classes3.dex */
public final class wuo extends zje {
    public long i;
    public long j;
    public long k;
    public i050 l;
    public /* synthetic */ Object m;
    public final /* synthetic */ pmi n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wuo(pmi pmiVar, zje zjeVar) {
        super(zjeVar);
        this.n = pmiVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.s(0L, 0L, 0L, this);
    }
}
