package a;

/* JADX INFO: loaded from: classes3.dex */
public final class d8u extends zje {
    public long i;
    public long j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ hsj m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d8u(hsj hsjVar, zje zjeVar) {
        super(zjeVar);
        this.m = hsjVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.m(0L, 0L, this);
    }
}
