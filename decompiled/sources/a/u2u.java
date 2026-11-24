package a;

/* JADX INFO: loaded from: classes4.dex */
public final class u2u extends zje {
    public int i;
    public long j;
    public cyu k;
    public /* synthetic */ Object l;
    public final /* synthetic */ zri m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2u(zri zriVar, zje zjeVar) {
        super(zjeVar);
        this.m = zriVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.f(0, 0L, this);
    }
}
