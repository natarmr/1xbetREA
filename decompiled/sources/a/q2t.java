package a;

/* JADX INFO: loaded from: classes4.dex */
public final class q2t extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ r2t j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2t(r2t r2tVar, zje zjeVar) {
        super(zjeVar);
        this.j = r2tVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(this);
    }
}
