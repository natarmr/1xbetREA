package a;

/* JADX INFO: loaded from: classes4.dex */
public final class fs00 extends zje {
    public long i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ieu k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fs00(ieu ieuVar, zje zjeVar) {
        super(zjeVar);
        this.k = ieuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.r(0L, this);
    }
}
