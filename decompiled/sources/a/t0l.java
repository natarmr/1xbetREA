package a;

/* JADX INFO: loaded from: classes4.dex */
public final class t0l extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ v0l j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0l(v0l v0lVar, zje zjeVar) {
        super(zjeVar);
        this.j = v0lVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.e(0, this, null);
    }
}
