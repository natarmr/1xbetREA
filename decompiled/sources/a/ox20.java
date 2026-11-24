package a;

/* JADX INFO: loaded from: classes4.dex */
public final class ox20 extends zje {
    public long i;
    public /* synthetic */ Object j;
    public final /* synthetic */ y3v k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ox20(y3v y3vVar, zje zjeVar) {
        super(zjeVar);
        this.k = y3vVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.i(0, 0L, 0L, false, null, this);
    }
}
