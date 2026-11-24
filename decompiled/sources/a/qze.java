package a;

/* JADX INFO: loaded from: classes.dex */
public final class qze extends zje {
    public q4f i;
    public /* synthetic */ Object j;
    public final /* synthetic */ wze k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qze(wze wzeVar, zje zjeVar) {
        super(zjeVar);
        this.k = wzeVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.y(null, this);
    }
}
