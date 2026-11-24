package a;

/* JADX INFO: loaded from: classes3.dex */
public final class r8o extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ bwl j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8o(bwl bwlVar, zje zjeVar) {
        super(zjeVar);
        this.j = bwlVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.e(null, this);
    }
}
