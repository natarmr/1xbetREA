package a;

/* JADX INFO: loaded from: classes5.dex */
public final class nvf extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ lrc j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nvf(lrc lrcVar, zje zjeVar) {
        super(zjeVar);
        this.j = lrcVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.r(0L, this);
    }
}
