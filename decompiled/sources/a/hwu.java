package a;

/* JADX INFO: loaded from: classes3.dex */
public final class hwu extends zje {
    public long i;
    public long j;
    public /* synthetic */ Object k;
    public final /* synthetic */ h3c l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hwu(h3c h3cVar, zje zjeVar) {
        super(zjeVar);
        this.l = h3cVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(0L, 0L, this);
    }
}
