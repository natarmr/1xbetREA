package a;

/* JADX INFO: loaded from: classes4.dex */
public final class oin extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ ali j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oin(ali aliVar, zje zjeVar) {
        super(zjeVar);
        this.j = aliVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.b(0L, null, 0L, 0.0d, this);
    }
}
