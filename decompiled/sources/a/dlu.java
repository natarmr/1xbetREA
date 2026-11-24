package a;

/* JADX INFO: loaded from: classes5.dex */
public final class dlu extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ reu j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlu(reu reuVar, zje zjeVar) {
        super(zjeVar);
        this.j = reuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.e(0, this, null, false);
    }
}
