package a;

/* JADX INFO: loaded from: classes2.dex */
public final class rhu extends zje {
    public ucq i;
    public /* synthetic */ Object j;
    public final /* synthetic */ shu k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rhu(shu shuVar, zje zjeVar) {
        super(zjeVar);
        this.k = shuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, null, this);
    }
}
