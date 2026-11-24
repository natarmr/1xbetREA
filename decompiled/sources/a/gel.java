package a;

/* JADX INFO: loaded from: classes.dex */
public final class gel extends zje {
    public qdl i;
    public /* synthetic */ Object j;
    public final /* synthetic */ hel k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gel(hel helVar, zje zjeVar) {
        super(zjeVar);
        this.k = helVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.m1(null, this);
    }
}
