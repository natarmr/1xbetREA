package a;

/* JADX INFO: loaded from: classes4.dex */
public final class tyk extends zje {
    public String i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ali k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tyk(ali aliVar, zje zjeVar) {
        super(zjeVar);
        this.k = aliVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.y(null, null, this);
    }
}
