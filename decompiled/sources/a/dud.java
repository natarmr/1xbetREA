package a;

/* JADX INFO: loaded from: classes.dex */
public final class dud extends zje {
    public zxj0 i;
    public long j;
    public long k;
    public /* synthetic */ Object l;
    public final /* synthetic */ gud m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dud(gud gudVar, zje zjeVar) {
        super(zjeVar);
        this.m = gudVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.d(null, 0L, 0L, this);
    }
}
