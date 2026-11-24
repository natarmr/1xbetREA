package a;

/* JADX INFO: loaded from: classes4.dex */
public final class h4v extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ a6u j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4v(a6u a6uVar, zje zjeVar) {
        super(zjeVar);
        this.j = a6uVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.K(this);
    }
}
