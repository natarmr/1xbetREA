package a;

/* JADX INFO: loaded from: classes5.dex */
public final class cvu extends zje {
    public long i;
    public /* synthetic */ Object j;
    public final /* synthetic */ jru k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvu(jru jruVar, zje zjeVar) {
        super(zjeVar);
        this.k = jruVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.e(0L, this);
    }
}
