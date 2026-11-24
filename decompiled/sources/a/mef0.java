package a;

/* JADX INFO: loaded from: classes4.dex */
public final class mef0 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ gxu j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mef0(gxu gxuVar, zje zjeVar) {
        super(zjeVar);
        this.j = gxuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.e(0L, 0L, 0L, 0L, 0, false, 0L, this);
    }
}
