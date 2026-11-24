package a;

/* JADX INFO: loaded from: classes5.dex */
public final class hbx extends zje {
    public String i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ibx k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hbx(ibx ibxVar, zje zjeVar) {
        super(zjeVar);
        this.k = ibxVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.w(this);
    }
}
