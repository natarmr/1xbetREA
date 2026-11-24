package a;

/* JADX INFO: loaded from: classes5.dex */
public final class rv70 extends zje {
    public uvc i;
    public /* synthetic */ Object j;
    public final /* synthetic */ wv70 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rv70(wv70 wv70Var, zje zjeVar) {
        super(zjeVar);
        this.k = wv70Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.j(null, this);
    }
}
