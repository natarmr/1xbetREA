package a;

/* JADX INFO: loaded from: classes4.dex */
public final class yap extends zje {
    public long i;
    public long j;
    public p7m0 k;
    public k050 l;
    public /* synthetic */ Object m;
    public final /* synthetic */ abp n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yap(abp abpVar, zje zjeVar) {
        super(zjeVar);
        this.n = abpVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.g(0L, 0L, this);
    }
}
