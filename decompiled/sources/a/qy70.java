package a;

/* JADX INFO: loaded from: classes5.dex */
public final class qy70 extends zje {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ sst k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qy70(sst sstVar, yje yjeVar) {
        super(yjeVar);
        this.k = sstVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
