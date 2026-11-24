package a;

/* JADX INFO: loaded from: classes3.dex */
public final class prt extends zje {
    public long i;
    public long j;
    public ig5 k;
    public double l;
    public /* synthetic */ Object m;
    public final /* synthetic */ hsj n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public prt(hsj hsjVar, zje zjeVar) {
        super(zjeVar);
        this.n = hsjVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.o(0L, 0L, this);
    }
}
