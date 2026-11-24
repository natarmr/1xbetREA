package a;

/* JADX INFO: loaded from: classes5.dex */
public final class voc extends zje {
    public boolean i;
    public /* synthetic */ Object j;
    public final /* synthetic */ woc k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public voc(woc wocVar, zje zjeVar) {
        super(zjeVar);
        this.k = wocVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(false, this);
    }
}
