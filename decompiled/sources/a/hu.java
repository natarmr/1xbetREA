package a;

/* JADX INFO: loaded from: classes3.dex */
public final class hu extends zje {
    public rcl i;
    public /* synthetic */ Object j;
    public final /* synthetic */ iu k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hu(iu iuVar, zje zjeVar) {
        super(zjeVar);
        this.k = iuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.b(null, this);
    }
}
