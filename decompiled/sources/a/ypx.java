package a;

/* JADX INFO: loaded from: classes6.dex */
public final class ypx extends zje {
    public long i;
    public /* synthetic */ Object j;
    public final /* synthetic */ edu k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ypx(edu eduVar, zje zjeVar) {
        super(zjeVar);
        this.k = eduVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.k(0, this);
    }
}
