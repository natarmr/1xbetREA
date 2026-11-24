package a;

/* JADX INFO: loaded from: classes2.dex */
public final class six extends zje {
    public Object i;
    public /* synthetic */ Object j;
    public final /* synthetic */ rqt k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public six(rqt rqtVar, zje zjeVar) {
        super(zjeVar);
        this.k = rqtVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
