package a;

/* JADX INFO: loaded from: classes.dex */
public final class h7f extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ r7f j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h7f(r7f r7fVar, zje zjeVar) {
        super(zjeVar);
        this.j = r7fVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.j0(null, this);
    }
}
