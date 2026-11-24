package a;

/* JADX INFO: loaded from: classes5.dex */
public final class e310 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ svu j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e310(svu svuVar, zje zjeVar) {
        super(zjeVar);
        this.j = svuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.g(0, this, null);
    }
}
