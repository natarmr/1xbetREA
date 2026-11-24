package a;

/* JADX INFO: loaded from: classes3.dex */
public final class rty extends zje {
    public v0 i;
    public long j;
    public /* synthetic */ Object k;
    public final /* synthetic */ izx l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rty(izx izxVar, zje zjeVar) {
        super(zjeVar);
        this.l = izxVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(null, null, null, this);
    }
}
