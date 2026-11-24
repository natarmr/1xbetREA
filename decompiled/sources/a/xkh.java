package a;

/* JADX INFO: loaded from: classes4.dex */
public final class xkh extends zje {
    public ykh i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ykh k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xkh(ykh ykhVar, zje zjeVar) {
        super(zjeVar);
        this.k = ykhVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(0L, this, null);
    }
}
