package a;

/* JADX INFO: loaded from: classes3.dex */
public final class hgu extends zje {
    public sh60 i;
    public long j;
    public /* synthetic */ Object k;
    public final /* synthetic */ ieu l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hgu(ieu ieuVar, zje zjeVar) {
        super(zjeVar);
        this.l = ieuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.l(null, this);
    }
}
