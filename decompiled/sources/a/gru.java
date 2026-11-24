package a;

/* JADX INFO: loaded from: classes5.dex */
public final class gru extends zje {
    public q7f0 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ hru k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gru(hru hruVar, zje zjeVar) {
        super(zjeVar);
        this.k = hruVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.d(null, this);
    }
}
