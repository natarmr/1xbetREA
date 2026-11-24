package a;

/* JADX INFO: loaded from: classes4.dex */
public final class pp extends zje {
    public gw i;
    public /* synthetic */ Object j;
    public final /* synthetic */ nr k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pp(nr nrVar, zje zjeVar) {
        super(zjeVar);
        this.k = nrVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.w(null, null, this);
    }
}
