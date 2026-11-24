package a;

/* JADX INFO: loaded from: classes3.dex */
public final class qyt extends zje {
    public long i;
    public /* synthetic */ Object j;
    public final /* synthetic */ syt k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qyt(syt sytVar, zje zjeVar) {
        super(zjeVar);
        this.k = sytVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(this);
    }
}
