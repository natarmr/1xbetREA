package a;

/* JADX INFO: loaded from: classes4.dex */
public final class ij50 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ yuu j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ij50(yuu yuuVar, zje zjeVar) {
        super(zjeVar);
        this.j = yuuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.r(this);
    }
}
