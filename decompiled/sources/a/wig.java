package a;

/* JADX INFO: loaded from: classes4.dex */
public final class wig extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ xig j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wig(xig xigVar, zje zjeVar) {
        super(zjeVar);
        this.j = xigVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.O(null, false, this);
    }
}
