package a;

/* JADX INFO: loaded from: classes3.dex */
public final class gwu extends zje {
    public boolean i;
    public long j;
    public long k;
    public jvn l;
    public y3v m;
    public /* synthetic */ Object n;
    public final /* synthetic */ u8u o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gwu(u8u u8uVar, zje zjeVar) {
        super(zjeVar);
        this.o = u8uVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.w(false, 0L, 0L, null, this);
    }
}
