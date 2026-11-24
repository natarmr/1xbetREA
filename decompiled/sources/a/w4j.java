package a;

/* JADX INFO: loaded from: classes3.dex */
public final class w4j extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ kki j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4j(kki kkiVar, zje zjeVar) {
        super(zjeVar);
        this.j = kkiVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.d(0L, this);
    }
}
