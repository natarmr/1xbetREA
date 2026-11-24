package a;

/* JADX INFO: loaded from: classes3.dex */
public final class hpu extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ ipu j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hpu(ipu ipuVar, zje zjeVar) {
        super(zjeVar);
        this.j = ipuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(this);
    }
}
