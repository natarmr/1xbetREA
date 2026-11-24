package a;

/* JADX INFO: loaded from: classes.dex */
public final class br extends zje {
    public lvj0 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ cr k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public br(cr crVar, zje zjeVar) {
        super(zjeVar);
        this.k = crVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.d(null, this);
    }
}
