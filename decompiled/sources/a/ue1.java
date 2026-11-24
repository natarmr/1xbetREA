package a;

/* JADX INFO: loaded from: classes2.dex */
public final class ue1 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ qgd j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ue1(qgd qgdVar, zje zjeVar) {
        super(zjeVar);
        this.j = qgdVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.w(0L, this, null);
    }
}
