package a;

/* JADX INFO: loaded from: classes4.dex */
public final class ga20 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ w5z j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ga20(w5z w5zVar, zje zjeVar) {
        super(zjeVar);
        this.j = w5zVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.i0(this);
    }
}
